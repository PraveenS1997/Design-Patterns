package Singleton.v1;

import java.util.List;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String url;
    private String userName;
    private String password;
    private List<Object> tcpConnectionPool;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
