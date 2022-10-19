/*
2.- Dada la clase Viaje siguiente, escribir un metodo denominado uneViaje 
que reciba como parametros dos tipos Viaje y devuelva un nuevo objeto de esa 
misma clase con: 
el origen del primero, el destino del segundo y como distancia la suma de 
las distancias de los dos viajes originales, si el destino del primero 
coincide con el origen del segundo, sino se cumple dicha condicion se 
asignara -1 a la distancia. 

class Viaje { 
private String origen; 
private String destino; 
private double distancia; 
} 

Nota: La funcion para comparar cadenas es: cadena1.compareTo(cadena2) 
devuelve 0 si las dos cadenas son iguales, <0 si la cadena1 < cadena2 
y >0 si cadena1>cadena2. 

Crea una clase Principal, en la que se defina un array/ArrayList de 10 
objetos Viaje e imprima por pantalla el resultado de usar el metodo 
uneViaje, con una componente y la siguiente (0 y 1, 1 y 2, 2 y 3, ... ,9 y 10). 

*/

package m3_Arraylist;

public class Ej002Viaje {
	
	private String origen;
	private String destino;
	private double distancia;


	//OTROS METODOS
	public Ej002Viaje uneViaje(Ej002Viaje v1, Ej002Viaje v2) {
		if(v1.getDestino().equals(v2.getOrigen()))
			return new Ej002Viaje(v1.getOrigen(), v2.getDestino(), (v1.getDistancia()+v2.getDistancia()));
		else
			return new Ej002Viaje(v1.getOrigen(), v2.getDestino(), (-1));
	}	

	public Ej002Viaje uneViaje2(Ej002Viaje v) {
		if(getDestino().equals(v.getOrigen())) 
			return new Ej002Viaje(getOrigen(), v.getDestino(), (getDistancia()+v.getDistancia()));
			
		else {
			System.out.println("Los viajes no forman un recorrido correcto");
			return new Ej002Viaje(getOrigen(), v.getDestino(), (-1));
		}
			
	}


	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej002Viaje() {}
	public Ej002Viaje(String origen, String destino, double distancia) {
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}


	//GETTERS
	public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
	public double getDistancia() {
		return distancia;
	}


	//SETTERS
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}


	//TOSTRING
	@Override
	public String toString() {
		return "\nViaje "
			  +"\nOrigen: " +origen 
			  +"\nDestino: " +destino 
			  +"\nDistancia: " +distancia;
	}	
}
