/*

Agregar .jars a 023 SMTP
Project -> properties -> Java Build Path -> Libraries -> Classpath -> Add External Jars

/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/!Drivers

JARS:
javax.activation-1.2.0.jar
javax.mail.jar
*/

import java.util.Properties;
import java.util.Scanner;

import javax.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GestorCorreo {

	private Properties misPropiedades;
	private Session miSession;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Password emisor generada en google: ");
		String passwordEmisor = sc.nextLine(); //aqui va la pw generada en google
		
		
		System.out.println("Introduce tu direccion de correo: ");
		String emailEmisor = sc.nextLine();
		
		System.out.println("Correo del destinatario: ");
		String emailDestino = sc.nextLine();
		
		System.out.println("Introduce el asunto: ");
		String asunto = sc.nextLine();
		
		System.out.println("Introduce el texto del mensaje: ");
		String texto = sc.nextLine();
		
		
		GestorCorreo miGestorCorreo = new GestorCorreo();
		
		try {
			miGestorCorreo.enviarMensajeTexto(emailEmisor, emailDestino, asunto, texto, emailEmisor, passwordEmisor);
			
			System.out.println("Mensaje enviado");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setPropiedadesServidorSMTP(){
		// https://programacion.net/articulo/tutorjava_nivel_basico_97/55
		misPropiedades = System.getProperties();
		// identificacion requerida
		misPropiedades.put("mail.smtp.auth", "true");
		// servidor SMTP
		misPropiedades.put("mail.smtp.host", "smtp.gmail.com");
		// puerto
		// https://kinsta.com/es/blog/puerto-smtp/
		misPropiedades.put("mail.smtp.port", "587");
		// Conexion segura
		// https://www.websecurity.digicert.com/es/es/security-topics/what-is-ssl-tls
		misPropiedades.put("mail.smtp.starttls.enable", "true");
		// http://www.jtech.ua.es/j2ee/2002-2003/modulos/mensajes/apuntes/sesion1.htm
		miSession = Session.getInstance(misPropiedades, null);
	}

	
	private Transport conectarServidorSMTP(String direccionCorreo, String password) throws Exception {
		
		// http://www.jtech.ua.es/j2ee/2002-2003/modulos/mensajes/apuntes/sesion1.htm
		Transport t;
		
		t = (Transport) miSession.getTransport("smtp");
		t.connect(misPropiedades.getProperty("mail.smtp.host"), direccionCorreo, password);
		
		return t;
		
	}
	
	
	private Message crearNucleoMensaje(String emisor, String destinatario, String asunto) throws Exception, MessagingException {
		Message miMensaje = new MimeMessage(miSession);
		
		miMensaje.setFrom(new InternetAddress(emisor));
		miMensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
		miMensaje.setSubject(asunto);
		
		return miMensaje;
	}
	
	
	private Message crearMensajeTexto(String emisor, String destinatario, String asunto, String texto) throws MessagingException, Exception {
		Message miMensaje = crearNucleoMensaje(emisor, destinatario, asunto);
		
		miMensaje.setText(texto);
		
		return miMensaje;
	}
	
	
	private void enviarMensajeTexto(String emisor, String destinatario, String asunto, String texto, String direccionCorreo, String password) throws MessagingException, Exception {
		setPropiedadesServidorSMTP();
		
		Message miMensaje = crearMensajeTexto(emisor, destinatario, asunto, texto);
		
		Transport t = conectarServidorSMTP(direccionCorreo, password);
		
		t.sendMessage(miMensaje, miMensaje.getAllRecipients());
		
		t.close();
		
		return;
	}
	
}
