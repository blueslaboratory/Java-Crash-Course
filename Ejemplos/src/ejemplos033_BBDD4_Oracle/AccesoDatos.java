package ejemplos033_BBDD4_Oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {
	/*
	 * borrarNotasFinales
	 */
	public static void borrarPersonasPaises(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists PersonasPaises");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * crearPersonasPaises
	 */
	public static void crearPersonasPaises(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute(
					"create table " + " PersonasPaises(Id int primary key, nPersona varchar(15), Apellido varchar(15),"
							+ " Edad int, nPais varchar(15),tamanio varchar(15)) "
							+ "select personas.id, personas.nombre nPersona, personas.apellido, edad, paises.nombre "
							+ "nPais, tamanio from personas, paises where paises.id=personas.pais");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * actualizarPersonasPaises
	 */
	public static void actualizarPersonasPaises(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			// Actualización de una vez:
			st.executeUpdate("update personaspaises set edad=edad+1 where nPais='Costa Rica'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * imprimirNotasFinales
	 */
	public static void imprimirPersonasPaises(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

//		   try (Statement st = con.createStatement();
//				ResultSet rs=st.executeQuery("select * from personaspaises"))
//		   {		          
//			   while(rs.next()) {
//				   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)); 
//			   }
//	        } catch(SQLException e){
//	              e.printStackTrace();
//	       }

		// Pruebo a hacer select solo de dos campos:
		try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select nPersona, Apellido from personaspaises")) {
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
