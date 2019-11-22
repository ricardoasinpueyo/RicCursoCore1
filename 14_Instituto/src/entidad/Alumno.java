package entidad;

public class Alumno {
	private String dni;
	private String nombre;
	private String sexo;
	private int edad;
	
	public Alumno(String dni, String nombre, String sexo, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public Alumno() {
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
}
