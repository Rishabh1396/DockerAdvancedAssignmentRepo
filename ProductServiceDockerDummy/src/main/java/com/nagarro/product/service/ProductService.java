package com.nagarro.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nagarro.product.dao.ProductDao;
import com.nagarro.product.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;

	@Cacheable(value = "allProductscache",key = "'globalDataKey'" )
	public List<Product> getAllProducts() {
		List<Product> products = productDao.findAll();
		return products;
	}

	public void addProduct(Product product) {
		Product pro = new Product();
		pro.setProduct_description(product.getProduct_description());
		pro.setProduct_name(product.getProduct_name());
		pro.setProduct_quantity(product.getProduct_quantity());
		productDao.save(pro);
		
	}

}
