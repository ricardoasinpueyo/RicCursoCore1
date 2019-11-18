package ejercicios;
import java.util.Scanner;

public class Ejercicio06AlrededorSexo {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char sexo='H';
		if (sexo == 'H')
			System.out.println("Hombre");
		else
			System.out.println("Mujer");
		String sexoS = "H";
		if (sexoS.equals("H"))
			System.out.println("Hombre String");
		else
			System.out.println("mujerString");
		
		char sexoLeer;
		sexoLeer = leer.next().charAt(0);
		if (sexoLeer == 'H')
			System.out.println("Hombre con caracter");
		else
			System.out.println("Mujer con caracter");
		
		String sexoLeerString = null;
		sexoLeerString = leer.next();
		if (sexoLeerString.equals("H"))
			System.out.println("Hombre Leer String");
		else
			System.out.println("Mujer Leer String");
		System.out.println("Pepe".compareTo("pepe"));
	leer.close();
	}

}
