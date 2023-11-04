package Factory.FactoryMethod;

import Factory.FactoryMethod.Databases.Database;
import Factory.FactoryMethod.Databases.MongoDatabase;
import Factory.FactoryMethod.Databases.MySqlDatabase;
import Factory.FactoryMethod.Queries.NoSQlQuery;
import Factory.FactoryMethod.Queries.Query;
import Factory.FactoryMethod.Queries.SQLQuery;

public class Client {
    public static void main(String[] args) {
        Database mongoDb = new MongoDatabase();
        Query noSqlQuery = mongoDb.createQuery();
        System.out.println(noSqlQuery.getClass() == NoSQlQuery.class);

        Database sqlDb = new MySqlDatabase();
        Query sqlQuery = sqlDb.createQuery();
        System.out.println(sqlQuery.getClass() == SQLQuery.class);
    }
}
