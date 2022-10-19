package ejemplos021_sobrecarga;

public class Publicacion {
	public long idPublicacion;
	public String titulo="";
	public String autor="";
	
	public static long siguienteId = 0;
	public static String propietario = "M. Carmen";
	
	public Publicacion() {
		//this.idPublicacion = siguienteId++;
		System.out.println("Soy el constructor por defecto");
	}
	
	public Publicacion(String titulo, String autor) {
		//this.idPublicacion = siguienteId++;
		System.out.println("Soy el constructor con parametros");
		this.titulo = titulo;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Publicacion [idPublicacion=" + idPublicacion + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
}
