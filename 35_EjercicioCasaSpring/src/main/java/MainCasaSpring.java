import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Casa;

public class MainCasaSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Casa casa = context.getBean("c1",Casa.class);
		
		System.out.println(casa);
	}
}
