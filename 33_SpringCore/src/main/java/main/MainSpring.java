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

	}

}
