package springIntro2;

public class MsSqlDal implements IDatabaseDal{

	@Override
	public void create() {
		System.out.println("Data Created Into MsSQL database");
	}

}
