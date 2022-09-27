package ejercicios4_fichRAFSol;
import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;
 
 
public class Aleatorio {
 
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        final String NOMFICHERO = "fichero.obj";
        final String NOMFICHEROAUX = "ficheroAux.obj";
        int opcion;
        
        do {
 
            System.out.println("1.-Añadir numeros de tipo double al principio del fichero");
            System.out.println("2.-Añadir numero de tipo double al final del fichero.");
            System.out.println("3.-Mostrar el fichero creado.");
            System.out.println("4.-Sustituir un número indicado por el usuario por otro numero que tambiÃ©n te indique el usuario.");
            System.out.println("5.-Salir del programa");
            opcion = teclado.nextInt();
 
            switch (opcion) {
                case 1: {
                    aniadirPpio(NOMFICHERO, NOMFICHEROAUX); 
                    break;
                }
                case 2: {
                	aniadirFinal(NOMFICHERO);
                    break;
                }
                case 3: {
                    leerFichero(NOMFICHERO);
                    break;
                }
                case 4: {
                    sustituirDoubles(NOMFICHERO);
                    break;
                }
                case 5: {
                    System.out.println("Gracias por usar el programa....");
                    break;
                }
                default: {
                    System.out.println("Opcion incorrecta");
                }
            }
        } while (opcion != 5);
 
    }
 
    public static void aniadirPpio(String nomFich, String nomFichA) {
        RandomAccessFile raf = null, raf2 = null;
        File fichero = null, ficheroA = null;
        
        try {
            fichero = new File(nomFich);
            ficheroA = new File(nomFichA);
            raf = new RandomAccessFile(fichero, "rw");
            raf2 = new RandomAccessFile(ficheroA, "rw");
            aniadirNumerosAlPrincipio(raf, raf2);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null)
                    raf.close();
                               
                if (raf2 != null)
                    raf2.close(); 
                                      
   
                
                if (fichero.delete())
                    	System.out.println("Se ha borrado y renombrado " + ficheroA.renameTo(fichero));
                else
                    	System.out.println("No se ha podido borrar");
                    
               
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
    /*public static void aniadirNumerosAlPrincipio(RandomAccessFile raf) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.println("Introduce un numero Double para aÃ±adir al principio del fichero: ");
        numero = teclado.nextDouble();
        raf.seek(0);// Esto lo que hace es machacar el primer número
        raf.writeDouble(numero);
 
    }*/
    
    public static void aniadirNumerosAlPrincipio(RandomAccessFile raf, RandomAccessFile raf2) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double numero, numeroLeido;

        File fichero = new File("ficheroAux.obj");
        
        System.out.println("Introduce un numero Double para añadir al principio del fichero: ");
        numero = teclado.nextDouble();
        
        raf.seek(0);
        
        raf2.writeDouble(numero);
        try {
	        while ((numeroLeido = raf.readDouble())!=-1 ){
	        	System.out.println("numeroLeido: " + numeroLeido);
	        	raf2.writeDouble(numeroLeido);
	        }
        } catch (EOFException e) {               
        } 
        catch (Exception e) { 
        	System.out.println(e.getMessage());
        }           
    }
    
    public static void aniadirFinal(String nomFich) {
        RandomAccessFile raf = null;
        
        try {
            File fichero = new File(nomFich);
            raf = new RandomAccessFile(fichero, "rw");
            aniadirNumerosAlFinal(raf);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
    public static void aniadirNumerosAlFinal(RandomAccessFile raf) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double numero;
       
        System.out.println("Introduce un numero Double para aÃ±adir al final del fichero: ");
        numero = teclado.nextDouble();
        raf.seek(raf.length());
        raf.writeDouble(numero);
 
    }
 
    public static void leerFichero(String nomFich) {
        RandomAccessFile raf = null;
        
        try {
            File fichero = new File(nomFich);
            raf = new RandomAccessFile(fichero, "r");
            mostrarFichero(raf);
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
    public static void mostrarFichero(RandomAccessFile raf) throws Exception {
        double numero;
        
        raf.seek(0);
        while (true) {
            numero = raf.readDouble();
            System.out.println(numero);
        }
    }
 
    public static void sustituirDoubles(String nomFich) {
        Scanner teclado = new Scanner(System.in);
        double sustituir, nuevo, numero;
        int i = 0;
 
        RandomAccessFile raf = null;
 
        try {
            File fichero = new File(nomFich);
            raf = new RandomAccessFile(fichero, "rw");
            raf.seek(0);
 
            System.out.println("Introduce el valor que desea sustituir");
            sustituir = teclado.nextDouble();
 
            System.out.println("Introduce el nuevo valor");
            nuevo = teclado.nextDouble();
 
            while (true) {
                numero = raf.readDouble();
                if (numero == sustituir) {
                    System.out.println("Encontrado en la posicion " + i);
                    //raf.seek(i * 8); // En la v8 de Java podemos hacer:
                    raf.seek(i * Double.BYTES);
                    raf.writeDouble(nuevo);
                }
                i++;
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
 
    }
 
    public static void main(String[] args) {
        menu();
    }
 
}
