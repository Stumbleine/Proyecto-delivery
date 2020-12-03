package com.example.demo.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Product")

public class Product {
	 @Id
		private ObjectId id;
		private String nombre;
		private String tamaño;
		private double precio;
		public ObjectId getId() {
			return id;
		}
		public void setId(ObjectId id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTamaño() {
			return tamaño;
		}
		public void setTamaño(String tamaño) {
			this.tamaño = tamaño;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", nombre=" + nombre + ", tamaño=" + tamaño + ", precio=" + precio + "]";
		}
		
		
}
