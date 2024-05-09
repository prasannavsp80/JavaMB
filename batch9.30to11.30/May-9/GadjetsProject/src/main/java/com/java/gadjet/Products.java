package com.java.gadjet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Products {

	@Id
	@Column(name="ProductId")
	private int productId;
	@Column(name="ProductName")
	private String productName;
	@Column(name="Description")
	private String description;
	@Column(name="Price")
	private double price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Products() {

	}

	public Products(int productId, String productName, String description, double price) {
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}
	
	
}
