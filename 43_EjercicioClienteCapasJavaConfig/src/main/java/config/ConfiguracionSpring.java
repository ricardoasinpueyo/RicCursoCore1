package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;
import modelo.persistencia.DaoCliente;

public class ConfiguracionSpring {
	
	@Bean
	@Scope("prototype")
	public Cliente cliente() {
		return new Cliente();
	}
	
	@Bean
	public DaoCliente daoCliente() {
		return new DaoCliente();
	}
	
	@Bean
	public GestorCliente gestorCliente(DaoCliente daoCliente) {
		GestorCliente gp = new GestorCliente();
		gp.setGestorCliente(daoCliente);
		return gp;
	}
}
