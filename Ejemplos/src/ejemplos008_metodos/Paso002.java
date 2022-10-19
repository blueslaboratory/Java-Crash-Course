//Da igual el orden porque a la hora de poner los m�todos,
//siempre empiezan por el main

package ejemplos008_metodos;

public class Paso002 {

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
		// 						 siempre empieza por el main
		//java.exe
		//java programa
		
		System.out.println("Primer ejemplo");
		subrayar();
		//Llamo al metodo subrayar

//		Paso002 ej = new Ejemplo2();
//		ej.subrayar();
		
		System.out.println("Segundo ejemplo");
		subrayar();

		System.out.println("Tercer ejemplo");
		subrayar();

		System.out.println();
			
	}
	
	
	static void subrayar() {
		//Esta es la cabecera o firma del metodo
		//Al no poner si es publico se asume que es eso por defecto
		int x;
		
		for (x = 1; x < 20; x++)
			System.out.print("-");

		System.out.println();
	}
}
