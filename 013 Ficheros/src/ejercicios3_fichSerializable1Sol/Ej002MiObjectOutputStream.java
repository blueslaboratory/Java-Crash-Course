package ejercicios3_fichSerializable1Sol;

import java.io.*;

public class Ej002MiObjectOutputStream extends ObjectOutputStream {
	public Ej002MiObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

//    protected MiObjectOutputStream() throws IOException, SecurityException
//    {
//        super();
//    }

	@Override
	protected void writeStreamHeader() throws IOException {}

}