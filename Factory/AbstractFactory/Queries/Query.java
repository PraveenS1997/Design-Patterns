package Factory.AbstractFactory.Queries;

public abstract class Query {
    private String query;

    public Query(){ }

    public Query(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}