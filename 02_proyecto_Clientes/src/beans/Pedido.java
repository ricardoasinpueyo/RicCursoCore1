package beans;

public class Pedido {
	private int idPedido;
	private String descripcion;
	private double importe;
	private boolean conIva;
	private Cliente cliente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(int idPedido, String descripcion, double importe, 
						boolean conIva, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.descripcion = descripcion;
		this.importe = importe;
		this.conIva = conIva;
		this.cliente = cliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public boolean isConIva() {
		return conIva;
	}

	public void setConIva(boolean conIva) {
		this.conIva = conIva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descripcion=" + descripcion + ", importe=" + importe + ", conIva="
				+ conIva + ", cliente=" + cliente + "]";
	}
	
	public double totalImporte(int iva) {
		
	//	double iva2 = iva;
		if (!conIva )
			return importe;
		else
			return importe * (1 + ((double)iva/100));
		
		 
	}
	
	
	

}
