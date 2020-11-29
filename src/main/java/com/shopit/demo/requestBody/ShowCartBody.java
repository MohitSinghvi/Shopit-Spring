package com.shopit.demo.requestBody;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShowCartBody {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int x;
	
	long cust_id;
	String cust_name;
	long item_id;
	String item_name;
	long supplier_id;
	String supplier_name;
	int quantity;
	double price;
	
	
	
	public ShowCartBody() {
		super();
	}
	
	public ShowCartBody(long cust_id, String cust_name, long item_id, String item_name, long supplier_id,
			String supplier_name, int quantity, double price) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.item_id = item_id;
		this.item_name = item_name;
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.quantity = quantity;
		this.price = price;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public long getItem_id() {
		return item_id;
	}
	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public long getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(long supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
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
