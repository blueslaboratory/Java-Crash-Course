package ejemplos025_ordenArrayListJug2;
import java.util.Arrays;

public class Programa { 
    static void imprimeArrayJugadores(Jugador[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
    }

    public static void main(String[] args) {
    	final int NP=5;
    	
        Jugador[] arrayJugadores = new Jugador[NP];
        
        arrayJugadores[0] = new Jugador("Mario", 22, 187);
        arrayJugadores[1] = new Jugador("Pepe", 52, 173);
        arrayJugadores[2] = new Jugador("Manuel", 27, 158);
        arrayJugadores[3] = new Jugador("David", 25, 164);
        arrayJugadores[4] = new Jugador("Alberto", 80, 184);

        System.out.println("Array sin ordenar por altura");
        imprimeArrayJugadores(arrayJugadores);
        
        // Ordeno el array de personas por altura (de menor a mayor).
        Arrays.sort(arrayJugadores);
        
        System.out.println("Array ordenado por altura");
        imprimeArrayJugadores(arrayJugadores);
    }
}