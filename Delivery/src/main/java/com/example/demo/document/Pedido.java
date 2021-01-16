package com.example.demo.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pedido")
public class Pedido {
	@Id
	private String id;
	private String nombre_cliente;
	private String numero_cliente;
	private String fecha;
	private String hora;
	private String estado;
	private List<Producto_Pedido> lista_pedidos;
	private String ubicacion;
	private double costo_Total;
	
	
	
	public Pedido(String nombre_cliente, String numero_cliente, String fecha, String hora, String estado,
			List<Producto_Pedido> lista_pedidos, String ubicacion, double costo_Total) {
		super();
		this.nombre_cliente = nombre_cliente;
		this.numero_cliente = numero_cliente;
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
		this.lista_pedidos = lista_pedidos;
		this.ubicacion = ubicacion;
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
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getNumero_cliente() {
		return numero_cliente;
	}
	public void setNumero_cliente(String numero_cliente) {
		this.numero_cliente = numero_cliente;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
