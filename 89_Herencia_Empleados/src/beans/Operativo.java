package beans;

public class Operativo extends Empleado{
	public final static double HORA_EXTRA = 30;
	private int horasExtras;
	
	public Operativo() {
		// TODO Auto-generated constructor stub
	}

	public Operativo(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departmento, int horasExtras) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, comision, departmento);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double salarioMensual() {
		// TODO Auto-generated method stub
		return totalSalario()/MESES_NOMINA;
	}

	@Override
	public double salarioMensual(int meses) {
		// TODO Auto-generated method stub
		return totalSalario()/meses;
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return salario + (horasExtras*HORA_EXTRA);
	}

	@Override
	public String toString() {
		return "Operativo [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", horasExtras="
				+ horasExtras + "]";
	}
	
	

}
