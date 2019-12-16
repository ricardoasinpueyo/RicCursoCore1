package main;

import java.util.Scanner;

import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;
import vista.VistaPeliculas;

public class MainExamen {

	//El main se va a encargar de crear el gestor
	//el dao y el scanner que vamos a utilizar en 
	//nuestra aplicacion
	
	//El ciclo de vida de estos objetos sera de todo
	//el ciclo de vida de nuestra aplicacion, ya que 
	//los creamos en este metodo y moriran cuando salgamos
	// de esta metodo
	
	//por lo tanto, de lo unico que tenemos que preocuparnos
	//es de pasar sus referencias a lo largo de nuestra app
	public static void main(String[] args) {
		VistaPeliculas vp = new VistaPeliculas();
		GestorPelicula gestorPelicula = new GestorPelicula();
		Scanner sc = new Scanner(System.in);
		DaoPelicula dp = new DaoPelicula();
		
		//el gestor pelicula necesita del daoPelicula
		//para poder funcionar, por lo tanto le hago 
		//una inyeccion de su dependencia (ID)
		gestorPelicula.setDaoPelicula(dp);
		
		vp.mostrarApp(gestorPelicula, sc);
	}

}
