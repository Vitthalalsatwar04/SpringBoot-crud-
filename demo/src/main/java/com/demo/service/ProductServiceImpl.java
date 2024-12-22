package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pd;

	@Override
	public Product save(Product p) {
	
		return pd.save(p);
	}

	@Override
	public List<Product> findAll() {
		return pd.findAll();
	}

	@Override
	public Product findByPid(int pid) {
		
		return pd.findByPid(pid);
	}

	@Override
	public int deletebyPid(int pid) {
		
		
		return pd.deletebyPid(pid);
	}
	

}
