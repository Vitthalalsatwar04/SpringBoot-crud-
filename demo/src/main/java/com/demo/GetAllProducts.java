package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Product;
import com.demo.service.ProductService;

@SpringBootApplication
public class GetAllProducts {
 

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(DeleteById.class, args);
	ProductService ps = context.getBean(ProductService.class);
	
	
	List<Product> list = ps.findAll();
	for(Product p:list)
		System.out.println(p);
	
	}

}
