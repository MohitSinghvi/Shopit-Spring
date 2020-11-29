package com.shopit.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopit.demo.entities.Customer;
import com.shopit.demo.entities.MyOrder;
import com.shopit.demo.requestBody.ShowOrderBody;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface OrderRepository extends JpaRepository<MyOrder, Long> {

//	@Query("select new com.shopit.demo.requestBody.ShowOrderBody() from  ")
//	
//	public ShowOrderBody getOrders();
	
	
	public List<MyOrder> findMyOrdersByCustomerOrderByIdDesc(Customer customer);
}
