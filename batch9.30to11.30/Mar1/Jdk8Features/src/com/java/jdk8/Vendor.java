package com.java.jdk8;

public class Vendor {

	private int vendorId;
	private String vendorName;
	private String vendorCity;
	private String vendorState;
	private double billAmount;
	
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCity() {
		return vendorCity;
	}
	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}
	public String getVendorState() {
		return vendorState;
	}
	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public Vendor(int vendorId, String vendorName, String vendorCity, String vendorState, double billAmount) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorCity = vendorCity;
		this.vendorState = vendorState;
		this.billAmount = billAmount;
	}
	
	public Vendor() {

	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorCity=" + vendorCity
				+ ", vendorState=" + vendorState + ", billAmount=" + billAmount + "]";
	}
	
	
}
