package org.jsanmarco.entidades;

public class Fruta extends Producto{
	private Double peso;
	private String color;

	
	public Fruta() {
		super();
	}
	public Fruta(String nombre, Double precio, Double peso, String color) {
		super(nombre, precio);
		this.peso = peso;
		this.color = color;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", peso = " + peso + ", color = " + color;
	}
	
	
}
