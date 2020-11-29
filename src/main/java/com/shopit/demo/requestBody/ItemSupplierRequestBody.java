package com.shopit.demo.requestBody;

public class ItemSupplierRequestBody {
	long item_id;
	
	long supplier_id;
	
	int no_in_stocks;
	
	double price;

	public ItemSupplierRequestBody() {
		super();
	}

	public ItemSupplierRequestBody(long item_id, long supplier_id, int no_in_stocks, double price) {
		super();
		this.item_id = item_id;
		this.supplier_id = supplier_id;
		this.no_in_stocks = no_in_stocks;
		this.price = price;
	}

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public long getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(long supplier_id) {
		this.supplier_id = supplier_id;
	}

	public int getNo_in_stocks() {
		return no_in_stocks;
	}

	public void setNo_in_stocks(int no_in_stocks) {
		this.no_in_stocks = no_in_stocks;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
