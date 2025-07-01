package Tiket_Bioskop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection con;

    public static Connection getConnection() throws SQLException {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
        }
        return con;
    }
}
