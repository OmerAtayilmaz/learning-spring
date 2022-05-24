package springIntro2;

public class PostgreSQLDal implements IDatabaseDal{

	@Override
	public void create() {
		System.out.println("CREATED INTO POSTGRESQL DATABASE");
	}
}
