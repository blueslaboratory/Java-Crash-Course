/*
2.- Crea una aplicacion que almacene los datos basicos de un vehiculo: 
matricula (String), marca (String), tamano de deposito (double) y 
modelo (String) en un fichero binario.
Los datos se pediran por teclado. Se iran anadiendo al fichero los datos 
de nuevos vehiculos cada vez que ejecutemos la aplicacion 
(no se sobrescriben los datos).

Cada vez que se modifica el fichero, se muestran por pantalla los datos 
de cada coche.

Utiliza la clase JOptionPane para leer los datos de entrada (showInputDialog) 
y mostrarlos (showMessageDialog).

*/


package ejercicios2_fichBinario;
import javax.swing.JOptionPane;

import java.io.*;
 
public class Ej002VehiculosMetodos {
 
    public static void main(String[] args) {
 
    	// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\013 Ficheros
        // final String RUTA="C:\\vehiculos.dat";
    	final String RUTA="vehiculos.dat";
 
        String matricula=JOptionPane.showInputDialog("Introduce la matricula");
        String marca=JOptionPane.showInputDialog("Introduce la marca");
        String texto=JOptionPane.showInputDialog("Introduce el tamano del deposito");
        double deposito=Double.parseDouble(texto);
        String modelo=JOptionPane.showInputDialog("Introduce el modelo");
        
        DataOutputStream dos=null;
        DataInputStream dis=null;
        
        try{ 
        	dos=new DataOutputStream(new FileOutputStream(RUTA,true));
            dis=new DataInputStream(new FileInputStream(RUTA));
 
            introduceDatos(dos, matricula, marca, deposito, modelo);
            muestraDatos(dis);
            
        }catch(EOFException e){
        	//siempre salta pero nunca se suele mostrar nada
        	//a no ser que el while tenga un dis.available()>0
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
        	try{
        		dos.close();
                dis.close();
            	// Como es un try sin recursos ha habido que cerrarlo en el finally
        	}
        	catch(IOException e){       	
        		System.out.println("No se han cerrado los ficheros");
        	}
        }
 
    }
 
    public static void introduceDatos(DataOutputStream dos,
                                      String matricula,
                                      String marca,
                                      double Deposito,
                                      String modelo) throws IOException{
 
        dos.writeUTF(matricula);
        dos.writeUTF(marca);
        dos.writeDouble(Deposito);
        dos.writeUTF(modelo); 
    }
 
    public static void muestraDatos(DataInputStream dis) throws IOException {
 
        //Cuando se acabe el fichero saltara la excepcion
        while(true){
            JOptionPane.showMessageDialog(null, ""
            		+ "El vehiculo tiene una matricula: "+dis.readUTF()
            		+ "\nSu marca es: "+dis.readUTF()
            		+ "\nEl tamano del deposito es de: "+dis.readDouble() +" litros"
   					+ "\nSu modelo es: " +dis.readUTF());
        }
    }
 
}