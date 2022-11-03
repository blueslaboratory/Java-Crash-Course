// UT3 - Programación multihilo III.pptx

package ejemplos037_multihilos6;

public class Main_Product_Consum {
	  public static void main(String[] args) {  
	    Cola cola = new Cola();
		
	    Productor p = new Productor(cola, 1);	
		Consumidor c = new Consumidor(cola, 1);
		
	    p.start();
		c.start();

	  }
	}