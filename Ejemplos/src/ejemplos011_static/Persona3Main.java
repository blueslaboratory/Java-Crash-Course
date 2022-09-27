package ejemplos011_static;

//Clase Principal
public class Persona3Main {

    public static void main(String[] args) {
    	
    	/*
    	Para invocar a un metodo estatico no se necesita 
    	crear un objeto de la clase en la que se define:
    	
		-	Tiene acceso solo a los atributos estaticos de la clase. 
		-	No es necesario instanciar un objeto para poder utilizarlo.
			Si se le invoca desde una clase distinta, debe anteponerse a 
			su nombre, el de la clase en la que se encuentra seguido 
			del operador punto (.) <NombreClase>.metodoEstatico  
		
		NOTA: this no se puede utilizar en un metodo estatico
    	*/
    	
        Persona3 p1 = new Persona3("Tomas Navarra", 22);
        Persona3 p2 = new Persona3("Jonas Estacio", 23);
        System.out.println("Se han creado: " + Persona3.getContadorPersonas() + " personas");
    }
}