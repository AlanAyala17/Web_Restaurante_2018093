/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanayala.sessionbeans;

import com.alanayala.entities.Tipocliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class TipoclienteFacade extends AbstractFacade<Tipocliente> implements TipoclienteFacadeLocal {

    @PersistenceContext(unitName = "WebRestaurante_IN5BM_2018093PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoclienteFacade() {
        super(Tipocliente.class);
    }
    
}
