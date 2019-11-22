package entidad;

import java.util.ArrayList;

public class Curso {
	private int id;
	private String nombre;
	private double horas;
	private double precio;
	private ArrayList<Alumno> listaAlumnos;
	public Curso(int id, String nombre, double horas, double precio, ArrayList<Alumno> listaAlumnos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.precio = precio;
		this.listaAlumnos = listaAlumnos;
	}
	public Curso() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", precio=" + precio + ", listaAlumnos="
				+ listaAlumnos + "]";
	}
	
	
}
