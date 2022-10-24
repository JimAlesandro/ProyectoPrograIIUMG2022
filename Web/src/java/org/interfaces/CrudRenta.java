/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.models.ModelRenta;

/**
 *
 * @author Christian
 */
public interface CrudRenta {
       public List listar();
    public ModelRenta list (int id);
    public boolean insertar(ModelRenta renta);
    public boolean modificar(ModelRenta renta);
    public boolean eliinar(ModelRenta renta);
}
