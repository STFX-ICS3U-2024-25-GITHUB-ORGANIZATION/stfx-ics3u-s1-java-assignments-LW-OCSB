package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldGUI {

	private JFrame frame;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldGUI window = new HelloWorldGUI();
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
	public HelloWorldGUI() {
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
		
		JLabel label1 = new JLabel("Hello World Program!");
		label1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label1.setBounds(135, 44, 235, 31);
		frame.getContentPane().add(label1);
		
		textField1 = new JTextField();
		textField1.setBounds(198, 131, 141, 25);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton button1 = new JButton("Click Me!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code goes here
				textField1.setText("Hello World!");
				
			}
		});
		button1.setBounds(48, 132, 89, 23);
		frame.getContentPane().add(button1);
	}
}
