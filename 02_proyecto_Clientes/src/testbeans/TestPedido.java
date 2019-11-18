package testbeans;

import beans.Cliente;
import beans.Pedido;

public class TestPedido {
	
	public static void main(String[] args) {
		Pedido ped1 = 
			new Pedido(1, "tornillo 4-30", 1, true, Cliente.dameCliente());
		
		System.out.print("pedido : " + ped1.getIdPedido());
		System.out.print("\tdescripc : " + ped1.getDescripcion());
		System.out.println("\tcliente : " + ped1.getCliente().getNombre().toUpperCase());
		
		Pedido ped2 = 
				new Pedido(2, "engletadora", 150, true, Cliente.dameCliente());
	}

}
