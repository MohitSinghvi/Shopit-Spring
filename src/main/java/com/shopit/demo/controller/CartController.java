package com.shopit.demo.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopit.demo.entities.CartItem;
import com.shopit.demo.entities.Customer;
import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.ItemSupplier;
import com.shopit.demo.entities.Supplier;
import com.shopit.demo.repository.CartItemRepository;
import com.shopit.demo.repository.CustomerRepository;
import com.shopit.demo.repository.ItemRepository;
import com.shopit.demo.repository.ItemSupplierRepository;
import com.shopit.demo.repository.SupplierRepository;
import com.shopit.demo.requestBody.CartRequestBody;
import com.shopit.demo.requestBody.ShowCartBody;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CartController {
	
	@Autowired
	CartItemRepository cartItemRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	SupplierRepository supplierRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ItemSupplierRepository itemSupplierRepository;
	
	
	@PostMapping(path="/addToCart")
	public CartItem addToCart(@RequestBody CartRequestBody cartRequestBody) {
		
		
		Item item= itemRepository.findById(cartRequestBody.getItem_id()).get();
		Supplier supplier = supplierRepository.findById(cartRequestBody.getSupplier_id()).get();
		Customer customer = customerRepository.findById(cartRequestBody.getCustomer_id()).get();
		int quantity = cartRequestBody.getQuantity();
		
		CartItem cartItem = new CartItem(customer, item, supplier, quantity);
		
		return cartItemRepository.save(cartItem);
		
		
		
		
		
		
	}
	
	
	@PostMapping(path="/removeFromCart")
	public void removeFromCart(@RequestBody CartRequestBody cartRequestBody) {
		Item item= itemRepository.findById(cartRequestBody.getItem_id()).get();
		Supplier supplier = supplierRepository.findById(cartRequestBody.getSupplier_id()).get();
		Customer customer = customerRepository.findById(cartRequestBody.getCustomer_id()).get();
//		int quantity = cartRequestBody.getQuantity();
//		double price= cartRequestBody.getPrice();
		
//		CartItem cartItem = new CartItem(customer, item, supplier, quantity);
		CartItem cartItem = cartItemRepository.findByCustomerAndItemAndSupplier(customer, item, supplier).get(0);
		Long cartItemIdLong=cartItem.getId();
		
		
		
		
		cartItemRepository.delete(cartItem);
		
//		return cartItemRepository.findById(cartItemIdLong).get()==null;
	
		
		
		
	}
	
	@GetMapping(path="/getCart/{id}")
	public List<ShowCartBody> getCartByCustomerId( @PathVariable("id") Long id) {
		
		return itemRepository.findCartBody(id);
		
//		List<CartRequestBody> cartRequestBodies = new ArrayList<CartRequestBody>();
//		
//		for(CartItem cartItem: cartItems) {
//			ItemSupplier itemSupplier = itemSupplierRepository.findByItemAndSupplier(cartItem.getItem(), cartItem.getSupplier());
//			CartRequestBody cartRequestBody = new CartRequestBody(cartItem.getCustomer().getId(), cartItem.getItem().getId(), cartItem.getSupplier().getId(), cartItem.getQuantity(), itemSupplier.getPrice());
//			cartRequestBodies.add(cartRequestBody);
//		}
//		return cartRequestBodies;
		
		
		
		
		
	}
	
	
	
	@GetMapping(path="/getPrice/{item_id}/{supplier_id}")
	public double getPrice(@PathVariable Long item_id,@PathVariable Long supplier_id) {
		return itemSupplierRepository.findByItemAndSupplier(itemRepository.findById(item_id).get(), supplierRepository.findById(supplier_id).get()).getPrice();
	}
	
	@GetMapping(path = "/hello")
	public String hello() {
		return "hello";
	}
	
	@DeleteMapping(path="clearCart/{customer_id}")
	@Transactional
	public void clearCart(@PathVariable Long customer_id) {
		Customer customer = customerRepository.findById(customer_id).get();
		cartItemRepository.deleteByCustomer(customer);
	}
	
	
	
	

}
