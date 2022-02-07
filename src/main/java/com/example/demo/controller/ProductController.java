package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;



@RestController
public class ProductController {
	@Autowired
	 ProductService productService;
	@GetMapping("/product")
	Iterable<Product> getProducts() {
	      return productService.getProducts();
	 }
	@GetMapping("/product/{id}")
	Optional<Product> getProducts(@PathVariable("id")Integer id){
		return productService.getproduct(id);
	}

	@PostMapping("/product")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void createProduct(@RequestBody @Valid Product product) {
		productService.saveProduct(product);
	}

}