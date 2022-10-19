package ejemplos030_ficherosSerializable3;

import java.io.*;

public class ClaseOutput extends ObjectOutputStream {

	// Constructor
	ClaseOutput(OutputStream f) throws IOException {
		super(f);
	}

	// Reescribe esta para que no se escriba la cabecera
	// y se pueda copiar el objeto sin problemas
	protected void writeStreamHeader() throws IOException {
	}

}