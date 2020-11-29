package com.shopit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopit.demo.entities.OrderContent;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface OrderContentRepository extends JpaRepository<OrderContent, Long>{

	
}
