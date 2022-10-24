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
import org.interfaces.CrudRenta;

import org.models.ModelRenta;

/**
 *
 * @author Christian
 */
public class DaoRenta implements CrudRenta {
    
     ModelRenta renta = new ModelRenta();
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
         ArrayList<ModelRenta>lstRenta = new ArrayList<>();
         try {            
            strSql = "SELECT * FROM RENTA";
            conexion.open();
            rs = conexion.executeQuery(strSql);                             
            
            while (rs.next()) {
                ModelRenta rent = new ModelRenta();
                rent.setIdRenta(rs.getInt("ID_RENTA"));
                rent.setSerie(rs.getInt("SERIE"));
                rent.setIdCliente(rs.getInt("ID_CLIENTE"));
                rent.setIdUsuario(rs.getInt("ID_USUARIO"));
                rent.setIdTipoPago(rs.getInt("ID_TIPO_PAGO"));
                rent.setFechaPrestamo(rs.getString("FECHA_PRESTAMO"));
                rent.setFechaDevolucion(rs.getString("FECHA_DEVOLUCION"));
                rent.setTotal(rs.getDouble("TOTAL"));
                lstRenta.add(rent);
            }
            rs.close();
            conexion.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoRenta.class.getName()).log(Level.SEVERE, null, ex);            
        } catch(Exception ex){
            Logger.getLogger(DaoRenta.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
         return lstRenta;
    }

    @Override
    public ModelRenta list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertar(ModelRenta renta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(ModelRenta renta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliinar(ModelRenta renta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
