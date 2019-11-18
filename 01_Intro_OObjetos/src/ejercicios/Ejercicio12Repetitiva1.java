package ejercicios;
import java.util.Scanner;

public class Ejercicio12Repetitiva1 {
	public static void main(String[] args) {
		/*
		 * 1.	Leer un número detrás de otro mientras que el número entero  
		 * leído sea distinto de cero. Al final del proceso mostrar cuantos
		 *  números válidos he leído, y cuanto suman las cantidades de 
		 *  los números introducidos.
		 */
		Scanner sc = new Scanner(System.in);
		int numero = 0, contador = 0, acumulador = 0;
		numero = sc.nextInt();
		while (numero != 0) {
			contador++;
			acumulador += numero;
			// OJO!!!!! y vuelvo a leer que se me bucla
			numero = sc.nextInt();
		}
		
		System.out.println("numeros leidos : " + contador);
		System.out.println("suman todos : " + acumulador);
		
		
		
		
		sc.close();
	}
	
}
