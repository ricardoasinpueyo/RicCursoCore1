
public class MainVideojuego {

	public static void main(String[] args) {
		
		
		Guerrero g1 = new Guerrero();
		g1.setNombre("conan");
		
		//Gracias a usar abstraciones y patrones (fabrica)
		//podemos crear objetos diferentes en tiempo de ejecucion
		Arma espada = FabricaArmas.crear(args[0]);
		g1.setArma(espada);
		
		g1.atacar();
		
		Guerrero g2 = new Guerrero();
		g2.setNombre("Legolas");
		
		Arma arco = FabricaArmas.crear(args[1]);
		g2.setArma(arco);
		
		g2.atacar();
		
		//Segunda parte con fabrica de personajes
		System.out.println("******************************");
		Personaje p1 = FabricaPersonajes.crear("guerrero");
		p1.setNombre("Anacleto");
		
		Arma e1 = FabricaArmas.crear("espada");
		//injeccion de dependencias carol!!!
		p1.setArma(e1);
		p1.atacar();
		
		Personaje p2 = FabricaPersonajes.crear("mago");
		p2.setNombre("Harry potter");
		
		Arma h1 = FabricaArmas.crear("hechizoFuego");
		//injeccion de dependencias carol!!!
		p2.setArma(h1);
		p2.atacar();

	}

}
