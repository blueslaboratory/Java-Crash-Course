package ejemplos034_SwingBasico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Ej005InterfacesBBDD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnBuscar; 
	private JLabel LblBuscar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej005InterfacesBBDD frame = new Ej005InterfacesBBDD();
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
	public Ej005InterfacesBBDD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(30, 59, 524, 173);
		contentPane.add(textPane);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				// hay que poner el driver en el classpath del proyecto!
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost?useServerPrepStmts=true", "root", "");
//					if (con != null)
//						System.out.println("Conectados");
					
					Statement st = con.createStatement();
					st.execute("use paises");
//					System.out.println("Usando paises");
				
					try(PreparedStatement pstmt = con.prepareStatement("SELECT * FROM PersonasPaises WHERE NombrePais = ? ");){
						// Mexico, Costa Rica, Chile, Venezuela
						pstmt.setString(1, textField.getText()); 
						ResultSet rs = pstmt.executeQuery();
						
						String aux = "";
						while(rs.next()) {
							aux += (rs.getInt(1) +"\t" 
								  +rs.getString(2) +"\t"
								  +rs.getString(3) +"    \t"
								  +rs.getInt(4) +"\t"
								  +rs.getString(5) +"    \t"
								  +rs.getString(6) +"\n");
						}
						
						textPane.setText(aux);
						
						con = null;
					} catch (SQLException e1) {
						e1.printStackTrace();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} catch(SQLException e1) {
					System.out.println(e1);
				} catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		
		btnBuscar.setBounds(411, 25, 89, 23);
		contentPane.add(btnBuscar);
		
		LblBuscar = new JLabel("Personas del pais:");
		LblBuscar.setBounds(82, 25, 149, 23);
		contentPane.add(LblBuscar);
		
		textField = new JTextField();
		textField.setBounds(217, 26, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
