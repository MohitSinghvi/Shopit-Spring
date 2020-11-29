package com.shopit.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shopit.demo.entities.Item;
import com.shopit.demo.service.ItemService;
import com.shopit.demo.service.ProductService;

@SpringBootApplication
public class ShopItApplication implements CommandLineRunner{

	@Autowired
	ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(ShopItApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Item product1 = new Item("Iphone 12", Arrays.asList("SmartPhone","Phone","Mobile"), Arrays.asList("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-blue-hero?wid=940&hei=1112&fmt=png-alpha&qlt=80&.v=1604021661000","https://photos5.appleinsider.com/gallery/35364-65139-iPhone-12-Rumor-Roundup-xl.jpg"), "Best Iphone Ever", "Apple", 99999.0,Arrays.asList(3.5,4.5,5.0), 100);
//		productService.save(product1);
//		
		
//		Item product2 = new Item("One plus 8T", Arrays.asList("SmartPhone","Phone","Mobile"), Arrays.asList("https://images-na.ssl-images-amazon.com/images/I/71m05O2uNdL._SX679_.jpg"), "Best One Plus Ever", "One plus", 49999.0,Arrays.asList(3.3,4.2,4.0), 120);
//		productService.save(product2);
		
		
		System.out.println(productService.getAll());
		
		
		 
	}
	

}
