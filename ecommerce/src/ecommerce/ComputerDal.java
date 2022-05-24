package ecommerce;

public class ComputerDal implements IProductDal{
	String coolstuff;

		@Override
		public void create() {
			System.out.println("Computer added to shopping card >> "+coolstuff);
		}
		
	public String getCoolstuff() {
		return coolstuff;
	}
	public void setCoolstuff(String coolstuff) {
		this.coolstuff=coolstuff;
	}
}
