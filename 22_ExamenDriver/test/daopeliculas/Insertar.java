package daopeliculas;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class Insertar {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("El imperio contrataca");
		pelicula.setDirector("George Lucas");
		pelicula.setGenero("Sci-fi");
		pelicula.setAnio(1981);
		
		DaoPelicula dp = new DaoPelicula();
		dp.alta(pelicula);

		System.out.println("Insertada correctamente");
	}

}
