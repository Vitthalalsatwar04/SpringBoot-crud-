package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	Product save(Product p);
	List<Product> findAll();
	Product findByPid(int pid); 
	int deletebyPid(int pid);

}
