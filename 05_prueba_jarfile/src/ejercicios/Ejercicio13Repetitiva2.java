package ejercicios;

public class Ejercicio13Repetitiva2 {
	public static void main(String[] args) {
		for(int i=1; i<= 250; i++) {
			if (i%3 == 0 && i%7 == 0)
				System.out.println("mul 3 y 7 : " + i);
		}
	}

}
