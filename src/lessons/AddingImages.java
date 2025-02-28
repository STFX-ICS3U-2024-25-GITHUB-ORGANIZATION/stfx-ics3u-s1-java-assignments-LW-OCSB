package lessons;


import javax.swing.ImageIcon;	// LIBRARY NEEDED FOR IMAGES

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingImages {

	// PICTURE VARIABLES
	ImageIcon myPicture1 = new ImageIcon(getClass().getResource("/resources/manyDogs.jpg"));
	ImageIcon myPicture2 = new ImageIcon(getClass().getResource("/resources/oneDog.jpg"));			
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingImages window = new AddingImages();
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
	public AddingImages() {
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(38, 125, 89, 23);
		btnNewButton.setIcon(myPicture2); 			// ADD PICTURE TO BUTTON
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(205, 44, 178, 184);
		lblNewLabel.setIcon(myPicture1);			// ADD PICTURE TO LABEL
		frame.getContentPane().add(lblNewLabel);
	}
}
