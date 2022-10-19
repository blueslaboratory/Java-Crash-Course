package ejemplos030_ficherosSerializable4_error;
/*
 * Escribimos dos objetos en un fichero y a continuacion los leemos.
 * Creamos un par de objetos mas y los anadimos al fichero. Vemos que da error 
 * al leer el fichero de nuevo:
 * java.io.StreamCorruptedException: invalid type code: AC
 * */

import java.io.*;
public class PruebaPersona {
	final static String NOM_FICH="datos.obj";
	public static void main(String[] args) {
		Persona p1=new Persona("Pablo", 20);
		Persona p2=new Persona("Rosa", 35);
		
		// Escritura de objetos 1
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH))){            			
			oos.writeObject(p1);
			oos.writeObject(p2); 
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
		// Lectura de objetos 1
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){

			try{                 
				while(true){ 
					p1=(Persona)ois.readObject();
					System.out.println(p1);
				}
			} catch(EOFException e){ } 
			ois.close(); 
			
		} catch (IOException ex) {  
			System.out.println(ex);
		} catch (ClassNotFoundException ex) { 
			System.out.println(ex); 
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		p1=new Persona("Lola", 5);
		p2=new Persona("Pepe", 45);
		
		
		// Escritura de objetos 2
		// No puedes porque cada vez que se escribe, escribe una cabecera
		// cabecera, 2 personas, cabecera, 2 personas
		// lee la cabecera, las 2 personas, pero no se espera la 2da cabecera
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH, true))){            			
			oos.writeObject(p1);
			oos.writeObject(p2);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
		// Lectura de objetos 1
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){

			try{                 
				while(true){ 
					p1=(Persona)ois.readObject();
					System.out.println(p1);
				}
			} catch(EOFException e){ } 
			 
		} catch (IOException ex) {  
			System.out.println(ex);
		} catch (ClassNotFoundException ex) { 
			System.out.println(ex); 
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}