package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:application.properties")
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}
	@Bean
	public ICustomerDal oracledb() {
		return new OracleCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}

}
