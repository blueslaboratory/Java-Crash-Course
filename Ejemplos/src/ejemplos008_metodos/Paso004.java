//Da igual el orden porque a la hora de poner los metodos,
//siempre empiezan por el main

package ejemplos008_metodos;

public class Paso004 {

	public static void main(String[] args) {
		
		//static: Se utiliza cuando no instanciamos la clase para llamarlo
		//No es obligatorio que en todas las clases haya un main
		
		//public: Se puede hacer uso desde cualquier clase
		//private: Solo se puede hacer uso desde la clase donde esta
		//protected: Solo se podra hacer uso dentro del paquete
		
		
		//void: Es el tipo de dato que devuelve el metodo, 
		//los tipos de datos son int, double, boolean, string, float...
		//void: Es cuando no devuelve nada
		
		//String[]: Array de strings
		
		//Desde la linea de comandos o cmd:
		//javac.exe
		//javac programa.java -> Busca el metodo main
		//java.exe
		//java programa
		

		
		subrayar("Primer ejemplo");

		subrayar("Segundo ejemplo");

		subrayar("Tercero ejemplo");

		System.out.println();
			
	}
	
	
	static void subrayar(String texto) {
		//Esta es la cabecera o firma del m�todo
		//Al no poner si es publico se asume que es eso por defecto
		//subrayar(String texto)
		//va a recibir un String				
		
		
		System.out.println(texto);
		
		for (int x = 1; x <= texto.length(); x++)
			//Tantos guiones como caracteres tienen el String
			System.out.print("-");

		System.out.println();
	}
}
