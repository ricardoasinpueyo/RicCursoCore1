package bean;

public class Habitación {
	
	private double superficie;
	private String tipo;
	
	
	public Habitación(double superficie, String tipo) {
		super();
		this.superficie = superficie;
		this.tipo = tipo;
		
	}
		
		public Habitación() {
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
			return "\n Habitación [superficie=" + superficie + ", tipo=" + tipo + "]";
		}
		
		
	


	


	
	
	
	
	
	

}



