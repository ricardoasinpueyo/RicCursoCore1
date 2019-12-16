package modelo.negocio;

import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {

	private DaoPelicula daoPelicula;

	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	/**
	 * Metodo que se encarga de dar de alta una pelicula
	 * @param pelicula la pelicula a dar de alta
	 * @return 0 si se ha insertado, 1 si algun campo esta vacio
	 * , 2 si hay dos peliculas con el mismo tipo
	 * , 3 en caso de algún error con la bbdd
	 */
	public int alta (Pelicula pelicula) {
		//comprobamos que no haya ningún campo vacio
		boolean correcto = comprobarCamposVacios(pelicula);
		if(!correcto) {
			return 1;
		}
		
		//comprobamos que no haya 2 peliculas con el mismo titulo
		boolean repetido = comprobarTituloRepetido(pelicula.getTitulo());
		if(repetido) {
			return 2;
		}
		
		correcto = daoPelicula.alta(pelicula);
		if(correcto) {
			return 0;
		}else {
			return 3;
		}
		
	}
	
	/**
	 * Metodo que se encarga de modificar una pelicula
	 * @param pelicula la pelicula a dar de alta
	 * @return 0 si se ha insertado, 1 si algun campo esta vacio
	 * , 2 si hay dos peliculas con el mismo tipo
	 * , 3 en caso de algún error con la bbdd
	 */
	public int modificar(Pelicula pelicula) {
		boolean correcto = comprobarCamposVacios(pelicula);
		if(!correcto) {
			return 1;
		}
		
		//comprobamos que no haya 2 peliculas con el mismo titulo
		boolean repetido = comprobarTituloRepetido(pelicula.getTitulo());
		if(repetido) {
			return 2;
		}
		
		correcto = daoPelicula.modificar(pelicula);
		if(correcto) {
			return 0;
		}else {
			return 3;
		}
	}
	
	public boolean borrar(int id) {
		return daoPelicula.borrar(id);
	}
	
	public Pelicula obtener(int id) {
		return daoPelicula.obtener(id);
	}
	
	public List<Pelicula> listar(){
		return daoPelicula.listar();
	}
	
	/**
	 * Metodo que comprueba si hay algún campo vacio en la pelicula
	 * @param pelicula la pelicula que queremos comprobar
	 * @return false en caso de que algún campo este vacio,
	 * true en caso de que estén todos los campos rellenos
	 */
	private boolean comprobarCamposVacios(Pelicula pelicula) {
		//comprobamos que no haya ningún campo vacio
		if(pelicula.getTitulo().isEmpty()) {
			return false;
		}else if(pelicula.getDirector().isEmpty()) {
			return false;
		}else if(pelicula.getGenero().isEmpty()) {
			return false;
		}else if(pelicula.getAnio() == 0) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Metodo que comprueba si existe un titulo en bbdd
	 * @param titulo el titulo que queremos comprobar
	 * @return <b>false</b> en caso de que el titulo no exista,
	 * <b>true</b> en caso de que sí
	 */
	private boolean comprobarTituloRepetido(String titulo) {
		for(Pelicula p : daoPelicula.listar()) {
			if(p.getTitulo().equals(titulo)) {
				return true;
			}
		}
		
		return false;
	}
	
}
