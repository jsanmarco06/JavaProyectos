package tareas;

import java.util.Scanner;

public class Tarea4OtraForma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreUno, nombreDos, nombreTres;
		
		System.out.println("Ingrese el primer nombre:");
		nombreUno = scanner.nextLine();
		
		System.out.println("Ingrese el segundo nombre:");
		nombreDos = scanner.nextLine();
		
		System.out.println("Ingrese el tercer nombre:");
		nombreTres = scanner.nextLine();
		
		if((nombreUno.length() >= nombreDos.length()) && (nombreUno.length() > nombreTres.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreUno + "   " + nombreUno.length());
			if((nombreDos.length() >= nombreTres.length())) {
				System.out.println(nombreDos + "\n"+ nombreTres + "\n");
			}
			if((nombreDos.length() < nombreTres.length())) {
				System.out.println(nombreTres + "\n"+ nombreDos + "\n");
			}
		}
		else if((nombreDos.length() >= nombreUno.length()) && (nombreDos.length() > nombreTres.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreDos + "   " + nombreDos.length());
			if((nombreUno.length() >= nombreTres.length())) {
				System.out.println(nombreUno + "\n"+ nombreTres + "\n");
			}
			if((nombreUno.length() < nombreTres.length())) {
				System.out.println(nombreTres + "\n"+ nombreUno + "\n");
			}
		}
		else if((nombreTres.length() >= nombreUno.length()) && (nombreTres.length() > nombreDos.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreTres + "   " + nombreTres.length());
			if((nombreUno.length() >= nombreDos.length())) {
				System.out.println(nombreUno + "\n"+ nombreDos + "\n");
			}
			if((nombreUno.length() < nombreDos.length())) {
				System.out.println(nombreDos + "\n"+ nombreUno + "\n");
			}
		}
		if((nombreUno.length() == nombreDos.length()) && (nombreTres.length() == nombreDos.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreTres + "\n"+ nombreUno + "\n"+ nombreDos + "\n");
		}
	}
}
