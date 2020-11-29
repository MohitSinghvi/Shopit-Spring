package com.shopit.demo.entities;



import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Item {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;	
	private String description;
	
//	@ManyToMany
//	List<Supplier> suppliers;
	
	
//	@OneToMany(mappedBy ="item" ,fetch=FetchType.LAZY,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//	Set<PriceStock> priceStock;
	
//	@OneToMany(mappedBy ="item")
	
	@OneToMany(mappedBy = "item" ,fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<ItemSupplier> itemSupplier = new HashSet<ItemSupplier>();
	
	
	
	@ElementCollection
	Map<String, String> specifications = new HashMap<String, String>();



	public Item() {
		super();
	}



	public Item(long id, String name, String description, Set<ItemSupplier> itemSupplier,
			Map<String, String> specifications) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.itemSupplier = itemSupplier;
		this.specifications = specifications;
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



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Set<ItemSupplier> getItemSupplier() {
		return itemSupplier;
	}



	public void setItemSupplier(Set<ItemSupplier> itemSupplier) {
		this.itemSupplier = itemSupplier;
	}



	public Map<String, String> getSpecifications() {
		return specifications;
	}



	public void setSpecifications(Map<String, String> specifications) {
		this.specifications = specifications;
	}



	@Override
	public String toString() {
		return "\n\tItem [id=" + id + ", name=" + name + ", description=" + description + ", itemSupplier=" + itemSupplier
				+ ", specifications=" + specifications + "]";
	}
	
	
	
	
	
}
