package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestEmpleadoConDepartamento {
	public static void main(String[] args) {
		Empleado emp1 = new Empleado(200, "eva", "perez", "M", 
				120000, 34, 100, null);
		
		Departamento dep40 = new Departamento(40, "Formacion");
		Empleado emp2 = new Empleado(210, "sara", "ruiz", "M", 
				150000, 45, 10000, dep40);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		/*mostrar por consola 
		 * el nombre del empleado2, su salario y
		 * el nombre del departamento del emp2
		 */
		
		System.out.println("nombre empleado 2 - sara : " + emp2.getNombre());
		System.out.println("salario empleado 2 - 150000 : " + emp2.getSalario());
		System.out.println("nombre dep del empleado 2 - Formacion : " 
		+ emp2.getDepartmento().getNombre());
		
		
	}

}
