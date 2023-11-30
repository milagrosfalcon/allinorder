
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
/**
 *
 * @author milag
 */
public class Vendedor2 {
    PreparedStatement ps;
    ResultSet rs;
    
   
    Conexion con= new Conexion();
    Connection acceder;
    
    public Vendedor Validacion(String dni,String user){
         Vendedor v=new Vendedor();
        String sql="select * from vendedor where Dni=? and User=?";
       try{
           acceder=con.Conectar();
           //le pasamos por parametro la query
           ps=acceder.prepareStatement(sql);
           ps.setString(1, dni);
           ps.setString(2,user);
           //ejecutamos
           rs=ps.executeQuery();
           while(rs.next()){
               v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                 v.setNombres(rs.getString(3));
                  v.setTelefono(rs.getString(4));
                   v.setEstado(rs.getString(5));
                    v.setUsuario(rs.getString(6));
           }
       } catch(Exception e){
           
       }
        return v;
    }
   
    
    
    
    
}
