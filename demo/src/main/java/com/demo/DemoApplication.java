package com.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Product;
import com.demo.service.ProductService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(DemoApplication.class, args);
	ProductService ps = context.getBean(ProductService.class);
	

	

	
	}

}
