package main;

import java.util.ArrayList;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class MainEmpleados {
	public static void main(String[] args) {
		System.out.println(Director.VARIABLE_POR_EMPLEADO);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		
		Programador p1 = new Programador();
		p1.setNombre("Harry Potter");
		p1.setEdad(17);
		p1.setDni("78992929S");
		p1.setSalarioBase(1500);
		
		empresa.add(p1);
		
		p1 = new Programador();
		p1.setNombre("Ernion Güesley");
		p1.setEdad(19);
		p1.setDni("5554454S");
		p1.setSalarioBase(1200);
		
		empresa.add(p1);
		
		p1 = new Programador();
		p1.setNombre("Ron");
		p1.setEdad(20);
		p1.setDni("12345678S");
		p1.setSalarioBase(1400);
		
		empresa.add(p1);
		
		p1 = new Programador();
		p1.setNombre("boldemor");
		p1.setEdad(23);
		p1.setDni("122121211S");
		p1.setSalarioBase(1600);
		
		empresa.add(p1);
		
		JefeProyecto jp1 = new JefeProyecto();
		jp1.setNombre("Draco Molfai");
		jp1.setEdad(33);
		jp1.setDni("66666666S");
		jp1.setSalarioBase(2000);
		jp1.setIncentivos(300);
		
		empresa.add(jp1);
		
		jp1 = new JefeProyecto();
		jp1.setNombre("Jagris");
		jp1.setEdad(39);
		jp1.setDni("99999999S");
		jp1.setSalarioBase(2100);
		jp1.setIncentivos(350);
		
		empresa.add(jp1);
		
		Director d1 = new Director();
		d1.setNombre("Dambeldor");
		d1.setEdad(150);
		d1.setDni("12351822S");
		d1.setSalarioBase(2400);
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(empresa.get(0));//harry
		listaEmpleados.add(empresa.get(1));//ernion
		listaEmpleados.add(empresa.get(4));//draco
		
		d1.setListaEmpleados(listaEmpleados);
		
		empresa.add(d1);
		
		for(Empleado empleado : empresa) {
			//empleamos el polimorfismo
			//segun el objeto al que estemos apuntando
			//ejecutaremos su calcular salario diferente
			System.out.println(empleado.calcularSalario());
		}
	}
}
