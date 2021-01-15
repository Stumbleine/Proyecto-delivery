package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Pedido;

@Repository
public interface Pedido_Repository extends MongoRepository<Pedido,String> {

	List<Pedido> findAll();
	
}
