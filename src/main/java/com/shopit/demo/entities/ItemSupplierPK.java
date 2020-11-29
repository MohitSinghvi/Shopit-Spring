package com.shopit.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemSupplierPK implements Serializable{

	@Column(name="item_id")
	private Long item_id;
	
	@Column(name="supplier_id")
	private Long supplier_id;

	public ItemSupplierPK() {
		super();
	}

	public ItemSupplierPK(Long item_id, Long supplier_id) {
		super();
		this.item_id = item_id;
		this.supplier_id = supplier_id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_id == null) ? 0 : item_id.hashCode());
		result = prime * result + ((supplier_id == null) ? 0 : supplier_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemSupplierPK other = (ItemSupplierPK) obj;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		if (supplier_id == null) {
			if (other.supplier_id != null)
				return false;
		} else if (!supplier_id.equals(other.supplier_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n\tItemSupplierPK [item_id=" + item_id + ", supplier_id=" + supplier_id + "]";
	}
	
	
	
	
	
}
