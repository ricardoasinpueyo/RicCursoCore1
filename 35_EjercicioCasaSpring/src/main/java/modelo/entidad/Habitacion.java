package modelo.entidad;

public class Habitacion {
	
	private double superficie;
	private String tipo;
	
	
	public Habitacion(double superficie, String tipo) {
		super();
		this.superficie = superficie;
		this.tipo = tipo;
		
	}
		
		public Habitacion() {
			super();
		}

		
		
		
		public double getSuperficie() {
			return superficie;
		}

		public void setSuperficie(double superficie) {
			this.superficie = superficie;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return "\n Habitacion [superficie=" + superficie + ", tipo=" + tipo + "]";
		}
		
		
	


	


	
	
	
	
	
	

}



