package com.shopit.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class NamePriceStock {
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int x;
	
	private long id;
	
	private String name;
	private double price;
	private int stock;
	
	
	
	public NamePriceStock() {
		super();
	}



	public NamePriceStock(Long id,String name, double price, int stock) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	
	
}
