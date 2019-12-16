package daopeliculas;

import modelo.persistencia.DaoPelicula;

public class Eliminar {
	public static void main(String[] args) {
		DaoPelicula dp = new DaoPelicula();
		
		boolean borrado = dp.borrar(1);
		
		System.out.println(borrado);
	}
}
