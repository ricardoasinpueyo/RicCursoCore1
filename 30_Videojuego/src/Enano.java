
public class Enano extends Personaje {

	@Override
	public void atacar() {
		System.out.println("Soy el enano " + getNombre() + " aioooo!!! aiooooo!!");
		getArma().usar();
	}

}
