/*
Project/Properties/Java Build Path/Libraries/ClassPath
Add External Jars -> ojdbc7.jar
G:\DOCUMENTS\DA1D1E\Programación\T10 Acceso a BBDD\Drivers
*/

package ejemplos033_BBDD3_Oracle;
import java.sql.*;

/*
 * Esto no entra en la 3ra Evaluacion
 * Hay que tener instalado la SQL DB y darle a Start DB
 */

class Prueba {
	public static void main(String args[]) throws SQLException {

	//Esto no es necesario
    //DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());

    Connection conn = DriverManager.getConnection
          ("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
    /*Connection conn = DriverManager.getConnection
            ("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");*/
    		//("jdbc:oracle:thin:@localhost:1521:oracleBD", "system", "oracle");
         // driver@machineName:port: SID, userid, password

    Statement stmt = conn.createStatement();
    
    ResultSet rset = stmt.executeQuery("select * from dba_users");
    
    while (rset.next())
         System.out.println ("USERS " + rset.getString(1));
    
    stmt.close();
    
	}
}