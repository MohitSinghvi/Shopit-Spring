package com.shopit.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderContent {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Item item;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Supplier supplier;
	

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="order_id")
	@JsonIgnore
	private MyOrder order;
	
	
	private int quantity;


	public OrderContent() {
		super();
	}


	public OrderContent(Long id, Item item, Supplier supplier, MyOrder order, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.supplier = supplier;
		this.order = order;
		this.quantity = quantity;
	}
	
	public OrderContent(Item item, Supplier supplier, MyOrder order, int quantity) {
		super();
		this.item = item;
		this.supplier = supplier;
		this.order = order;
		this.quantity = quantity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public Supplier getSupplier() {
		return supplier;
	}


	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	public MyOrder getOrder() {
		return order;
	}


	public void setOrder(MyOrder order) {
		this.order = order;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	
	
	
	

	
	
	
}
