package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExcepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Este bloque de aqui, sera la parte que va a intentar
		//java ejecutar, pero es posible que algun error ocurra
		//, si algun error ocurriera, en vez de parar el programa
		//entraría por la parte del bloque catch
		
		boolean repetir = true;
		
		do {
			try {
				System.out.println("Introduzca el nominador:");
				int numero1 = sc.nextInt();
				System.out.println("Introduzca el denominador:");
				int numero2 = sc.nextInt();
				//si ponemos el numero2 con un cero, nos da un 
				//error en tiempo de ejecucion, y el programa se
				//para
				int resultado = numero1 / numero2;//esto puede arrojar excepciones aritmeticas
				// en caso de excepcion, deja de ejecutar el resto del 
				// bloque try
				System.out.println("El resultado es: " + resultado);
				repetir = false;
			} catch (ArithmeticException ae) {
				//si ocurre una excepcion en el bloque try de tipo
				//ArithmeticException, entraremos por esta parte
				//del codigo
				System.out.println("No se puede dividir por 0");
				//en la variable ae, tenemos información a cerca del error
				//que se ha producido, y podemos mostrarla o no, segun
				//nuestro criterio
				//podemos sacar un mensaje
				//System.out.println("mensaje: " + ae.getMessage());
				//o podemos imprimir toda la traza de el
				//ae.printStackTrace();				
			} catch (InputMismatchException ime) {
				System.out.println("No se admiten carateres");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Error inesperado " + e.getMessage());
			}
		} while (repetir);
		System.out.println("Fin del programa, gracias por usarlo");
	}

}
