/*
3.- Hacer una aplicacion para que realice las siguientes operaciones:
• Serializar todos los objetos de tipo Producto que tenemos en la base 
de datos Tienda para escribirlos en un fichero llamado “productos.dat”. 
• Se recuperaran todos los productos del fichero “productos.dat” y se 
asignaran a un arraylist de productos.
• Se le presentaran al usuario todos los productos que sean susceptibles 
de ser vendidos, es decir,  aquellos cuya cantidad sea > 0. El usuario 
tendra que elegir uno y la cantidad que desea comprar, actualizandose 
en el arraylist la cantidad que queda.  
• Cuando se venda un producto, se ira guardando en un fichero de texto 
(“vendidos.txt”) con los datos del producto vendido asi como la cantidad 
y el importe total.
• Y por ultimo, se actualizara la base de datos de acuerdo con lo vendido.
Clase Producto

• Atributos:

int codigo;
String nombre;
int precio;
int cantidad;

Todos ellos de tipo privados

• Metodos obligatorios

- Metodo get y set para cada uno de los atributos.
- Metodo para anadir mas cantidad de un producto determinado.
- Metodo para disminuir la cantidad de un producto determinado cuando se 
haga una venta. Si no hubiese suficientes unidades se lanzara una excepcion 
propia que indicara el problema
- Metodo que escriba toda la informacion de un producto en concreto.

*/

