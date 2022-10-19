package ejercicios3_fichSerializable1Sol;
import java.io.*;

public class Ej001Asignatura implements Serializable{
    /**
	 * 
	 */
	
	//ojo, anade el serialVersionUID
	//https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private static final long serialVersionUID = 1L;
	private String nombre;
    private double nota;
 
    public Ej001Asignatura(String nombre, double nota) {
    	this.nombre=nombre;
    	this.nota=nota;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public double getNota() {
        return nota;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setNota(double nota) {
    	this.nota = nota;
    }
}


