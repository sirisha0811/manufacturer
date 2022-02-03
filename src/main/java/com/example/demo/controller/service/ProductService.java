package com.example.demo.controller.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
    ProductRepository productRepository;

	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> getproduct(Integer id) {
		return productRepository.findById(id);
	}

	public void saveProduct(@Valid Product product) {
		productRepository.save(product);
		
	}

}
