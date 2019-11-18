
public class PrimeraTontadaTomasin {

	public static void main(String[] args) {
		int a = 7, b= 9, c= 0;
		Persona p1 = new Persona();
//		p1.edad = 34; 
		p1.setEdad(34);
//		p1.nombre = "tomasin";
		p1.setNombre("tomasin");
		
		System.out.println("mi nombre de p1 es :" + p1.getNombre().toUpperCase());
/*		
		Persona p2 = new Persona();
		p2.nombre = "ESTEBAN";
		p2.edad = -90;
	*/	
		c= a+b;
		
		if (a > b)
			System.out.println("a es mayor que b : " + a);
		else
			System.out.println("a es menor que b : " + b);

	}

}
