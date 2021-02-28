package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQL {

    private final String db = "sql10395611";
    private final String user = "sql10395611";
    private final String pass = "NEirVJAnmA";
    private final String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/" + db;
    
    private final String db1 = "calendar";
    private final String user1 = "root";
    private final String pass1 = "root";
    private final String url1 = "jdbc:mysql://localhost:3306/" + db1;
    private Connection con = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url1, user1, pass1);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }
}
