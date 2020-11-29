package com.shopit.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopit.demo.repository.ItemRepository;
import com.shopit.demo.repository.SupplierRepository;

@Entity
public class ItemSupplier {
	@EmbeddedId
	private ItemSupplierPK id;
	
	@ManyToOne
	@MapsId("item_id")
	@JoinColumn(name="item_id")
//	@JsonProperty("item_id")
	@JsonIgnore
	private Item item;
	
	@ManyToOne
	@MapsId("supplier_id")
//	@JsonProperty("supplier_id")
	@JoinColumn(name = "supplier_id")
	@JsonIgnore
	private Supplier supplier;
	
//	@Transient
//	@JsonIgnore
//	@Autowired ItemRepository itemRepository;
//	
//	@Transient
//	@JsonIgnore
//	@Autowired SupplierRepository supplierRepository;
	
	private Double price;
	private int noInStocks;
	public ItemSupplier(ItemSupplierPK id, Item item, Supplier supplier, Double price, int noInStocks) {
		super();
		this.id = id;
//		this.item = item;
//		this.supplier = supplier;
		this.price = price;
		this.noInStocks = noInStocks;
	}
	public ItemSupplier( Item item, Supplier supplier, Double price, int noInStocks) {
		super();
		
		this.item = item;
		this.supplier = supplier;
		
		id=new ItemSupplierPK(item.getId(),supplier.getId());
		
		this.price = price;
		this.noInStocks = noInStocks;
	}
	
	
//	@JsonProperty("item_id")
//	public void setItemId(Long item_id) {
//		this.item=itemRepository.getOne(item_id);
//	}
//	
//	@JsonProperty("supplier_id")
//	public void setSupplierId(Long supplier_id) {
//		this.supplier=supplierRepository.getOne(supplier_id);
//	}
	
	public ItemSupplier() {
		super();
	}
	public ItemSupplierPK getId() {
		return id;
	}
	public void setId(ItemSupplierPK id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
//	public Long getItemId() {
//		return item.getId();
//	}
	
	
	
	public void setItem(Item item) {
		this.item = item;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNoInStocks() {
		return noInStocks;
	}
	public void setNoInStocks(int noInStocks) {
		this.noInStocks = noInStocks;
	}

	@Override
	public String toString() {
		return "\n\tItemSupplier [id=" + id + ", item=" + item.getName() + ", supplier=" + supplier.getName() + ", price=" + price
				+ ", noInStocks=" + noInStocks + "]";
	}
	
	
	
	
	
	

}
