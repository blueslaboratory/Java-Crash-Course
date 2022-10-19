//Ejercicio 7.-
//Diseñar una clase Rueda que permita representar una rueda de un vehículo. 
//Sus atributos de clase serán: tipo (String), grosor (double), diametro (double), 
//marca (String). Define un constructor asignando unos valores de defecto a los 
//atributos y los métodos para poder establecer y obtener los valores de los atributos. 
//Crea un método denominado comprobarDimensiones donde a través de condicionales 
//if realices las siguientes comprobaciones:

//a) Si el diámetro es superior a 1.4 debe mostrarse por consola el mensaje 
//"La rueda es para un vehículo grande". Si es menor o igual a 1.4 pero mayor 
//que 0.8 debe mostrarse por consola el mensaje "La rueda es para un vehículo "
//+ "mediano". Si no se cumplen ninguna de las condiciones anteriores 
//debe mostrarse por pantalla el mensaje "La rueda es para un vehículo pequeño".

//b) Si el diámetro es superior a 1.4 con un grosor inferior a 0.4, ó si el diámetro 
//es menor o igual a 1.4 pero mayor que 0.8, con un grosor inferior a 0.25, deberá 
//mostrarse por consola el mensaje "El grosor para esta rueda es inferior al recomendado".


package basicos1_repaso;

public class Ej007RuedaMain_J {

	public static void main(String[] args) {
	
	String tipo, marca;
	double grosor, diametro;
	
	Ej007Rueda_J rueda1 = new Ej007Rueda_J();
	
	//Llamando al Constructor
	//rueda1 = new Rueda(String marca, String tipo, double grosor, double diametro);
	rueda1 = new Ej007Rueda_J("Michellin", "Grip", 2.5, 26.0);
	
	
	rueda1.comprobarDimensiones();
	
	//toString
	System.out.println(rueda1);
	
	}
}

