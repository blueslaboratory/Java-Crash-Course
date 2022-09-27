/*
Project/Properties/Java Build Path/Libraries/ClassPath
Add External Jars -> mysql-connector-java-8.0.20
G:\DOCUMENTS\DA1D1E\Programación\T10 Acceso a BBDD\Drivers

Hay que iniciar en XAMPP: Apache y MySQL
*/

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

import java.sql.*;
import java.util.*;

public class Principal {
	final static String NOMFICHPROD = "productos.dat", NOMFICHVEND = "Vendidos.txt";

	public static void main(String[] args) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<Producto> prod = new ArrayList<Producto>();

		try {

			conn = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
			
			AccesoDatos.createDB(conn);
			AccesoDatos.crearTablas(conn);
			AccesoDatos.rellenarTablas(conn);

			// Crear fichero con los registros extraidos de la base de datos
			boolean creado = AccesoDatos.crearFichArticulos(conn, NOMFICHPROD);

			if (creado) {
				// Crear la lista a partir de los objetos del fichero
				AccesoDatos.crearListaArticulos(prod, NOMFICHPROD);

				AccesoDatos.venderProductos(prod, NOMFICHVEND, sc);
				AccesoDatos.leerVendidos(NOMFICHVEND);
				AccesoDatos.actualizarBaseDatos(prod, conn);

			}

		} catch (Exception e) {
			System.out.println("ERROR:" + e.getMessage());
		} finally {
			try {
				Conexion.desConexion(conn);
			} catch (Exception e) {
				System.out.println("ERROR al desconectarnos: " + e.getMessage());
			}
		}

		sc.close();
	}

}