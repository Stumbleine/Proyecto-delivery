package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Role;

@Repository
public interface Rol_Repository extends MongoRepository<Role,String>{
	Role findByRol(String rol);
}
