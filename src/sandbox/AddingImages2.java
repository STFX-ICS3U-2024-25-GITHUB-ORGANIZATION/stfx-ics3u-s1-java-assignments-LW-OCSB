package sandbox;

// import for images
import javax.swing.ImageIcon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddingImages2 {

	// variables
	private JFrame frame;
	
	// creating new image object
	ImageIcon myPicture = new ImageIcon(getClass().getResource("/resources/dog.jpg"));
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingImages2 window = new AddingImages2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddingImages2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("New label");
		label1.setBounds(117, 73, 206, 139);
		label1.setIcon(myPicture);         // add image to label
		frame.getContentPane().add(label1);
	}
}
