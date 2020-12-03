package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.document.Producto;
import com.example.demo.repository.Producto_repositorio;
import com.example.demo.service.Producto_Servicio;


@Controller
public class Producto_Controlador {
	@Autowired
	private Producto_Servicio servicio_producto;
	@Autowired
	Producto_repositorio repo;
	@CrossOrigin
	@PostMapping("/api/productos")
	public ResponseEntity<Producto> guardar_producto(@RequestParam("nombre") String nombre,@RequestParam("tamaño") String tamaño,@RequestParam("tipo") String tipo,@RequestParam("precio") int precio, @RequestParam("image") MultipartFile image, Model model) throws IOException {
        try {
		String ide = servicio_producto.guardar_producto(nombre, tamaño, tipo, precio, image);
        return new ResponseEntity<Producto>(HttpStatus.OK);
        }
        catch (Exception e) {
        	return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    } 
	
	@PermitAll
	@DeleteMapping("api/productos/{id}")
	public ResponseEntity<Producto> eliminar_producto(@PathVariable(value = "id")String id) {
		try {
			servicio_producto.eliminar_producto(id);
			return new ResponseEntity<>(null,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@CrossOrigin
	@GetMapping("/api/productos")
	public ResponseEntity<List<Producto>> lista_productos(){
		 List<Producto> lista = new ArrayList<Producto>();
		try {
		   //servicio_producto.lista_de_productos(lista);
		  lista=repo.findAll();
		   return ResponseEntity.ok(lista);
		   } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}
	
	@CrossOrigin
	@PostMapping("/api/productos/{id}")
	public ResponseEntity<Producto> actualizar_producto(@PathVariable(value = "id")String id,@RequestParam("nombre") String nombre,@RequestParam("tamaño") String tamaño,@RequestParam("tipo") String tipo,@RequestParam("precio") int precio, @RequestParam("image") MultipartFile image, Model model) throws IOException {
		try {
			
			servicio_producto.actualizar_producto(id, nombre, tamaño, tipo, precio, image);
			return new ResponseEntity<Producto>(HttpStatus.OK); 
		}catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
		
	}
}