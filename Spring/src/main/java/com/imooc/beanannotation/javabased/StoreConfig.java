package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration//扫描这个类时候,会配置需要设置的bean
@ImportResource("classpath:config.xml")
public class StoreConfig {
	
//	@Value("${url}")
//	private String url;
//	
//	@Value("${jdbc.username}")
//	private String username;
//	
//	@Value("${password}")
//	private String password;
//	
//	@Bean
//	public MyDriverManager myDriverManager() {
//		return new MyDriverManager(url, username, password);
//	}

	/**
	 * 如果不指定bean的名称，那么就是默认是方法的名称，也可以指定的bean的名称
	 */
//	@Bean(name = "stringStore", initMethod="init", destroyMethod="destroy")
//	public Store stringStore() {
//		return new StringStore();
//	}
	
	
//	@Bean(name = "stringStore")
//	@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//	public Store stringStore() {
//		return new StringStore();
//	}
	
	@Autowired
	private Store<String> s1;
	
	@Autowired
	private Store<Integer> s2;
	
	@Bean
	public StringStore stringStore() {
		return new StringStore();
	}
	
	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}
	
//	@Bean(name = "stringStoreTest")
//	public Store stringStoreTest() {
//		System.out.println("s1 : " + s1.getClass().getName());
//		System.out.println("s2 : " + s2.getClass().getName());
//		return new StringStore();
//	}
	

}
