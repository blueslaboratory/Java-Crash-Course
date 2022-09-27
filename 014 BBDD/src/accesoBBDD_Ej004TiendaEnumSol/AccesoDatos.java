package accesoBBDD_Ej004TiendaEnumSol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {
	/*
	 * borrarNotasFinales
	 */
	public static void borrarTablaIva(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists ArtFab");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * crearTablaIva
	 */
	public static void crearTablaIva(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con.prepareStatement("create table ArtFab (NombreArticulo varchar(30), "
													   + "NombreFabricante varchar(30), "
													   + "Precio int, "
													   + "iva float(5,2) default 0)")) {
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * insertarArtFab
	 */
	public static void insertarArtFab(Connection con) {

		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement();
			 PreparedStatement ps = con.prepareStatement("INSERT INTO ARTFAB (NombreArticulo, NombreFabricante, Precio, iva) VALUES (?, ?, ?, ?)");) {

			ResultSet rs;
			int precio;
			double iva;

			rs = st.executeQuery("select articulos.nombre, fabricantes.nombre, articulos.precio from articulos, fabricantes "
							   + "where articulos.clfab=fabricantes.clfab");
			while (rs.next()) {
				precio = rs.getInt(3);
				ps.setString(1, rs.getString(1));
				ps.setString(2, rs.getString(2));
				ps.setInt(3, rs.getInt(3));

				if (precio > 500)
					iva = precio * IVA.FRANJA4.valor();
				else if (precio <= 500 && precio > 200)
					iva = precio * IVA.FRANJA3.valor();
				else if (precio <= 200 && precio > 100)
					iva = precio * IVA.FRANJA2.valor();
				else
					iva = precio * IVA.FRANJA1.valor();

				ps.setFloat(4, (float) iva);

				ps.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * imprimirArtfab
	 */
	public static void imprimirArtfab(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select * from ArtFab")) {
			
			while (rs.next())
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}