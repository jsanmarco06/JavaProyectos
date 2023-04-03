package org.jsanamarco.pooclasesabstactas.felinos;

import org.jsanmarco.pooclasesabstractas.mamiferos.Mamifero;

public abstract class Felino extends Mamifero{
	protected Float tamanioGarras;
	protected int velocidad;
	
	public Felino(String habitad, Float altura, Float largo, Float peso, String nombreCientifico) {
		super(habitad, altura, largo, peso, nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	public Felino(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanioGarras,
			int velocidad) {
		super(habitad, altura, largo, peso, nombreCientifico);
		this.tamanioGarras = tamanioGarras;
		this.velocidad = velocidad;
	}

	public Float getTamanioGarras() {
		return tamanioGarras;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
}
