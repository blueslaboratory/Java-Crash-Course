package ejemplos008_metodos;

/**
 * Demostracion de la funcion esPositivo
 */

public class MetodoPositivo {
	
    public static void main (String [] args) {
        for (int i=5; i>=-5; i--)
            System.out.println(i + " es positivo: " + esPositivo(i));
    }
 
    public static boolean esPositivo(int x) {
        //if (x<0) return false;
        //if (x>0) return true;
        //Si se quedase hasta aqu� devolver�a un error porque el cero no est� incluido
       
    	
    	//if (x>0) return true;
        //else return false;
    	
    	return (x>0)? true : false;
        
       
    }
}
