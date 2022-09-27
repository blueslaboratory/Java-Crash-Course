//Da igual el orden porque a la hora de poner los metodos,
//siempre empiezan por el main

package ejemplos008_metodos;

public class Paso003 {

	public static void main(String[] args) {
		
		//static: Se utiliza cuando no instanciamos la clase para llamarlo
		//No es obligatorio que en todas las clases haya un main
		
		//public: Se puede hacer uso desde cualquier clase
		//private: Solo se puede hacer uso desde la clase donde esta
		//protected: Solo se podra hacer uso dentro del paquete
		//Al no poner si es publico se asume que es eso por defecto
		
		//void: Es el tipo de dato que devuelve el metodo, 
		//los tipos de datos son int, double, boolean, string, float...
		//void: Es cuando no devuelve nada
		
		//String[]: Array de strings
		
		//Desde la linea de comandos o cmd:
		//javac.exe
		//javac programa.java -> Busca el metodo main
		//java.exe
		//java programa
		

		
		subrayar("Primer ejemplo", 16);

		subrayar("Segundo ejemplo", 17);

		subrayar("Tercer ejemplo", 16);


		String mens = ("Primer ejemplo");
		int nSub = 16; 
		
		subrayar(mens, nSub);

		System.out.println();
			
	}
	
	//DENTRO DE LA CLASE PERO FUERA DEL MAIN
	static void subrayar(String texto, int cantidad) {
		//Esta es la cabecera o firma del metodo
		
		//subrayar(String texto, int cantidad)
		//Primero va a recibir un String y luego un int
		
		//Hemos creado dos variables dentro del metodo: texto y cantidad
		//Son variables que solo tienen su ambito dentro del metodo
		//Se crean cada vez que llamas al metodo 
		//Y cuando termina el metodo desaparecen
		
		//subrayar("Primer ejemplo", 16);
		//texto guarda: "Primer Ejemplo"
		//cantidad guarda: 16
		
		
		System.out.println(texto);
		for (int x = 1; x < cantidad; x++)
			System.out.print("-");

		System.out.println();
	}
}
