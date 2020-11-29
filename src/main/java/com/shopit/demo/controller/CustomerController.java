package com.shopit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopit.demo.entities.Customer;
import com.shopit.demo.repository.CustomerRepository;

@RestController
//@RequestMapping(path="/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping(path="/customers/updateAddressAndPhone")
	public Customer updateCustomer(@RequestBody Customer customer) {
		Customer new_customer = customerRepository.findById(customer.getId()).get();
		new_customer.setAddress(customer.getAddress());
		new_customer.setPhone(customer.getPhone());
		return customerRepository.save(new_customer);
		
	}

}
