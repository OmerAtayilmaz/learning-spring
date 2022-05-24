package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		//business rules - if everything is ok
		//another step
		customerDal.add();
	}
	
//	SETTER INJECTION
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

}
