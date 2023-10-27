package Singleton.v2_Eager_Loading;

import java.util.List;

// Eager loading
public class DatabaseConnection {
    // issues with passing config parameters to DatabaseConnection
    // as the below code will run at the class load/ application start
    // so runtime parameters are not available at the class load time
    private static final DatabaseConnection instance = new DatabaseConnection();
    private String url;
    private String userName;
    private String password;
    private List<Object> tcpConnectionPool;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        return instance;
    }
}
