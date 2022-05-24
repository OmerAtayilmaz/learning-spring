package springIntro2;

public class MongoDbManager implements IDatabaseManagerService{
	
	private IDatabaseDal databaseDal ;
	public MongoDbManager(IDatabaseDal databaseDal) {
		this.databaseDal=databaseDal;
	}

	@Override
	public void create() {
		databaseDal.create();
		
	}

}
