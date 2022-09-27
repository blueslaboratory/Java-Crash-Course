package ejemplos033_BBDD1_MySQL;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {
	/*
	 * borrarAutores
	 */
	public static void borrarAutores(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists autores");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * crearTablaAutores
	 */
	public static void crearTablaAutores(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("CREATE TABLE AUTORES(ID INTEGER PRIMARY KEY, NOMBRE VARCHAR(24), APELLIDO VARCHAR(24))");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Podriamos desconectarnos cada vez, depende de las circunstancias de la
		// aplicacion

	}

	/*
	 * rellenarAutores
	 */
	public static void rellenarAutores(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {

			st.executeUpdate("INSERT INTO AUTORES VALUES(1,'MIGUEL','DE CERVANTES')");
			st.executeUpdate("INSERT INTO AUTORES VALUES(2,'FRANCISCO','DE QUEVEDO')");
			st.executeUpdate("INSERT INTO AUTORES VALUES(3,'LOPE','DE VEGA')");
			st.executeUpdate("INSERT INTO AUTORES VALUES(4,'CALDERÓN','DE LA BARCA')");
			st.executeUpdate("INSERT INTO AUTORES VALUES(5,'MIGUEL','DELIBES')");
			st.executeUpdate("INSERT INTO AUTORES VALUES(6,'EMILIA','PARDO BAZÁN')");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * leerAutores
	 */
// TYPE_SCROLL_SENSITIVE, si algo cambia en la BD mientras la aplicacion esta recogiendo los datos, se recoge lo modificado
// TYPE_SCROLL_INSENSITIVE, no se recogen las modificaciones hechas mientras se esta recorriendo el ResulSet
	public static void mostrarAutores(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	 // try (Statement st1 = con.createStatement();
			ResultSet rs = st1.executeQuery("select * from autores")) {

			System.out.println("clave\tNombre y Apellido\n");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " " + rs.getString(3));
			}

			rs.beforeFirst(); // no funciona si dejo los valores por defecto en el statement

			System.out.println();

			// volvemos a recorrer la tabla desde el principio
			System.out.println("clave\tNombre y Apellido\n");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void mostrarAutoresPrepared(Connection con, String nombre) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement("select * from autores where nombre = ?")) {
			// Fijaos que ya no ponemos comillas, al sustituir el valor ya sabe que es un String

			pstmt.setString(1, nombre); // El 1 se refiere a la primera interrogacion

			ResultSet rs = pstmt.executeQuery();

			System.out.println("clave\tNombre y Apellido\n");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
