
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

	}

}
