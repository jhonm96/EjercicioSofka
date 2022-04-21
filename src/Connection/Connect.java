package Connection;
// clase connect utilizada para hacer la respectiva conexion a la base de datos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static Connection connect() throws ClassNotFoundException {
        String url = "jdbc:sqlite:C:/Users/jhonm/DataGripProjects/historialJuegoSofka/historialJuegoSofka.SQLITE";
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



//C:\Users\jhonm\DataGripProjects\historialJuegoSofka
//C:/Users/jhonm/OneDrive/Desktop/SQLiteStudio/RetoSofka.db