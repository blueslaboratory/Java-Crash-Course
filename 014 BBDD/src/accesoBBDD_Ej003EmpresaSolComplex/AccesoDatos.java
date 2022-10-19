package accesoBBDD_Ej003EmpresaSolComplex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoDatos {

	/*****************************************************************/
	/* insertarDepartamento */
	/*****************************************************************/
	public static void insertarDepartamento(int numDep, String nombreDept, String localidad, Connection con) {

		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con
				.prepareStatement("INSERT INTO DEPARTAMENTOS (dept_no, dnombre, loc) VALUES (?, ?, ?)");) {

			ps.setInt(1, numDep);
			ps.setString(2, nombreDept);
			ps.setString(3, localidad);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*****************************************************************/
	/* insertarDepartamento */
	/*****************************************************************/
	public static void insertarDepartamento(Departamento depto, Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con
				.prepareStatement("INSERT INTO DEPARTAMENTOS (dept_no, dnombre, loc) VALUES (?, ?, ?)");) {

			ps.setInt(1, depto.getNumDep());
			ps.setString(2, depto.getNombreDep());
			ps.setString(3, depto.getLocalidad());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*****************************************************************/
	/* listarDepartamentos */
	/*****************************************************************/
	public static ArrayList<Departamento> listarDepartamentos(Connection con) {
		Departamento d;
		ArrayList<Departamento> listaDep = new ArrayList<Departamento>();

		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM DEPARTAMENTOS")) {
			while (rs.next()) {
				d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
				listaDep.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaDep;
	}
	
	/*****************************************************************/
	/* borrarDepartamento */
	/*****************************************************************/
	public static void borrarDepartamento(int numDep, Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con.prepareStatement("DELETE FROM DEPARTAMENTOS WHERE DEPT_NO = ?");) {

			ps.setInt(1, numDep);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	

	/*****************************************************************/
	/* actualizarDepartamento */
	/*****************************************************************/
	public static void actualizarDepartamento(int numDep, String loc, Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con.prepareStatement("UPDATE DEPARTAMENTOS SET LOC = ? WHERE dept_no = ?");) {
			ps.setString(1, loc);
			ps.setInt(2, numDep);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*****************************************************************/
	/* actualizarDepartamento */
	/*****************************************************************/
	public static void actualizarDepartamento(Departamento dp, Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con.prepareStatement("UPDATE DEPARTAMENTOS SET DNOMBRE = ? WHERE LOC = ?");) {

			ps.setString(1, dp.getNombreDep());
			ps.setString(2, dp.getLocalidad());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	/*****************************************************************/
	/* devolverDepartamento */
	/*****************************************************************/
	public static Departamento devolverDepartamento(int numDep, Connection con) {
		Departamento d = null;

		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM DEPARTAMENTOS WHERE DEPT_NO = ?");) {

			ps.setInt(1, numDep);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}

	

	/*****************************************************************/
	/* subirSalario */
	/*****************************************************************/
	public static void subirSalario(int s, int num, Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement ps = con
				.prepareStatement("UPDATE EMPLEADOS SET SALARIO = SALARIO + ? WHERE DEPT_NO = ?")) {

			ps.setInt(1, s);
			ps.setInt(2, num);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*****************************************************************/
	/* listarEmpleados */
	/*****************************************************************/
	public static void listarEmpleados(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM EMPLEADOS")) {

			while (rs.next()) {

				System.out.println(String.format("%5d", rs.getInt(1)) + String.format("%20s", rs.getString(2)) + "\t"
						+ String.format("%5f", rs.getFloat(6)));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
}
