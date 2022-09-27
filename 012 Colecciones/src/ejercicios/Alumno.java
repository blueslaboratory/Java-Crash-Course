package ejercicios;

public class Alumno {
	private String nombre;
	private int edad;
	private float nota;

	public Alumno(String nombre, int edad) throws Exception {
		if (edad < 0)
			throw new Exception("Edad no valida");
		else {
			this.edad = edad;
			this.nombre = nombre;
		}
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) throws Exception {
		if (nota < 0 || nota > 10)
			throw new Exception("Nota no valida");
		else
			this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Edad: " + edad + " Nota: " + nota;
	}

}
