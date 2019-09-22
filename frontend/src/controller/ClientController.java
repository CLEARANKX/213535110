package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
 
import model.Client;
import service.ClientEJB;

@ManagedBean(name = "clientcontroller")
@SessionScoped
public class ClientController {
	
	@EJB
	ClientEJB clientservice;
	
	@ManagedProperty(value="#{client}")
	private Client client;
		
	public void addNewTransaction()
	{
		System.out.println("Is in use");
		clientservice.addNew(client.getEntity());
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	

}
