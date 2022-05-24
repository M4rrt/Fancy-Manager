package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL {
    public static Connection getConnection(){
        Connection conn2 = null;
        try {
            String dbURL2 = "jdbc:postgresql://localhost/jpmodas";
            String user = "postgres";
            String pass = "Info1234@";
            conn2 = DriverManager.getConnection(dbURL2, user, pass);
            return conn2;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro. "+ex);
        }
    }
}
