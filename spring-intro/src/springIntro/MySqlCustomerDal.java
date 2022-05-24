package springIntro;

public class MySqlCustomerDal implements ICustomerDal{
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
