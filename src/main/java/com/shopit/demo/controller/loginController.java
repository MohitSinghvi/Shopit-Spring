package com.shopit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopit.demo.entities.Customer;
import com.shopit.demo.repository.CustomerRepository;
import com.shopit.demo.requestBody.LoginRequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class loginController {

	@Autowired
	CustomerRepository customerRepository;
	
	
	@PostMapping(value = "/login")
	public Customer isUserPasswordPresent(@RequestBody LoginRequestBody loginRequestBody) {
		//TODO: process POST request
		
		return customerRepository.findByEmailAndPassword(loginRequestBody.getEmail(), loginRequestBody.getPassword());
		
	}

}
