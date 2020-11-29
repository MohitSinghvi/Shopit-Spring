package com.shopit.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopit.demo.entities.Item;
import com.shopit.demo.repository.ItemRepository;

@Component
@Transactional
public class ProductService implements Service<Item, Long>{

	@Autowired
	private ItemRepository productRepository;
	
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		
		return productRepository.findAll();
	}

	@Override
	public Item get(Long id) {
		// TODO Auto-generated method stub
		
		return productRepository.findById(id).get();
	}

	@Override
	public Item save(Item product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
		
	}

	@Override
	public Item update(Item product) {
		// TODO Auto-generated method stub
		
//		Item product2 = get(product.getId());
//		product2.setBrand(product.getBrand());
//		product2.setCategories(product.getCategories());
//		product2.setDescription(product.getDescription());
//		product2.setImageUrls(product.getImageUrls());
//		product2.setName(product.getName());
//		product2.setNoInStock(product.getNoInStock());
//		product2.setPrice(product.getPrice());
//		product2.setRatings(product.getRatings());
		
		return null;
	}

	@Override
	public Item remove(Long id) {
		// TODO Auto-generated method stub
		Item product = get(id);
		productRepository.delete(product);
		return product;
		
	}
	
}
