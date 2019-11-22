package test;

import java.util.ArrayList;

import entidad.Alumno;
import entidad.Curso;
import entidad.Profesor;

public class TestInstituto {
	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		a1.setDni("232323");
		a1.setEdad(34);
		a1.setNombre("Maria");
		a1.setSexo("Mujer");
		
		Alumno a2 = new Alumno();
		a2.setDni("11111111");
		a2.setEdad(45);
		a2.setNombre("Eduardo");
		a2.setSexo("Hombre");
		
		Alumno a3 = new Alumno();
		a3.setDni("22222222");
		a3.setEdad(49);
		a3.setNombre("Marcos");
		a3.setSexo("Hombre");
		
		Curso c1 = new Curso();
		c1.setId(1);
		c1.setNombre("Matematicas");
		c1.setPrecio(1200);
		c1.setHoras(25);
		
		Curso c2 = new Curso();
		c2.setId(2);
		c2.setNombre("Fisica y Quimica");
		c2.setPrecio(1500);
		c2.setHoras(40);
		
		ArrayList<Alumno> listaAlumnosMatematicas = new ArrayList<Alumno>();
		listaAlumnosMatematicas.add(a1);
		listaAlumnosMatematicas.add(a2);
		
		ArrayList<Alumno> listaAlumnosFisicaYQuimica = new ArrayList<Alumno>();
		listaAlumnosFisicaYQuimica.add(a3);
		
		c1.setListaAlumnos(listaAlumnosMatematicas);
		c2.setListaAlumnos(listaAlumnosFisicaYQuimica);
		
		Profesor profesor = new Profesor();
		profesor.setDni("989898989");
		profesor.setEdad(36);
		profesor.setSalario(1900);
		profesor.setSexo("Hombre");
		profesor.setNombre("Profesor Bacterio");
		
		ArrayList<Curso> listaCursos = new ArrayList<Curso>();
		listaCursos.add(c1);
		listaCursos.add(c2);
		
		profesor.setListaCursos(listaCursos);
		
		System.out.println(profesor);
		
		
	}
}
