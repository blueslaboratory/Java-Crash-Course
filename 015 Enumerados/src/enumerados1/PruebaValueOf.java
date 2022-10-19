package enumerados1;

public class PruebaValueOf {
	 
    enum Animal {
        PERRO, GATO
    };
 
    public static void main(String[] args) {
    	Animal animal = null;
    	
    	try {
    		animal = Animal.valueOf(args[0]);
    		//valueOf nos transforma el String en un elemento de tipo animal
    		 
            switch (animal) {
            case PERRO:
            	System.out.println("El perro ladra.");
            	break;
            case GATO:
                System.out.println("El gato maulla.");
                break;
//          default:
//              System.out.println("No es un tipo aceptado.");
             }
    	} 
    	// si introducimos un animal que no este en la lista salta la excepcion
    	catch (Exception e){
    		System.out.println("ERROR: " +args[0] +" no esta en nuestros enumerados");
    		//e.printStackTrace();
    	}
         
        
     }
}

/* 

Solucion:
No funciona porque el Array args[] esta vacio, correr la clase y:
Project -> Properties -> Run/Debug settings -> Nombre (class PruebaValueOf) -> 
edit -> arguments -> PERRO GATO (con poner uno basta)

*/
