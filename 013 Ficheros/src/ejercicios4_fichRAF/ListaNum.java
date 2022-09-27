/*
1. Utilizando las clases de acceso directo a ficheros, realiza un programa 
que le muestre al usuario un menu con las siguientes opciones:

a. Anadir numeros de tipo double al principio del fichero.
b. Anadir numeros de tipo double al final del fichero.
c. Mostrar el fichero creado.
d. Sustituir un numero indicado por el usuario por otro numero que tambien 
te indique el usuario.
e. Ordenar los numeros en el fichero descendentemente (ayudate de un ArrayList).

Nota: Un double en JAVA ocupa 8 bytes (en Java 8 existe un metodo para obtener 
el tamano). 

*/


package ejercicios4_fichRAF;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaNum {
	File f;
	RandomAccessFile raf;
	ArrayList<Double> numeros;
	
	// Introducir numero
	public static double introNum(String str, Scanner sc) {
		boolean flag = true;
		double n = 0;
		
		while(flag) {
			try {
				System.out.print(str);
				n = Double.parseDouble(sc.nextLine());
				flag = false; //si salta la excepcion no llega al flag
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return n;
	}
	
	
	// 1a.
	public void addFirst(double n) {
		File f2 = new File("auxiliar.txt");
		RandomAccessFile raf2 = null;
		double d;
		try {
			
			raf2 = new RandomAccessFile(f2, "rw");
			raf.seek(0); //Me situo en la 1a posicion
			raf2.seek(0); //Me situo en la 1a posicion
			raf2.writeDouble(n); //escribo el digito 0 en el fichero raf2
			while(true) {
				d = raf.readDouble();
				raf2.writeDouble(d);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Fin fichero"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			// HAY QUE CERRAR RAF PARA RENOMBRAR/ELIMINAR
			if(raf != null) raf.close();
			if(raf2 != null) raf2.close();
						
			if (f.delete()) // Borro el fichero original
				f2.renameTo(f); // auxiliar pasa a ser el original
			
			// Reabrimos el flujo para seguir escribiendo
			this.raf = new RandomAccessFile(f, "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	// 2b.
	public void addLast(double n) {
		boolean flag = false;
		
		while(!flag) {
			try {
				raf.readDouble();
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Fin fichero");
				flag = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(flag) {
			try {
				raf.seek(raf.getFilePointer()); //Me situo en el final
				raf.writeDouble(n);
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Fin fichero");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	// 2b. Elegante 
	public void addLast2(double n) {
		long pos;		
		
		try {
			pos = raf.length(); 
			raf.seek(pos); //Me situo en el final
			raf.writeDouble(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// 3c.
	public void printFile() {
		double num;
		try {
			raf.seek(0);
			while(true) {
				num = raf.readDouble();
				System.out.println(num +"\tFilePointer: " +raf.getFilePointer());
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Fin fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 4d.
	public void sustituir(double n, double s) {		
		double num;
		try {
			raf.seek(0);
			while(true) {
				num = raf.readDouble();
				if (num == n) {
					raf.seek(raf.getFilePointer()-Double.BYTES);
					raf.writeDouble(s);
				}
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Fin fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 5e.
	public void ordenar() {
		double n;
		
		//Anadir al array
		try {
			raf.seek(0);
			while(true) {
				n = raf.readDouble();
				numeros.add(n);
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Fin fichero"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ordenar y escribir
		try {
			Collections.sort(numeros, new OrdenarDescendente());
			raf.seek(0);
			for(Double d : numeros)
				raf.writeDouble(d);
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Fin fichero");
			numeros.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	//ALT + SHIFT + S
	//CONSTRUCTORES
	public ListaNum() {}
	public ListaNum(File f) {
		this.f = f;
		try {
			this.raf = new RandomAccessFile(f, "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.numeros = new ArrayList<Double>();
	}
	
	//GETTERS
	public File getF() {
		return f;
	}
	public RandomAccessFile getRaf() {
		return raf;
	}
	public ArrayList<Double> getNumeros() {
		return numeros;
	}
	
	//SETTERS
	public void setF(File f) {
		this.f = f;
	}
	public void setRaf(RandomAccessFile raf) {
		this.raf = raf;
	}
	public void setNumeros(ArrayList<Double> numeros) {
		this.numeros = numeros;
	}
}