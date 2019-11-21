package modelo.negocio;

import java.util.ArrayList;

import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class GestorLibreria {
	private Libreria libreria;

	//Como no quiero que se me olvide poner la libreria
	//y ademas este gestor no funciona sin la libraria
	//creo INICAMENTE el constructor con la libreria
	//y quito set
	public GestorLibreria(Libreria libreria) {
		super();
		this.libreria = libreria;
	}

	public Libreria getLibreria() {
		return libreria;
	}


	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	public ArrayList<Libro> getListaLibros(){
		return libreria.getListaLibros();
	}
	
	/**
	 * Dar de alta un libro
	 * @param libro libro a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso
	 * de que falte el isbn, 2 en caso de que falte el titulo
	 * y 3 en caso de que el isbn este duplicado
	 */
	public int alta(Libro libro) {
		if(libro.getIsbn().isEmpty()) {
			return 1;
		}
		
		if(libro.getTitulo().isEmpty()) {
			return 2;
		}
		//si buscamos un libro por isbn y existe
		//podemos concluir que este isbn va a estar 
		//duplicado, por lo que devolemos un 3
		if(buscarPorIsbn(libro.getIsbn()) != null) {
			return 3;
		}
		
		libreria.getListaLibros().add(libro);
		return 0;
	}
	
	public Libro buscarPorIsbn(String isbn) {
		for(Libro l :libreria.getListaLibros()) {
			if(l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}
	
	public ArrayList<Libro> buscarPorEditorial(String editorial){
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		for(Libro l : libreria.getListaLibros()) {
			if(l.getEditorial().equals(editorial)) {
				listaLibros.add(l);
			}
		}
		return listaLibros;
	}
}
