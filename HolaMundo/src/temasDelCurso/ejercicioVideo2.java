package temasDelCurso;

import java.util.Scanner;

public class ejercicioVideo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String usuario = "juan06";
		String constraseña = "juanManuel06";
		
		String usuario1;
		String constraseña2;
		
		System.out.println("Ingrese nombre de usuario: ");
		usuario1 = scanner.nextLine();
		
		System.out.println("Ingrese contraseña: ");
		constraseña2 = scanner.nextLine();
		
		if(usuario.equals(usuario1) && constraseña.equals(constraseña2)) {
			System.out.println("Bienvenido ");
		}
		else {
			System.out.println("usuario o contraseña incorrectos ");
		}
	}

}
