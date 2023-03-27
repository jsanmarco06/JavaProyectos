package tareas;

import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {
		String nombreUno, nombreDos, nombreTres;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese Un nombre:");
		nombreUno = scanner.nextLine();
		System.out.println("Ingrese Un Segundo nombre:");
		nombreDos = scanner.nextLine();
		System.out.println("Ingrese Un Tercer nombre:");
		nombreTres = scanner.nextLine();
		
		if((nombreUno.length() >= nombreDos.length()) && (nombreUno.length() >= nombreTres.length())) {
			System.out.println("El nombre mas largo es " + nombreUno + " con " + nombreUno.length() + " caracteres");
		}
		else if((nombreDos.length() >= nombreUno.length()) && (nombreDos.length() >= nombreTres.length())) {
			System.out.println("El nombre mas largo es " + nombreDos + " con  " + nombreDos.length() + " caracteres");
		}
		else if((nombreTres.length() >= nombreUno.length()) && (nombreTres.length() >= nombreDos.length())) {
			System.out.println("El nombre mas largo es " + nombreTres + " con " + nombreTres.length() + " caracteres");
		}

	}

}
