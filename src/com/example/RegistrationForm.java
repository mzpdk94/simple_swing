package com.example;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegistrationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAge;
	private JTextField txtMobile;
	private JTextField txtEmail;
	private JTextField txtUser;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\eclipse\\download.png"));
		setTitle("RegistrationForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		createLabel("Name:");
		
		JLabel lblNewLabel_1 = new JLabel("Address:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 94, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 138, 99, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 184, 99, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile no.:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 228, 129, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(10, 276, 99, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("User Name:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(10, 327, 129, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Password:");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 368, 99, 22);
		contentPane.add(lblNewLabel_7);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(0, 0, 0));
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtName.setBounds(173, 42, 213, 37);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JTextArea txtAddr = new JTextArea();
		txtAddr.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtAddr.setBounds(173, 87, 213, 49);
		contentPane.add(txtAddr);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBackground(Color.BLACK);
		rbMale.setForeground(Color.WHITE);
		rbMale.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonGroup.add(rbMale);
		rbMale.setBounds(173, 138, 109, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setBackground(Color.BLACK);
		rbFemale.setForeground(Color.WHITE);
		rbFemale.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonGroup.add(rbFemale);
		rbFemale.setBounds(314, 138, 109, 23);
		contentPane.add(rbFemale);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtAge.setBounds(173, 182, 140, 28);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMobile.setBounds(173, 216, 213, 38);
		contentPane.add(txtMobile);
		txtMobile.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setBounds(173, 268, 213, 38);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUser.setBounds(173, 320, 213, 28);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setBounds(173, 365, 213, 28);
		contentPane.add(txtPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName( "com.mysql.cj.jdbc.Driver" );
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
					String query="insert into registration values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, txtName.getText());
					ps.setString(2, txtAddr.getText());
					if(rbMale.isSelected())
						ps.setString(3, rbMale.getText());
					else
						ps.setString(3, rbFemale.getText());
					ps.setInt(4, Integer.parseInt(txtAge.getText()));
					ps.setInt(5, Integer.parseInt(txtMobile.getText())); 
					ps.setString(6, txtEmail.getText());
					ps.setString(7, txtUser.getText());
					ps.setString(8, txtPassword.getText());
		        	int i=ps.executeUpdate();
					ps.close();
					
					JOptionPane.showMessageDialog(null,"Record added successfully!");
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegister.setBounds(89, 416, 140, 22);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAddr.setText("");
				txtAge.setText("");
				txtMobile.setText("");
				txtEmail.setText("");
				txtUser.setText("");
				txtPassword.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnReset.setBounds(381, 416, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_8 = new JLabel("User Registration");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(173, 11, 213, 14);
		contentPane.add(lblNewLabel_8);
	}

	private void createLabel(String name) {
		JLabel lblNewLabel = new JLabel(name);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 53, 99, 14);
		contentPane.add(lblNewLabel);
	}
}
