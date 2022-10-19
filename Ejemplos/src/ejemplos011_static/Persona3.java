package ejemplos011_static;

//Clase Persona

public class Persona3 {

    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    
    
    //CONSTRUCTORES: ALT+SHIFT+S
    public Persona3() {
        contadorPersonas++;
    }
    public Persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }

    
    //SET IT: ALT+SHIFT+S
    public void setNombre(String nom) {
        nombre = nom;
    }
    public void setEdad(int ed) {
        edad = ed;
    }
    
    
    //GET IT: ALT+SHIFT+S    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public static int getContadorPersonas() {
    	//TIENE QUE SER UN METODO STATIC
    	//edad++; //no se podria porque edad no es estatico
        return contadorPersonas;
    }

}
