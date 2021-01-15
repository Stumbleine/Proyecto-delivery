package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Usuario;

@Repository
public interface Usuario_Repository extends MongoRepository<Usuario, String> {
	Usuario findByNombre(String nombre);
}
