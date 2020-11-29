package com.shopit.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.shopit.demo.entities.Customer;
import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.MyOrder;
import com.shopit.demo.entities.Supplier;

@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer  {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Item.class);
		config.exposeIdsFor(Supplier.class);
		config.exposeIdsFor(MyOrder.class);
		config.exposeIdsFor(Customer.class);
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
	}
}

