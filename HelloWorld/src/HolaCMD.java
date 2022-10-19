//Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit -> arguments -> 12 32

public class HolaCMD{
	public static void main(String []args){

		if(args.length == 2){
			int nf = Integer.parseInt(args[0]);
			int nc = Integer.parseInt(args[1]);

			System.out.println("Hola CMD");
			System.out.println("nf: " +nf);
			System.out.println("nc: " +nc);
		}
		else
			System.out.println("Tienes que introducir 2 parametros");
	}
}

/*

windows+R:
cmd.exe

>java -version
>javac HolaCMD.java
>java HolaCMD.java

cd: para ir al directorio donde esta el archivo
dir: para ver los archivos del directorio donde estas
cd eclipse-workspace\EjMatrices\bin\matrices
C:\Users\W10Alex\Desktop
cd Users\W10Alex\Desktop


 */

// WINDOWS/PREFERENCES/WORKSPACE/TEXT FILE ENCODING