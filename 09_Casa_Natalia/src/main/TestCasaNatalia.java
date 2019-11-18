package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Dirección;
import bean.Habitación;
import bean.Persona;

public class TestCasaNatalia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dirección d1 = new Dirección("Calle", "Manoteras", "Madrid");
		Persona pers1 = new Persona("Ana", 37, 55, d1);
		Persona pers2 = new Persona("Eva", 48, 55, new Dirección("Calle", "Castellana", "Valencia"));
		Persona pers3 = new Persona("Pepe", 25, 55, new Dirección("Calle", "Gran Vía", "Barcelona"));

		Dirección dir1 = new Dirección("Calle", "del Peine", "Salamanca");
		Dirección dir2 = new Dirección("Calle", "Bravo Murillo", "Zaragoza");
		Dirección dir3 = new Dirección("Calle", "de la Rambla", "Leon");

		Habitación hab1 = new Habitación();

		hab1.setSuperficie(50);
		hab1.setTipo("salon");

		Habitación hab2 = new Habitación();

		hab2.setSuperficie(35);
		hab2.setTipo("dormitorio1");

		Habitación hab3 = new Habitación();

		hab3.setSuperficie(35);
		hab3.setTipo("dormitorio2");

		Habitación hab4 = new Habitación();

		hab4.setSuperficie(35);
		hab4.setTipo("dormitorio3");

		Habitación hab5 = new Habitación();

		hab5.setSuperficie(35);
		hab5.setTipo("dormitorio4");

		Habitación hab6 = new Habitación();

		hab6.setSuperficie(35);
		hab6.setTipo("dormitorio5");

		Habitación hab7 = new Habitación();

		hab7.setSuperficie(15);
		hab7.setTipo("baño1");

		Habitación hab8 = new Habitación();

		hab8.setSuperficie(15);
		hab8.setTipo("baño2");

		Habitación hab9 = new Habitación();

		hab9.setSuperficie(25);
		hab9.setTipo("baño3");

		Habitación hab10 = new Habitación();

		hab10.setSuperficie(45);
		hab10.setTipo("cocina");

		Habitación hab11 = new Habitación();

		hab11.setSuperficie(200);
		hab11.setTipo("terraza");

		Habitación hab12 = new Habitación();

		hab12.setSuperficie(100);
		hab12.setTipo("garaje");

		ArrayList<Habitación> listaHabitaciones1 = new ArrayList<Habitación>();
		listaHabitaciones1.add(hab1);
		listaHabitaciones1.add(hab2);
		listaHabitaciones1.add(hab3);


		ArrayList<Habitación> listaHabitaciones2 = new ArrayList<Habitación>();
		listaHabitaciones2.add(hab6);
		listaHabitaciones2.add(hab7);
		listaHabitaciones2.add(hab8);
		listaHabitaciones2.add(hab9);


		ArrayList<Habitación> listaHabitaciones3 = new ArrayList<Habitación>();
		listaHabitaciones3.add(hab4);
		listaHabitaciones3.add(hab5);
		listaHabitaciones3.add(hab10);
		listaHabitaciones3.add(hab11);
		listaHabitaciones3.add(hab12);

		Casa casa1 = new Casa(500000, listaHabitaciones1, pers1, dir1);
		Casa casa2 = new Casa(400.000, listaHabitaciones2, pers2, dir2);
		Casa casa3 = new Casa(300.000, listaHabitaciones3, pers3, dir3);

		System.out.println("Casa1 " + casa1);
		System.out.println("Casa2 " + casa2);
		System.out.println("Casa3 " + casa3);

		System.out.println("Fin");

	}

}
