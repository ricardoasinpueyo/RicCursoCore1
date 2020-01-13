package modelo.entidad;

public class Direccion {
	
	private String tipoVia;
	private String via;
	private String ciudad;
	
	public Direccion(String tipoVia, String via, String ciudad) {
		super();
		this.tipoVia = tipoVia;
		this.via = via;
		this.ciudad = ciudad;
	}
	public Direccion() {
		super();
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", via=" + via + ", ciudad=" + ciudad + "]";
	}
	
	
	

}
