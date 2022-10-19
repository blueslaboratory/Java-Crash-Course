package ejemplos032_ficherosNIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistanceChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("test.txt");
		System.out.println(" path = " +path);
		System.out.println(" exists = " +Files.exists(path));
		System.out.println(" readable = " +Files.isReadable(path));
		System.out.println(" writeable = " +Files.isWritable(path));
		System.out.println(" executable = " +Files.isExecutable(path));
	}

}
