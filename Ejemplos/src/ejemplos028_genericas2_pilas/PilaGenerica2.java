package ejemplos028_genericas2_pilas;

public class PilaGenerica2<T extends Number> { //el extends este es lo que cambia
    private Object[] datos;
    private int numDatos;
    private static final int TAM_INI = 10, TAM_INC = 10;

    public static void main(String[] args) throws Exception {
    	//no se suele poner en el main nunca el throws
		PilaGenerica2<Number> pg = new PilaGenerica2<Number>();
		
		pg.push(25);
		pg.push(44);
		pg.push(37.45);
		//pg.push("hola"); // error de compilacion.
		double d = (double)pg.pop(); //saca de la pila el ultimo
		//double d = pg.pop().doubleValue();
		System.out.println(d);
		int i = (int)pg.pop(); //saca de la pila el penultimo
		//int i = pg.pop().intValue();
		System.out.println(i);
    }
    
    public PilaGenerica2() {
    	datos = new Object[TAM_INI];
    	numDatos = 0;
    }

    public void push(T dato) {
	    if (numDatos == datos.length) {
		  Object[] aux = new Object[datos.length + TAM_INC];
	      System.arraycopy(datos,0,aux,0,datos.length);
	      //System.arraycopy(src, srcPos, dest, destPos, length);
	      datos = aux;
	    }
	    datos[numDatos++] = dato;
	}
    
    @SuppressWarnings("unchecked")
	  public T pop() throws Exception {
	    if (numDatos > 0) {
	      numDatos--;
	      return (T)datos[numDatos];
	    }
	    else {
	    	throw new Exception("Pila vacía");
	    }
	}
    
   

}