package com.shopit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopit.demo.entities.Item;
import com.shopit.demo.repository.ItemRepository;

public class ItemService implements Service<Item, Long>{

	@Autowired
	ItemRepository ItemRepository;
	
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item save(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item update(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item remove(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
