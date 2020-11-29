package com.shopit.demo.requestBody;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class CartRequestBody {
	
	
	
	private Long customer_id;
	private Long item_id;
	private Long supplier_id;
	
	private int quantity;
	private double price;
	
	public CartRequestBody() {
		super();
	}
	public CartRequestBody(Long customer_id, Long item_id, Long supplier_id, int quantity,double price) {
		super();
		this.customer_id = customer_id;
		this.item_id = item_id;
		this.supplier_id = supplier_id;
		this.quantity = quantity;
		this.price=price;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public Long getItem_id() {
		return item_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	public Long getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(Long supplier_id) {
		this.supplier_id = supplier_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	

}
