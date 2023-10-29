package Factory.AbstractFactory.DatabaseFactories;

import Factory.AbstractFactory.Queries.SQLQuery;
import Factory.AbstractFactory.Transactions.SqlTransaction;
import Factory.AbstractFactory.Updaters.SqlUpdater;

public class SqlDatabaseFactory implements DatabaseFactory{
    @Override
    public SQLQuery createQuery() {
        System.out.println("returning SQL query object");
        return new SQLQuery();
    }

    @Override
    public SqlTransaction createTransaction() {
        System.out.println("returning SQL transaction object");
        return new SqlTransaction();
    }

    @Override
    public SqlUpdater createUpdater() {
        System.out.println("returning SQL updater object");
        return new SqlUpdater();
    }
}
