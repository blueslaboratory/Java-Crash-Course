/*
2.- Se trata de hacer una aplicacion en Java que gestione los 
clientes de una empresa. Los datos de los clientes, se almacenaran 
en un fichero serializado, denominado clientes.dat.
Los datos que se almacenaran sobre cada cliente son:
	- NIF.
	- Nombre.
	- Telefono.
	- Direccion.
	- Deuda. 

Mediante un menu se podran realizar determinadas operaciones:
Anadir cliente. Esta opcion pedira los datos del cliente y anadira 
el registro correspondiente en el fichero.
Listar clientes. Recorrera el fichero mostrando los clientes almacenados 
en el mismo.
Buscar clientes. Pedira al usuario el nif del cliente a buscar, y 
comprobara si existe en el fichero, mostrando sus datos.
Borrar cliente. Pedira al usuario el nif del cliente a borrar, y si existe, 
lo borrara del fichero.
Borrar fichero de clientes completamente. Elimina del disco el fichero clientes.dat
Salir de la aplicacion.

*/

package ejercicios3_fichSerializable1;

//se pueden implementar varias a la vez:
//public class Ej002Cliente implements java.io.Serializable, java.util.Comparator<Ej002Cliente> {
public class Ej002Cliente implements java.io.Serializable {
	// ojo que tiene que tener el implements java.io.Serializable
	// si no salta una excepcion: java.io.NotSerializableException
	
	//https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private static final long serialVersionUID = 1L;
	String NIF, nombre, tel, dir;
	float deuda;
	

	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej002Cliente() {} 
	public Ej002Cliente(String NIF, String nombre, String tel, String dir, float deuda) {
		this.NIF = NIF;
		this.nombre = nombre;
		this.tel = tel;
		this.dir = dir;
		this.deuda = deuda;
	}
	
	
	//GETTERS
	public String getNIF() {
		return NIF;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTel() {
		return tel;
	}
	public String getDir() {
		return dir;
	}
	public float getDeuda() {
		return deuda;
	}
	
	
	//SETTERS
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public void setDeuda(float deuda) {
		this.deuda = deuda;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Cliente "
				+ "\n\tNIF: " + NIF 
				+ "\n\tNombre: " + nombre 
				+ "\n\tTelefono: " + tel 
				+ "\n\tDireccion: " + dir 
				+ "\n\tDeuda: "	+ deuda;		
	}
	
}