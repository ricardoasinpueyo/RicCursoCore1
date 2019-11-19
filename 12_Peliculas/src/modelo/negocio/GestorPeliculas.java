package modelo.negocio;

import java.util.ArrayList;

import modelo.entidad.Pelicula;

public class GestorPeliculas {
	private ArrayList<Pelicula> listaPeliculas;

	public ArrayList<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
	
	public void alta(Pelicula p) {
		listaPeliculas.add(p);
	}
	
	/**
	 * Metodo que busca por titulo una pelicula
	 * @param titulo el titulo de la pelicula a busdcar
	 * @return pelicula en caso de que se encuetre, null
	 * en caso de que no se encuentre
	 */
	public Pelicula buscarPorTitulo(String titulo) {
		for(Pelicula p : listaPeliculas) {
			if(p.getTitulo().equals(titulo)){
				return p;
			}
		}
		return null;
	}
}
