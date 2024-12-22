package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	
	Product save(Product p);
	List<Product> findAll();
	Product findByPid(int pid); 
	int deletebyPid(int pid);
	
}
