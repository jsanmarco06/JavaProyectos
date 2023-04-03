package org.jsanmarco.entidades;

public class TvLcd extends Electronico{
	private int pulgada;


	public TvLcd(Double precio, String fabricante, int pulgada) {
		super(precio, fabricante);
		this.pulgada = pulgada;
	}
	public int getPulgada() {
		return pulgada;
	}
	public void setPulgada(int pulgada) {
		this.pulgada = pulgada;
	}
	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioVenta();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", pulgada =" + pulgada;
	}
	
	
}
