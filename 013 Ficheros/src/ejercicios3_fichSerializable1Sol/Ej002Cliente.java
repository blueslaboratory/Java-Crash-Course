package ejercicios3_fichSerializable1Sol;

import java.io.*;

/**
 *
 * @author 
 */
public class Ej002Cliente implements Serializable {  

	//ojo que incluye el serialVersionUID
	//https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private static final long serialVersionUID = 1L;
	
	//Inicializo los miembros de clase.
    //Inicializo atributos de clase
    private String nif; //Nif del cliente
    private String nombre; //Nombre del cliente
    private String telefono; // Telefono del cliente
    private String direccion; // Direccion del cliente
    private String deuda; //Deuda del cliente
   
    /**
     * Constructor de la clase
     * Los datos son comprobados dentro del metodo que los crea
     * @param nombre
     * @param nif
     * @param telefono
     * @param direccion
     * @param deuda
     */

	public Ej002Cliente(String nombre, String nif, String telefono, String direccion, String deuda) {
		this.nombre = nombre;
		this.nif = nif;
		this.telefono = telefono;
		this.direccion = direccion;
		this.deuda = deuda;
	}
     
    
	// Metodos set y get  
    
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getTlf() {
        return telefono;
    }
    public void setTlf(String telefono) {
        this.telefono = telefono;
    }
    
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public String getDeuda() {
        return deuda;
    }
    public void setDeuda(String deuda) {
        this.deuda = deuda;
    }
    

	@Override
	public String toString() {
		return "Cliente [nif=" + nif 
				+ ", nombre=" + nombre 
				+ ", telefono=" + telefono 
				+ ", direccion=" + direccion
				+ ", deuda=" 
				+ deuda + "]";
	}
    
}
