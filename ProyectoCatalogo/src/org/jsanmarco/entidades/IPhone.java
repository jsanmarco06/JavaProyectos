package org.jsanmarco.entidades;

public class IPhone extends Electronico{
	private String modelo;
	private String color;
	
	
	
	public IPhone(Double precio, String fabricante, String modelo, String color) {
		super(precio, fabricante);
		this.modelo = modelo;
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioVenta();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ", modelo =" + modelo + ", color =" + color;
	}
	

	
}
