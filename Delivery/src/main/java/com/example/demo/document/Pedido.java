package com.example.demo.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pedido")
public class Pedido {
	@Id
	private String id;
	private List<Producto_Pedido> lista_pedidos;
	private String ubicacion;
	private String fecha;
	private double costo_Total;
	
	
	
	public Pedido(List<Producto_Pedido> lista_pedidos, String ubicacion, String fecha, double costo_Total) {
		super();
		this.lista_pedidos = lista_pedidos;
		this.ubicacion = ubicacion;
		this.fecha = fecha;
		this.costo_Total = costo_Total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Producto_Pedido> getLista_pedidos() {
		return lista_pedidos;
	}
	public void setLista_pedidos(List<Producto_Pedido> lista_pedidos) {
		this.lista_pedidos = lista_pedidos;
	}
	public double getCosto_Total() {
		return costo_Total;
	}
	public void setCosto_Total(double costo_Total) {
		this.costo_Total = costo_Total;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
}
