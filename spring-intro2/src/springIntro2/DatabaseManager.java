package springIntro2;

public class DatabaseManager implements IDatabaseManagerService {
	private IDatabaseDal databasedal;
	public DatabaseManager(IDatabaseDal databasedal) {
		this.databasedal=databasedal;
	}
	@Override
	public void create() {
		databasedal.create();
	}
	
}
