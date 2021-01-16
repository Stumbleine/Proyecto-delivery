package com.example.demo.document;

import org.springframework.data.annotation.Id;

public class Producto_Pedido extends Producto {

	private int cantidad;
	private double sub_total;
	public Producto_Pedido(String nombre, String tamano, String tipo, double precio,int cantidad,double sub_total,boolean estado) {
		super(nombre, tamano, tipo, precio,estado);
		// TODO Auto-generated constructor stub
		this.cantidad=cantidad;
		this.sub_total=sub_total;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSub_total() {
		return sub_total;
	}
	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}
	

}
