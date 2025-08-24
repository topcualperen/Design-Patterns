package singleton;

// 1. SINGLETON PATTERN
// Bir sınıftan sadece tek bir nesne oluşturulmasını sağlar

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Constructor ı private yapıyoruz
    private DatabaseConnection() {
        System.out.println("Veritabanı bağlantısı oluşturuldu");
    }

    // Tek instance ı döndüren method
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("DB1: " + db1);
        System.out.println("DB2': " + db2);
    }
}