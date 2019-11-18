package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestRRHHParte1 {
	public static void main(String[] args) {
		Departamento dep1 = null;
		dep1 = findById(30);
		System.out.println(dep1);
		
	}
	
	
	
	
	
	
	public static Departamento findById(int id) {
		if (id != 30)
			return null;
		Departamento dep30 = new Departamento(30, "Ventas",null);
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "diego", "martinez", "H", 
				35_000, 45, 2000, dep30);
		
 		emp115 = new Empleado(115, "sara", "perez", "M", 
				20_000, 35, 1000, dep30);
		
		emp116 = new Empleado(116, "carlos", "sanchez", "H", 
				18_000, 20, 0, dep30);
		
		emp300 = new Empleado(300, "natalia", "vazquez", "M", 
				60_000, 27, 5_500, dep30);
 		
	//	dep30.setJefe(emp114);
		
		return dep30;
	}
	
	public static void loDeArriba() {
		Departamento dep30 = new Departamento(30, "Ventas",null);
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "diego", "martinez", "H", 
				35_000, 45, 2000, dep30);
		
		emp115 = new Empleado(115, "sara", "perez", "M", 
				20_000, 35, 1000, dep30);
		
		emp116 = new Empleado(116, "carlos", "sanchez", "H", 
				18_000, 20, 0, dep30);
		
		emp300 = new Empleado(300, "natalia", "vazquez", "M", 
				60_000, 27, 5_500, dep30);
		
		dep30.setJefe(emp114);
		//asignacion de jefe que perteecea otro departamento otro departamento a departamento
		Departamento dep120 = new Departamento(120, "Formación", 
				new Empleado(225, "carmen", "gonzalez", "m", 70_000, 
							43, 10_000, dep30));
		
		dep120.getJefe().setDepartmento(dep120);
		
		
		Departamento dep130 = new Departamento(130, "Logistica", emp300);
		
		emp300.setDepartmento(dep130);
		
		System.out.println("dep 120 : " + dep120.getJefe().getDepartmento().getNombre());
		System.out.println("dep 130 : " + dep130.getJefe().getDepartmento().getNombre());
		System.out.println(emp300);
	}
		
	 
	
	
}
