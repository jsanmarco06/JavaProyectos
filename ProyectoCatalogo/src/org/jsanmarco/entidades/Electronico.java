package org.jsanmarco.entidades;

public abstract class Electronico extends Producto implements IElectronico{
	private String fabricante;

	
	public Electronico(Double precio, String fabricante) {
		super(precio);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", fabricante = " + fabricante;
	}	
	
}
