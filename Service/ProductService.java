package com.productMain.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.productMain.Dao.ProductDao;
import com.productMain.Product.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	public String addProduct(@RequestBody List<Product> pdt) {
		return proDao.addProduct(pdt);
	}
	public List<Product> getProduct(){
		return proDao.getProduct();
	}
	public String deleteProduct(int id) {
		return proDao.deleteProduct(id);
	}
	public String updateProduct(Product value) {
		return proDao.updateProduct(value);
	}
	public List<Product> getByPrice(int price1,int price2){
		return proDao.getByPrice(price1,price2);
	}
}
