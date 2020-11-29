package com.shopit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.ItemSupplier;
import com.shopit.demo.repository.ItemRepository;
import com.shopit.demo.repository.ItemSupplierRepository;
import com.shopit.demo.repository.SupplierRepository;
import com.shopit.demo.requestBody.ItemSupplierRequestBody;

@RestController
//@RequestMapping(path="/items")
@CrossOrigin(origins = "http://localhost:4200")

public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private ItemSupplierRepository itemSupplierRepository;
//	
//	public Item Save(Item item) {
//		
//		
//		
//		return item;
//	}
	
	@PostMapping(path="/addItemSupplier")
	public ItemSupplier addItemSupplier(@RequestBody ItemSupplierRequestBody itemSupplierRequestBody) {
		
		return itemSupplierRepository.save(new ItemSupplier(itemRepository.findById(itemSupplierRequestBody.getItem_id()).get(), supplierRepository.findById(itemSupplierRequestBody.getSupplier_id()).get(), itemSupplierRequestBody.getPrice(), itemSupplierRequestBody.getNo_in_stocks()));
	}
	
	

}
