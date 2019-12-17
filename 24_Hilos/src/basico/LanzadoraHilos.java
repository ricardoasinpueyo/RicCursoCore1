package basico;

public class LanzadoraHilos {

	public static void main(String[] args) {
		HiloThread ht1 = new HiloThread("ht1");
		HiloThread ht2 = new HiloThread("ht2");
		
		//una vez creados los objetos hilos, les decimos
		//que arranquen
		//ht1.start();
		//ht2.start();
		
		//si ejecutamos el metodo run() directamente
		//no arrancamos hilo, serie el hilo main el que 
		//ejecutaria el metodo run(), primero el de ht1 y
		//luego el de ht2
		//ht1.run();
		//ht2.run();
		
		//con runnable, primero tenemso que crear el objeto
		//runnable 
		
		HiloRunnable hr1 = new HiloRunnable("hr1");
		HiloRunnable hr2 = new HiloRunnable("hr2");
		
		//y a continuacion crear un objeto hilo (Thread)
		//pasandole el objeto runnable
		Thread t1 = new Thread(hr1);
		Thread t2 = new Thread(hr2);
		//si pasamo el mismo objeto a ambos hilos, podemos
		//tener problemas de concurrencia, ya que ambos
		//hilos estan ejecutando el mismo objeto02
		
		//y ahora podemos arrancar el hilo de manera normal
		//, el hilo ejecutará el metodo run del objeto pasado
		//por parametro
		t1.start();
		t2.start();
	}

}





