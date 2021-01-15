package com.example.demo.controller;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.document.Usuario;
import com.example.demo.service.Usuario_Service;

@Controller
public class Usuario_Controller {
	@Autowired
	private Usuario_Service service;
	
	@PermitAll
	@PostMapping("/api/usuario")
	public ResponseEntity guardar(@RequestParam("nombre")String nombre,@RequestParam("pass")String pass){
		service.guardar(nombre, pass);
	 
		return new ResponseEntity(HttpStatus.OK);
	}
}
