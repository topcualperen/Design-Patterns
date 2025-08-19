package singleton;

// 1. SINGLETON PATTERN
// Bir sınıftan sadece tek bir nesne oluşturulmasını sağlar


class Deneme {

}

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
        System.out.println("***************************");
        Deneme deneme1 = new Deneme();
        Deneme deneme2 = new Deneme();
        System.out.println("Dnm1: " + deneme1);
        System.out.println("Dnm2: " + deneme2);
    }
}