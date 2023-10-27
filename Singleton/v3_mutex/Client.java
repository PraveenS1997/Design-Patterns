package Singleton.v3_mutex;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 + " " + db2);
        System.out.println("Are db1 & db2 instance are same: " + (db1 == db2));
    }
}
