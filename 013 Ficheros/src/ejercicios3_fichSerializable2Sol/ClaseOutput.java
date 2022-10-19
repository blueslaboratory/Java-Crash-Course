package ejercicios3_fichSerializable2Sol;

import java.io.*;

public class ClaseOutput extends ObjectOutputStream{
	//Constructor
	ClaseOutput (FileOutputStream fos) throws IOException{
		super(fos);
	}
	
	//Reescribimos el metodo de escribir cabeceras de ObjectOutputStream dejándolo vacío
	//para que al escribir por segunda vez en un fichero no vuelva a escribir una cabecera
	@Override
	protected void writeStreamHeader() throws IOException{}
}
