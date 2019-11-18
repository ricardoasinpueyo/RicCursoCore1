import beans.Empleado;

public class TestConstante {

	public static void main(String[] args) {
		System.out.println(Empleado.MESES_NOMINA);
		Empleado e1 = new Empleado();
		System.out.println(e1.MESES_NOMINA);

	}

}
