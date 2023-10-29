package Factory.AbstractFactory.PracticalFactory;

import Factory.AbstractFactory.Databases.Database;
import Factory.AbstractFactory.Databases.MongoDatabase;
import Factory.AbstractFactory.Databases.MySqlDatabase;

public class DatabasePracticalFactory {
    public static Database getDatabaseByType(DatabaseType databaseType){
        if(databaseType == DatabaseType.SQL){
            return new MySqlDatabase();
        }
        return new MongoDatabase();
    }
}
