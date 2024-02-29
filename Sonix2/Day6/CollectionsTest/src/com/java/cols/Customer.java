package com.java.cols;

public class Customer implements Comparable {

	int custId;
	String custName;
	String city;
	double billAmount;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", billAmount=" + billAmount
				+ "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String city, double billAmount) {
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.billAmount = billAmount;
	}
	@Override
	public int compareTo(Object o) {
		Customer customer = (Customer)o;
		return custName.compareTo(customer.getCustName());
	}
	
	
}
