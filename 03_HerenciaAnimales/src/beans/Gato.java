package beans;

public class Gato extends Animal{
	private int vidas;
	
	

	public Gato(String color, int vidas) {
		super(color);
		this.vidas = vidas;
	}

	public Gato() {
		super();
 		 
	}

	public int getVidas() {
		return vidas;
		
	}

	public void setVidas(int vidas) {
		 
		this.vidas = vidas;
	}
	
	public void mostrarDatos() {
		
		System.out.println("Vidas : " + vidas);
		System.out.println("color : " + color);
		 
		
	}
	
	public void trepar() {
		System.out.println("trepo que lo flipas");
	}

	
	
	// metodos reescritos de mi padre
	
	

	@Override
	public void saludar() {
		System.out.println("soy un Gato y tengo : "+ vidas + "  vidas");
	}

	@Override
	public String toString() {
		return "Gato [vidas=" + vidas + ", color=" + color + "]";
	}

	@Override
	public void sonido() {
		System.out.println("soy : " + color + "  y digo MIAUUUUUU");
	}
	
	
	
	
	

}
