package com.shopit.demo.requestBody;

public class OrderContentRequestBody {

	Long item_id;
	Long supplier_id;
	int quantity;
	public OrderContentRequestBody() {
		super();
	}
	public OrderContentRequestBody(Long item_id, Long supplier_id, int quantity) {
		super();
		this.item_id = item_id;
		this.supplier_id = supplier_id;
		this.quantity = quantity;
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
	
	
}
