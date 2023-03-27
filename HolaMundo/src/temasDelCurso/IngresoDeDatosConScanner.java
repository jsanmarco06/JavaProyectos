package temasDelCurso;

import java.util.Scanner;

public class IngresoDeDatosConScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		String edad = "";
		String lugarDeResidencia = "";
		
		System.out.println("ingrese el nombre:");
		nombre = scanner.nextLine();
		
		System.out.println("ingrese el apellido:");
		apellido = scanner.nextLine();
		
		System.out.println("ingrese edad:");
		edad = scanner.nextLine();
		
		System.out.println("ingrese lugar de residencia:");
		lugarDeResidencia = scanner.nextLine();
		
		System.out.println("SUS DATOS:\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nLugar De Residencia: " + lugarDeResidencia);
	}
}
