//Ejercicio 8.-
//Dise�ar una clase Motor que representa el motor de una bomba para mover fluidos. 
//Define la clase Motor considerando los siguientes atributos de clase: 
//tipoBomba (int), tipoFluido (String), combustible (String). 
//Define un constructor asignando unos valores de defecto a los atributos y los 
//m�todos para poder establecer y obtener los valores de los atributos. 
//A�ade un m�todo tipo PROCEDIMIENTO denominado dimeTipoMotor() donde a trav�s de un 
//condicional switch hagas lo siguiente:
//a) Si el tipo de bomba es 0, mostrar un mensaje por consola indicando 
//"No hay establecido un valor definido para el tipo de motor".
//b) Si el tipo de bomba es 1, mostrar un mensaje por consola indicando 
//"El motor es un motor de agua".
//c) Si el tipo de bomba es 2, mostrar un mensaje por consola indicando 
//"El motor es un motor de gasolina".
//d) Si el tipo de bomba es 3, mostrar un mensaje por consola indicando 
//"El motor es un motor de hormig�n".
//e) Si el tipo de bomba es 4, mostrar un mensaje por consola indicando 
//"El motor es un motor de pasta alimenticia".
//f) Si no se cumple ninguno de los valores anteriores mostrar el mensaje 
//"No se puede clasificar el motor.

//Ejercicio 9.-
//Dada la clase del ejercicio anterior Motor, dise�a un m�todo tipo funci�n que 
//devuelva un booleano (true o false) denominado dimeSiMotorEsParaAgua() donde 
//se cree una variable local booleana motorEsParaAgua de forma que si el tipo de 
//motor tiene valor 1 tomar� valor true y si no lo es tomar� valor false. El 
//m�todo debe devolver la variable local booleana motorEsParaAgua.


package basicos1;

public class Ej009MotorMain {

	public static void main(String[] args) {
		
		
		Ej009Motor motor1 = new Ej009Motor();
		
		motor1 = new Ej009Motor(1, "liquido", "keroseno");
		//public Ej008Motor(int tipoBomba, String tipoFluido, String combustible)
		
		motor1.dimeTipoMotor();
		System.out.println("Motor para agua: " + (motor1.dimeSiMotorEsParaAgua() ? "Yes": "No"));
		
		//toString
		System.out.println(motor1);
	}
}
