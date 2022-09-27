package ejemplos009_objetos;

public class CocheMain {
	public static void main(String[] args) {
		//ALT + UP/DOWN: MUEVE LINEAS
		
		
		//Creo un coche
		//apuntar al objeto coche
		Coche coche1;
				
		//crear el objeto coche
		coche1 = new Coche(); 
		//llamo al constructor por defecto: new
		
		
		//todo a la vez
		//Nombre-clase nombre-objeto = new Nombre-clase (<valores>);
		//Coche coche1 = new Coche();
		
//			He tenido que comentarlos al cambiar los atributos a private
//			Puedo acceder a las variables private desde su misma clase con metodos public
//			coche1.marca = "Tesla";
//			coche1.modelo = "X";
//			coche1.color ="Cherry Red";
//			coche1.numeroDePuertas = 5;
//			coche1.cuentaKilometros = 2500000;
//			coche1.velocidad = 0;
//			coche1.arrancado = false;
//			coche1.arrancado = true;
			
			coche1.arrancar();
			coche1.acelerar();
			coche1.pitar();
			
			//SET IT
			coche1.setMarca("Tesla");
			coche1.setModelo("X");
			coche1.setColor("Cherry Red");
			coche1.setNumeroDePuertas(5);
			coche1.setCuentaKilometros(2500000);
			coche1.setVelocidad(0);
			
			int km = coche1.consultarCuentaKm();
			System.out.println("km: " +km);
			
			//GET IT
			System.out.println("Marca: " +coche1.getMarca());
			coche1.setMarca("Porsche");
			System.out.println("Marca: " +coche1.getMarca());
			
		//Nombre-clase nombre-objeto = new Nombre-clase (<valores>);
		Coche coche2 = new Coche();
//			coche2.marca = "Nissan";
//			coche2.modelo = "Skyline";
//			coche2.color = "azul";
			
		//Nombre-clase nombre-objeto = new Nombre-clase (<valores>);	
		Coche coche3 = new Coche();
//			coche2.marca = "Nissan";
//			coche2.modelo = "Skyline";
//			coche2.color = "azul";
			
			
		//Apuntando a 2 zonas de memoria distintas
		if (coche2 == coche3)
			System.out.println("Es el mismo coche");
		else
			System.out.println("No es el mismo coche");
		
		
		//Apunto mi variable coche4 a coche3, 
		//pero NO estoy creando coche4
		//Tienen la misma direccion de memoria
		//ESTAMOS EN EL MISMO OBJETO
		Coche coche4 = coche3;
		
		
		//Apuntando a 2 zonas de memoria iguales
		//cambiamos el color de coche3 y coche4
		//no lo puedes cambiar si private String color;
		//coche3.color = "Gray";
		if (coche3 == coche4)
			System.out.println("Es el mismo coche");
		else
			System.out.println("No es el mismo coche");
		
		
		//INICIALIZANDO coche5 CON UN CONSTRUCTOR
		Coche coche5 = new Coche("Mercedes", "Clase A", "Black", false);
		
		//IMPRIMIR COCHE
		coche1.setMarca("Tesla");
		System.out.print("\n*** Coche 1 ***");
		coche1.imprimirCoche();
		System.out.print("*** Coche 2 ***");
		coche2.imprimirCoche();
		System.out.print("*** Coche 3 ***");
		coche3.imprimirCoche();
		System.out.print("*** Coche 4 ***");
		coche4.imprimirCoche();
		
		System.out.print("\n*** Coche 1 ***");
		coche1.imprimir();
		System.out.print("\n*** Coche 5 ***");
		coche5.imprimir();
		
		
		Coche coche6 = new Coche("Nissan", "350Z", "orange", true);
		System.out.print("\n*** Coche 6 ***");
		System.out.println(coche6.toString());
		
		//IMPRIMIENDO CON EL toString
		System.out.print("\n*** Coche 6 toString ***");
		System.out.println(coche6);
	}
}
