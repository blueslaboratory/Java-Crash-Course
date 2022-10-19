package ejemplos030_ficherosSerializable5_pruebas;
public class Cliente implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private transient String passWord; 
	// con transient en este campo se pone null cuando voy a escribir el objeto 
	// en un fichero serializado
	/*
	The transient keyword in Java is used to avoid serialization. 
	If any object of a data structure is defined as a transient, 
	then it will not be serialized. Serialization is the ​process of 
	converting an object into a byte stream.
	*/
	public Cliente(String nombre, String pw) {
		this.nombre = nombre;
		passWord = pw;
	}

	public String toString() {
		String texto = "Password: ";
		texto += (passWord == null) ? "(no disponible)" : passWord;
		texto += "\nCliente: " +nombre;
		return texto;
	}
}