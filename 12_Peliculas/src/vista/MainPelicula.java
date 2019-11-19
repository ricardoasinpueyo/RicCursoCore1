package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPeliculas;

public class MainPelicula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		GestorPeliculas gp = new GestorPeliculas();
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		gp.setListaPeliculas(listaPeliculas);

		do {
			System.out.println("1- Alta de pelicula");
			System.out.println("2- lista de peliculas");
			System.out.println("3- Buscar pelicula por titulo");
			opcion = sc.nextLine();
			if(opcion.equals(1)) {
				System.out.println("Introduzca el titulo:");
				String titulo = sc.nextLine();
				System.out.println("Introduzca el genero:");
				String genero = sc.nextLine();
				System.out.println("Introduzca el nombre del director:");
				String nombreDirector = sc.nextLine();
				System.out.println("Introduzca la edad:");
				String edad = sc.nextLine();
				System.out.println("Introduzca el año de estreno:");
				String anioEstreno = sc.nextLine();
				
				int iEdad = Integer.parseInt(edad);//me cambia la edad de string a un entero
				int iAnioEstreno = Integer.parseInt(anioEstreno);
				
				Director d = new Director();
				d.setNombre(nombreDirector);
				d.setEdad(iEdad);
				
				Pelicula p = new Pelicula();
				p.setTitulo(titulo);
				p.setGenero(genero);
				p.setAnioEstreno(iAnioEstreno);
				p.setDirector(d);
				
				gp.alta(p);
			}else if(opcion.equals("2")) {
				ArrayList<Pelicula> peliculas = gp.getListaPeliculas();
				for(Pelicula p : peliculas) {
					System.out.println(p);
				}
			}else if(opcion.equals("3")) {
				System.out.println("Introduzca el titulo a buscar");
				String titulo = sc.nextLine();
				Pelicula p = gp.buscarPorTitulo(titulo);
				if(p == null) {
					System.out.println("La pelicula no se ha encontrado");
				}else {
					System.out.println(p);
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
	}
	
	
	
}



