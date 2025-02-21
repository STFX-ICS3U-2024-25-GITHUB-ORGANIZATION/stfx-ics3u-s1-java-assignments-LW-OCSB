package lessons;

import javax.swing.JOptionPane;  // for pop-up dialog

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

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
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Add Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(150, 24, 214, 36);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(150, 99, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(150, 142, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(150, 185, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(264, 102, 100, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(264, 145, 93, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sum");
		lblNewLabel_3.setBounds(264, 188, 74, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code goes here
				
				// NOTE - We don't want variables declared
				//	      inside methods.  We will declare these
				//	      variables here to simplify this lesson.
				int num1 = 0;
				int num2 = 0;
				int sum = 0;
				
				// get first number
				try  {
					
					num1 =	Integer.parseInt(textField1.getText());
				}
				
				catch(Exception e1)  {
					
					JOptionPane.showMessageDialog(null,  "Invalid entry.");
				}
				
				// get second number
				try  {
					
					num2 =	Integer.parseInt(textField2.getText());
				}
				
				catch(Exception e2)  {
					
					JOptionPane.showMessageDialog(null,  "Invalid entry.");
				}
						
				// calculate sum, cast int to String, display answer
				sum = num1 + num2;
				
				textField3.setText(Integer.toString(sum));
				
				
				
			}
		});
		button1.setBounds(27, 141, 89, 23);
		frame.getContentPane().add(button1);
	}
}
