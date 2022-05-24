package ecommerce;

public class ProductService implements IProductService{
	private IProductDal productDal;
	String awesome;
	public String getAwesome() {
		return awesome;
	}


	public void setAwesome(String awesome) {
		this.awesome = awesome;
	}


	public ProductService(IProductDal productDal) {
		this.productDal=productDal;
	}
	
	
	@Override
	public void create() {
		productDal.create();
		System.out.print(this.awesome);
		
	}
}
