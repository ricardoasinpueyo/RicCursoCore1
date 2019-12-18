package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteSuma {

	public static void main(String[] args) {
		//System.in es un stream de entrada
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero 1: ");
		int numero1 = sc.nextInt();
		System.out.println("introduzca el numero 2: ");
		int numero2 = sc.nextInt();
		
		//nos conectamos al servidor para mandarle
		//los numeros
		
		//si hacemos esto de una manera clasica, deberiams
		//crear estar variables fuera del try y luego 
		//cerrarlas en el bloque finally. Desde la version
		//1.7 de java, podemos poner las variables que queremos
		//cerrar automaticamente dentro de los parentesis del try
		//y cuando salga se cerraran
		try(Socket socket = new Socket("",2019);
				PrintStream ps = 
						new PrintStream(socket.getOutputStream())) {
			//creamos el tubo
			
			//creamos un objeto que me permite escribir
			//sobre el output stream del socket
			ps.println(numero1 + "-" + numero2);
			
			//ahora en el cliente tendremos que ller la inforamcion
			//del servidor
			InputStreamReader isr = 
					new InputStreamReader(socket.getInputStream());
			
			//para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			//en este linea nos quedaremos parados hasta que 
			//el servidor nos responda
			System.out.println("cliente: " + bf.readLine());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
