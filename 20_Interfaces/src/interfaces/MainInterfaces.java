package interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainInterfaces {
	public static void main(String[] args) {
		Movible m = new Oso();
		m.moverseLento();
		
		List<Movible> listaMovibles = new ArrayList<Movible>();
		listaMovibles.add(m);
		
		Persona p = new Persona();
		p.setNombre("pepe");
		
		listaMovibles.add(p);
	}
}
