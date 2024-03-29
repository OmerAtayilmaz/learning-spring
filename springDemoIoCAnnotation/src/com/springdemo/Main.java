package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);
//		Not Refreshed hatasınde kullanılır: context.refresh();
		ICustomerDal customerDal=context.getBean("database",ICustomerDal.class);
		customerDal.add();
		ICustomerDal oracle=context.getBean("oracledb",ICustomerDal.class);
		oracle.add();
	
		ICustomerService customer=context.getBean("service",ICustomerService.class);
		customer.add();
		
	}
	//IOC - Inversion of Control
	//DEPENDENCY INJECTION
}