package ejercicios3_fichSerializable3TiendaSol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class AccesoDatos {
	/*************************************************************/
	/* crearFichArticulos */
	/*************************************************************/
	public static boolean crearFichArticulos(Connection conn, String nomFich) {
		Producto p;
		boolean creado = false;

		// Podriamos en cada metodo comprobar si la conexion es valida
		// si esta creado lo machaco, no me complico reescribiendo oos
		// utilizamos el try con recursos siempre que podamos para ahorrarnos el finally
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFich))) {
			Statement st = conn.createStatement();
			ResultSet tabla = st.executeQuery("Select * from Articulos");
			while (tabla.next()) {
				p = new Producto(tabla.getInt(1), tabla.getString(2), tabla.getInt(3), tabla.getInt(4));
				oos.writeObject(p); // lo escribo en el fichero
			}
			creado = true;
			return creado;
		} catch (IOException e) {
			System.out.println(e);
			return creado;
		} catch (Exception e) {
			System.out.println(e);
			return creado;
		}
	}

	/*************************************************************/
	/* crearListaArticulos */
	/*************************************************************/
	public static void crearListaArticulos(ArrayList<Producto> prod, String nomFich) {
		//try con recursos para ahorrarnos el finally
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFich))) {

			try {
				Producto p;
//				while ((p = (Producto) ois.readObject())!= null) {
				while (true) {
					p = (Producto) ois.readObject();
					if (p instanceof Producto)
						prod.add(p);
				}
			} catch (EOFException e) {
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/*************************************************************/
	/* venderProductos */
	/*************************************************************/
	public static void venderProductos(ArrayList<Producto> prod, String nomFich, Scanner teclado) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich))) {
			char resp = 's';
			int cant = 0;
			int num;

			System.out.println("Elija los productos a comprar \n"); 

			// Se puede mejorar para que se muestren los productos cada vez que se dice que
			// se quiere seguir comprando.

			while (resp == 's') {
				for (int i = 0; i < prod.size(); i++)
					if (prod.get(i).getCantidad() > 0)
						System.out.println(prod.get(i));

				System.out.print("\nIntroducir codigo de producto: ");
				num = Integer.parseInt(teclado.nextLine());

				int j = 0;
				int total, codigo;

				// Avanzamos por la lista hasta que encontramos el código del producto
				while (j < prod.size() && num != prod.get(j).getCodigo())
					j++;

				// Controlar si el producto no está o no hay stock suficiente para la cantidad
				// pedida
				if (j >= prod.size())
					System.out.println("Producto no encontrado");
				else {
					System.out.print("Introducir cantidad a comprar: ");
					cant = Integer.parseInt(teclado.nextLine());

					// Trabajamos con excepciones
					// En la posición j tenemos el producto que se va a vender
					try {
						prod.get(j).restarCantidad(cant);
						// hay cantidad suficiente de este producto
						total = prod.get(j).getPrecio() * cant;
						codigo = prod.get(j).getCodigo();

						String cadena = codigo + "-" + prod.get(j).getNombre() + "-" + cant + "-" + total + "\n";
						System.out.println(cadena);
						bw.write(cadena);
					} catch (ExcepcionNohayStock e) {
						System.out.println(e.getMessage() + " Disponibles " + prod.get(j).getCantidad() + " unidades.");
					} // Tengo que capturar la excepcion, para permitir que el usuario siga pidiendo articulos

				}

				// Puedo seguir porque no esta el producto y hay cantidad suficiente
				do {
					System.out.println("Desea comprar mas?(S/N) ");
					resp = (teclado.nextLine()).toLowerCase().charAt(0);
				} while (!(resp=='s' || resp=='n'));
			}

		} catch (Exception e) {
			System.out.println("ERROR CON EL FICHERO DE TEXTO en venderProductos " + e.getMessage());
		}
	}

	/*************************************************************/
	/* leerVendidos */
	/*************************************************************/
	public static void leerVendidos(String nomFich) {

		try (BufferedReader br = new BufferedReader(new FileReader(nomFich))) {
			String linea;
			int cod, cant, precioTotal;
			String nombre;

			System.out.println("Productos vendidos \n");

			while ((linea = br.readLine()) != null) {
				System.out.println("linea " + linea);
				String datos[] = linea.split("-");
				// System.out.println("datos " + datos);

				cod = Integer.parseInt(datos[0]);
				System.out.println("Codigo de producto " + cod);

				nombre = datos[1];
				System.out.println("Nombre de producto " + nombre);

				cant = Integer.parseInt(datos[2]);
				System.out.println("Cantidad de producto vendida " + cant);

				precioTotal = Integer.parseInt(datos[3]);
				System.out.println("Precio pagado " + precioTotal);
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			System.out.println("ERROR CON EL FICHERO DE TEXTO leerVendidos " + e.getMessage());
		}
	}

	/*************************************************************/
	/* actualizarBaseDatos */
	/*************************************************************/
	public static void actualizarBaseDatos(ArrayList<Producto> prod, Connection conn) throws Exception {
		PreparedStatement ps = null;

		ps = conn.prepareStatement("UPDATE Articulos SET cantidad = ? WHERE CLART = ?");

		System.out.println("Actualizamos la base de datos \n");

		for (int i = 0; i < prod.size(); i++) {
			ps.setInt(1, prod.get(i).getCantidad());
			ps.setInt(2, prod.get(i).getCodigo());
			if (ps.executeUpdate() > 0)
				System.out.println("Actualizada en la bd el producto " + prod.get(i).getCodigo());
			else
				System.out.println("No se ha actualizado el producto " + prod.get(i).getCodigo());
		}
	}
	
	
	/*
	 * Crea BD
	 */
	public static void createDB(Connection conn) {
		if(conn == null)
			conn = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		
		try(Statement st = conn.createStatement()){
			// Si quiero iniciar todo desde el principio
			st.execute("DROP DATABASE IF EXISTS TIENDA");
			st.execute("CREATE DATABASE TIENDA");
			st.execute("USE TIENDA");
			System.out.println("Exito al crear la DB");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * CrearTablas
	 */
	public static void crearTablas(Connection conn) {
		if (conn == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = conn.createStatement()) {
			st.execute("create table Fabricantes(\r\n" + 
					 "  CLFAB int Primary Key,\r\n" + 
					 "  Nombre varchar(30)\r\n" + 
					 "	);"  //NO LLEVA ; (parece que el ; no importa)
					);
			
			st.execute("create table Articulos(\r\n" + 
						"  CLART int Primary Key,\r\n" + 
						"  Nombre varchar(30),\r\n" + 
						"  Precio int,\r\n" + 
						"  Cantidad int,\r\n" + 
						"  CLFAB int,\r\n" + 
						"  Foreign Key (CLFAB) References Fabricantes(CLFAB)\r\n" + 
						"  ON DELETE CASCADE\r\n" + 
						");"  //NO LLEVA ; (parece que el ; no importa)
					);
			
			System.out.println("Exito al crear las tablas");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Podriamos desconectarnos cada vez, depende de las circunstancias de la
		// aplicacion
		
	}

	
	/*
	 * RellenarTablas
	 */
	public static void rellenarTablas(Connection conn) {
		if (conn == null)
			conn = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = conn.createStatement()) {

			st.executeUpdate("insert into Fabricantes values(1,'Kingston');");
			st.executeUpdate("insert into Fabricantes values(2,'Adata');");
			st.executeUpdate("insert into Fabricantes values(3,'Logitech');");
			st.executeUpdate("insert into Fabricantes values(4,'Lexar');");
			st.executeUpdate("insert into Fabricantes values(5,'Seagate');");
			
			st.executeUpdate("insert into Articulos values(1,'Teclado',100,12,3);");
			st.executeUpdate("insert into Articulos values(2,'Disco Duro 300Gb',500,20,5);");
			st.executeUpdate("insert into Articulos values(3,'Mouse',80,10,3);");
			st.executeUpdate("insert into Articulos values(4,'Memoria USB 16Gb',20,15,4);");
			st.executeUpdate("insert into Articulos values(5,'Memoria Ram',290,22,1);");
			st.executeUpdate("insert into Articulos values(6,'Disco Duro Extraible 250 Gb',650,30,5);");
			st.executeUpdate("insert into Articulos values(7,'Memoria USB  32Gb',30,5,1);");
			st.executeUpdate("insert into Articulos values(8,'DVD Rom',450,19,2);");
			st.executeUpdate("insert into Articulos values(9,'CD Rom',200,50,2);");
			st.executeUpdate("insert into Articulos values(10,'Tarjeta de Red',180,40,3);");
			
			System.out.println("Exito al rellenar las tablas");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
