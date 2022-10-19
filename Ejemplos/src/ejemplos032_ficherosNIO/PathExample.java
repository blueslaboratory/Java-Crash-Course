package ejemplos032_ficherosNIO;

import java.nio.file.Path;
import java.nio.file.Paths;

class PathExample {
	public static void main(String args[]) {
		//G:\\DOCUMENTS\\DA1D1E\\Programación\\T9 Ficheros en Java
		//G:\\DOCUMENTS\\DA1D1E\\Programación\\T9 Ficheros en Java\\java-file-nio_es
		Path path = Paths.get("G:\\DOCUMENTS\\DA1D1E\\Programación\\T9 Ficheros en Java\\java-file-nio_es");
		
		System.out.println(" path = " + path);
		System.out.println(" is absoute ? = " + path.isAbsolute());
		System.out.println(" file short name = " + path.getFileName());
		System.out.println(" parent = " + path.getParent());
		System.out.println(" uri = " + path.toUri());
		//La URI es para acceder desde el navegador
		
		String strRuta = path.toString();
		System.out.println(" toString = " +strRuta);
	}
}