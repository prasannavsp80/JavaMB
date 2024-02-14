package com.java.cols;

public class Customer implements Comparable {

	private int custId;
	private String custName;
	private String custCity;
	private double billAmount;
	
	public Customer() {

	}

	public Customer(int custId, String custName, String custCity, double billAmount) {
		this.custId = custId;
		this.custName = custName;
		this.custCity = custCity;
		this.billAmount = billAmount;
	}

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

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custCity=" + custCity + ", billAmount="
				+ billAmount + "]";
	}

	@Override
	public int compareTo(Object o) {
		Customer customer = (Customer)o;
		return custName.compareTo(customer.getCustName());
	}
	
}
