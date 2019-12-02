package entidad;

import java.util.ArrayList;

public class Director extends Empleado{
	private ArrayList<Empleado> listaEmpleados;
	public static final double VARIABLE_POR_EMPLEADO = 100.0;

	@Override
	public double calcularSalario() {
		return getSalarioBase() + (listaEmpleados.size() 
				* VARIABLE_POR_EMPLEADO);
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Director [getNombre()=" + getNombre() + ", getDni()=" + getDni() + ", getSalarioBase()="
				+ getSalarioBase() + ", getEdad()=" + getEdad() + ", listaEmpleados=" + listaEmpleados + "]";
	}
	
	
	
	
}
