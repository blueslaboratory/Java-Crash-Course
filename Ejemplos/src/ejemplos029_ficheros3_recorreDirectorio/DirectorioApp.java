package ejemplos029_ficheros3_recorreDirectorio;
import java.io.*;
// Project -> Properties -> Run/Debug settings -> DirectorioApp edit(ejecutar antes) -> Arguments
// C:\Users\W10Alex\Desktop\Borrar

public class DirectorioApp{
	public static void main(String args[]) {
		
		if (args.length == 1){
			Directorio dir = new Directorio(args[0]);
			
			
//			System.out.println();
//			System.out.println("listarFicheros\n\n");
//			try {
//				dir.listarDir1Nivel();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			
			// Para ver los ficheros solo (comentar el resto)
			System.out.println("listarFicherosYDirectorios (recursiva)\n");
			dir.listarDirTodo(dir, 0);
			System.out.println();
			
			
			
//			
//			System.out.println();
//			System.out.println("borrarDir1Nivel\n");
//			try {
//				dir.borrarDir1Nivel();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			
			System.out.println();
			System.out.println("BorrarFicherosNoVacios\n");
			dir.borrarDirTodo(dir, 0);
			
		}
		else{
			System.out.println("Numero incorrecto de parametros");
		}
	}
}