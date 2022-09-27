package ejemplos026_excepciones;  

public class NExcepcion2 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion1();
          }
          catch(Exception e) {  
               System.out.println("Dentro de catch");
               System.out.println("e.getMessage(): " + e.getMessage());
               System.out.println("e.toString(): " + e.toString());
               System.out.println("e.printStackTrace():"); e.printStackTrace();
               System.out.println();
          }
          
          
          //Lanzo la excepcion y la capturo a la vez
          lanzaExcepcion2();
     }
     
     public static void lanzaExcepcion1() throws Exception {
    	
     	throw new Exception("Mi nueva excepcion 1");
     	//tiene un throw que no se esta tratando por lo que hay que ponerle un throws
     	//al metodo y capturarla en un nivel superior o relanzarla
     }
     
     
     //Lanzo la excepcion y la capturo a la vez
     public static void lanzaExcepcion2() {
     	try {
     		throw new Exception("Mi nueva excepcion 2");
     	} catch(Exception e) {  
            System.out.println("Dentro de catch");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():"); e.printStackTrace();
            System.out.println();
        }
      }
     
}
