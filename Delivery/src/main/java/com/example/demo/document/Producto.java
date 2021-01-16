package com.example.demo.document;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Producto")
public class Producto {
	
	 @Id
	private String id;
	private String nombre;
	private String tamano;
	private String tipo;
	private Binary image;
	private double precio;
	private boolean estado;

	

	public Producto(String nombre, String tamano, String tipo, double precio,boolean estado) {
		super();
		this.nombre = nombre;
		this.tamano = tamano;
		this.tipo = tipo;
		this.precio = precio;
		this.estado=estado;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tamaño=" + tamano + ", tipo=" + tipo + ", image=" + image + ", precio="
				+ precio + "]";
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Binary getImage() {
		return image;
	}

	public void setImage(Binary image) {
		this.image = image;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

	
	
	
}
