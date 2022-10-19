package ejemplos034_SwingBasico;
/*
Desde el market place hemos instalado el Windows Builder
Market Place: Help -> Eclipse Market Place -> Windows Builder


boton derecho en el src -> new "other" -> "WindowBuilder" ->
Swing designer -> JFrame

https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=128&punto=&inicio=

Abajo del workspace esta la pestana: design 
boton derecho en la ventana de java que vas a crear: set layout -> absolute layout

SWING esta hecho sobre AWT, pero lo que se utiliza es SWING
*/


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Esto no entra en el examen
 */

public class Ej001Marco extends JFrame {

	private JPanel contentPane; 
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // crea un hilo diferente para la parte grafica
			public void run() {
				try {
					Ej001Marco frame = new Ej001Marco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	public static void main(String[] args) {
//		Marco ventana = new Marco();
//		// si no hago esto la ventana no se ve:
//		ventana.setVisible(true); 
//	}
	
	/**
	 * Create the frame.
	 */
	public Ej001Marco() {
		// en el evento de cerrar la ventana: cierro tambien la aplicacion:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		// tamano de la ventana:
		setBounds(100, 100, 450, 300); 
		// Panel: zona de la ventana donde puedo poner los elementos
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Generado automaticamente despues de tocar el Design:
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(41, 207, 120, 31);
		contentPane.add(btnNewButton);
		
		JButton btnMiBoton = new JButton("Cancelar");
		btnMiBoton.setBackground(Color.CYAN);
		btnMiBoton.setBounds(270, 207, 120, 31);
		contentPane.add(btnMiBoton);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setToolTipText("toolTipText");
		lblNewLabel.setBounds(41, 80, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Clave");
		lblNewLabel_1.setBounds(41, 116, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 113, 245, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(145, 77, 245, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
