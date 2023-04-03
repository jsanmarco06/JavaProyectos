package org.jsanmarco.entidades;

public abstract class Producto implements IProducto{
	protected Double precio;

	
	public Producto(Double precio) {
		super();
		this.precio = precio;
	}


	public double getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "precio= " + precio;
	}
	
	
}
