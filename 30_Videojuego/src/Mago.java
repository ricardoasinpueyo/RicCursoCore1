
public class Mago extends Personaje {

	@Override
	public void atacar() {
		System.out.println("Soy el mago " + getNombre() + " alacazam!!! abracadabra!!!");
		getArma().usar();
	}

}
