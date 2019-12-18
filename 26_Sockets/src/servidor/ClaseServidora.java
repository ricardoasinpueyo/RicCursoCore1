package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClaseServidora {
	public static void main(String[] args) {
		
		System.out.println("Escuchando peticiones...");
		try (ServerSocket ss = new ServerSocket(2019);
				Socket socket = ss.accept();){
			//ServerSocket ss = new ServerSocket(2019);
			//abrimos el puerto y escuchamos peticiones
			//hechas por un socket
			
			//Socket socket = ss.accept();
			//Este metodo se quedara parado el hilo de ejecucion
			//hasta que llegue la peticion de un cliente
			//cuando llegue la peticion de un cliente
			//se continuara ejecutando el codigo y se nos
			//creara un objeto Socket
			
			//usamos la clase InputStreamReader para leer del
			//tunel de entrada de datos, lo que pasa es que esta
			//clase solo me permite leer caracter a caracter
			InputStreamReader isr = 
					new InputStreamReader(socket.getInputStream());
			
			//para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			String cadena = bf.readLine();
			System.out.println("Ha llegado lo siguiente al servidor: " 
			+ cadena);
			String[] numeros = cadena.split("-");
			String numero1 = numeros[0];
			String numero2 = numeros[1];
			
			int iNumero1 = Integer.parseInt(numero1);
			int iNumero2 = Integer.parseInt(numero2);
			
			int resultado = iNumero1 + iNumero2;
			
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.println(""+resultado);
			
			System.out.println("Fin del servidor");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
