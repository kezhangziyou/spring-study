package com.imooc;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class TestBase {
	
	private ClassPathXmlApplicationContext context;

	public ClassPathXmlApplicationContext getContext() {
		return context;
	}

	public void setContext(ClassPathXmlApplicationContext context) {
		this.context = context;
	}

	private String springXmlpath;

	
	public TestBase(String springXmlpath) {
		this.springXmlpath = springXmlpath;
	}
	
	public void loadConfig() {
		if (StringUtils.isEmpty(springXmlpath)) {
			springXmlpath = "classpath*:spring-*.xml";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	public  <T extends Object> T getBean(String beanId) {
		try {
			return (T)context.getBean(beanId);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}

	public <T extends Object> T getBean(Class<T> clazz) {
		try {
			return context.getBean(clazz);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}

}
