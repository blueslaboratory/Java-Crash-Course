package ejemplos011_static;


public class SerHumano{
	String nombre;
	String colorOjos;
	int edad;
	
	/*
	 * Declaracion e inicializacion de una variable de instancia estatica
	 * Tiene sentido declararla estatica pues todos los objetos
	 * de la clase, teniendo en cuenta que esta modela a un ser humano,
	 * habitan en el mismo planeta
	 */
	
	static String planeta="Tierra";
	//ATRIBUTO ESTATICO
	
	
	public static void main(String args[]){
		SerHumano sh1 = new SerHumano ();
		sh1.nombre="Jesus";
		sh1.colorOjos="azules";
		sh1.edad=28;
		sh1.mostrarCaracteristicas();
		sh1.esMayorEdad();
		System.out.println("---------------------");
		
		/*
		Para invocar a una variable estatica no se necesita crear un 
		objeto de la clase en la que se define:
		•	Si se invoca desde la clase en la que se encuentra definido, 
			basta con escribir su nombre.
		•	Si se le invoca desde una clase distinta, debe anteponerse a su 
			nombre, el de la clase en la que se encuentra definido seguido 
			del operador punto (.) <NombreClase>.variableEstatica.
		 */
		
		SerHumano.planeta = "Marte";
		planeta = "Marte";
		//LO CAMBIA PARA LOS 2 PORQUE ES UN ATRIBUTO ESTATICO
		
		SerHumano sh2 = new SerHumano ();
		sh2.nombre="Rebeca";
		sh2.colorOjos="verdes";
		sh2.edad=27;
		sh2.mostrarCaracteristicas();
		sh2.esMayorEdad();
		System.out.println("---------------------");
		
		
		sh1.mostrarCaracteristicas();
		
		
		System.out.println("FIN DEL PROGRAMA");
	}
	
	
	
	public void mostrarCaracteristicas(){
		System.out.println(nombre+" tiene "+edad+" anios.");
		System.out.println("Sus ojos son "+colorOjos);
		System.out.println("Su planeta es "+planeta);
	}
	
	public void esMayorEdad(){
		if(edad>=18){
			System.out.println(nombre+" es mayor de edad.");
			System.out.println("Tiene "+edad+" anios.");
		}
		else{
			System.out.println(nombre+" es menor de edad");
			System.out.println("Tiene "+edad+" anios");
		}
	}
	
}

