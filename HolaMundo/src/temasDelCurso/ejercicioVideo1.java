package temasDelCurso;

import java.util.Scanner;

public class ejercicioVideo1 {
	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		String nombre1 = "";
		String nombre2 = "";
		
		System.out.println("Igrese nombre 1: ");
		nombre1 = usuario.nextLine();
		
		System.out.println("Igrese nombre 2: ");
		nombre2 = usuario.nextLine();
		
		if(nombre1.equals(nombre2)) {
			System.out.println("los nombre son iguales");
		}
		else {
			System.out.println("los nombre son distintos");
		}
		
	}

}
