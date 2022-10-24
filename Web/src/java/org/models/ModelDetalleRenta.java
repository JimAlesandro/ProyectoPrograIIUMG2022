/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.models;

/**
 *
 * @author Christian
 */
public class ModelDetalleRenta {
    private int idRenta;
    private int serie;
    private int idDetalleRenta;
    private int idVehiculo;
    private double precioAlquiler;

    public int getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getIdDetalleRenta() {
        return idDetalleRenta;
    }

    public void setIdDetalleRenta(int idDetalleRenta) {
        this.idDetalleRenta = idDetalleRenta;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    
}
