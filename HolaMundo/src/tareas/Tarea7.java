package tareas;

import java.util.Scanner;

public class Tarea7 {

	public static void main(String[] args) {
		
		int[] numerosAleatorios;
		numerosAleatorios = new int[10];
		
		System.out.println("Ingrese numeros aleatorios");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = s.nextInt();
		}
		
		int mayor = -1;
		for(int i = 0; i < numerosAleatorios.length; i++) {
			if(numerosAleatorios[i] > mayor) {
				mayor = numerosAleatorios[i];
			}
		}
		System.out.println("El numero mayor es: " + mayor);
	}

}
