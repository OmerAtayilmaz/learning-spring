package springIntro2;

public class MongoDbDal implements IDatabaseDal {
	
	@Override
	public void create() {
		System.out.println("CREATED INTO MONGODB DATABASE");
	}

}
