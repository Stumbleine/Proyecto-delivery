package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Producto;


@Repository
public interface Producto_repositorio extends MongoRepository<Producto,String> {

	Producto findByNombre(String nombre);
	Optional<Producto> findById(String id);
	List<Producto> findByEstado(boolean estado);
	List<Producto> findByTipo(String tipo);
}
