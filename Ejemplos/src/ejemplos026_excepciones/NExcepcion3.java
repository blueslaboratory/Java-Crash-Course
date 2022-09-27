package ejemplos026_excepciones;  
// Este java tiene 2 clases, pero solo 1 puede ser publica (la que tenga el main)


class NuevaExcepcion extends Exception {

	//private static final long serialVersionUID = 6386963178772120771L;
	//una clase es serializable cuando el objeto que se puede conseguir de esa clase
	//se puede convertir en un chorro de bytes
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3815828530487575919L;

	public NuevaExcepcion(String mensaje){
		super(mensaje);
	}
	// Como esta en el mismo paquete no pongo modificador
}


public class NExcepcion3 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
               //ahora no hago un new exception, creo una instancia de la excepcion
          }
          catch(NuevaExcepcion e) {
        	   System.out.println( "e.getMessage(): " + e.getMessage());
          }
          //es order sensitive, tiene que ser este orden, si pusiesemos
          //1ero catch(Exception e)	no pillaria nunca catch(NuevaExcepcion e) {
          //porque Exception es padre de todas
          catch(Exception e){               
               System.out.println( "e.getMessage(): " + e.getMessage());
          }          
     }
     
     public static void lanzaExcepcion() throws NuevaExcepcion {
     	throw new NuevaExcepcion("Mi nueva excepcion en una clase");
     }
}
