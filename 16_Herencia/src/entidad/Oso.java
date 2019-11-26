package entidad;

public class Oso extends Animal {

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

}
