package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Product;
import com.example.demo.repository.RespositoryProduct;





@Service
public class Service_Product {
	@Autowired
	RespositoryProduct repo;
	
	public void add(Product producto) {
		repo.save(producto);
	
		
	}

	public Product add(String nombre, String tamano, double precio,boolean estado) {
		Product product=new Product(nombre, tamano, precio,estado);
		repo.save(product);
		return product;
	}
}	
