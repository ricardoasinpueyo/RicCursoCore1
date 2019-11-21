package modelo.entidad;

import java.util.ArrayList;

public class Libreria {
	private String nombre;
	private ArrayList<Libro> listaLibros;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", listaLibros=" + listaLibros + "]";
	}
	
	
	
}
