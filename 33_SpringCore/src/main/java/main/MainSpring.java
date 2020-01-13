package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Direccion;
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
		
		Persona p4 = context.getBean("terence",Persona.class);
		System.out.println(p4);
		
		Persona pRon = context.getBean("ron",Persona.class);
		System.out.println(pRon);
		
		Direccion dRon = context.getBean("direccion1",Direccion.class);
		System.out.println(dRon);
		
		Persona pEsneip = context.getBean("esneip",Persona.class);
		System.out.println(pEsneip);
		//notese que no puedo acceder directametn a  la direccion de Esneip
		
		//Debemos siempre en la medida de lo posible usar
		//interfaces en vez referencias de clases concretas
		//porque dejamos el codigo mas abierto a usar diferentes
		//tipos de objetos
		List<Persona> listaPersonas = context.getBean("listaPersonas",List.class);
		listaPersonas.add(pRon);
		
		//ahora obtemos la lista con los objetos inyectados
		//mediante spring
		System.out.println("******* lista personas ********");
		List<Persona> personas = context.getBean("personas", List.class);
		for(Persona p : personas) {
			System.out.println(p);
		}
		personas.add(pEsneip);
		personas.add(pRon);
		
		for(Persona p : personas) {
			System.out.println(p);
		}
		
		System.out.println("********* todos los ids **************");
		//esto me devuelve toods los ids que tenga en 
		//el contexto de spring
		String[] idsContexto = context.getBeanDefinitionNames();
		for(String id : idsContexto) {
			System.out.println(id);
		}
		
		System.out.println("******* imprimimos todos los objetos **************");
		for(String id : idsContexto) {
			Object o = context.getBean(id);
			//gracias al polimorfismo cada objeto
			//invocará a su propio toString
			System.out.println(o);
		}
		
		//ejemplos sobre prototype
		System.out.println("********* Prototype **********");
		Persona p5 = context.getBean("personaPrototype",Persona.class);
		p5.setNombre("Felix");
		
		Persona p6 = context.getBean("personaPrototype",Persona.class);
		p6.setNombre("Andres");
		
		List<Persona> personasSingleton = context.getBean("listaPersonasSingleton", List.class);
		personasSingleton.add(p5);
		personasSingleton.add(p6);
		
		for(Persona p : personasSingleton) {
			System.out.println(p);
		}
	}

	private static void imprimirNombrePersonaSpring() {
		Persona p = (Persona)context.getBean("persona1");
		System.out.println(p.getNombre());		
	}

	private static void imprimirNombrePersona(Persona p) {
		System.out.println(p.getNombre());
	}

}
