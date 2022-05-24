package com.springdemo;

public class OracleCustomerDal implements ICustomerDal {

	String connectionString;
	public void add() {
		System.out.println("\n Connection String:"+this.connectionString);
		System.out.println("ORACLE DB'ye EKLENDI*\n");
	}
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString=connectionString;
	}
}
