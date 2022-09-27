package basicos1;

//Esta clase representa una persona.
public class Ej001Sol{
    private String nombre;//Nombre de cada persona
    private String apellidos;//Apellidos de cada persona
    private int edad;//Edad de cada persona
    private boolean casado;//Estado civil de cada persona, true=casado ,false=soltero
    private String numeroDocumentoIdentidad;//dni de cada persona

    
    
    //Constructor
    public Ej001Sol() {}
    public Ej001Sol(String nombre, String apellidos, int edad, boolean casado, String dni) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.casado=casado;
        numeroDocumentoIdentidad=dni;
    }
    
    
    
    //Metodo para establecer el nombre de la persona
    public void setNombre (String valorNombre){
        nombre = valorNombre;
    }
    //Metodo para establecer los apellidos
    public void setApellidos (String valorApellidos){
        apellidos = valorApellidos;
    }
    //Metodo para establecer la edad
    public void setEdad (int valorEdad){
        edad = valorEdad;
    }
    //Metodo para establecer casado
    public void setCasado (boolean valorCasado) {
        casado = valorCasado;
    }
    //Metodo para establecer el numeroDocumentoIdentidad
    public void setNumeroDocumentoIdentidad (String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }
   
    
    
    //Metodo para obtener el nombre de la persona
    public String getNombre (){ return nombre; }
    //Metodo para obtener los apellidos de la persona
    public String getApellidos (){return apellidos;}
    //Metodo para obtener la edad de la persona
    public int getEdad () {return edad;}
    //Metodo para obtener casado de la persona
    public boolean getCasado () {return casado;}
    //Metodo para obtener el numeroDocumentoIdentidad
    public String getNumeroDocumentoIdentidad () {return numeroDocumentoIdentidad;}
    
    
    
    public String toString() {   	
    	return  nombre + " " + apellidos +" de " +  edad + " años " + (casado ? " esta casado ": " no esta casado ") + 
    			" su numero de dni es " + numeroDocumentoIdentidad;
    }
    
    
    
}