package temasDelCurso;

import java.util.Scanner;

public class NumeroPar {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		String numeroIngresado = scanner.nextLine();
		int numero = Integer.parseInt(numeroIngresado);
		
		if((numero % 2) == 0) {
			System.out.println("El numero ingresado es Par");
		}
		else {
			System.out.println("El numero ingresado es Impar");
		}
		
	}

}
