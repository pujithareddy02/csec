package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class data {

	private JFrame frame;
	private JTable table;
	private JTable Table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					data window = new data();
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
	public data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csec","root","mysql");
					String query="select * from kamidi";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData read=rs.getMetaData();
					 DefaultTableModel n = (DefaultTableModel)Table.getModel();
					int cols=read.getColumnCount();
					String[]colName=new String[cols];
					for(int i=0;i<cols;i++)
					colName[i]=read.getColumnName(i+1);
				 n.setColumnIdentifiers(colName);
					String Name,marks,percentage,grade;
					while(rs.next())
					{
						Name=rs.getString(1);
						marks=rs.getString(2);
						percentage=rs.getString(3);
						grade=rs.getString(4);
						String[] row = {Name,marks,percentage,grade};
						n.addRow(row);
						
						
						
					}
					st.close();
					con.close();
					
					
					
					
				}
				 catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				 }
			 catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 24));
		btnNewButton.setBounds(52, 30, 158, 55);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(81, 162, 43, 0);
		frame.getContentPane().add(table);
		
		Table = new JTable();
		Table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		Table.setBounds(91, 125, 340, 233);
		frame.getContentPane().add(Table);
	}
}
