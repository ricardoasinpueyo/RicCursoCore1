package entidad;

public class Persona {
	private String nombre;
	private int edad;
	public static int numeroPersonas = 0;

	public String getNombre() {
		return nombre;
	}

	// esto es un metodo dinamico, el ciclo de vida de
	// este metodo depende el objeto. Un metodo dinamico
	// se crea SIN PONER STATIC
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
