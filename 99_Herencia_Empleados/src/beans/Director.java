package beans;

public class Director extends Empleado{
	private int acciones;
	private String tablet;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departmento, int acciones, String tablet) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, comision, departmento);
		this.acciones = acciones;
		this.tablet = tablet;
	}

	public int getAcciones() {
		return acciones;
	}

	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}

	public String getTablet() {
		return tablet;
	}

	public void setTablet(String tablet) {
		this.tablet = tablet;
	}

	@Override
	public String toString() {
		if (departamento == null)
			return "Director [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
				+ departamento + ", acciones=" + acciones + ", tablet=" + tablet + "]";
		else
			return "Director [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
			+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
			+ departamento.getIdDepartamento() + ", acciones=" + acciones + ", tablet=" + tablet + "]";
			
	}

	@Override
	public double salarioMensual() {
		// TODO Auto-generated method stub
		return totalSalario()/MESES_NOMINA;
	}

	@Override
	public double salarioMensual(int meses) {
		// TODO Auto-generated method stub
		return totalSalario() / meses;
	}

	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return salario + comision + (acciones * VALOR_ACCION);
	}
	
	
	}

	

 
