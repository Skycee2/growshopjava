package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String user = "Growshopjava1";
    String password = "Growshopjava1";

    private Connection conexion = null;

    public Conexion() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conexion = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Cerrar() throws SQLException {
        conexion.close();
    }

    public Connection getConexion() {
        return conexion;
    }

}
