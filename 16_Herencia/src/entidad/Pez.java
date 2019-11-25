package entidad;

//para heredar una clase de otra se utiliza la
//palabra reservada extends
public abstract class Pez extends Animal{

	@Override
	public void comer(Object comida) {
		//instanceof preguntamos la clase del objeto al que 
		//apuntamos
		if(comida instanceof Placton) {
			Placton p = (Placton) comida;
			System.out.println("Soy un pez que me llamo " + nombre
					+ " y me voy a comer un placton con " + 
					p.getCalorias());
		}else {
			System.out.println("PUAJJJJJJJJJJJ no me gusta eso!!! :( :(");
		}
		
	}

}
