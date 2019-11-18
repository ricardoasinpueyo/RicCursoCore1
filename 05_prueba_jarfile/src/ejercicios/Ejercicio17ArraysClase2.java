package ejercicios;

public class Ejercicio17ArraysClase2 {
	public static void main(String[] args) {
		String [] dias = {"lunes","martes", "miercoles","jueves","viernes",
				"sabado","domingo"};
		int ind =0;
		
		int diaSemana = 1;
		
//		System.out.println("hoy es : " + dias[diaSemana-1]);
		System.out.println("\n\nCASO 1 viene entero");
		//caso 1: lo mas normal, que el array este completo
		for (String dia: dias) {
				System.out.println("dia caso 1: " + dia);
		}
		System.out.println("\n\nCASO 2 huecos al final con for");
		//caso 2: incompleto-sin huecos, y se el tope(se cuantos tienen contenido)
		for (int i=0; i<5; i++)
			System.out.println("dia caso 2 : " + dias[i]);
		System.out.println("\n\nCASO 3 huecon al final con while sin tope ");
		//caso 3: incompleto-sin huecos, y NO se el tope(se cuantos tienen contenido)
		while (ind < dias.length && dias[ind] != null) {
			System.out.println("dia caso 3 : " + dias[ind]);
			ind++;
		}
		System.out.println("\n\nCASO 4 huecos sin saber donde");
	//	caso 4: un array con huecos
		for (String dia: dias) {
			 	if (dia != null)
						System.out.println("dia caso 4: " + dia);
	}

	}
}

