package ejemplos025_ordenArrayListJug1;

public class Jugador implements Comparable<Jugador> {
	 public String nombre;
     public int edad, altura;

     public Jugador(String nombre, int edad, int altura) {
         this.nombre = nombre;
         this.edad = edad;
         this.altura = altura;
     }

    public int getEdad() {return edad;}
    public String getNombre() {return nombre;}
    public int getAltura() {return altura;}
    
    // Añadir setters
    
    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareTo(o.nombre);}
    
    @Override
    public String toString() {
        return "\nJugador->  Nombre: "+nombre+ " Edad: " + edad + " Altura: " +altura + "\n";}

}