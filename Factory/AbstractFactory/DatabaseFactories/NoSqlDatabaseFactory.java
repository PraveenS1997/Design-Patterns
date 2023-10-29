package Factory.AbstractFactory.DatabaseFactories;

import Factory.AbstractFactory.Queries.NoSQlQuery;
import Factory.AbstractFactory.Transactions.NoSqlTransaction;
import Factory.AbstractFactory.Updaters.NoSqlUpdater;

public class NoSqlDatabaseFactory implements DatabaseFactory{
    @Override
    public NoSQlQuery createQuery() {
        System.out.println("returning NoSQL query object");
        return new NoSQlQuery();
    }

    @Override
    public NoSqlTransaction createTransaction() {
        System.out.println("returning NoSQL transaction object");
        return new NoSqlTransaction();
    }

    @Override
    public NoSqlUpdater createUpdater() {
        System.out.println("returning NoSQL updater object");
        return new NoSqlUpdater();
    }
}
