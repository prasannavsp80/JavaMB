package com.java.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerSonix")
public class Customer {

	@Id
	@Column(name="CustId")
	private int custId;
	@Column(name="CustomerFirstName")
	private String customerFirstName;
	@Column(name="CustomerLastName")
	private String customerLastName;
	@Column(name="CustomerUserName")
	private String customerUserName;
	@Column(name="CustomerPassword")
	private String customerPassword;
	@Column(name="CustomerCity")
	private String customerCity;
	@Column(name="CustomerEmail")
	private String customerEmail;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerUserName() {
		return customerUserName;
	}
	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String customerFirstName, String customerLastName, String customerUserName,
			String customerPassword, String customerCity, String customerEmail) {
		this.custId = custId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.customerCity = customerCity;
		this.customerEmail = customerEmail;
	}
	
	
}
