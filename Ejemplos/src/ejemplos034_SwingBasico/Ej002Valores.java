package ejemplos034_SwingBasico;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej002Valores extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej002Valores frame = new Ej002Valores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ej002Valores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Pestana Design: Seleccionas el boton/Properties/Show event/Action
		// new ActionListener() es una instancia de una clase que implementa una interfaz
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.setBounds(163, 134, 89, 23);
		contentPane.add(btnResultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Boton pulsado");
				 int v1=Integer.parseInt(valor1.getText());
		         int v2=Integer.parseInt(valor2.getText());
		         int suma=v1+v2;
		         btnResultado.setText(String.valueOf(suma));
			}
		});
		
		btnSumar.setBounds(38, 134, 89, 23);
		contentPane.add(btnSumar);
		
		JLabel etiquetaV1 = new JLabel("Valor 1");
		etiquetaV1.setBounds(38, 37, 46, 14);
		contentPane.add(etiquetaV1);
		
		JLabel etiquetaV2 = new JLabel("Valor 2");
		etiquetaV2.setBounds(38, 83, 46, 14);
		contentPane.add(etiquetaV2);
		
		valor1 = new JTextField();
		valor1.setBounds(111, 34, 141, 20);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		valor2 = new JTextField();
		valor2.setBounds(111, 80, 141, 20);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		
	}
}