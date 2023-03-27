package org.jsanmarco.entidades;

public class Producto {
	private String nombre;
	private Double precio;
	
	
	public Producto() {
		super();
	}
	public Producto(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "nombre = " + nombre + ", precio = " + precio;
	}
	
	
}
