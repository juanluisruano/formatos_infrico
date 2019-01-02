// CLASE CONECTOR REALIZA CONEXION A BD
import java.sql.*;

/**
 *
 * @author Juan Ruano  
 */
public class Conector {
    Connection con;
    public Conector(){
        try{
          Class.forName("com.mysql.jdbc.Driver");  
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/almacen","root","");
        }
        catch(SQLException es)
        {System.err.println(es);}
        
    }
    Connection obtenerconexion(){
        return con;
    }
}
