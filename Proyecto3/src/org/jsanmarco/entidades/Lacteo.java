package org.jsanmarco.entidades;

public class Lacteo extends Producto{
	private int cantidades;
	private int proteinas;
	
	
	public Lacteo() {
		super();
	}
	public Lacteo(String nombre, Double precio, int cantidades, int proteinas) {
		super(nombre, precio);
		this.cantidades = cantidades;
		this.proteinas = proteinas;
	}
	public int getCantidades() {
		return cantidades;
	}
	public void setCantidades(int cantidades) {
		this.cantidades = cantidades;
	}
	public int getProteinas() {
		return proteinas;
	}
	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", cantidades = " + cantidades + ", proteinas = " + proteinas;
	}
	
}
