package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class reg {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg window = new reg();
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
	public reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" REGISTRATION PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(169, 10, 220, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel f1 = new JLabel("Full name");
		f1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f1.setBounds(10, 81, 75, 13);
		frame.getContentPane().add(f1);
		
		JLabel e1 = new JLabel("email");
		e1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		e1.setBounds(10, 127, 45, 13);
		frame.getContentPane().add(e1);
		
		JLabel ph = new JLabel("ph no");
		ph.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ph.setBounds(10, 204, 56, 13);
		frame.getContentPane().add(ph);
		
		t1 = new JTextField();
		t1.setBounds(95, 80, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(95, 126, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(95, 203, 96, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				
				
				JOptionPane.showMessageDialog(btnNewButton, "hey"   +name+" your  registration is done" );
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(150, 311, 137, 21);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 18));
		r1.setBounds(101, 234, 103, 21);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 18));
		r2.setBounds(220, 234, 103, 21);
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"css", "java", "python", "php"}));
		c1.setBounds(176, 171, 77, 21);
		frame.getContentPane().add(c1);
		
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 239, 61, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_5 = new JLabel("fav programming lang");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 173, 156, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("click");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=(String)c1.getSelectedItem();
				String f1=t1.getText();
				String ph=t3.getText();
				String e1=t2.getText();
				
				
				if(r1.isSelected())
				{
					JOptionPane.showMessageDialog(btnNewButton,"name:" +f1+"\n gender:female "+ "\nselected "+i+"\n phone number"+ph+"\nemail"+e1);
							
				}
				else if(r2.isSelected())
				
				{
					JOptionPane.showMessageDialog(btnNewButton,"name:" +f1+"\n gender:male"+ "\nselected "+i+"\n phone number"+ph+"\nemail"+e1);
				}
					
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"selected gender");
					
				}
				
				
				
					
			}
		});
		btnNewButton_1.setBounds(304, 237, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
			}
}
