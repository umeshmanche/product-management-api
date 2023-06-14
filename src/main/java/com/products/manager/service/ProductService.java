package com.products.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.manager.repository.Product;
import com.products.manager.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
	
	public Optional<Product> getProductById(int id) {
		return repo.findById(id);
	}
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "deleted";
	}
	
	public Product createProduct(Product product) {
		return repo.save(product);
	}
	
	public Product updateProduct(int id, Product product) {
		if(!repo.existsById(id)) {
			
		}
		return repo.save(product);
	}
}
