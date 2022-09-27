//1.- Crea una clase llamada Libro que guarde la informaci�n de cada uno 
//de los libros de una biblioteca. La clase debe guardar el t�tulo del libro, 
//autor, n�mero de ejemplares del libro y n�mero de ejemplares prestados. 
//La clase contendr� los siguientes m�todos:
//Constructor por defecto.
//Constructor con par�metros. 
//M�todos Setters/getters
//M�todo pr�stamo que incremente el atributo correspondiente cada vez que 
//se realice un pr�stamo del libro. No se podr�n prestar libros de los que 
//no queden ejemplares disponibles para prestar. Devuelve true si se ha podido 
//realizar la operaci�n y false en caso contrario.
//M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca 
//la devoluci�n de un libro. No se podr�n devolver libros que no se hayan prestado. 
//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
//M�todo toString para mostrar los datos de los libros. Este m�todo se heredada 
//de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
//Escribe un programa para probar el funcionamiento de la clase Libro.


package clases2;

	
public class Ej001Sol {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //constructor por defecto
    public Ej001Sol() {
    }

    //constructor con parametros
    public Ej001Sol(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //metodo para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //metodo para realizar la devolucion de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    //metodo toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;
    }
   
}
