package modelo.entidad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cfg.ConfiguracionSpring;

public class MainJavaConfig {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		System.out.println(p);

		
		Pelicula sp = context.getBean("otraPelicula",Pelicula.class);
		System.out.println(sp);
		/*
		String[] ids = context.getBeanDefinitionNames();
		for(String s : ids) {
			System.out.println(s);
		}*/
	}

}
