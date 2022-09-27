package ejemplos008_metodos;

/**
 * Demostracion del metodo cubo
 */

public class MetodoCubo {
	
    public static void main (String [] args){
    	
    	double vCubo = cubo((float)7.5);
    	// asigno a vCubo el valor que devuelve el metodo cubo
        System.out.println("El cubo de 7.5 es: " +vCubo ); 
        // llamada dentro de la sentencia System.out.println
    }
 
    
    public static double cubo (double x) {
    	// declaracion del metodo
    	// devuelve un double
        double miCubo = x*x*x;
        return miCubo;
        // NO DEVUELVO LA VARIABLE, DEVUELVO EL VALOR
        
//        Si no hay sentencia return dentro de un metodo, su ejecucion 
//        continua hasta que se alcanza el final del metodo y entonces se 
//        devuelve la secuencia de ejecucion al lugar donde se invoca al metodo.
        
    }
}

