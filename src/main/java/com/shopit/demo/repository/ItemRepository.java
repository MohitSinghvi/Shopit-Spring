package com.shopit.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopit.demo.entities.Item;
import com.shopit.demo.entities.NamePriceStock;
import com.shopit.demo.entities.Supplier;
import com.shopit.demo.requestBody.ShowCartBody;



//@Repository
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ItemRepository extends JpaRepository<Item, Long> {
	
	public List<Item> findByNameContaining(String name);
	
//	@Query("select"+new com.shopit.demo.entities.ItemSupplier()+" s.name as name,ik.price as price,ik.noInStocks as stock from Item i, Supplier s, ItemSupplier ik where ik.item.id=:id and ik.supplier.id=s.id")
	@Query("select distinct new com.shopit.demo.entities.NamePriceStock(s.id,s.name,ik.price,ik.noInStocks) from Item i, Supplier s, ItemSupplier ik where ik.item.id=i.id and ik.supplier.id=s.id and ik.item.id=:id ")
	public List<NamePriceStock> getSupplierPriceByid(@PathVariable Long id);
	
	
	@Query("select new com.shopit.demo.requestBody.ShowCartBody(c.id,c.name,i.id,i.name,s.id,s.name,ci.quantity,ik.price) from Customer c, Item i, Supplier s, ItemSupplier ik, CartItem ci where  ci.customer.id=:customer_id  and ik.item.id=i.id and ik.supplier.id=s.id and c.id=:customer_id and  i.id=ci.item.id and s.id=ci.supplier.id")
	public List<ShowCartBody>findCartBody(@PathVariable Long customer_id);
	

	@Query("select min(i.price) from ItemSupplier i where i.item.id=:id")
	public double getMinPriceByItemId(@PathVariable Long id);
	
	
	@Query("select new map(min(ik.price) as price,i as item) from Item i, ItemSupplier ik where i.id=ik.item.id group by i.id")
	public Object[] getItemAndMinPrice();
	

}



