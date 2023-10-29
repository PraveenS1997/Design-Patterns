package Factory.AbstractFactory.PracticalFactory;

import Factory.AbstractFactory.DatabaseFactories.DatabaseFactory;
import Factory.AbstractFactory.DatabaseFactories.NoSqlDatabaseFactory;
import Factory.AbstractFactory.DatabaseFactories.SqlDatabaseFactory;

public class DatabaseFactoryFactory {
    public static DatabaseFactory getDatabaseFactoryByType(DatabaseType databaseType){
        if(databaseType == DatabaseType.SQL){
            return new SqlDatabaseFactory();
        }
        return new NoSqlDatabaseFactory();
    }
}
