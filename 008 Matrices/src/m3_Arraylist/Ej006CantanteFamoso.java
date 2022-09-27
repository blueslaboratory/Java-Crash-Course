/*
6.- Ejercicio para guardar informacion sobre cantantes famosos. Crearemos 
una clase denominada ListaCantantes que disponga de un atributo de tipo 
ArrayList para guardar cantantes. La clase debe tener un metodo que permita 
anadir objetos de tipo CantanteFamoso  en la lista, otro metodo para eliminar 
un cantante y dos metodos para mostrar el disco mas vendido de cada cantante 
y todos los discos de cada cantante (todo son opciones del menu que se 
muestra mas abajo).

Cada objeto de tipo CantanteFamoso tendra como atributos:

•	nombre (String)
•	discos (lista con los discos)
•	y los metodos para obtener y establecer los atributos.

En el atributo discos, se guardara un listado de todos los discos editados 
por el cantante. Para cada uno de los discos se dispondra de su titulo y el 
numero de ejemplares vendidos.

Crea una clase principal que muestre un menu, con las siguientes opciones:
1. Introducir nuevo Cantante.
2. Borrar cantante.
3. Mostrar disco mas vendido de cada cantante.
4. Mostrar los cantantes y sus discos.
5. Salir.

Elija opcion:
*/

package m3_Arraylist;

public class Ej006CantanteFamoso {
	
	private String artista;
	private Ej006Discos discosObj;
 
	private int nArtista;
	private static int contArtista = 0;
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej006CantanteFamoso() {
		nArtista = contArtista;
		contArtista++;
	}
	public Ej006CantanteFamoso(String artista, Ej006Discos discosObj) {
		nArtista = contArtista;
		contArtista++;
		this.artista = artista;
		this.discosObj = discosObj;
	}
	

	//GETTERS
	public String getArtista() {
		return artista;
	}
	public Ej006Discos getDiscosObj() {
		return discosObj;
	}
	public int getnArtista() {
		return nArtista;
	}
	public static int getContArtista() {
		return contArtista;
	}
	
	
	//SETTERS
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public void setDiscosObj(Ej006Discos discosObj) {
		this.discosObj = discosObj;
	}
	public void setnArtista(int nArtista) {
		this.nArtista = nArtista;
	}
	public static void setContArtista(int contArtista) {
		Ej006CantanteFamoso.contArtista = contArtista;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "\nCantante Famoso " + (nArtista+1)
			 + "\nArtista: " + artista 
			 + "\nDiscos: " + discosObj;
	}
}
