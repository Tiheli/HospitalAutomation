package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=JavaHastaneOtomasyonDB";
    private static final String USER = "sa";
    private static final String PASSWORD = "senin_sifren";
    
    public static Connection connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean checkLogin(String tcno, String password, String role) {
        String query = "SELECT * FROM USERS WHERE TCNO = ? AND PASSWORD = ? AND ROLE = ?";
        try (Connection con = connect();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, tcno);
            ps.setString(2, password);
            ps.setString(3, role);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
