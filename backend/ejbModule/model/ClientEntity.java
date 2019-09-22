package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="client_table")
public class ClientEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String sourcepassport;
	private String destinationpassport;
	private String destinationbank;
	private String destinationcountry;
	private Double accountnumber;
	private Double amount;
	private Double transactioncode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	
}
