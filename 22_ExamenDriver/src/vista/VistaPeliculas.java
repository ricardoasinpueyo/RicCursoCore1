package vista;

import java.util.List;
import java.util.Scanner;

import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class VistaPeliculas {
	private Scanner sc;
	private GestorPelicula gp;
	
	
	public void mostrarApp(GestorPelicula gestorPelicula, Scanner scanner) {
		this.gp = gestorPelicula;
		this.sc = scanner;
		
		String opcion = "0";
		do {
			System.out.println("1- Alta de pelicula");
			System.out.println("2- Modificar pelicula");
			System.out.println("3- Borrar pelicula");
			System.out.println("4- Buscar pelicula por id");
			System.out.println("5- Listar peliculas");
			System.out.println("0- Salir");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca la pelicula a dar de alta");
				System.out.println("Introduzca el titulo:");
				//nextLine coje toda la frase, next coje palabra
				String titulo = sc.nextLine();
				System.out.println("Introduzca el director:");
				String director = sc.nextLine();
				System.out.println("Introduzca el genero: ");
				String genero = sc.nextLine();
				System.out.println("Introduzca el año: ");
				String anio = sc.nextLine();
				
				int iAnio = Integer.parseInt(anio);
				
				Pelicula pelicula = new Pelicula();
				pelicula.setTitulo(titulo);
				pelicula.setDirector(director);
				pelicula.setGenero(genero);
				pelicula.setAnio(iAnio);
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle información a nuestro
				//usuario
				int alta = gp.alta(pelicula);
				if(alta == 0) {
					System.out.println("Pelicula introducida correctamente");
				}else if(alta == 1) {
					System.out.println("Algún campo esta vacio");
				}else if(alta == 2) {
					System.out.println("El titulo de la pelicula esta repetido");
				}else if(alta == 3) {
					System.out.println("Ha ocurrido algun error en la BBDD");
				}
			}else if(opcion.equals("2")) {
				System.out.println("Introduzca la pelicula a modificar");
				System.out.println("Introduzca el id:");
				String id = sc.nextLine();
				System.out.println("Introduzca el titulo:");
				//nextLine coje toda la frase, next coje palabra
				String titulo = sc.nextLine();
				System.out.println("Introduzca el director:");
				String director = sc.nextLine();
				System.out.println("Introduzca el genero: ");
				String genero = sc.nextLine();
				System.out.println("Introduzca el año: ");
				String anio = sc.nextLine();
				
				int iAnio = Integer.parseInt(anio);
				int iId = Integer.parseInt(id);
				
				Pelicula pelicula = new Pelicula();
				pelicula.setId(iId);
				pelicula.setTitulo(titulo);
				pelicula.setDirector(director);
				pelicula.setGenero(genero);
				pelicula.setAnio(iAnio);
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle información a nuestro
				//usuario
				int modificar = gp.modificar(pelicula);
				if(modificar == 0) {
					System.out.println("Pelicula modificada correctamente");
				}else if(modificar == 1) {
					System.out.println("Algún campo esta vacio");
				}else if(modificar == 2) {
					System.out.println("El titulo de la pelicula esta repetido");
				}else if(modificar == 3) {
					System.out.println("Ha ocurrido algun error en la BBDD");
				}
			}else if(opcion.equals("3")) {
				System.out.println("Introduzca el id a borrar:");
				String id = sc.nextLine();
				
				int iId = Integer.parseInt(id);
				
				boolean borrar = gp.borrar(iId);
				if(borrar) {
					System.out.println("Pelicula borrada");
				}else {
					System.out.println("Ha ocurrido algun error en la bbdd");
				}
			}else if(opcion.equals("4")) {
				System.out.println("Introduzca el id a buscar:");
				String id = sc.nextLine();
				
				int iId = Integer.parseInt(id);
				
				Pelicula p = gp.obtener(iId);
				if(p != null) {
					System.out.println(p);
				}else {
					System.out.println("No se ha encontrado la pelicula");
				}
			}else if(opcion.equals("5")) {
				List<Pelicula> listaPeliculas = gp.listar();
				if(listaPeliculas.size() == 0) {
					System.out.println("No hay peliculas dadas de alta");
				}else {
					for(Pelicula p : listaPeliculas) {
						System.out.println(p);
					}
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
		sc.close();
	}
}
