package com.java.intf;

public class Customer {

	private int custId;
	private String custName;
	private double billAmount;
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", billAmount=" + billAmount + "]";
	}
	
	
}
