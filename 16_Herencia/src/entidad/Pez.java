package entidad;

//para heredar una clase de otra se utiliza la
//palabra reservada extends
public abstract class Pez extends Animal{

	private int numeroAletas;
	
	@Override
	public void comer(Object comida) {
		//instanceof preguntamos la clase del objeto al que 
		//apuntamos
		if(comida instanceof Placton) {
			//cambiamos el mando a distancia de Object
			//a tipo Placton, para que?, para más adelante
			//poder utilizar el metodo getCalorias()
			Placton p = (Placton) comida;
			System.out.println("Soy un pez que me llamo " + nombre
					+ " y me voy a comer un placton con " + 
					p.getCalorias());
			//la division entre entre dos numeros enteros
			//siempre devuelve un entero
			double nuevoPeso = p.getCalorias()/1000.0;
			this.setPeso(this.getPeso() + nuevoPeso);
		}else {
			System.out.println("PUAJJJJJJJJJJJ no me gusta eso!!! :( :(");
		}
		
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}

	//tenemos que coger los getter heredados de Animal
	//ya que los atributos son privados y no podemos
	//acceder desde esta clase. Otra opcion hubiera sido
	//haberlos hecho protected
	@Override
	public String toString() {
		return "Pez [numeroAletas=" + numeroAletas + ", getNombre()=" + getNombre() + ", getPeso()=" + getPeso()
				+ ", getEdad()=" + getEdad() + "]";
	}
	
	

}
