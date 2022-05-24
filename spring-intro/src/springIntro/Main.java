package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerManager manager=new CustomerManager(context.getBean("database",ICustomerDal.class));
		manager.add();
		CustomerManager manager2=new CustomerManager(context.getBean("database2",ICustomerDal.class));
		manager2.add();
		CustomerManager mysqlManager=new CustomerManager(new MySqlCustomerDal());
		mysqlManager.add();
//		
		ICustomerService customerService=context.getBean("service",ICustomerService.class);
		customerService.add();
	
	}
	//IOC - Inversion of Control
	//DEPENDENCY INJECTION
}
