package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static Connection connect() throws ClassNotFoundException  {
        String url = "jdbc:sqlite:C:/Users/jhonm/OneDrive/Desktop/SQLiteStudio/RetoSofka.db";
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        

        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been stablished.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}


