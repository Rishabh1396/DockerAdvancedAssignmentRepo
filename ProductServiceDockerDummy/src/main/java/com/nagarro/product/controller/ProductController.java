package com.nagarro.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.product.model.Product;
import com.nagarro.product.service.ProductService;

@Controller
@RequestMapping
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity(productService.getAllProducts(), HttpStatus.OK);
	}

}
