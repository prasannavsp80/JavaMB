package com.java.inv;

public class Stock {

	private String stockId;
	private String itemName;
	private double price;
	private int quantityAvail;
	
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public Stock() {
		// TODO Auto-generated constructor stub
	}
	public Stock(String stockId, String itemName, double price, int quantityAvail) {
		this.stockId = stockId;
		this.itemName = itemName;
		this.price = price;
		this.quantityAvail = quantityAvail;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", itemName=" + itemName + ", price=" + price + ", quantityAvail="
				+ quantityAvail + "]";
	}
	
	
}
