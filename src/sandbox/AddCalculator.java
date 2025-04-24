package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculator window = new AddCalculator();
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
	public AddCalculator() {
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
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				int num1 = Integer.parseInt(textField1.getText());
				int num2;
				int answer;
				
				// button code ends here
			}
		});
		btnAdd.setBounds(64, 105, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		textField1 = new JTextField();
		textField1.setBounds(211, 106, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(322, 106, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(211, 191, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setBounds(168, 194, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
