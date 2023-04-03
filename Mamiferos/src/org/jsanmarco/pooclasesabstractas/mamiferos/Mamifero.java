package org.jsanmarco.pooclasesabstractas.mamiferos;

public abstract class Mamifero {
	protected String habitad;
	protected Float altura;
	protected Float largo;
	protected Float peso;
	protected String nombreCientifico;
	
	//constructors
	public Mamifero() {
		super();
	}
	public Mamifero(String habitad, Float altura, Float largo, Float peso, String nombreCientifico) {
		super();
		this.habitad = habitad;
		this.altura = altura;
		this.largo = largo;
		this.peso = peso;
		this.nombreCientifico = nombreCientifico;
	}
	
	// getter
	public String getHabitad() {
		return habitad;
	}
	public Float getAltura() {
		return altura;
	}
	public Float getLargo() {
		return largo;
	}
	public Float getPeso() {
		return peso;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	
	// methods abstract
	abstract protected String comer();
	abstract protected String dormir();
	abstract protected String correr();
	abstract protected String comunicarse();
	
	
	
}
