package ejemplos025_ordenArrayListJug3;

// Ejemplo con Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Programa {

    public static void main(String arg[]) {

    	ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

        listaJugadores.add(new Jugador("Mario", 22, 187));
        listaJugadores.add(new Jugador("Pepe", 52, 173));
        listaJugadores.add(new Jugador("Manuel", 27, 158));
        listaJugadores.add(new Jugador("David", 25, 164));
        listaJugadores.add(new Jugador("Alberto", 80, 184));
        
        Collections.sort(listaJugadores, new OrdenarJugadorAltura()); 
        //Necesitamos reescribir compare para esto
        
        //El comparator es un criterio de ordenacion general, 
        //te permite implementar diversas clases con varios criterios de ordenacion
        Comparator<Jugador> c = new OrdenarJugadorAltura();
        Collections.sort(listaJugadores, c);
        
        System.out.println("Personas Ordenadas por orden total: "+ listaJugadores);

      } 

}