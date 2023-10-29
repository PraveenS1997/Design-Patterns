package Factory.AbstractFactory;

import Factory.AbstractFactory.DatabaseFactories.DatabaseFactory;
import Factory.AbstractFactory.DatabaseFactories.SqlDatabaseFactory;
import Factory.AbstractFactory.Databases.Database;
import Factory.AbstractFactory.Databases.MongoDatabase;
import Factory.AbstractFactory.Databases.MySqlDatabase;
import Factory.AbstractFactory.PracticalFactory.DatabaseType;
import Factory.AbstractFactory.Queries.NoSQlQuery;
import Factory.AbstractFactory.Queries.Query;
import Factory.AbstractFactory.Queries.SQLQuery;
import Factory.AbstractFactory.Transactions.Transaction;
import Factory.AbstractFactory.Updaters.Updater;

public class Client {
    public static void main(String[] args) {
        // Sql example
        Database sqlDatabase = new MySqlDatabase();
        DatabaseFactory sqlDbFactory = sqlDatabase.getDatabaseFactory(DatabaseType.SQL);
        Query sqlQuery = sqlDbFactory.createQuery();
        Transaction sqlTransaction = sqlDbFactory.createTransaction();
        Updater sqlUpdater = sqlDbFactory.createUpdater();

        // NoSql example
        Database mongoDatabase = new MongoDatabase();
        DatabaseFactory dbFactory = mongoDatabase.getDatabaseFactory(DatabaseType.NoSQL);
        Query noSqlQuery = dbFactory.createQuery();
        Transaction noSqlTransaction = dbFactory.createTransaction();
        Updater noSqlUpdater = dbFactory.createUpdater();
    }
}
