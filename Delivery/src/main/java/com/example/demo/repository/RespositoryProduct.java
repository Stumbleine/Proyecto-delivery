package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Product;

@Repository
public interface RespositoryProduct extends MongoRepository<Product, String>{

}
