package main;

import entidades.Automovil;
import entidades.Persona;

public class Main {

	public static void main(String[] args) {
		Automovil auto = new Automovil();
		
		Persona juan= new Persona("juan","san marco");
		
		
	}
	
	
	/*
	public static void imprimir(OrdenCompra orden) {
		Producto[] productosAux = orden.getProductos();
		System.out.println("============================"+"\n"+ 
							orden.getDescripcion() +  "\n"); 
		for(Producto p : productosAux) {
			System.out.println(
							"El fabricante es: " + p.getFabricante() + "\n" + 
							"El nombre es: " + p.getNombre() + "\n" + 
							"El precio es: " + p.getPrecio() + "\n");
		}
		orden.sumarPrecios();
	}*/

}
