package com.java.inv;

public class Order {

	private String orderId;
	private String stockId;
	private int qtyOrd;
	public int getQtyOrd() {
		return qtyOrd;
	}
	public void setQtyOrd(int qtyOrd) {
		this.qtyOrd = qtyOrd;
	}

	private double price;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", stockId=" + stockId + ", quyOrd=" + qtyOrd + ", price=" + price + "]";
	}
	
	
}
