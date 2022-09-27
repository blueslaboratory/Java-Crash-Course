package ejercicios3_fichSerializable3TiendaSol;
import java.io.*;


public class Producto implements Serializable{ //ojo al implements
	
	private static final long serialVersionUID = 1L;
	private int codigo; 
	private String nombre;
	private int precio; 
	private int cantidad; 
	
	public Producto(int co, String nom, int pre, int ca) {
		codigo= co;
		nombre= nom;
		precio= pre;
		cantidad= ca;
	}
	
	public void setCodigo(int codigo) { 
		this.codigo = codigo;
	}
	
    public int getCodigo() {  
	    return codigo;
    }
    
	public void setNombre(String nombre) { 
		this.nombre = nombre;
	}
	
    public String getNombre() {  
	    return nombre;
    }
    
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() { 
		return precio;
	}
	
	public void setCantidad(int cantidad) { 
		this.cantidad = cantidad;
	}
	
	public int getCantidad(){ 
		return cantidad;
	}
	
	public void sumarCantidad(int cantidad) { 
		this.cantidad = this.cantidad+cantidad;
	}
	
	
	public void restarCantidad(int cantidad) throws ExcepcionNohayStock { 
		if (this.cantidad-cantidad < 0)
			throw new ExcepcionNohayStock();
		
		// si se lanza la excepcion no llega a aqui y esto no se actualiza
		this.cantidad = this.cantidad-cantidad;
		
	}
	
	public String toString() {
		return "Codigo: " + codigo + " Stock: " + cantidad + " Producto " + nombre +
		" Precio unitario " + precio;
	}
}
