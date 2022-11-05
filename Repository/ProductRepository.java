package com.productMain.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.productMain.Product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value="select * from product where price>=:price1 AND price<=:price2", nativeQuery=true)
	public List<Product> getProductByPrice(@Param("price1")int price1,@Param("price2")int price2);
}
