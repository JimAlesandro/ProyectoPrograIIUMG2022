/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.models.ModelDevolucion;

/**
 *
 * @author Christian
 */
public interface CrudDevolucion {
    public List listar();
    public ModelDevolucion list (int id);
    public boolean insertar(ModelDevolucion devolucion);
    public boolean modificar(ModelDevolucion devolucion);
    public boolean eliinar(ModelDevolucion devolucion);
}
