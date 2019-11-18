package beans;

public class Departamento {
	private int idDepartamento;
	private String nombre;
	private Empleado jefe;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	
	public Departamento(int idDepartamento, String nombre) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
	}
	
	


	public Departamento(int idDepartamento, String nombre, Empleado jefe) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.jefe = jefe;
	}


	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public Empleado getJefe() {
		return jefe;
	}


	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}


	@Override
	public String toString() {
		if (jefe == null )
			return "Departamento [idDepartamento=" + idDepartamento + ", "
			+ "	nombre=" + nombre + ", jefe=" + jefe + "]";
		else
			return "Departamento [idDepartamento=" + idDepartamento + ", "
			+ "	nombre=" + nombre + ", jefe=" + jefe.getIdEmpleado() + "]";
	}


	


	
	
	
	
	
	
	

}
