package testbeans;

import beans.Animal;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1,a2,a3;
		a1 = new Animal(" camaleon verde");
		a2 = new Animal("buho rojo");
		a3 = new Animal("nisesabe negro");
		
		System.out.println(a1 + " - " + a2 + " - " + a3);
		a1.saludar();
		a1.sonido();
		
		Animal [] zoologico = {a1,a2,a3};
		
		for (Animal ele: zoologico) {
			System.out.print(ele.getColor() + "- ");
			ele.sonido();
		}
		
		
	}

}
