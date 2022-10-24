/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.models.ModelCliente;

/**
 *
 * @author josef
 */
public interface CrudCliente {
    public List listar();
    public ModelCliente list (int id);
    public boolean insertar(ModelCliente cliente);
    public boolean modificar(ModelCliente cliente);
    public boolean eliinar(ModelCliente cliente);
    
}
