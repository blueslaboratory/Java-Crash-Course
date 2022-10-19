package ejemplos030_ficherosSerializable2;

import java.io.*;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectOutputStream.html

public class ClaseOutput extends ObjectOutputStream {
	
	// Constructor
	ClaseOutput(OutputStream f) throws IOException {
		super(f); // constructor de ObjectOutputStream 
	} 

	// Reescribe esta para que no se escriba la cabecera 
	// y se pueda copiar el objeto sin problemas
	protected void writeStreamHeader() throws IOException {}

}