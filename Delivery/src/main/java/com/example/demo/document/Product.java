package com.example.demo.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Product")



public class Product {
	 @Id
		private String id;
		private String nombre;
		private String tamano;
		private double precio;
		private boolean estado;
		
		
		
		
		public Product(String nombre, String tamano, double precio,boolean estado) {
			super();
			this.nombre = nombre;
			this.tamano = tamano;
			this.precio = precio;
			this.estado = estado;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTamano() {
			return tamano;
		}
		public void setTamano(String tamano) {
			this.tamano = tamano;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		
		
		
}
