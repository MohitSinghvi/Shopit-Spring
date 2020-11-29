package com.shopit.demo.requestBody;

import java.util.Set;

import com.shopit.demo.entities.OrderContent;

public class OrderRequestBody {
	Long customer_id;
	String date;
	Double amount;
	Set<OrderContentRequestBody> orderContents;
	
	public OrderRequestBody() {
		super();
	}

	public OrderRequestBody(Long customer_id, String date, Double amount, Set<OrderContentRequestBody> orderContents) {
		super();
		this.customer_id = customer_id;
		this.date = date;
		this.amount = amount;
		this.orderContents = orderContents;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Set<OrderContentRequestBody> getOrderContents() {
		return orderContents;
	}

	public void setOrderContents(Set<OrderContentRequestBody> orderContents) {
		this.orderContents = orderContents;
	}
	
	
	

}
