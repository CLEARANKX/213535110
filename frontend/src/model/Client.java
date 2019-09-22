package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "client")
@SessionScoped
public class Client {
	private String name;
	private String sourcepassport;
	private String destinationpassport;
	private String destinationbank;
	private String destinationcountry;
	private Double accountnumber;
	private Double amount;
	private Double transactioncode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcepassport() {
		return sourcepassport;
	}
	public void setSourcepassport(String sourcepassport) {
		this.sourcepassport = sourcepassport;
	}
	public String getDestinationpassport() {
		return destinationpassport;
	}
	public void setDestinationpassport(String destinationpassport) {
		this.destinationpassport = destinationpassport;
	}
	public String getDestinationbank() {
		return destinationbank;
	}
	public void setDestinationbank(String destinationbank) {
		this.destinationbank = destinationbank;
	}
	public String getDestinationcountry() {
		return destinationcountry;
	}
	public void setDestinationcountry(String destinationcountry) {
		this.destinationcountry = destinationcountry;
	}
	public Double getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Double accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getTransactioncode() {
		return transactioncode;
	}
	public void setTransactioncode(Double transactioncode) {
		this.transactioncode = transactioncode;
	}
	 

	public ClientEntity getEntity()
	{
		ClientEntity clientEntity = new ClientEntity();
		clientEntity.setName(name);
		clientEntity.setSourcepassport(sourcepassport);
		clientEntity.setDestinationpassport(destinationpassport);
		clientEntity.setDestinationbank(destinationbank);
		clientEntity.setDestinationcountry(destinationcountry);
		clientEntity.setAccountnumber(accountnumber);
		clientEntity.setAmount(amount);
		clientEntity.setTransactioncode(transactioncode);
		
		return clientEntity;
	}
	
	
	
} 
