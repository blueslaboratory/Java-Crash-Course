package ejemplos023_abstractas;

public abstract class Item {
	 protected String titulo;
	 protected float precio = 5.0f;
	 
	 public abstract boolean esAlquilable();
	 
	 
	 public float getPrecio() {
	        return precio;
	 }
	 public void setPrecio(float pr) {
	        precio = pr;
	 }
	 public String getTitulo() {
	        return titulo;
	 }
	 public void setTitulo(String tit) {
	        titulo = tit;
	 }
}
