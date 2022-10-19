package ejercicios3_fichSerializable1;

import java.io.*;

public class Ej002ClaseOutput extends ObjectOutputStream {

	// Constructor
	Ej002ClaseOutput(OutputStream f) throws IOException {
		super(f);
	}

	// Reescribe esta para que no se escriba la cabecera
	// y se pueda copiar el objeto sin problemas
	protected void writeStreamHeader() throws IOException {}

}