package org.jsanmarco.ejecutable;

import org.jsanmarco.entidades.Empleado;
import org.jsanmarco.entidades.Gerente;

public class Ejecutable {
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Juan Manuel","San Marco","1213","Urquiza 1380", 50500.45,3);
		Gerente gerente1 = new Gerente("Eduardo","Lopez","1111","Jose Maria Moreno 1579", 120000.00,1, 150000.00);
		
		System.out.println("================================ \nDATOS DEL EMPLEADO:");
		System.out.println(empleado1.toString());
		
		System.out.println("================================ \nDATOS DEL GERENTE:");
		System.out.println(gerente1.toString());
		
		System.out.println("================================ \nREMUNERACION SIN AUMENTO:");
		System.out.println("REMUNERACIO " + empleado1.getRemuneracion());
		System.out.println("REMUNERACIO " + gerente1.getRemuneracion());
		
		empleado1.aumentarRemuneracion(22.5);
		gerente1.aumentarRemuneracion(39.6);
		
		System.out.println("================================ \nREMUNERACION ACUTAL:");
		System.out.println("REMUNERACIO " + empleado1.getRemuneracion());
		System.out.println("REMUNERACIO " + gerente1.getRemuneracion());
	}
}
