package ejemplos034_SwingBasico;
// https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=56&codigo=129&inicio=40

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ej004Ascensor extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JLabel l2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej004Ascensor frame = new Ej004Ascensor();
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
	public Ej004Ascensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(l1.getText());
				if (1 < pisoactual)
					l2.setText("Baja");
				else
					l2.setText("Piso actual");
				l1.setText("1");
			}
		});
		b1.setBounds(38, 187, 53, 44);
		contentPane.add(b1);

		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(l1.getText());
				if (2 < pisoactual)
					l2.setText("Baja");
				else if (2 > pisoactual)
					l2.setText("Sube");
				else
					l2.setText("Piso actual");
				l1.setText("2");
			}
		});
		b2.setBounds(38, 132, 53, 44);
		contentPane.add(b2);

		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(l1.getText());
				if (3 < pisoactual)
					l2.setText("Baja");
				else if (3 > pisoactual)
					l2.setText("Sube");
				else
					l2.setText("Piso actual");
				l1.setText("3");
			}
		});
		b3.setBounds(38, 77, 53, 44);
		contentPane.add(b3);

		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(l1.getText());
				if (4 > pisoactual)
					l2.setText("Sube");
				else
					l2.setText("Piso actual");
				l1.setText("4");
			}
		});
		b4.setBounds(38, 22, 53, 44);
		contentPane.add(b4);

		JLabel lblPiso = new JLabel("piso");
		lblPiso.setBounds(160, 92, 46, 14);
		contentPane.add(lblPiso);

		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(160, 147, 61, 14);
		contentPane.add(lblDireccion);

		l1 = new JLabel("1");
		l1.setBounds(243, 92, 46, 14);
		contentPane.add(l1);

		l2 = new JLabel("baja");
		l2.setBounds(243, 147, 53, 14);
		contentPane.add(l2);
	}
}