package Factory.AbstractFactory.Databases;

import Factory.AbstractFactory.DatabaseFactories.DatabaseFactory;
import Factory.AbstractFactory.DatabaseFactories.SqlDatabaseFactory;
import Factory.AbstractFactory.Queries.SQLQuery;

public class MySqlDatabase extends Database {

    @Override
    public DatabaseFactory getDatabaseFactory() {
        return new SqlDatabaseFactory();
    }
}
