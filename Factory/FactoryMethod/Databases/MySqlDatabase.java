package Factory.FactoryMethod.Databases;

import Factory.FactoryMethod.Queries.Query;
import Factory.FactoryMethod.Queries.SQLQuery;

public class MySqlDatabase extends Database{
    @Override
    public SQLQuery createQuery() {
        return new SQLQuery();
    }
}
