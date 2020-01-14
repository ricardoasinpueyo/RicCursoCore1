package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author felix de pablo
 *
 */

/*
 * Podemos dar de alta los beans tambien por anotaciones
 * 
 * Tenemos 4 tipos de anotaciones basicas
 * 
 * @Component
 * @Service
 * @Repository
 * @Controller
 * 
 * La anotacion @Component da de alta la clase como bean
 *  en el contexto de spring
 *  
 * Las otras anotaciones hacen lo MISMO, son anotaciones
 * semanticas
 * 
 * @Service se usa para dar de lata un objeto de tipo gestor
 * 
 * @Repository es para dar de alta un objeto de tipo DAO
 * 
 * @Controller es par adar de alta un objeto de tipo controlador
 */

//@Component
//Equivalente a <bean id="director" class="modelo.entidad.Director"></bean>
//por defecto, el id del bean sera el nombre de la clase en lowerCamelCase

//@Component(value = "directorPropio")
//de esta manera le podemos cambiar el id
@Component
@Scope("prototype")
//de esta manera damos de alta el bean con alcance prototipado
public class Director {
	private String nombre = "Harry el sucio";
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}	
}
