
package proyecto2dosemestre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

   public static Connection getthatConexion(){
    
    String url = "jdbc:sqlserver://rentadevehiculos.cgblpzajkteo.us-east-2.rds.amazonaws.com:1433;"
            +"database=proyecto;"
            +"user=admin;"
            +"password=V3h1cu705!";
    
    try{
    Connection con = DriverManager.getConnection(url);
    return con;
    
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    }
    
}
