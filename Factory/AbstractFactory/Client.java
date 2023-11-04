package Factory.AbstractFactory;

import Factory.AbstractFactory.DatabaseFactories.DatabaseFactory;
import Factory.AbstractFactory.DatabaseFactories.SqlDatabaseFactory;
import Factory.AbstractFactory.Databases.Database;
import Factory.AbstractFactory.Databases.MongoDatabase;
import Factory.AbstractFactory.Databases.MySqlDatabase;
import Factory.AbstractFactory.PracticalFactory.DatabasePracticalFactory;
import Factory.AbstractFactory.PracticalFactory.DatabaseType;
import Factory.AbstractFactory.Queries.NoSQlQuery;
import Factory.AbstractFactory.Queries.Query;
import Factory.AbstractFactory.Queries.SQLQuery;
import Factory.AbstractFactory.Transactions.Transaction;
import Factory.AbstractFactory.Updaters.Updater;

public class Client {
    public static void main(String[] args) {
        // Sql example
        Database sqlDatabase = DatabasePracticalFactory.getDatabaseByType(DatabaseType.SQL);
        DatabaseFactory sqlDbFactory = sqlDatabase.getDatabaseFactory();
        System.out.println(sqlDbFactory.getClass());
        Query sqlQuery = sqlDbFactory.createQuery();
        Transaction sqlTransaction = sqlDbFactory.createTransaction();
        Updater sqlUpdater = sqlDbFactory.createUpdater();

        // NoSql example
        Database mongoDatabase = DatabasePracticalFactory.getDatabaseByType(DatabaseType.NoSQL);
        DatabaseFactory noSqlDbFactory = mongoDatabase.getDatabaseFactory();
        System.out.println(noSqlDbFactory.getClass());
        Query noSqlQuery = noSqlDbFactory.createQuery();
        Transaction noSqlTransaction = noSqlDbFactory.createTransaction();
        Updater noSqlUpdater = noSqlDbFactory.createUpdater();
    }
}
