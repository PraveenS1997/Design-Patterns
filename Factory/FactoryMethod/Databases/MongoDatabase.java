package Factory.FactoryMethod.Databases;

import Factory.FactoryMethod.Queries.NoSQlQuery;

public class MongoDatabase extends Database{
    @Override
    public NoSQlQuery createQuery() {
        return new NoSQlQuery();
    }
}
