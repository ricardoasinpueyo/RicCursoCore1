package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Cliente;

import modelo.persistencia.DaoCliente;

public class GestorCliente {

	private DaoCliente daoCliente;

	public List<Cliente> getListaClientes() {
		return daoCliente.getListaClientes();
	}

	/**
	 * Dar de alta un cliente
	 * 
	 * @param cliente cliente a dar de alta
	 * @return 3 si flata letra del dni, 2 si nombre esta vacio, 1 si edad esta
	 *         vacio, 6 si el dni esta repetido
	 * 
	 */
	public int alta(Cliente cliente) {

		if (cliente.getEdad().isEmpty()) {
			return 1;
		}
		
		if (cliente.getNombre().isEmpty()) {
			return 2;
		}
		
		if (Character.isDigit(cliente.getDni().charAt(8))) {
			return 3;
		}		
	
		if (comprobarDniRepetido(cliente.getDni())) {
			return 6;
		}
		
		return daoCliente.alta(cliente);
	}

	public Cliente buscarPorId(int id) {
		return daoCliente.buscarPorId(id);
	}

	public List<Cliente> buscarPorNombre(String nombre) {
		return daoCliente.buscarPorNombre(nombre);
	}

	public boolean baja(int id) {
		return daoCliente.baja(id);
	}

	private boolean comprobarDniRepetido(String dni) {
		for (Cliente c : daoCliente.getListaClientes()) {
			if (c.getDni().equals(dni)) {
				return true;
			}
		}

		return false;
	}

	public void setGestorCliente(DaoCliente daoCliente) {
		this.daoCliente = daoCliente;		
	}

}
