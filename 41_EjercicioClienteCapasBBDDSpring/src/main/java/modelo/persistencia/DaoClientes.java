package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.stereotype.Repository;

import modelo.entidad.Cliente;
import vista.MainClientes;

@Repository
public class DaoClientes {

	// Esto es una interfaz, el objeto que realiza la conexion
	// a la bbdd estan dentro de las librerias de MySql
	private Connection conexion;

	// Bloque estatico, este bloque se ejecutará
	// justo al cargar esta clase en la JVM, se ejecutará
	// antes que el metodo main. Esto para versiones
	// anteriores a Java 1.7
	/*
	 * static { //Le decimos a java que carge en memoria el driver //de conexión con
	 * la bbdd, para poder recuperarlo //cuando hagamos la conexión try {
	 * Class.forName("com.mysql.cj.jdbc.Driver"); } catch (ClassNotFoundException e)
	 * { // TODO Auto-generated catch block System.out.println("Driver NO cargado");
	 * e.printStackTrace(); } }
	 */

	public boolean abrirConexion() {
		// protocolo:subprotocolo//IP:PUERTO/NOMBRE_ESQUEMA
		// esta url depende de la bbddd a la que nos conectemos

		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";

		// getConeccion me devuelve un objeto que lleva la conexión
		// a la bbdd, esta clase (DriverManager) es la clase
		// que lleva el control del driver
		// Estamos aplicando la Inyeccion de dependecia, es decir,
		// no creo el objeto aqui (no hago new), sino que es
		// el metodo getConnection el que me crea el objeto
		// en mi lugar
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<Cliente> getListaClientes() {
		if (!abrirConexion()) {
			return null;
		}

		String query = "select id,dni,nombre,edad from clientes";

		try {
			// le decimos a la conexion que nos haga una consulta
			// parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			// esta funcion me devuelve el numero de filas
			// afectadas
			ResultSet rs = ps.executeQuery();
			// ResultSet es un objeto que tiene toda la lista
			// de registros que ha devuelto la consulta

			Cliente cliente = null;
			List<Cliente> listaClientes = new ArrayList<Cliente>();
			// asi pues, podemos recorrernos la lista
			while (rs.next()) {// preguntamos si hay un registro mas
				cliente = MainClientes.context.getBean("cliente", Cliente.class);
				// libro = (Libro)MainLibreria.context.getBean("libro");
				cliente.setId(rs.getInt(1));// el id esta en la primera posicion
				cliente.setDni(rs.getString(2));
				cliente.setNombre(rs.getString(3));
				cliente.setEdad(rs.getString(4));

				listaClientes.add(cliente);
			}
			return listaClientes;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
			// el bloque finally se va a ejecutar SIEMPRE
			// no importa si ha pasado por el bloque try o
			// por el bloque catch
			cerrarConexion();
		}
	}

	public int alta(Cliente cliente) {
		if (!abrirConexion()) {
			return 4;
		}

		String query = "insert into clientes (dni,nombre,edad) values(?,?,?)";

		try {
			// le decimos a la conexion que nos haga una consulta
			// parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			// sustimos la primera interrogante por la matricula
			// del coche
			ps.setString(1, cliente.getDni());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getEdad());

			// esta funcion me devuelve el numero de filas
			// afectadas
			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return 4;
			} else {
				return 0;
			}
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return 4;
		} finally {
			// el bloque finally se va a ejecutar SIEMPRE
			// no importa si ha pasado por el bloque try o
			// por el bloque catch
			cerrarConexion();
		}
	}

	public Cliente buscarPorId(int id) {
		if (!abrirConexion()) {
			return null;
		}

		String query = "select id,dni,nombre,edad from clientes where id=?";

		try {
			// le decimos a la conexion que nos haga una consulta
			// parametrizada a partir de la query anterior

			PreparedStatement ps = conexion.prepareStatement(query);

			// sustimos la primera interrogante por la id
			ps.setInt(1, id);
			// esta funcion me devuelve el numero de filas
			// afectadas

			ResultSet rs = ps.executeQuery();
			// ResultSet es un objeto que tiene toda la lista
			// de registros que ha devuelto la consulta

			Cliente cliente = null;

			// asi pues, podemos recorrernos la lista
			while (rs.next()) {// preguntamos si hay un registro mas
				cliente = new Cliente();
				cliente.setId(rs.getInt(1));// el id esta en la primera posicion
				cliente.setDni(rs.getString(2));
				cliente.setNombre(rs.getString(3));
				cliente.setEdad(rs.getString(4));

			}
			return cliente;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
			// el bloque finally se va a ejecutar SIEMPRE
			// no importa si ha pasado por el bloque try o
			// por el bloque catch
			cerrarConexion();
		}
	}

	public List<Cliente> buscarPorNombre(String nombre) {
		if (!abrirConexion()) {
			return null;
		}

		String query = "select id,dni,nombre,edad from clientes where nombre=?";
		//se puede hacer que la busqueda no sea por nombre exacto
		//es decir, que contenga
		//String query = "select id,dni,nombre,edad from clientes where nombre like ?";
		//y luego el ps seria
		//ps.setString(1, "%"+nombre+"%");
		try {
			// le decimos a la conexion que nos haga una consulta
			// parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			// sustimos la primera interrogante por el nombre
			ps.setString(1, nombre);

			// esta funcion me devuelve el numero de filas
			// afectadas
			ResultSet rs = ps.executeQuery();
			// ResultSet es un objeto que tiene toda la lista
			// de registros que ha devuelto la consulta

			Cliente cliente = null;
			// tambien podriamos hacerlo aqui si damos de alta el cliente
			List<Cliente> listaClientes = new ArrayList<Cliente>();
			// asi pues, podemos recorrernos la lista
			while (rs.next()) {// preguntamos si hay un registro mas
				cliente = new Cliente();
				cliente.setId(rs.getInt(1));// el id esta en la primera posicion
				cliente.setDni(rs.getString(2));
				cliente.setNombre(rs.getString(3));
				cliente.setEdad(rs.getString(4));

				listaClientes.add(cliente);
			}
			return listaClientes;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
			// el bloque finally se va a ejecutar SIEMPRE
			// no importa si ha pasado por el bloque try o
			// por el bloque catch
			cerrarConexion();
		}
	}

	public boolean baja(int id) {
		if (!abrirConexion()) {
			return false;
		}

		String query = "delete from clientes where id=?";

		try {
			// le decimos a la conexion que nos haga una consulta
			// parametrizada a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			// sustimos la primera interrogante por la matricula
			// del coche
			ps.setInt(1, id);

			// esta funcion me devuelve el numero de filas
			// afectadas
			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return false;
		} finally {
			// el bloque finally se va a ejecutar SIEMPRE
			// no importa si ha pasado por el bloque try o
			// por el bloque catch
			cerrarConexion();
		}
	}

}