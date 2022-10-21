
package proyecto2dosemestre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

   public static Connection getthatConexion(){
    
    String url = "jdbc:sqlserver://localhost:1433;"
            +"database=proyecto;"
            +"user=sa;"
            +"password=123456";
    
    try{
    Connection con = DriverManager.getConnection(url);
    return con;
    
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    }
    
}
