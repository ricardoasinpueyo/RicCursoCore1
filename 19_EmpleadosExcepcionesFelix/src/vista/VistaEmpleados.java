package vista;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;
import negocio.GestorEmpleados;

public class VistaEmpleados {

	//Lo declaramos como atributo de clase para que su
	//visibilidad sea toda esta clase, si no tendriamos que estar
	//pasando la referencia sc por todos los metodos
	private static Scanner sc = null;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		GestorEmpleados ge = new GestorEmpleados();
		ge.setListaEmpleado(new ArrayList<>());
		String opcion = "";

		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case "1":
				Empleado e = pedirEmpleado(ge);
				ge.alta(e);
				break;
			case "2":{//creo estos bloques para evitar duplicidad de variable
				ArrayList<Empleado> listaEmpleados = ge.getListaEmpleado();
				for(Empleado empleado : listaEmpleados) {
					System.out.println(empleado);
				}
				break;
			}case "3":{
				ArrayList<Empleado> listaEmpleados = ge.getListaEmpleado();
				for(Empleado empleado : listaEmpleados) {
					System.out.print(empleado.getNombre() + " - ");
					System.out.println(empleado.calcularSalario());
				}
				break;
			}case "0":
				System.out.println("Gracias por usar nuestra app");
				break;
			default:
				System.out.println("opcion no reconocida");
				break;
			}
		}while(!opcion.equals("0"));
		
		
	}

	private static Empleado pedirEmpleado(GestorEmpleados ge) {
		String opcion = mostrarMenuTipoEmpleado();
		Empleado empleado = null;
		switch (opcion) {
		case "1":
			empleado = pedirProgramador();
			break;
		case "2":
			empleado = pedirJefeProyecto();
			break;
		case "3":
			empleado = pedirDirector(ge);
			break;
		}
		return empleado;
	}

	private static Empleado pedirDirector(GestorEmpleados ge) {
		String nombre = pedirDato("nombre");
		String dni = pedirDato("dni");
		String edad = pedirDato("edad");
		String salarioBase = pedirDato("Salario base");
		
		ArrayList<Empleado> listaEmpleados = pedirEmpleados(ge);
		
		Director director = new Director();
		director.setNombre(nombre);
		director.setDni(dni);
		
		double dSalariobase = 0;
		int iEdad = 0;
		boolean repetir = true;
		do {
			try {
				dSalariobase = Double.parseDouble(salarioBase);
				iEdad = Integer.parseInt(edad);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("solamente se admiten numeros");
				sc.nextLine();
			}			
		} while (repetir);
		
		director.setEdad(iEdad);
		director.setSalarioBase(dSalariobase);
		director.setListaEmpleados(listaEmpleados);
		
		return director;
	}

	/**
	 * Metodo cuyo proposito es mostrar la lista de empleados
	 * totales y que el usuario seleccione aquellos empleados
	 * que quiere que tenga el director a su cargo
	 * 
	 * Finalizara cuando el usuario introduzca -1
	 * @param ge el gestor empleados se necesita para buscar
	 * la lista de todos los empleados
	 * 
	 * @return la lista de empleados que tendra el director
	 */
	private static ArrayList<Empleado> pedirEmpleados(GestorEmpleados ge) {
		
		ArrayList<Empleado> listaEmpleados = 
				ge.getListaEmpleado();
		ArrayList<Empleado> listaEmpleadosACargo = 
				new ArrayList<Empleado>();
		//esta variable guardara la eleccion del usuario
		String posicionEmpleado = null;
		do {
			//este mostrara el indice de las posiciones del array
			//que sera mostrado al usuario
			int indice = 0;
			//siempre mostraremos el array total de empleados
			//para que lo pueda ver nuestro usuario
			System.out.println("Elija un empleado (-1 para salir)");
			for(Empleado e : listaEmpleados) {
				System.out.println(indice + " - " + e);
				indice++;
			}
			//le pedimos al usuario que elija la posicion
			posicionEmpleado = sc.nextLine();
			if(!posicionEmpleado.equals("-1")) {
				//en caso de que sea distinto a -1, add
				//al array de los empleados del director
				//el empleado elegido por el indice del array
				//total de empleados
				Empleado empleadoSeleccionado;
				boolean repetir = true;
				do {
					try {
						int iPosicionEmpleado = Integer.parseInt(posicionEmpleado);
						empleadoSeleccionado = ge.getListaEmpleado().get(iPosicionEmpleado);
						listaEmpleadosACargo.add(empleadoSeleccionado);
						repetir = false;
					} catch (NumberFormatException e1) {
						System.out.println("El indice debe de ser numerico");
						sc.nextLine();
					} catch (IndexOutOfBoundsException ioobe) {
						System.out.println("No hay tantas posiciones en el array " + "de empleados (0-"
								+ (listaEmpleados.size() - 1) + ")");
					} 
				} while (repetir);
				
			}
		}while(!posicionEmpleado.equals("-1"));
		return listaEmpleadosACargo;
	}

	private static Empleado pedirJefeProyecto() {
		String nombre = pedirDato("nombre");
		String dni = pedirDato("dni");
		String edad = pedirDato("edad");
		String salarioBase = pedirDato("Salario base");
		String incentivos = pedirDato("incentivos");
		
		JefeProyecto jefeProyecto = new JefeProyecto();
		
		double dSalariobase = 0;
		int iEdad = 0;
		double dIncentivos = 0;
		boolean repetir = true;
		do {
			try {
				dSalariobase = Double.parseDouble(salarioBase);
				iEdad = Integer.parseInt(edad);
				dIncentivos = Double.parseDouble(incentivos);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("Solo admitimos numeros");
				sc.nextLine();
			} 
		} while (repetir);
		jefeProyecto.setNombre(nombre);
		jefeProyecto.setDni(dni);
		jefeProyecto.setEdad(iEdad);
		jefeProyecto.setSalarioBase(dSalariobase);
		jefeProyecto.setIncentivos(dIncentivos);
		
		return jefeProyecto;
	}

	private static Empleado pedirProgramador() {
		String nombre = pedirDato("nombre");
		String dni = pedirDato("dni");
		String edad = pedirDato("edad");
		String salarioBase = pedirDato("Salario base");
		
		Programador p = new Programador();
		p.setNombre(nombre);
		p.setDni(dni);
		
		double dSalariobase = 0;
		int iEdad = 0;
		//esto lo suyo seria sacarlo a un funcion
		boolean repetir = true;
		do {
			try {
				dSalariobase = Double.parseDouble(salarioBase);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("solamente se admiten numeros");
				salarioBase = pedirDato("Salario base");
				sc.nextLine();
			}			
		} while (repetir);
		
		iEdad = parsearStringAEntero(edad, "Edad");
		
		p.setSalarioBase(dSalariobase);
		p.setEdad(iEdad);
		
		return p;
	}
	
	private static int parsearStringAEntero(String sNumero, String dato) {
		boolean repetir = true;
		int iNumero = 0;
		do {
			try {
				iNumero = Integer.parseInt(sNumero);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("solamente se admiten numeros");
				sNumero = pedirDato(dato);
				sc.nextLine();
			}			
		} while (repetir);
		return iNumero;
	}

	private static String pedirDato(String dato) {
		System.out.println("Introduzca " + dato);
		String valor = sc.nextLine();
		return valor;
	}

	private static String mostrarMenuTipoEmpleado() {
		System.out.println("1 - Programador");
		System.out.println("2 - Jefe de Proyecto");
		System.out.println("3 - Director");
		String opcion = sc.nextLine();
		return opcion;
	}

	private static String mostrarMenu() {
		System.out.println("1 - alta empleado");
		System.out.println("2 - listar empleado");
		System.out.println("3 - mostrar salarios");
		System.out.println("0 - salir");
		String opcion = sc.nextLine();
		return opcion;
	}


}
