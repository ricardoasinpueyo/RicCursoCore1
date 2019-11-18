package daos;

import beans.Cliente;

public class ClienteDAOImpl {
	private Cliente[] listaClientes;
	private int cuantosVan;
	
	public ClienteDAOImpl() {
		listaClientes = new Cliente[20];
		cargaClientes();
		cuantosVan = 4;
		 
		
	}
	
	public ClienteDAOImpl(int cuantosElementos) {
		listaClientes = new Cliente[cuantosElementos];
		 
		
	}
	
	private void cargaClientes() {
		 
		listaClientes[0] =		new Cliente("tomas", "tomas", "tomasin", 
							"escu", "calle pez, 3, madrid");
		listaClientes[1] = 		new Cliente("sara", "sara", "sarita", 
						"perz", "calle nuez, 32, sevilla");
		listaClientes[2] =		new Cliente("eva", "ruiz", "evita", 
						"goma", "calle lirio, 35, cadiz");
		listaClientes[3] =		new Cliente("ana", "ana", "anita", 
						"lista", "calle rosa, 333, cuenca");
				 
	 
	}

	public Cliente[] getClientes() {
		
		Cliente[] lista = new Cliente[cuantosVan];
		for (int i=0; i< cuantosVan; i++)
			lista[i] = listaClientes[i];
		return lista;
	}

	public void setClientes(Cliente[] clientes) {
		this.listaClientes = clientes;
	}
	
	public int size() {
		return cuantosVan;
	}
	
	
	//responsabilidad
	

}
