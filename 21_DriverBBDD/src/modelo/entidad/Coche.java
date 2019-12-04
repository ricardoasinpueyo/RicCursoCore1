package modelo.entidad;

public class Coche {
	private int id;
	private String matricula;
	private String marca;
	private String modelo;
		
	public Coche() {
		super();
	}
	
	public Coche(int id, String matricula, String marca, String modelo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	
}
