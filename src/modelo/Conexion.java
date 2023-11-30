
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author milag
 */
public class Conexion {
    Connection acceso;
    String url="jdbc:mysql//localhost:3306/allinorder";
    String user="root";
    String password="root";
    
    //conectar a bbdd
    public Connection Conectar() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            acceso=DriverManager.getConnection(url,user,password);
            
          
        } catch (SQLException ex) {
            System.out.println("Eror de conexion");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return acceso;
    }
}
