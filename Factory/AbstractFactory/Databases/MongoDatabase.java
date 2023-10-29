package Factory.AbstractFactory.Databases;

import Factory.AbstractFactory.DatabaseFactories.DatabaseFactory;
import Factory.AbstractFactory.DatabaseFactories.NoSqlDatabaseFactory;
import Factory.AbstractFactory.Queries.NoSQlQuery;

public class MongoDatabase extends Database {

    @Override
    public DatabaseFactory getDatabaseFactory() {
        return new NoSqlDatabaseFactory();
    }
}
