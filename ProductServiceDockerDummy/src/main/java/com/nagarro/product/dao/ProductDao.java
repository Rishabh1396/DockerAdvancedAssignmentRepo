package com.nagarro.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.product.model.Product;

public interface ProductDao extends JpaRepository<Product, Long>{

}
