package com.productMain.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.productMain.Product.Product;
import com.productMain.Service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService proSer;
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody List<Product> pdt) {
		return proSer.addProduct(pdt);
	}
	@GetMapping("/getProduct")
	public List<Product> getProduct(){
		return proSer.getProduct();
	}
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return proSer.deleteProduct(id);
	}
	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody Product value) {
		return proSer.updateProduct(value);
	}
	@GetMapping("/getProductByPrice/{price1}/{price2}")
	public List<Product> getByPrice(@PathVariable int price1,@PathVariable int price2){
		return proSer.getByPrice(price1,price2);
	}
}
