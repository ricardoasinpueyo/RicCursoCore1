package interfaces;

public class Oso extends Animal implements Movible{

	@Override
	public void comer(Object comida) {
		if(comida instanceof Animal) {
			Animal a = (Animal)comida;
			System.out.println("Soy un oso que me llamo "
			+ nombre + " y me voy a comer al animal de tipo "
			+ a.getClass().getSimpleName()
			+ " y que se llama " + a.nombre);
		}else {
			System.out.println("Ey ey ey bubu los osos solo "
					+ "comemos animales");
		}

	}

	@Override
	public void moverseLento() {
		System.out.println("Soy un oso y me muevo 5 metros");
		
	}

	@Override
	public void moverse(int metros) {
		System.out.println("Soy un oso y me muevo " + metros + " metros");
		
	}

}
