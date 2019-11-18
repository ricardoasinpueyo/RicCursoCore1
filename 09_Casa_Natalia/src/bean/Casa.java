package bean;

import java.util.ArrayList;

public class Casa {
	
	private double precio;
	private ArrayList <Habitación> listaHabitaciones;
	private Persona propietario;
	private Dirección dirección;
	
	
	public Casa(double precio, ArrayList<Habitación> listaHabitaciones, Persona propietario, Dirección dirección) {
		super();
		this.precio = precio;
		this.listaHabitaciones = listaHabitaciones;
		this.propietario = propietario;
		this.dirección = dirección;
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
	public ArrayList<Habitación> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setlistaHabitaciones(ArrayList<Habitación> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Dirección getDirección() {
		return dirección;
	}
	public void setDirección(Dirección dirección) {
		this.dirección = dirección;
	}
	@Override
	public String toString() {
		return "Casa [precio = " + precio + " Euros " + ", \n propietario = " + propietario
				+ ", \n dirección = " + dirección +  ", \n listaHabitaciones =" + listaHabitaciones + "]";
	}
	
	
	

	
	}

	
	
	
	


