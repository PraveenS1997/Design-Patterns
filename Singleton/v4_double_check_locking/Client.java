package Singleton.v4_double_check_locking;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1.hashCode() + " " + db2.hashCode());
        System.out.println("Are db1 & db2 instance are same: " + (db1 == db2));
    }
}
