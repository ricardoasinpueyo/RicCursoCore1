package testbeans;

import beans.Animal;
import beans.Gato;

public class TestVariablesAnimal {

	public static void main(String[] args) {
		Animal a1,a2,a3,a4, a5;
		Gato gato1;
		
		a1 = new Animal("Pulpo - rojizo");
		a2 = new Gato("montes - marron", 6);
		a3 = new Animal("camaleón - verde");
		a4 = new Gato("gatuno - marron", 2);
		
		a5 = findAnimal();
		gato1 = (Gato)findAnimal();
		String tontada = (String) readObject(); 
		System.out.println(tontada);
		
		Gato g2 = (Gato)readObject();
		g2.mostrarDatos();
		
	}
	
	public static  Animal findAnimal() {
		return new Gato("callejero - blanco", 2);
	}
	
	public static Object readObject() {
		return new String("vaya tela el tomasin");
	}

}
