package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private Connection conn;
    public void connect() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=deneme";
            String user = "sa";
            String password = "0";
            setConn(DriverManager.getConnection(url, user, password));
            System.out.println("Veritabanına bağlanıldı!");
        } catch (SQLException e) {
            System.out.println("Veritabanına bağlanırken hata oluştu.");
            e.printStackTrace();
        }
    }

    public boolean isValidUser(String tc, String sifre) {
        return tc.equals("12345678901") && sifre.equals("0");
    }
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
