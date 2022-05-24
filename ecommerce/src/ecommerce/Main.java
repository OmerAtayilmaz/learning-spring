package ecommerce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("*****Welcome to e-commerce*****");
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService product=new ProductService(context.getBean("computer",IProductDal.class));
		product.create();
		
		ProductService computer=context.getBean("service",ProductService.class);
		computer.create();
		
		//YENI YONTEM - ANNOTATION ILE
		AnnotationConfigApplicationContext newcontext=new AnnotationConfigApplicationContext(IocConfig.class);
		ProductService comp=newcontext.getBean("service",ProductService.class);
		IProductDal phone=newcontext.getBean("phone",IProductDal.class);
		comp.create();
		phone.create();
	}

}
