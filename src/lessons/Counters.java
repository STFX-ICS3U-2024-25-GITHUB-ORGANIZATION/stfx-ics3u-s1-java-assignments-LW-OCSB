package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counters {

	// variables
	int countUp = 0;
	int countDown = 0;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counters window = new Counters();
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
	public Counters() {
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
		
		JLabel lblNewLabel = new JLabel("Counter Lesson");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(149, 33, 159, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton("Count Up");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				countUp++;   // short cut for "countUp = countUp + 1";
				textField1.setText(Integer.toString(countUp));	// cast int to String before displaying
			}
		});
		button1.setBounds(67, 104, 118, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Count Down");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				countDown--;   // short cut for "countDown = countDown -- 1";
				textField2.setText(Integer.toString(countDown));	// cast int to String before displaying
			}
		});
		button2.setBounds(67, 138, 118, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Clear");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// reset counters
				countUp = 0;
				countDown = 0;
				
				// display counters
				textField1.setText(Integer.toString(countUp));
				textField2.setText(Integer.toString(countDown));
				
			}
		});
		button3.setBounds(174, 203, 89, 23);
		frame.getContentPane().add(button3);
		
		textField1 = new JTextField();
		textField1.setBounds(261, 105, 86, 20);
		textField1.setText(Integer.toString(countUp));	// display counter upon program launch
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(261, 139, 86, 20);
		textField2.setText(Integer.toString(countDown));	// display counter upon program launch
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
	}
}
