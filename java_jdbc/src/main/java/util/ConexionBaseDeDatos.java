package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_prueba";
    private static String username = "root";
    private static String password = "juanjulia1976";

    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url,username,password);
        return con;
    }
}
