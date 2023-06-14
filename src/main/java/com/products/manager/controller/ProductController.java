package com.products.manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.products.manager.repository.Product;
import com.products.manager.service.ProductService;

@RestController
@RequestMapping("/product-api")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	/*
	 * @GetMapping("/product") public Optional<Product>
	 * getProductById(@RequestParam("id") String id) { return
	 * service.getProductById(Integer.parseInt(id)); }
	 */
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable String id) {
		return service.getProductById(Integer.parseInt(id));
	}
	
	@PostMapping("/product")
	public Product createProduct(@PathVariable Product product) {
		return service.createProduct(product);
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable String id) {
		return service.deleteById(Integer.parseInt(id));
	}
	
	@PutMapping("/product/{id}")
	public Product updateproduct(@PathVariable String id, @RequestBody Product product) {
		return service.updateProduct(Integer.parseInt(id), product);
	}
}
