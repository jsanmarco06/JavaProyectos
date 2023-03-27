package tareas;

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {
		int[] numerosAleatorios;
		numerosAleatorios = new int[10];
		
		System.out.println("Ingrese numeros aleatorios");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = s.nextInt();
		}
		
		int numeroRepetido = -1;
		int cantidadMaxima = 1;
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int cantidadRepeticiones = 0;
			for(int j = 0; j < numerosAleatorios.length; j++) {
				if((numerosAleatorios[i] == numerosAleatorios[j])) {
					cantidadRepeticiones++;
					if(cantidadRepeticiones > cantidadMaxima) {
						cantidadMaxima = cantidadRepeticiones;
						numeroRepetido = numerosAleatorios[i];
					}
				}
				
			}
		}

		System.out.println("numero repetido: " + numeroRepetido);
		System.out.println("cant repetido: " + cantidadMaxima);

	}

}
