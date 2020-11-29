package com.shopit.demo.requestBody;

public class ShowOrderContentBody {
	
	String item_name;
	String supplier_nameString;
	int quantity;
	double amount;
	public ShowOrderContentBody() {
		super();
	}
	public ShowOrderContentBody(String item_name, String supplier_nameString, int quantity, double amount) {
		super();
		this.item_name = item_name;
		this.supplier_nameString = supplier_nameString;
		this.quantity = quantity;
		this.amount = amount;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getSupplier_nameString() {
		return supplier_nameString;
	}
	public void setSupplier_nameString(String supplier_nameString) {
		this.supplier_nameString = supplier_nameString;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
