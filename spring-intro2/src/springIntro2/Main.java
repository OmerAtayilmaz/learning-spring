package springIntro2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DatabaseManager db=new DatabaseManager(context.getBean("postgresql",IDatabaseDal.class));
		db.cremoduleate();
		
		DatabaseManager mongo=new DatabaseManager(context.getBean("mongodb",IDatabaseDal.class));
		mongo.create();
		
		DatabaseManager mssql=new DatabaseManager(context.getBean("mssql",IDatabaseDal.class));
		mssql.create();

		IDatabaseManagerService dbManagerService=context.getBean("mongoManagerService",IDatabaseManagerService.class);
		dbManagerService.create();
		
		IDatabaseManagerService mongoService=context.getBean("mongoService",IDatabaseManagerService.class);
		mongoService.create();
		
		
	}

}
