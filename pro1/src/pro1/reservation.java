package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reservation {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservation window = new reservation();
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
	public reservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RAILWAY RESERVATION SYSTEM");
		lblNewLabel.setBounds(127, 10, 294, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(27, 61, 69, 13);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(127, 61, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setBounds(27, 100, 62, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(127, 100, 85, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"HYDERABAD", "WARANGAL ", "BHUPALPALLY", "KALESHWARAM"}));
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setBounds(27, 152, 62, 13);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(127, 151, 85, 21);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"HYDERABAD", "WARANGAL", "BHUPALPALLY", "KALESHWARAM"}));
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("NO OF TICKETS");
		lblNewLabel_4.setBounds(10, 206, 144, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(164, 205, 59, 21);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton,"done");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(116, 242, 123, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
