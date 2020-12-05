package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.document.Product;
import com.example.demo.repository.RespositoryProduct;
import com.example.demo.service.Service_Product;

@Controller
public class ControllerProduct {
	@Autowired
	private RespositoryProduct repoProducto;
	
	
	@Autowired
	private Service_Product servicio;
	@PermitAll
	@GetMapping("/productos")
	public ResponseEntity<List<Product>> lista_product(){
		 List<Product> lista = new ArrayList<Product>();
		try {
		   //servicio_producto.lista_de_productos(lista);
		  lista=repoProducto.findAll();
		   return ResponseEntity.ok(lista);
		   } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}
	@PermitAll
	@PostMapping("/productos")
	public ResponseEntity<Product> save(@RequestParam("nombre") String nombre,@RequestParam("tamano")String tamano,@RequestParam("precio")double precio){
		Product product=servicio.add(nombre,tamano,precio);
		return ResponseEntity.ok(product);
	}
}
