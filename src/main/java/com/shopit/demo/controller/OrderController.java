package com.shopit.demo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopit.demo.entities.Customer;
import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.MyOrder;
import com.shopit.demo.entities.OrderContent;
import com.shopit.demo.entities.Supplier;
import com.shopit.demo.repository.CustomerRepository;
import com.shopit.demo.repository.ItemRepository;
import com.shopit.demo.repository.OrderContentRepository;
import com.shopit.demo.repository.OrderRepository;
import com.shopit.demo.repository.SupplierRepository;
import com.shopit.demo.requestBody.OrderContentRequestBody;
import com.shopit.demo.requestBody.OrderRequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	@Autowired
	OrderContentRepository orderContentRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	
	@Autowired
	SupplierRepository supplierRepository;
	
	
	
	@PostMapping(path = "/addOrder")
	public 	void addOrder(@RequestBody OrderRequestBody orderRequestBody) {
		Customer customer = customerRepository.findById(orderRequestBody.getCustomer_id()).get();
		
		
		
//		LocalDate date = LocalDate.parse(orderRequestBody.getDate(),DateTimeFormatter.ofPattern("d/MM/yyyy"));
		LocalDate date = LocalDate.now();
		
		
		
		double amount = orderRequestBody.getAmount();
		
		MyOrder order = new MyOrder(customer, date, amount);
		orderRepository.save(order);
		
		
		Set<OrderContent> orderContents=new HashSet<OrderContent>();
		for(OrderContentRequestBody orderContentRB: orderRequestBody.getOrderContents()) {
			Item item = itemRepository.findById(orderContentRB.getItem_id()).get();
			Supplier supplier = supplierRepository.findById(orderContentRB.getSupplier_id()).get();
			int quantity = orderContentRB.getQuantity();
			
			OrderContent orderContent = new OrderContent(item, supplier, order, quantity);
			orderContents.add(orderContent);
		}
		orderContentRepository.saveAll(orderContents);
		
	}
	
	@GetMapping(path = "/getOrders/{customer_id}")
	public List<MyOrder> getOrders(@PathVariable Long customer_id) {
		return orderRepository.findMyOrdersByCustomerOrderByIdDesc(customerRepository.findById(customer_id).get());
		
	}
}
