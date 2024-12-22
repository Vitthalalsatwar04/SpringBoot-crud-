package com.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Product;
import com.demo.service.ProductService;

@SpringBootApplication
public class CreateProduct {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CreateProduct.class, args);
		ProductService ps = context.getBean(ProductService.class);

//		for single object 

//		Product p = new Product();

//		Insertion of the data or post the new product 

//		p.setPname("Fastrack Goggles");
//		p.setPdescription("This goggles is used every where");
//		p.setPtype("Fasion");
//		p.setPprice(1254); 
//		System.out.println(ps.save(p));

//		for multiple object 
		String type[] = { "moblie & accessories", "computer & hardware", "sport equipments", "study materials",
				"home furnitures", "electronics", "Fashion", "grossary", "medicine" };
		String description[] = { "bajaj product", "sony product", "smartphone", "good product", "cipla product",
				"good for health" };
		for (int i = 1; i <= 5000; i++) {
			Product p = new Product();
			StringBuilder name = new StringBuilder();
			for (int j = 1; j <= 10; j++)
				name.append((char) (new Random().nextInt(26) + 65));
			p.setPname(name.toString());
			p.setPprice(new Random().nextDouble() * 1000000);
			p.setPtype(type[new Random().nextInt(type.length)]);
			p.setPdescription(description[new Random().nextInt(description.length)]);
			System.out.println(ps.save(p));
		}

	}

}
