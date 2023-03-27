package org.jsanmarco.entidades;

public class NoPerecible extends Producto{
	private int contenido;
	private int calorias;
	
	
	public NoPerecible() {
		super();
	}
	public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
		super(nombre, precio);
		this.contenido = contenido;
		this.calorias = calorias;
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ", contenido = " + contenido + ", calorias = " + calorias;
	}
	
	
}
