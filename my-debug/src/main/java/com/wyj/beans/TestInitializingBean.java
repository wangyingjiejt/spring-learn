package com.wyj.beans;

import org.springframework.beans.factory.InitializingBean;


public class TestInitializingBean implements InitializingBean {

	private String value;


	public String getValue() {
		return value;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		value="i was populated in initializing TestInitializingBean point";
		System.out.println("initializing TestInitializingBean");
	}

	public TestInitializingBean() {
		System.out.println("constructor TestInitializingBean");
	}
}
