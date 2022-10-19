/*
2.-  Implementa una clase en Java que permita realizar promedios. 
La clase debe tener dos métodos, uno para ingresar un nuevo número, 
llamado agregarNumero(int numero) y otro para obtener el promedio 
hasta el momento, llamado obtenerPromedio(). Determina qué atributos 
son necesarios para implementarla.

Implementa luego una clase de prueba que permita introducir algunos 
valores y que muestre el promedio. 
*/

package clases3;

/*
"Me interesa mucho este ejercicio por como oculta los numeros
con respecto al main, como una caja negra"
*/


public class Ej002SolPromedios {
	
	private int arr[];
	private int contador = 0;
	
	public Ej002SolPromedios() {}
	public Ej002SolPromedios(int longitud) {
		arr = new int[longitud];
	}
	
	public void agregarNumero(int numero) {
		if(contador < arr.length) {
			arr[contador] = numero;
			contador++;
		}
		else {
			System.out.println("No se pueden agregar mas numeros");
		}
	}
	
	public double obtenerPromedio() {
		double promedio = 0;
		
		for(int i=0; i<contador; i++) {
			promedio = promedio + arr[i];
		}
		return promedio/contador;
	}
	
	public void mostrarValores() {
		for(int i=0; i<contador; i++) {
			System.out.println(arr[i] +" ");
		}
	}
	
	public String toString() {
		String cadena = "";
		
		for(int i=0; i<contador; i++)
			cadena += arr[i] +" ";
		
		return cadena;
	}
}
