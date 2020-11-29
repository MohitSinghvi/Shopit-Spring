package com.shopit.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopit.demo.entities.CartItem;
import com.shopit.demo.entities.Customer;
import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.Supplier;
import com.shopit.demo.requestBody.ShowCartBody;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	
	public List<CartItem> findAllByCustomerId(Long id);
	
	
	public List<CartItem> findByCustomerAndItemAndSupplier(Customer customer, Item item, Supplier supplier);
	
	public void deleteByCustomer(Customer customer);
	
	
	
	
}
