package com.imooc.bean;

import com.imooc.TestBase;

public class TestBeanScope  {

	public static void main(String[] args) {
		TestBase testBase = new TestBase("classpath*:spring-beanscope.xml");
		testBase.loadConfig();
		BeanScope beanScope = testBase.getBean("beanScope");
		beanScope.say();

		BeanScope beanScope2 = testBase.getBean("beanScope");
		beanScope2.say();
		testBase.destroy();

	}


}
