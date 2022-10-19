package year_2022_prenavidades;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class F_JuegosCintas {
	
	// ruta base en nuestro sistema operativo donde dejaremos los ficheros de datos
	// de entrada
	static final String RUTA_BASE = "";

	// ruta base con el objeto de la clase Scanner que usaremos para leer los datos
	// de entrada
	static Scanner lector;

	public static void main(String[] args) {
		Scanner lector=null;
		/* comentar las siguientes líneas hasta el fin del bloque catch en el juez en línea */
		
		File fichero;          
		try {
			
			String ruta = RUTA_BASE+"sample.in";
			 fichero = new File(ruta);
			 lector = new Scanner(fichero);
			
		} catch (Exception e) {
			System.out.println("Holi");
			e.printStackTrace();
			System.exit(1); // abandonamos la aplicación si se producen erores
		}
		/* */ //Fin del comentario multilínea	
		
		//lector = new Scanner(System.in);   //descomentar esta línea en el Juez en Línea
		
					
		//CASO 3: Hemos de procesar todas las entradas hasta llegar al fin del flujo de entrada
		while (lector.hasNext()) {			
			//leemos mientras tengamos algo que leer en el flujo de entrada

			
			//lectura de entradas			
			int tamCinta = lector.nextInt();
			int nJuegos = lector.nextInt();
			
			//ArrayList<Integer> aDatosJuegos = new ArrayList<Integer>();
			int datosJuegos[] = new int[nJuegos];
			int datosJuegosG[] = new int[nJuegos];
			
			for(int i=0; i<nJuegos; i++) {
				datosJuegos[i] = lector.nextInt();
			}
						
			
			// procesamiento
			Arrays.sort(datosJuegos);
			//System.out.println(Arrays.toString(datosJuegos));
			
			
			int cociente = 1;
			
						
			for(int cara=1; cara<3; cara++) {
				int tamCintaRestante = tamCinta;
				
				for(int i=(nJuegos-1); i>=0 && tamCintaRestante>0; i--) {					
					
					if(datosJuegos[i] != 0) {
						if(tamCintaRestante>0) 
							cociente = tamCintaRestante/datosJuegos[i];
						
						
						if(cociente<1) {
							System.out.println("Ya no quepo");
						}
						/*
						else if(cociente==1) {
							tamCintaRestante = tamCintaRestante%datosJuegos[i];
							datosJuegos[i] = 0;
							
						}
						*/
						else if(cociente>=1){
							tamCintaRestante -= datosJuegos[i];
							datosJuegos[i] = 0;
						}
					}
										
					
					System.out.println(i +Arrays.toString(datosJuegos));
				}
				
				Arrays.sort(datosJuegos);				
				System.out.println("Se ha acabado la cara " +cara +"\n");
			}
			
			
			boolean flag = true;
			
			for(int i=0; i<nJuegos; i++) {
				if(datosJuegos[i] != 0) {
					flag = false;
				}
			}
			
			
			//salida de resultados, en el formato que nos pida el  enunciado			
			if(flag) {
				System.out.println("SI\n");
			}
			else {
				System.out.println("NO\n");
			}
			
		} //fin del bucle while en el que leemos entradas
				
		
	} // fin del main

}