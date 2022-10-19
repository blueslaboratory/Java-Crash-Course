package ejemplos011_static;


//Clase Persona

public class Persona1 {
    private String nombre;
    private int edad;
    public static int contadorPersonas=0;

    
    //CONSTRUCTORES: ALT+SHIFT+S
    public Persona1() {}
    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

 
}
