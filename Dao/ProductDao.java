package com.productMain.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.productMain.Product.Product;
import com.productMain.Repository.ProductRepository;
@Repository
public class ProductDao {

	@Autowired
	ProductRepository proRepo;
	public String addProduct(@RequestBody List<Product> pdt) {
		 proRepo.saveAll(pdt);
		 return "Product list added successfully";
	}
	public List<Product> getProduct(){
		return proRepo.findAll();
	}
	public String deleteProduct(int id) {
		 proRepo.deleteById(id);
		 return "Mentioned id has deleted";
	}
	public String updateProduct(Product value) {
		 proRepo.save(value);
		 return "Product updated successfully";
	}
	public List<Product> getByPrice(int price1,int price2){
		return proRepo.getProductByPrice(price1,price2);
	}
}
