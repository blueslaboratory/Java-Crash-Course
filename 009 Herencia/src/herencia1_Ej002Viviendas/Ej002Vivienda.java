/*
2.- Realiza un programa en java con las siguientes clases:
    - Vivienda: 
            + Atributos: metros cuadrados, calle y numero.
            + Metodos para devolver/establecer valores a los atributos.
            + Constructor con valores por defecto (0,â€�â€�,0)
            + Constructor con valores para los atributos
    - Chalet: Una vivienda que siempre tiene 120m2 y puede 
    		  o no tener jardin (verdadero o falso)
    - Palacio: Una vivienda de la que interesa el numero de habitaciones.

En el programa principal se mostrara el siguiente menu:

1. Insertar vivienda
2. Insertar chalet
3. Insertar palacio
4. Mostrar viviendas
5. Mostrar palacios
6. Borrar vivienda
7. Salir

Elija opcion: 


En las tres primeras opciones nos pediran los datos de 
cada tipo de vivienda (el tipo general corresponde a una 
vivienda que no es ni chalet ni palacio).
En la cuarta opcion se mostraran todas las viviendas de 
cualquier tipo.
En la quinta opcion se mostraran los datos de los palacios.
En la sexta opcion se pide el nombre de la calle y el numero 
de la vivienda a borrar y la eliminamos de la lista.

Un arrayList en otra clase ya
*/

package herencia1_Ej002Viviendas;

public class Ej002Vivienda {
	protected String calle;
	protected int n;
	protected double m2;
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej002Vivienda() {};
	public Ej002Vivienda(String calle, int n, double m2) {
		this.calle = calle;
		this.n = n;
		this.m2 = m2;
	}
	
	//GETTERS
	public String getCalle() {
		return calle;
	}
	public int getN() {
		return n;
	}
	public double m2() {
		return m2;
	}
	
	//SETTERS
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	
	//toString
	@Override
	public String toString() {
		return "\nVivienda " +getClass().toString().substring(getClass().toString().indexOf("Ej002")+5, 
				  											  getClass().toString().length())
			  +"\nCalle: " +calle
			  +"\nNumero: " +n
			  +"\nMetros cuadrados: " +m2;
	}
}
 