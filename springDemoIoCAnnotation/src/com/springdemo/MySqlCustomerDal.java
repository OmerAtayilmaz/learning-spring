package com.springdemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("database")
public class MySqlCustomerDal implements ICustomerDal{
	
	@Value("${database.sqlConnectionString}")
	String connectionString;
	public void add() {
		System.out.println("Connection String:"+this.connectionString);
		System.out.print("MYSQL DB'ye EKLENDI");
	}

	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString=connectionString;
	}
}
