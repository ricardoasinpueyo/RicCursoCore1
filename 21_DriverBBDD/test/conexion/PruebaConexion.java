package conexion;

import modelo.persistencia.DaoCoche;

public class PruebaConexion {

	public static void main(String[] args) {
		DaoCoche daoCoche = new DaoCoche();
		boolean estaConectado = daoCoche.abrirConexion();
		System.out.println(estaConectado);
	}

}
