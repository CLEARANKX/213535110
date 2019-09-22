package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.ClientEntity;

/**
 * Session Bean implementation class ClientEJB
 */
@Stateless
@LocalBean
public class ClientEJB {

	@PersistenceContext
	private EntityManager em;
    public ClientEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(ClientEntity clientEntity)
    {
    	System.out.println("=========================Adding Client Rtransaction to database===================");
    	em.persist(clientEntity);
    }

}
