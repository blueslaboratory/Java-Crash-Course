//Ejercicio 8.-
//Diseñar una clase Motor que representa el motor de una bomba para mover fluidos. 
//Define la clase Motor considerando los siguientes atributos de clase: 
//tipoBomba (int), tipoFluido (String), combustible (String). 
//Define un constructor asignando unos valores de defecto a los atributos y los 
//métodos para poder establecer y obtener los valores de los atributos. 
//Añade un método tipo PROCEDIMIENTO denominado dimeTipoMotor() donde a través de un 
//condicional switch hagas lo siguiente:
//a) Si el tipo de bomba es 0, mostrar un mensaje por consola indicando 
//"No hay establecido un valor definido para el tipo de motor".
//b) Si el tipo de bomba es 1, mostrar un mensaje por consola indicando 
//"El motor es un motor de agua".
//c) Si el tipo de bomba es 2, mostrar un mensaje por consola indicando 
//"El motor es un motor de gasolina".
//d) Si el tipo de bomba es 3, mostrar un mensaje por consola indicando 
//"El motor es un motor de hormigón".
//e) Si el tipo de bomba es 4, mostrar un mensaje por consola indicando 
//"El motor es un motor de pasta alimenticia".
//f) Si no se cumple ninguno de los valores anteriores mostrar el mensaje 
//"No se puede clasificar el motor.

//Ejercicio 9.-
//Dada la clase del ejercicio anterior Motor, diseña un método tipo función que 
//devuelva un booleano (true o false) denominado dimeSiMotorEsParaAgua() donde 
//se cree una variable local booleana motorEsParaAgua de forma que si el tipo de 
//motor tiene valor 1 tomará valor true y si no lo es tomará valor false. El 
//método debe devolver la variable local booleana motorEsParaAgua.

package basicos1_repaso;

public class Ej009Motor {

	int tipoBomba;
	String tipoFluido;
	String combustible;
	
	
	
	//Ej9: dimeSiMotorEsParaAgua() 
	//public boolean dimeSiMotorEsParaAgua(int tipoBomba) {
	public boolean dimeSiMotorEsParaAgua() {
		boolean motorEsParaAgua = false;
		
		if (tipoBomba == 1)
			motorEsParaAgua = true;
		
		return motorEsParaAgua;
	}
	
	
	//tipoMotor PROCEDIMIENTO
	//NO HACE FALTA PASARLE EL PARAMETRO PORQUE ESTA DENTRO DE LA CLASE
	//public void dimeTipoMotor(int tipoBomba) {
	public void dimeTipoMotor() {
		switch(tipoBomba) {
			case 0:
				System.out.println("No hay establecido un valor definido para el tipo de motor");
				break;
			case 1:
				System.out.println("El motor es un motor de agua");
				break;
			case 2:
				System.out.println("El motor es un motor de gasolina");
				break;
			case 3:
				System.out.println("El motor es un motor de hormigon");
				break;
			case 4:
				System.out.println("El motor es un motor de pasta alimenticia");
				break;
			default:
				System.out.println("No se puede clasificar el motor");
				break;
		}
	}
	
	
	
	
	
	//CONSTRUCTOR DE MOTOR
	//Para crearlos automaticamente ALT + SHIFT + S
	public Ej009Motor() {}
	//me permite tener el constructor en el main por defecto de:
	//Motor motor1 = new Motor();
	public Ej009Motor(int tipoBomba, String tipoFluido, String combustible) {
		this.tipoBomba = tipoBomba;
		this.tipoFluido = tipoFluido;
		this.combustible = combustible;
	}	
	
	
	
	//SET IT
	//Para crearlos automaticamente ALT + SHIFT + S
	public void setTipoBomba (int tipoBomba){
		this.tipoBomba = tipoBomba;
	}
	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	

	
	//GET IT
	//Para crearlos automaticamente ALT + SHIFT + S
	public int getTipoBomba() {
		return tipoBomba;
	}
	public String getTipoFluido() {
		return tipoFluido;
	}
	public String getCombustible() {
		return combustible;
	}
	
	
	@Override
	//Para crearlo automaticamente ALT + SHIFT + S
	public String toString() {
		return "Motor [tipoBomba=" + tipoBomba 
			 + ", tipoFluido=" + tipoFluido 
			 + ", combustible=" + combustible + "]";
	}
}
