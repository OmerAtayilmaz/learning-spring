package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerDal customerDal=context.getBean("database",ICustomerDal.class);
		customerDal.add();
	
	}
	//IOC - Inversion of Control
	//DEPENDENCY INJECTION
}
