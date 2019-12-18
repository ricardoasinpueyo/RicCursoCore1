package hilos;

import java.util.Date;

public class HiloCalculoPrimo implements Runnable{

	private long numeroPrimo;
	private String nombre;
	
	public HiloCalculoPrimo(long numeroPrimo, String nombre) {
		this.numeroPrimo = numeroPrimo;
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		System.out.println(nombre + " - calculando si el numero " +
			numeroPrimo + " es primo...");
		//tomamos el tiempo inicial
		//la clase date cuando instaciamos el objeto
		//contiene el numero de milisegundos que han pasado
		//desde el año 1970
		Date dateInicial = new Date();//contiene el num de milesegundos desde 1970
		
		boolean esPrimo = true;
		for(long i = 2;i<numeroPrimo;i++) {
			if(numeroPrimo % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		Date dateFinal = new Date();
		
		//el numero de milisegundos es la resta de ambos tiempos
		long tiempoTranscurrido = dateFinal.getTime() - dateInicial.getTime();
		
		System.out.println("Hilo: " + nombre + " terminado");
		System.out.println("Hilo: " + nombre + ", es el numero "
				+ numeroPrimo + " primo?: " + esPrimo);
		System.out.println("Hilo: " + nombre + ", el tiempo total "
				+ "del calculo del numero ha sido " + tiempoTranscurrido);
	}

}
