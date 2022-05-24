package ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ecommerce")
@PropertySource("classpath:application.properties")
public class IocConfig {
	
	@Bean
	public IProductDal computer() {
		return new ComputerDal();
	}
	
	@Bean
	public IProductDal phone() {
		return new PhoneDal();
	}
	@Bean
	public IProductService service() {
		return new ProductService(computer());
	}
}
