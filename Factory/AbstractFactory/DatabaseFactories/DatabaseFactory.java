package Factory.AbstractFactory.DatabaseFactories;

import Factory.AbstractFactory.Queries.Query;
import Factory.AbstractFactory.Transactions.Transaction;
import Factory.AbstractFactory.Updaters.Updater;

public interface DatabaseFactory {
    Query createQuery();
    Transaction createTransaction();
    Updater createUpdater();
}
