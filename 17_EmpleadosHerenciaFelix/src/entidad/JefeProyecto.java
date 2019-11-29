package entidad;

public class JefeProyecto extends Empleado{
	private double incentivos;

	@Override
	public double calcularSalario() {
		return getSalarioBase() + incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "JefeProyecto [getNombre()=" + getNombre() + ", getDni()=" + getDni() + ", getSalarioBase()="
				+ getSalarioBase() + ", getEdad()=" + getEdad() + ", incentivos=" + incentivos + "]";
	}
	
	
}
