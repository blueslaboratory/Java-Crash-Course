package ejemplos021_sobrecarga;

import ejemplos021_sobrecarga.Usuario;

public class UsuarioMain {
	void imprimeUsuario(Usuario usr) {
		System.out.println("\nNombre: " + usr.getNombre());
		System.out.println("Edad: " + usr.getEdad());
		System.out.println("Direccion: " + usr.getDireccion());
	}

	public static void main(String args[]) {

		UsuarioMain prog = new UsuarioMain();
		//La otra opción sería que imprimeUsuario fuera static
		Usuario usr1, usr2;

		usr1 = new Usuario();
		System.out.println("Imprimir usr1");
		prog.imprimeUsuario(usr1);

		usr2 = new Usuario("Eduardo", 24, "Mi direccion");
		System.out.println("Imprimir usr2");
		prog.imprimeUsuario(usr2);

		usr1 = new Usuario(usr2);
		usr1.setEdad(50);
		usr2.setEdad(30.45);
		
		System.out.println("*****************************");
		System.out.println("Imprimir usr1 despues del set");
		prog.imprimeUsuario(usr1);
		System.out.println("Imprimir usr2");
		prog.imprimeUsuario(usr2);
	}
}
