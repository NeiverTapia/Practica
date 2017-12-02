/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import Model.Datos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class DatosFacade extends AbstractFacade<Datos> {

    @PersistenceContext(unitName = "ProlicoresPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DatosFacade() {
        super(Datos.class);
    }
    
}
