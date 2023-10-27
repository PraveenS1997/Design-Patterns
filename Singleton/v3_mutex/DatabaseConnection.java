package Singleton.v3_mutex;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private static final Lock lock = new ReentrantLock();
    private String url;
    private String userName;
    private String password;
    private List<Object> tcpConnectionPool;

    private DatabaseConnection(){

    }

    // using any type of mutex lock
    public static DatabaseConnection getInstance(){
        lock.lock();
        if(instance == null){
            // the below line is the critical section
            instance = new DatabaseConnection();
        }
        lock.unlock();
        return instance;
    }

    // using synchronized block & passing the class to lock
    public static DatabaseConnection getInstance_1(){
        synchronized (DatabaseConnection.class){
            if(instance == null){
                // the below line is the critical section
                instance = new DatabaseConnection();
            }
        }
        return instance;
    }

    // using synchronized modifier
    public synchronized static DatabaseConnection getInstance_2(){
        if(instance == null){
            // the below line is the critical section
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
