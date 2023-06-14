package com.products.manager.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.products.manager.repository.Product;
import com.products.manager.repository.ProductRepository;

@Configuration
public class ProductConfig {
	
	@Bean
	CommandLineRunner runner(ProductRepository repo) {
		return args -> {
			repo.saveAll(List.of(
					new Product("nord 2", "mobile", 25000, LocalDate.now().getYear()),
					new Product("thinkpad 2", "laptop", 55000, LocalDate.now().getYear()),
					new Product("jbl soundbar","accessories", 12000, LocalDate.now().getYear()),
					new Product("lava agni 2", "mobile", 22000, LocalDate.now().getYear()),
					new Product("syska led", "bulb", 499, LocalDate.now().getYear()),
					new Product("macbook", "laptop", 105000, LocalDate.now().getYear()),
					new Product("boat airdopes", "accessories", 55000, LocalDate.now().getYear())
					));
		};
	}
}
