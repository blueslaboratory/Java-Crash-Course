package ejemplos034_layouts;
import java.awt.*;
import javax.swing.*;


/**
 * Ejemplo de BorderLayout.
 * 
 */
public class BorderLayoutExample2
{
    private JFrame frame;

    /**
     * Constructor for objects of class BorderLayoutExample
     */
    public BorderLayoutExample2()
    {
        makeFrame();
    }

    /**
     * Place five components in the available regions.
     */
    private void makeFrame()
    {
        frame = new JFrame("BorderLayout Example");
        
        // Container contentPane = frame.getContentPane();
        
        frame.setLayout(new BorderLayout());
        
        frame.add(new JButton("north"), BorderLayout.NORTH);
        frame.add(new JButton("south"), BorderLayout.SOUTH);
        frame.add(new JButton("center"), BorderLayout.CENTER);
        frame.add(new JButton("west"), BorderLayout.WEST);
        frame.add(new JButton("east"), BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					new BorderLayoutExample2();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
