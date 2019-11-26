package entidad;

public class Tiburon extends Pez {

	@Override
	public void comer(Object comida) {
		// si dejamos el super se ejecutaría primero
		//el comer del padre y luego podriamos add 
		//lineas
		//super.comer(comida);
		if(comida instanceof Pez) {
			Pez pez = (Pez)comida;
			System.out.println("Soy el tiburon " + getNombre() + " "
					+ "y me voy a comer al pez de tipo "
					+ pez.getClass().getSimpleName() +
					" que se llama " + pez.getNombre());
		}else {
			System.out.println("Soy un tiburon asesino y solo como peces");
		}
	}
	
	
}
