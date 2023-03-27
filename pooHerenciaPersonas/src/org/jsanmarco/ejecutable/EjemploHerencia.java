package org.jsanmarco.ejecutable;

import org.jsanmarco.entidades.Alumno;
import org.jsanmarco.entidades.AlumnoInternacional;
import org.jsanmarco.entidades.Persona;
import org.jsanmarco.entidades.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========= Creando la instacia de la clase Alumno =========");
		
		Alumno alumno = new Alumno();
		
		alumno.setApellido("San Marco");
		alumno.setEdad(20);
		alumno.setEmail("jsanmarco@gamil.com");
		alumno.setNombre("Juan Manuel");
		alumno.setNotaCastellano(7.5);
		alumno.setNotaHistoria(7.9);
		alumno.setNotaMatematica(10);
		alumno.setInstitucion("UNLAM");
		
		System.out.println("========= Creando la instacia de la clase Alumno Internacional =========");
		
		AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
		
		alumnoInternacional.setApellido("San Marco");
		alumnoInternacional.setEdad(18);
		alumnoInternacional.setEmail("rsanmarco@gamil.com");
		alumnoInternacional.setNombre("Roman");
		alumnoInternacional.setNotaIdiomas(6.6);
		alumnoInternacional.setNotaCastellano(7.0);
		alumnoInternacional.setNotaHistoria(7.5);
		alumnoInternacional.setNotaMatematica(10);
		alumnoInternacional.setInstitucion("UNLAM");
		
		System.out.println("========= Creando la instacia de la clase Profesor =========");
		
		Profesor profesor = new Profesor();
		
		profesor.setApellido("Aguirre");
		profesor.setAsignatura("Matematica");
		profesor.setEdad(45);
		profesor.setNombre("Noelia");
		
		
		imprimir(alumno);
		imprimir(alumnoInternacional);
		imprimir(profesor);
		
	}
	public static void imprimir(Persona persona) {
		System.out.println("==============================");
		System.out.println(persona);
	}

}
