package com.shopit.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.ItemSupplier;
import com.shopit.demo.entities.ItemSupplierPK;
import com.shopit.demo.entities.Supplier;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ItemSupplierRepository extends JpaRepository<ItemSupplier, ItemSupplierPK>  {
	 
	
	public ItemSupplier findByItemAndSupplier(Item item, Supplier supplier);

}
