package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECOM {
	int i=0;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOM window = new ECOM();
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
	public ECOM() {
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
		
		JLabel lblNewLabel = new JLabel("amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(194, 10, 86, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\813uPMOnskL._AC_UL116_SR116,116_.jpg"));
		lblNewLabel_1.setBounds(22, 47, 123, 148);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\71UwSHSZRnS._AC_UL116_SR116,116_.jpg"));
		lblNewLabel_2.setBounds(155, 64, 104, 115);
		frame.getContentPane().add(lblNewLabel_2);
		JLabel lblcart = new JLabel("cart:0");
		lblcart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblcart.setBounds(322, 64, 86, 21);
		frame.getContentPane().add(lblcart);
		
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("cart" +i);
			}
		});
		btnNewButton.setBounds(44, 232, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("cart" +i);
			}
		});
		btnNewButton_1.setBounds(174, 232, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("120/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(60, 209, 69, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("270/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(187, 212, 72, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lbltotal = new JLabel("total:0");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbltotal.setBounds(322, 96, 69, 21);
		frame.getContentPane().add(lbltotal);
	}

}
