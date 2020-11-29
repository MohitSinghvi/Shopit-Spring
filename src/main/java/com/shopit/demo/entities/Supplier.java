package com.shopit.demo.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Supplier {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
//	@OneToMany(mappedBy ="supplier",cascade = {CascadeType.PERSIST,CascadeType.MERGE} )
//	Set<PriceStock> priceStock;
//	private double price;
	
	
	@OneToMany(mappedBy = "supplier")
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonIgnore
	private Set<ItemSupplier> itemSuppliers = new HashSet<ItemSupplier>();

	public Supplier() {
		super();
	}

	public Supplier(Long id, String name, Set<ItemSupplier> itemSuppliers) {
		super();
		this.id = id;
		this.name = name;
		this.itemSuppliers = itemSuppliers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ItemSupplier> getItemSuppliers() {
		return itemSuppliers;
	}

	public void setItemSuppliers(Set<ItemSupplier> itemSuppliers) {
		this.itemSuppliers = itemSuppliers;
	}

	@Override
	public String toString() {
		return "\n\tSupplier [id=" + id + ", name=" + name + ", itemSuppliers=" + itemSuppliers + "]";
	}
	
	
	
	
	
	
}
