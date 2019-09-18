/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanayala.sessionbeans;

import com.alanayala.entities.Tipocliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface TipoclienteFacadeLocal {

    void create(Tipocliente tipocliente);

    void edit(Tipocliente tipocliente);

    void remove(Tipocliente tipocliente);

    Tipocliente find(Object id);

    List<Tipocliente> findAll();

    List<Tipocliente> findRange(int[] range);

    int count();
    
}
