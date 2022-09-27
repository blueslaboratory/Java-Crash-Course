//Dos vehiculos viajan a diferentes velocidades (v1 y v2) y estan distanciados 
//por una distancia d. 
//El que esta detras viaja a una velocidad mayor. Se pide hacer un algoritmo 
//para ingresar la distancia entre los dos vehiculos (km) y sus respectivas 
//velocidades (km/h) y con esto determinar y mostrar en que tiempo (minutos) 
//alcanzara el vehiculo mas rapido al otro.


package ejercicios;

import java.util.Scanner;


public class Ej016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float v1, v2, d, t;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("v(km/h) del coche que va detras: ");
		v2 = sc.nextFloat();
		
		System.out.print("v(km/h) del coche que va delante: ");
		v1 = sc.nextFloat();
		
		System.out.print("d(km) que los separa: ");
		d = sc.nextFloat();
		
		t = (float) (d/(v2-v1))*60;
		// v1*t + d = v2*t
		
		
		System.out.println("t(min) que tardan en alcanzarse: " +t);
		
		sc.close();
	}

}
