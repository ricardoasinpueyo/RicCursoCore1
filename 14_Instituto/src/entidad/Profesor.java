package entidad;

import java.util.ArrayList;

public class Profesor {
	private String dni;
	private String nombre;
	private int edad;
	private double salario;
	private String sexo;
	private ArrayList<Curso> listaCursos;
	
	public Profesor(String dni, String nombre, int edad, double salario, String sexo, ArrayList<Curso> listaCursos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.sexo = sexo;
		this.listaCursos = listaCursos;
	}

	public Profesor() {
		super();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", sexo="
				+ sexo + ", listaCursos=" + listaCursos + "]";
	}
	
	
}
