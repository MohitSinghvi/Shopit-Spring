package com.shopit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopit.demo.entities.Supplier;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}



