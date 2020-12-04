package com.shopit.demo.entities;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class MyOrder {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy ="order",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<OrderContent> orderContents;
	
	
	LocalDate date;

	private double amount;
//	@ManyToOne

	public MyOrder() {
		super();
	}
	public MyOrder(long id,Customer customer, Set<OrderContent> orderContents, LocalDate date,
			double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.orderContents = orderContents;
		this.date = date;
		this.amount = amount;
	}
	
	public MyOrder(Customer customer,LocalDate date, double amount) {
		this.customer=customer;
		this.date=date;
		this.amount=amount;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		customer = customer;
	}
	public Set<OrderContent> getOrderContents() {
		return orderContents;
	}
	public void setOrderContents(Set<OrderContent> orderContents) {
		this.orderContents = orderContents;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
//	
	
	
	
	

}
