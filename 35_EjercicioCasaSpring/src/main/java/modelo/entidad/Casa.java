package modelo.entidad;

import java.util.ArrayList;

public class Casa {
	
	private double precio;
	private ArrayList <Habitacion> listaHabitaciones;
	private Persona propietario;
	private Direccion direccion;
	
	
	public Casa(double precio, ArrayList<Habitacion> listaHabitaciones, Persona propietario, Direccion direccion) {
		super();
		this.precio = precio;
		this.listaHabitaciones = listaHabitaciones;
		this.propietario = propietario;
		this.direccion = direccion;
	}
	public Casa() {
		super();
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Casa [precio = " + precio + " Euros " + ", \n propietario = " + propietario
				+ ", \n direccion = " + direccion +  ", \n listaHabitaciones =" + listaHabitaciones + "]";
	}
	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	
	
	

	
	}

	
	
	
	


