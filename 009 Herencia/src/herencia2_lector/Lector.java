package herencia2_lector;

import java.time.LocalDate;
import java.util.Scanner;

import herencia2_productos.*;
import herencia2_supermercado.*;
import herencia2_utilidadesFecha.*;

public class Lector {
	
	//MENU
	public static int menuAlmacen(Scanner sc) {
		int opcion;
		System.out.println("*******************************************");
		System.out.println("PROCESO DE CREACION DEL ALMACEN\n");
		System.out.println("\t1. Introducir producto alimenticio");
		System.out.println("\t2. Introducir producto textil");
		System.out.println("\t3. Introducir producto drogueria");
		System.out.println("\t4. Terminar");
		System.out.print("Elija opcion: ");
		
		opcion = Integer.parseInt(sc.nextLine());
		
		return opcion;
	}
	
	//PRODUCTO
	public static Producto crearProducto(Scanner sc) {
		String nombre, codigo;
		double precio;
		
		System.out.print("Nombre producto: ");
		nombre = sc.nextLine();
		//System.out.print("Codigo: ");
		codigo = leerCod(sc);
		System.out.print("Precio (euros): ");
		precio = Double.parseDouble(sc.nextLine());
		
		return new Producto(nombre, codigo, precio);
	}
	//DROGUERIA
	public static Drogueria crearDrogueria(Scanner sc) {
		Producto p = crearProducto(sc);
		String marca;
		
		System.out.print("Marca: ");
		marca = sc.nextLine(); 		
		
		return new Drogueria(p, marca);
	}
	//TEXTIL
	public static Textil crearTextil(Scanner sc) {
		Producto p = crearProducto(sc);
		String color;
		
		System.out.print("Color: ");
		color = sc.nextLine(); 
		
		return new Textil(p, color);
	}
	//ALIMENTACION
	public static Alimentacion crearAlimentacion(Scanner sc) {
		return new Alimentacion(crearProducto(sc), leerFecha(sc));
	}
//	public static Alimentacion crearAlimentacion2(Scanner sc) {
//		Esto no se puede hacer porque p contiene una referencia a
//		un objeto de tipo producto y no de tipo Alimentacion
//		
//		Producto  p = crearProducto(sc);
//		Alimentacion a = new Alimentacion();
//		
//		if(a instanceof Producto)
//			a = (Alimentacion)p;
//		a.setFechaCad(leerFecha(sc));
//		
//		return a;
//		
//		Poligono p = new Triangulo(1,3,2);  //upcasting
//		Triangulo t;
//
//		t = (Triangulo) p; //downcasting
//
//		Esta asignacion se puede hacer porque p contiene la referencia de un objeto triangulo.
//	}
	
	
	//FECHA
	public static LocalDate leerFecha(Scanner sc) {
		int dia, mes, year;
		LocalDate fechaCad;
		char opcion;
		
		System.out.println();
		System.out.println("Introduce la fecha de caducidad del producto");
		System.out.print("Year: ");
		year = Integer.parseInt(sc.nextLine());
		System.out.print("Month: ");
		mes = Integer.parseInt(sc.nextLine());
		System.out.print("Day: ");
		dia = Integer.parseInt(sc.nextLine());
		
		
		fechaCad = LocalDate.of(year, mes, dia);
		
		if(!ValidacionFecha.fechaValida(fechaCad)) {
			System.out.print("Desea introducir una nueva fecha (s/n): ");
			opcion = sc.nextLine().charAt(0);
			
			if(opcion == 's') 
				leerFecha(sc);			
		}
		
		return fechaCad;
	}
	
	
	//CODIGO
	public static String leerCod(Scanner sc) {
		String cod;
		do {
			System.out.print("Codigo del producto: ");
			cod = sc.nextLine();
		} while(!checkCod(cod));
		
		return cod;
	}
	public static boolean checkCod(String cod) {
		boolean correct = cod.matches("^([A-Z]{1}[0-9]{3}[A-Z]{1})$");
		//"[A-Z][0-9][0-9][0-9][A-Z]"
		if(!correct)
			System.out.println("Codigo no correcto, formato correcto A123B");
		
		return correct;
	}
	
	
	//LLENARCARRITO
	public static Carrito meterEnCarrito(Scanner sc, Supermercado sm) {
		Carrito carro = new Carrito();
		int opcion;
		char respuesta;
		
		sm.printSupermercado();
		System.out.println();
		
		do {
			System.out.print("Desea introducir algun producto en el carrito (s/n): ");
			respuesta = sc.nextLine().charAt(0);
			
			if(respuesta == 's') {
				System.out.print("Numero del producto que desea introducir: ");
				opcion = Integer.parseInt(sc.nextLine());
				carro.add(sm.getProducto(opcion-1));
				System.out.println("Producto introducido");
			}
			else {
				System.out.println("Saliendo del supermercado");
				carro.printCarrito();
			}
			
		}while(respuesta == 's');
		
		return carro;
	}
}
