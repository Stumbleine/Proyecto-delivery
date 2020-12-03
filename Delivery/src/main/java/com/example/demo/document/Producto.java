package com.example.demo.document;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Producto")
public class Producto {
	
	 @Id
	private ObjectId id;
	private String nombre;
	private String tamaño;
	private String tipo;
	private Binary image;
	private double precio;
	

	

	public Producto(String nombre, String tamaño, String tipo, double precio) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tamaño=" + tamaño + ", tipo=" + tipo + ", image=" + image + ", precio="
				+ precio + "]";
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
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	

	
	
	
}
