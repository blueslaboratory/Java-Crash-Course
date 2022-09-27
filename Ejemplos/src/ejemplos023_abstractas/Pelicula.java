package ejemplos023_abstractas;

public class Pelicula extends Item {
    
	//necesitas este metodo, si no, tendrias que poner abstract en la clase
	//los metodos abstractos son obligatorios si queremos que sea instanciable
	public boolean esAlquilable() {
        return true;
    }
}