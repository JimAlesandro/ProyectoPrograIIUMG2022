/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.Conexion;
import org.interfaces.CrudDetalleRenta;
import org.models.ModelDetalleRenta;

/**
 *
 * @author Christian
 */
public class DaoDetalleRenta implements CrudDetalleRenta {
     //Se crea un objeto publico del Cliente
    ModelDetalleRenta cliente = new ModelDetalleRenta();
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
        ArrayList<ModelDetalleRenta>lstDetalleRenta = new ArrayList<>();
         try {            
            strSql = "SELECT * FROM DETALLE_RENTA";
            conexion.open();
            rs = conexion.executeQuery(strSql);                             
            
            while (rs.next()) {
                ModelDetalleRenta deta = new ModelDetalleRenta();
                deta.setIdRenta(rs.getInt("ID_RENTA"));
                deta.setSerie(rs.getInt("SERIE"));
                deta.setIdDetalleRenta(rs.getInt("ID_DETALLE_RENTA"));
                deta.setIdVehiculo(rs.getInt("ID_VEHICULO"));
                deta.setPrecioAlquiler(rs.getDouble("PRECIO_ALQUILER"));
                lstDetalleRenta.add(deta);
            }
            rs.close();
            conexion.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoDetalleRenta.class.getName()).log(Level.SEVERE, null, ex);            
        } catch(Exception ex){
            Logger.getLogger(DaoDetalleRenta.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
         return lstDetalleRenta;
    }

    @Override
    public ModelDetalleRenta list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertar(ModelDetalleRenta detalleRenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(ModelDetalleRenta detalleRenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliinar(ModelDetalleRenta detalleRenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
