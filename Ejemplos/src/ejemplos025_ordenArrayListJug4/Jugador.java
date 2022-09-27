package ejemplos025_ordenArrayListJug4;
public class Jugador {
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
    
    @Override
    public String toString() {
        return "\n Jugador->  Nombre: "+nombre+ " Edad: " + edad + " Altura: " +altura+ "\n";}

}