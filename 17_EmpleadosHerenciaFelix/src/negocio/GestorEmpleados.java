package negocio;

import java.util.ArrayList;

import entidad.Empleado;

public class GestorEmpleados {
	private ArrayList<Empleado> listaEmpleado;

	public ArrayList<Empleado> getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}
	
	public void alta(Empleado empleado) {
		listaEmpleado.add(empleado);
	}
	
}
