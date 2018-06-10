package com.bow.api.main.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="customer")
public class SystemwareModel {
	
	private String CustomerName;
	private String AccountNumber;
	private String AccountStatus;
		
	public SystemwareModel(String customerName, String accountNumber, String accountStatus) {
		super();
		CustomerName = customerName;
		AccountNumber = accountNumber;
		AccountStatus = accountStatus;
	}
	
	public SystemwareModel() {
		super();
	}

	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	
	
	
}
