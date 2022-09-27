package ejercicios3_fichSerializable1Sol;
public class Ej001CursoApp {
	final static String NOM_FICH="datos.obj";
    
      
    public static void main(String[] args) {
    	Ej001Asignaturas curso = new Ej001Asignaturas();
    	
    	curso.anadirObjetosALista();  
    	curso.crearFichero(NOM_FICH);
    	//curso.leerFichero(NOM_FICH);
    	curso.leerFicheroParaCalcular(NOM_FICH);
    }
 
}