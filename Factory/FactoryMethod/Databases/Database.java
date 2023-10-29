package Factory.FactoryMethod.Databases;

import Factory.FactoryMethod.Queries.Query;

public abstract class Database {
    public abstract Query createQuery();
}
