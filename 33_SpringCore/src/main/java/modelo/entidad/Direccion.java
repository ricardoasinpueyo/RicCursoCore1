package modelo.entidad;

public class Direccion {
	private String nombreVia;
	private String tipoVia;
	private String ciudad;
	
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Direccion [nombreVia=" + nombreVia + ", tipoVia=" + tipoVia + ", ciudad=" + ciudad + "]";
	}
	
	
}
