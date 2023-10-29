package Factory.AbstractFactory.Databases;

import Factory.AbstractFactory.DatabaseFactories.DatabaseFactory;
import Factory.AbstractFactory.PracticalFactory.DatabaseFactoryFactory;
import Factory.AbstractFactory.PracticalFactory.DatabaseType;

public abstract class Database {
    public void log(){
        // log
    }

    public void connect(){
        // connect to database
    }

    public DatabaseFactory getDatabaseFactory(DatabaseType databaseType){
        return DatabaseFactoryFactory.getDatabaseFactoryByType(databaseType);
    }
}