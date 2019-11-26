package main;

import java.util.ArrayList;

import entidad.Animal;
import entidad.Oso;
import entidad.Pez;
import entidad.PezPayaso;
import entidad.Placton;
import entidad.Tiburon;
import entidad.Trucha;

public class MainAnimal {

	public static void main(String[] args) {
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Robustiano");
		tiburon.setEdad(4);
		tiburon.setNumeroAletas(6);
		tiburon.setPeso(250);
		
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(tiburon);
		
		Pez pez = new PezPayaso();
		pez.setNombre("El padre de nemo");
		pez.setEdad(5);
		pez.setNumeroAletas(4);
		pez.setPeso(0.400);
		
		listaAnimales.add(pez);
		
		pez = new Trucha();
		pez.setNombre("Elisa");
		pez.setEdad(2);
		pez.setNumeroAletas(2);
		pez.setPeso(0.200);
		
		listaAnimales.add(pez);
		
		Oso oso = new Oso();
		oso.setNombre("Yogui");
		oso.setPeso(400);
		oso.setEdad(11);
		
		listaAnimales.add(oso);
		
		Placton p = new Placton();
		p.setCalorias(500);
		
		for(Animal animal : listaAnimales) {
			animal.comer(p);//no importa la referencia
			//cada objeto ejecutará su metodo comer
		}
		
		for(Animal animal : listaAnimales) {
			Oso osoAlimento = new Oso();
			osoAlimento.setNombre("bubu");
			animal.comer(osoAlimento);//no importa la referencia
			//cada objeto ejecutará su metodo comer
		}
	}

}
