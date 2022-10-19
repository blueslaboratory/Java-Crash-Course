/*
3.- Crea manualmente dos ficheros f1.txt y f2.txt, que tendran un solo 
caracter por linea y que estaran ordenados alfabeticamente, y escribe un 
programa en java que genere el fichero f3.txt que sera la fusion de f1 y f2 
manteniendo su ordenacion. Escribir por pantalla el fichero resultante. 
(Supuestamente los 2 ficheros estan ordenados)
*/

package ejercicios1_fichTexto;

import java.io.FileReader;
import java.io.FileWriter;

public class Ej003FusionFicheros {
	public static void main(String[] args) {
		int c1, c2;
		final String FICHERO1 = "f1.txt", FICHERO2 = "f2.txt", FICHERO3 = "f3.txt";
		
		FileWriter fw = null;
		FileReader fr = null, fr1 = null, fr2 = null;
		
		/*
		crearFichero(FICHERO1, FICHERO2, FICHERO3);
		leerFichero(FICHERO3);
		*/
		
		try {
			fw = new FileWriter(FICHERO3);
			
			fr1 = new FileReader(FICHERO1);
			fr2 = new FileReader(FICHERO2);
			
			c1=fr1.read();
			c2=fr2.read();
			
			while(c1!=-1 && c2!=-1) {
				// mientras los 2 ficheros tengan datos
				if(c1<c2) {
					fw.write((char) c1);
					c1=fr1.read();
				} else if(c1>c2) {
					fw.write((char) c2);
					c2=fr2.read();
				} else {
					// si es el mismo escribimos los 2
					fw.write((char) c1);
					fw.write((char) c2);
					c1=fr1.read();
					c2=fr2.read();
				}
			}
			
			// Llega aqui cuando uno de los 2 ha acabado de recorrerse
			// ya que las condiciones se vuelven invalidas cuando uno de
			// los 2 ficheros llega a -1
			// Volcamos el resto
			
			while(c1!=-1) {
				fw.write((char) c1);
				c1=fr1.read();	
			}
			while(c2!=-1) {
				fw.write((char) c2);
				c2=fr2.read();	
			}
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA " +e);
			
		} finally {
			try {
				if(fr2!=null) fr2.close();
				if(fr1!=null) fr1.close();
				if(fw!=null) fw.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		// Ahora leemos el fichero nuevo generado
		try {
			fr=new FileReader(FICHERO3);
			c1=fr.read();
			while(c1!=-1) {
				// El 13 y el 10 son caracteres especiales
				if(c1!=13 && c1!=10) 
					System.out.println((char)c1);
				
				c1=fr.read();
			}
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA " +e);
		} finally {
			try {
				if(fr!=null) fr.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
