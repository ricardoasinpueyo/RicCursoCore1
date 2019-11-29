package entidad;

public class Programador extends Empleado{

	@Override
	public double calcularSalario() {
		return getSalarioBase();
	}

	@Override
	public String toString() {
		return "Programador [getNombre()=" + getNombre() + ", getDni()=" + getDni() + ", getSalarioBase()="
				+ getSalarioBase() + ", getEdad()=" + getEdad() + "]";
	}

	
}
