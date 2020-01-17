package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ConfiguracionSpring;
import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;
import modelo.persistencia.DaoCliente;

public class MainCliente {

	public static ApplicationContext context;

	public static void main(String[] args) {

		// Primera parte
		// creacion de los objetos necesarios para el programa
		// y la inyeccion de sus dependencias

		Scanner sc = new Scanner(System.in);
		context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

		// En este caso lo que tenemos que pasarle es un
		// objeto daoClientes
		GestorCliente gl = (GestorCliente) context.getBean("gestorCliente");
		// GestorCliente gl = context.getBean("gestorClientes", GestorCliente.class);

		String opcion = "0";
		do {
			System.out.println("\n1- Alta de cliente");
			System.out.println("2- Lista de clientes");
			System.out.println("3- Buscar cliente por id");
			System.out.println("4- Buscar clientes por nombre");
			System.out.println("5- Eliminar clientes por id");

			System.out.println("\n0- Salir");
			opcion = sc.nextLine();
			if (opcion.equals("1")) {
				System.out.println("Introduzca el dni:");
				// nextLine coge toda la frase, next coge palabra
				String dni = sc.nextLine();
				System.out.println("Introduzca el nombre:");
				String nombre = sc.nextLine();
				System.out.println("Introduzca la edad");
				String edad = sc.nextLine();

				Cliente l = context.getBean("cliente", Cliente.class);

				l.setDni(dni);
				l.setNombre(nombre);
				l.setEdad(edad);

				// basandonos en la explicacion de la documentacion
				// del metodo alta, podemos darle información a nuestro
				// usuario
				int alta = gl.alta(l);
				if (alta == 0) {
					System.out.println("\nCliente introducido correctamente");
				} else if (alta == 1) {
					System.out.println("El Cliente tiene que tener una edad");
				} else if (alta == 2) {
					System.out.println("El Cliente tiene que tener un nombre");
				} else if (alta == 3) {
					System.out.println("El dni debe de acabar con letra");
				} else if (alta == 6) {
					System.out.println("Dni repetido");
				}
			} else if (opcion.equals("2")) {
				// ahora como estamos trabajando con Interfaces
				// es decir, el metodo getListaClientes() me devuelve
				// una interfaz, no puedo apuntar a una interfaz List
				// con una referencia de tipo ArrayList, por lo que
				// tengo que cambiar el tipo de rereferencia a List
				// Interfaz = Implementacion Si se puede
				// Implementacion = Interfaz NO se puede
				List<Cliente> clientes = gl.getListaClientes();
				if (clientes.size() != 0) {
					for (Cliente l : clientes) {
						System.out.println(l);
					}
				} else {
					System.out.println("Todavia no hay clientes en la libreria");
				}
			} else if (opcion.equals("3")) {
				System.out.println("Introduzca el Id a buscar");
				String id = sc.nextLine();
				int iid = Integer.parseInt(id);

				Cliente l = gl.buscarPorId(iid);
				if (l == null) {
					System.out.println("El Cliente no se ha encontrado");
				} else {
					System.out.println(l);
				}
			} else if (opcion.equals("4")) {
				System.out.println("Introduzca el nombre a buscar");
				String nombre = sc.nextLine();
				// como la parte de la logica de negocio
				// la lleva el gestor, usamos el gestor creado
				// para buscar por genero
				List<Cliente> lista = gl.buscarPorNombre(nombre);
				if (lista.size() != 0) {
					System.out.println("La lista de libros por Nombre es:");
					for (Cliente l : lista) {
						System.out.println(l);
					}
				} else {
					System.out.println("No hay conincidencias por nombre");
				}
			} else if (opcion.equals("5")) {
				System.out.println("Introduzca el Id a eliminar");
				String id = sc.nextLine();
				int iId = Integer.parseInt(id);

				Cliente l = gl.buscarPorId(iId);
				if (l == null) {
					System.out.println("El Cliente no se ha encontrado");
				} else {
					System.out.println(l);
					boolean baja = gl.baja(iId);
					if (baja) {
						System.out.println("\nCliente eliminado correctamente");
					}

				}
			}

		} while (!opcion.equals("0"));
		System.out.println("Fin del programa");

	}
}