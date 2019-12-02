package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainListas {

	public static void main(String[] args) {
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add("pepe");
		listaStrings.add("pepa");
		
		//Las interfazces son una coleccion de metodos
		//abstractos. Sirven para varias cosas, entre ellas
		//implementar una herencia multiple en java
		//Con una referencia de una interfaz, podemos
		//apuntar a cualquier objeto que inplemente dicha
		//interfaz
		//Las interfaces dicen el "QUE" mientras que las
		//clases que implementan dicha interface dicen 
		//el "COMO"
		//Ejemplo, La clase ArrayList es una implementación
		//de la interfaz List, que por debajo utiliza
		//arrays normales java, y cuando se llena, crea uno
		//nuevo más grande
		
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("pepe");
		listaNombres.add("pepa pig");
		
		LinkedList<String> listaLinked = new LinkedList<String>();
		ArrayList<String> listaArray = new ArrayList<String>();
		Vector<String> listaVector = new Vector<String>();
		
		recorrerArray(listaArray);
		recorrerVector(listaVector);
		recorrerLinked(listaLinked);
		
		//gracias a las interfaces, puedo tener un solo metodo
		//en vez de 3
		recorrer(listaVector);
		recorrer(listaArray);
		recorrer(listaLinked);
	}
	
	private static void recorrerLinked(LinkedList<String> lista) {
		//trabajos con los datos de la lista
		for(String s : lista) {
			System.out.println(s);
		}
	}
	
	private static void recorrerArray(ArrayList<String> lista) {
		//trabajos con los datos de la lista
		for(String s : lista) {
			System.out.println(s);
		}
	}
	
	private static void recorrerVector(Vector<String> lista) {
		//trabajos con los datos de la lista
		for(String s : lista) {
			System.out.println(s);
		}
	}
	
	private static void recorrer(List<String> lista) {
		//trabajos con los datos de la lista
		for(String s : lista) {
			System.out.println(s);
		}
	}
	

}
