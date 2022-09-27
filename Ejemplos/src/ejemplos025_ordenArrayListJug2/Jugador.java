package ejemplos025_ordenArrayListJug2;

public class Jugador implements Comparable<Jugador> {

        public String nombre;
        public int edad, altura;

        public Jugador(String nombre, int edad, int altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        @Override
        public int compareTo(Jugador per) { 
        	// Tambien se podria usar compareTo dentro
            if (altura < per.altura) {
                return -1;
            }
            else if (altura > per.altura) {
                return 1;
            }
            else return 0;
        }
        
        @Override
        public String toString() {
            return " Jugador->  Nombre: "+nombre+ " Edad: " + edad + " Altura: " +altura+ "\n";}
    }