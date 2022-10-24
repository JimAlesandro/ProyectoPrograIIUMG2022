/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.Conexion;
import org.interfaces.CrudDevolucion;
import org.models.ModelDevolucion;


/**
 *
 * @author Christian
 */
public class DaoDevolucion implements CrudDevolucion {
      ModelDevolucion devolucion = new ModelDevolucion();
    //Variable para crear las sentencias SQL
    String strSql =  "";
    //Se crea un obejto de tipo conexión para manejar la persistencia hacia la base de datos
    Conexion conexion = new Conexion();
    //Obtiene el resultado de las consultas SQL
    ResultSet rs = null;
    //flag para retornar si la sentencia SQL fue satisfactorio o no
    boolean respuesta = false;
    @Override
    public List listar() {
        ArrayList<ModelDevolucion>lstDevolucion = new ArrayList<>();
         try {
            strSql = "SELECT * FROM DEVOLUCION";
            conexion.open();
            rs = conexion.executeQuery(strSql);

            while (rs.next()) {
                ModelDevolucion devol = new ModelDevolucion();
                devol.setIdDevolucion(rs.getInt("ID_DEVOLUCION"));
                devol.setIdRenta(rs.getInt("ID_RENTA"));
                devol.setSerie(rs.getInt("SERIE"));
                devol.setFecha(rs.getString("ID_FECHA"));
                devol.setObservaciones(rs.getString("OBSERVACIONES"));
                devol.setIdUsuario(rs.getInt("ID_USUARIO"));
                devol.setDiasAtraso(rs.getInt("DIAS_ATRASO"));
                devol.setMora(rs.getDouble("MORA"));

                lstDevolucion.add(devol);
            }
            rs.close();
            conexion.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoDevolucion.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception ex){
            Logger.getLogger(DaoDevolucion.class.getName()).log(Level.SEVERE, null, ex);
        }

         return lstDevolucion;    }

    @Override
    public ModelDevolucion list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertar(ModelDevolucion devolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(ModelDevolucion devolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliinar(ModelDevolucion devolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
