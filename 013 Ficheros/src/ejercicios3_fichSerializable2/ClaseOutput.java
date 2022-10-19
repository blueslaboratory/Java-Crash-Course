package ejercicios3_fichSerializable2;

import java.io.*;

public class ClaseOutput extends ObjectOutputStream {

	// Constructor
	ClaseOutput(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}

	
	// Reescribe esta para que no se escriba la cabecera
	// y se pueda copiar el objeto sin problemas
	// Esta parte no es autogenerada!, pero puedes 
	// buscar writeStreamHeader en la doc y te viene el metodo
	protected void writeStreamHeader() throws IOException {}

}