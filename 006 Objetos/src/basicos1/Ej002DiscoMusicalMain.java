//Ejercicio 2.- Considera que estï¿½s desarrollando un programa Java donde 
//necesitas trabajar con objetos de tipo DiscoMusical. Define una clase 
//DiscoMusical considerando los siguientes atributos de clase: 
//titulo (String), autor (String), aï¿½oEdicion (int), formato (String), 
//digital (boolean). Define un constructor y los mï¿½todos para poder 
//establecer y obtener los valores de los atributos.


package basicos1;

public class Ej002DiscoMusicalMain {

	public static void main(String[] args) {
		
		//Apuntamos a la direccion de memoria: 
		Ej002DiscoMusical Disco1;
		//Creamos el objeto de la clase DiscoMusical con un constructor:
		Disco1 = new Ej002DiscoMusical();
		//El constructor consiste en crear un objeto
		//de una clase con la palabra reservada new y rellenar los atributos.
		
		//Todo a la vez:
		Ej002DiscoMusical disco2 = new Ej002DiscoMusical();
		
		
		//Podemos acceder a atributos private desde metodos public 
		//que se encuentran en la misma clase que esos atributos:
		//Set it para cambiar el valor:
		 Disco1.setTitulo("Parachutes");
		 Disco1.setAutor("Coldplay");
		 Disco1.setAnyoEdicion(2000);
		 Disco1.setFormato("CD");
		 Disco1.setDigital(true);
		 
		//Get it para que nos lo devuelva:
		 System.out.println("Titulo del disco: " + Disco1.getTitulo());
		 System.out.println("Autor: " + Disco1.getAutor());
		 System.out.println("Anyo de edicion: " + Disco1.getAnyoEdicion());
		 System.out.println("Formato: " + Disco1.getFormato());
		 System.out.println("Es digital : " + Disco1.getDigital());
	}

}
