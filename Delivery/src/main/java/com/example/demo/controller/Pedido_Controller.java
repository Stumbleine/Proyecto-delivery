package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.document.Pedido;
import com.example.demo.document.Producto;
import com.example.demo.document.Producto_Pedido;
import com.example.demo.repository.Pedido_Repository;
import com.example.demo.service.Pedido_Service;

@Controller
public class Pedido_Controller {
		@Autowired
		private Pedido_Service service;
		@Autowired
		private Pedido_Repository repo;
		@CrossOrigin
		@PostMapping("/api/pedido")
		public ResponseEntity<Producto> guardar(@RequestBody Pedido pedido){
			
			service.guardar_pedido(pedido);
			
			 return new ResponseEntity<Producto>(HttpStatus.OK); 
		}
		
		@CrossOrigin
		@GetMapping("/api/pedido")
		public ResponseEntity<List<Pedido>> lista_pedido(){
			 List<Pedido> lista = new ArrayList<Pedido>();
			try {
			   //servicio_producto.lista_de_productos(lista);
			  lista=repo.findAll();
			   return ResponseEntity.ok(lista);
			   } catch (Exception e) {
			    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			  }
		}
}
