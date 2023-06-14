package com.products.manager.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private float price;
	private int warranty;
	
	
	public Product() {
		super();
	}
	
	public Product(String name, String type, float price, int warranty) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.warranty = warranty;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", warranty=" + warranty
				+ "]";
	}
	
	
	
}
