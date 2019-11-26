package main;

import entidad.Animal;
import entidad.PezPayaso;
import entidad.Placton;
import entidad.Trucha;

public class MainPez {

	public static void main(String[] args) {
		//no podemos hacer esto
		//Animal a = new Animal();
		Animal a = new Trucha();
		a.setNombre("Ruperta");
		a.setPeso(3);
		Animal b = new PezPayaso();
		b.setNombre("Nemo");
		a.comer(b);
		Placton p = new Placton();
		p.setCalorias(100);
		System.out.println(a.toString());
		a.comer(p);
		System.out.println(a.toString());
	}

}
