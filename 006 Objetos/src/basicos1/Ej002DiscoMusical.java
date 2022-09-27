//Ejercicio 2.- Considera que estás desarrollando un programa Java donde 
//necesitas trabajar con objetos de tipo DiscoMusical. Define una clase 
//DiscoMusical considerando los siguientes atributos de clase: 
//titulo (String), autor (String), añoEdicion (int), formato (String), 
//digital (boolean). Define un constructor y los métodos para poder 
//establecer y obtener los valores de los atributos.


package basicos1;

public class Ej002DiscoMusical {
	//Los definimos como private, por lo que solo podemos acceder a ellos 
	//desde la clase donde nos encontramos y no desde los objetos que 
	//creamos a partir de esta clase "plantilla" desde otras clases,
	//a no ser que declaremos metodos public dentro de esta clase que nos
	//lo permitan
	
	//String es una clase
	private String titulo = new String();
	private String autor;
	private String formato;
	private int anyoEdicion;
	private boolean digital;
	
	
	//CONSTRUCTORES
	//ALT + SHIFT + S
	public Ej002DiscoMusical() {}
	public Ej002DiscoMusical(String titulo, String autor, String formato, int anyoEdicion, boolean digital) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.anyoEdicion = anyoEdicion;
		this.digital = digital;
	}
	
	//SETS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public void setAnyoEdicion(int anyoEdicion) {
		this.anyoEdicion = anyoEdicion;
	}
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	
	//GETS
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getFormato() {
		return formato;
	}
	public int getAnyoEdicion() {
		return anyoEdicion;
	}
	public boolean getDigital() {
		return digital;
	}
	
}


