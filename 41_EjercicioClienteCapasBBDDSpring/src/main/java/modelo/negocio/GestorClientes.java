package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Cliente;

import modelo.persistencia.DaoClientes;

@Service
public class GestorClientes {
	// En este caso lo que necesita la capa gestora
	// para funcionar es el dao del la librería
	// habria que adaptar todo el codigo a este dao
	@Autowired
	private DaoClientes daoClientes;

	public List<Cliente> getListaClientes() {
		return daoClientes.getListaClientes();
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
		
		return daoClientes.alta(cliente);
	}

	public Cliente buscarPorId(int id) {
		return daoClientes.buscarPorId(id);
	}

	public List<Cliente> buscarPorNombre(String nombre) {
		return daoClientes.buscarPorNombre(nombre);
	}

	public boolean baja(int id) {
		return daoClientes.baja(id);
	}

	private boolean comprobarDniRepetido(String dni) {
		for (Cliente c : daoClientes.getListaClientes()) {
			if (c.getDni().equals(dni)) {
				return true;
			}
		}

		return false;
	}

}
