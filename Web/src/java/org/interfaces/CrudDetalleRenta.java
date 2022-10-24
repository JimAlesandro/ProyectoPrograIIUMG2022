/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.models.ModelDetalleRenta;

/**
 *
 * @author Christian
 */
public interface CrudDetalleRenta {
    public List listar();
    public ModelDetalleRenta list (int id);
    public boolean insertar(ModelDetalleRenta detalleRenta);
    public boolean modificar(ModelDetalleRenta detalleRenta);
    public boolean eliinar(ModelDetalleRenta detalleRenta);
}
