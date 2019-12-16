package daopeliculas;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class Obtener {

	public static void main(String[] args) {
		DaoPelicula dp = new DaoPelicula();
		
		Pelicula p = dp.obtener(2);
		
		System.out.println(p);

	}

}
