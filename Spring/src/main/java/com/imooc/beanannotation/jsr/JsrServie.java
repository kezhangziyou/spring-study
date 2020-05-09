package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

//@Service
@Named
public class JsrServie {
	
//	@Resource 可以赋值，将dao的实例注入到当前service中
//	@Inject
	private JsrDAO jsrDAO;
	
//	@Resource，用set方法，也可以
	@Inject
	public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}

	/**
	 * 初始化
	 */
	@PostConstruct
	public void init() {
		System.out.println("JsrServie init.");
	}

	/**
	 * 销毁
	 */
	@PreDestroy
	public void destroy() {
		System.out.println("JsrServie destroy.");
	}

	public void save() {
		jsrDAO.save();
	}
	
}
