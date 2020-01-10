package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpring {

	//esta referencia llevara el objeto de contexto de spring
	//este objeto llevara el ciclo de vida de todos los objetos
	//que hayamos creado en el xml
	public static ApplicationContext context;
	
	public static void main(String[] args) {
		//damos de alta el contexto de spring, a partir
		//de un fichero xml. Este contexto llevara el ciclo
		//de vida de todos los "beans" que hay en dicho fichero
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		//a partir de este momento, a traves del contexto
		//de spring podemos acceder a cualquier bean
		//mediante su id
		//getBean devuelve una referencia de tipo Object
		//con lo cual debemos de decirle a java que nos
		//convierta la refencia de tipo Object a otra
		//de tipo Persona
		Persona p1 = (Persona)context.getBean("persona1");

		Persona p2 = new Persona();
		
		//Diferencias entre uno y otro
		//aqui no pierdo el objeto porque me lo gestiona spring
		//IoC
		p1 = null;
		//aqui pierdo el objeto porque lo gestiono yo
		p2 = null;
		
		p1 = (Persona)context.getBean("persona1");
		
		p1.setNombre("Jarry poter");
		
		p1 = null;
		
		p1 = (Persona)context.getBean("persona1");
		System.out.println(p1.getNombre());
		
		p2 = new Persona();
		p2.setNombre("Ernion");
		
		imprimirNombrePersona(p2);
		imprimirNombrePersonaSpring();
		
		//Esto hace un cast automatico a la clase persona
		Persona bud = context.getBean("bud",Persona.class);
		System.out.println(bud.getNombre());
		System.out.println(bud.getPeso());
		
		bud.setPeso(198);
		
		Persona p3 = context.getBean("bud",Persona.class);
		System.out.println(p3.getPeso());
	}

	private static void imprimirNombrePersonaSpring() {
		Persona p = (Persona)context.getBean("persona1");
		System.out.println(p.getNombre());		
	}

	private static void imprimirNombrePersona(Persona p) {
		System.out.println(p.getNombre());
	}

}
