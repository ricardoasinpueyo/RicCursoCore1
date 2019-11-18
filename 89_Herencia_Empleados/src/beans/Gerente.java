package beans;

public class Gerente extends Empleado{
	private int plazaGaraje;
	private String movil;
	private double variable;
	
	
	public Gerente() {
		super();
	}


	public Gerente(int idEmpleado, String nombre, String apellidos, 
			String sexo, double salario, int edad,
			double comision, Departamento departamento, int plazaGaraje, 
			String movil, double variable) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, 
				comision, departamento);
		this.plazaGaraje = plazaGaraje;
		this.movil = movil;
		this.variable = variable;
	}


	public int getPlazaGaraje() {
		return plazaGaraje;
	}


	public void setPlazaGaraje(int plazaGaraje) {
		this.plazaGaraje = plazaGaraje;
	}


	public String getMovil() {
		return movil;
	}


	public void setMovil(String movil) {
		this.movil = movil;
	}


	public double getVariable() {
		return variable;
	}


	public void setVariable(double variable) {
		this.variable = variable;
	}


	@Override
	public String toString() {
		if (departamento == null)
			return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
				+ departamento + ", plazaGaraje=" + plazaGaraje + ", movil=" + movil + ", variable=" + variable + "]";
		else
			return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
			+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
			+ departamento.getIdDepartamento() + ", plazaGaraje=" + plazaGaraje + ", movil=" + movil + ", variable=" + variable + "]";
	
	}


	@Override
	public double salarioMensual() {
		// TODO Auto-generated method stub
		return totalSalario()/this.MESES_NOMINA;
	}


	@Override
	public double salarioMensual(int meses) {
		// TODO Auto-generated method stub
		return totalSalario()/meses;
	}


	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return salario + comision + variable;
	}
	
	


	


	
	
	
	
	
	
	

}
