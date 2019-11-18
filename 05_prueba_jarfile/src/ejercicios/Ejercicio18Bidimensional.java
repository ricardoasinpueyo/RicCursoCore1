package ejercicios;

public class Ejercicio18Bidimensional {
	public static void main(String[] args) {
		String [] dias = {"lunes","martes", "miercoles","jueves","viernes",
				"sabado","domingo"};
		String [][] menus = {
								{"macarrones","lomo","sandia"},
								{"sopa","garbanzos","apaño","cafe","copa"},
								{"acelgas","pechuga plancha","melon","cafe"},
								{"lentejas","carne guisada","piña"},
								{"ensalada","rabo de toro","tarta",}
							};
		int fila = 1;
		System.out.println(dias[fila]);
		for (int j =0; j < menus[fila].length; j++)
			System.out.println(menus[fila][j]);
		
		
		System.out.println("MENU DE ESTA SEMANA");
		for (int i =0; i< menus.length; i++) {
			System.out.println("\n" + dias[i].toUpperCase());
			for (int j=0; j < menus[i].length; j++)
				System.out.print(menus[i][j] + "  - ");
				
		}
				
				
		}
	
}

 
