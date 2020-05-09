package com.imooc.beanannotation.javabased;

public class StringStore implements Store<String> {
	/**
	 * 定义bean的初始化方法
	 */
	public void init() {
		System.out.println("This is init.");
	}
	/**
	 * 定义bean的销毁方法
	 */
	public void destroy() {
		System.out.println("This is destroy.");
	}
	
}
