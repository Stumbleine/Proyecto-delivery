package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Pedido;
import com.example.demo.document.Producto;
import com.example.demo.document.Producto_Pedido;
import com.example.demo.repository.Pedido_Repository;

@Service
public class Pedido_Service {
	
	@Autowired
	private Pedido_Repository repo;
	
	public void guardar_pedido(Pedido pedido) {
		
		repo.save(pedido);
	}
	
	public List<Pedido> listar() {
		return repo.findAll();
		
		
	}
}
