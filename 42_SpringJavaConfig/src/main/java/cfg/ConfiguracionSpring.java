package cfg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;

//Esta clase ahora llevará la configuracion de Spring en 
//vez del xml
//Tambien podemos mezclar esto con anotaciones
//Mediante la antoacion
//@ComponentScan podemos decir que vaya a buscar 
//anotaciones alla donde queramos
@ComponentScan(basePackages = "modelo")
public class ConfiguracionSpring {

	//los beans los vamos a dar de alta mediante metodos
	//anotados con la anotacion @Bean
	//el id con que se va a dar de alta sera el nombre
	//del metodo y la class sera del tipo que devuelvas
	@Bean
	//podemos seguir usando el scope para el alcance
	@Scope("prototype")
	public Director directorSpielberg() {
		Director d = new Director();
		d.setNombre("Steven Spielberg");//equivalente a property
		return d;
	}
	//lo de arriba seria equivalente a 
	/*
	 * <bean id="director" class="modelo.entidad.Director"> <property name="nombre"
	 * value="Steven Spielberg"> </bean>
	 */
	
	@Bean
	@Scope("prototype")
	//por defecto si le pasamos parametros de entrada
	//al metodo, spring va a intentar hacer un autowired
	//de algun objeto del contexto para pasarselo
	//si hubiera más de uno y no puediera hacer el 
	//autowired por nombre, la inicializacion del contexto
	//fallaria
	public Pelicula pelicula(Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		return pelicula;
	}
	
	//podemos cambiar el nombre mediante la anotacion
	//@Bean
	@Bean(name = "director")
	@Scope("prototype")
	public Director otroDirector() {
		Director d = new Director();
		d.setNombre("George Lucas");
		return d;
	}
	
	@Bean
	@Scope("prototype")
	//con la anotacion @Qualifier podemos decir el id
	//concreto del bean que queremos meterle
	public Pelicula otraPelicula(@Qualifier("directorSpielberg")Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		return pelicula;
	}
}
