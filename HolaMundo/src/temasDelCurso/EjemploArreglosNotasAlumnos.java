package temasDelCurso;

import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

	public static void main(String[] args) {
		double[] claseMatematicas, claseHistoria, claseLengua;
		
		double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLengua = 0;
		
		claseMatematicas = new double[7];
		claseHistoria = new double[7]; 
		claseLengua = new double[7];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese 7 notas de estudiantes para MAtematicas");
		for(int i = 0; i < claseMatematicas.length; i++) {
			claseMatematicas[i] = s.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas de estudiantes para Historia");
		for(int i = 0; i < claseHistoria.length; i++) {
			claseHistoria[i] = s.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas de estudiantes para Lengua");
		for(int i = 0; i < claseLengua.length; i++) {
			claseLengua[i] = s.nextDouble();
		}
		
		for(int i = 0; i < 7; i ++) {
			sumNotasMatematicas += claseMatematicas[i];
			sumNotasHistoria += claseHistoria[i];
			sumNotasLengua += claseLengua[i];
		}
		
		double promedioMatematica = (sumNotasMatematicas / claseMatematicas.length);
		double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
		double promedioLengua = (sumNotasLengua / claseLengua.length);
		
		System.out.println("El promedio de la clase de matematica es " + promedioMatematica);
		System.out.println("El promedio d ela clase de historia es " + promedioHistoria);
		System.out.println("EL promedio de la clase de Lengua es " + promedioLengua);
		
		System.out.println("Ingrese el numero del aulumno (0 - 6)");
		int id = s.nextInt();
		double promedioAlumno = ((claseMatematicas[id] + claseHistoria[id] + claseLengua[id]) / 3);
		System.out.println("El promedio de el alumno " + id + " es: " + promedioAlumno);
		
	}

}
