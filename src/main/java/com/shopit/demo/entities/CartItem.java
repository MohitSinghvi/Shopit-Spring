package com.shopit.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class CartItem implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Item item;
	
	@ManyToOne
	private Supplier supplier;
	
	private int quantity;
	
	

	public CartItem() {
		super();
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public CartItem(long id, Customer customer, Item item, Supplier supplier, int quantity) {
		super();
		this.id = id;
		this.customer = customer;
		this.item = item;
		this.supplier = supplier;
		this.quantity = quantity;
	}



	public CartItem(Customer customer, Item item, Supplier supplier, int quantity) {
		super();
		this.customer = customer;
		this.item = item;
		this.supplier = supplier;
		this.quantity = quantity;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	
}
