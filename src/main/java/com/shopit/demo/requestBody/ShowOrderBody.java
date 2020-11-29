package com.shopit.demo.requestBody;

import java.util.Set;

public class ShowOrderBody {
	private Long order_id;
	private Long customer_id;
	private Long customer_name;
	private String address;
	private String phone;
	private String date;
	private double amount;
	private Set<ShowOrderContentBody> orderContent;
	public ShowOrderBody() {
		super();
	}
	public ShowOrderBody(Long order_id, Long customer_id, Long customer_name, String address, String phone, String date,
			double amount, Set<ShowOrderContentBody> orderContent) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.amount = amount;
		this.orderContent = orderContent;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public Long getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(Long customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Set<ShowOrderContentBody> getOrderContent() {
		return orderContent;
	}
	public void setOrderContent(Set<ShowOrderContentBody> orderContent) {
		this.orderContent = orderContent;
	}
	
	
	
	
	
	

}
