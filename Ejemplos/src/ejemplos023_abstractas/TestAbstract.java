package ejemplos023_abstractas;

public class TestAbstract {
    public static void main (String[] args) {
        Pelicula pelicula = new Pelicula();
        Libro libro = new Libro();        
        //Item i = new Item(); 
        //esto no se puede hacer para clases abstractas
        
        System.out.println(pelicula.esAlquilable());
        System.out.println(pelicula.getPrecio());
        System.out.println(libro.esAlquilable());
        System.out.println(libro.getPrecio());
    }
}