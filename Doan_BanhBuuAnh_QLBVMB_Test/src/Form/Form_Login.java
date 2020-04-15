package Form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Form_Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JLabel lblNewLabel;
	private JLabel Password;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Login frame = new Form_Login();
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
	public Form_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Username = new JLabel("Username:");
		Username.setToolTipText("Username\r\n");
		Username.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Username.setForeground(new Color(255, 255, 255));
		Username.setBounds(48, 100, 90, 32);
		contentPane.add(Username);
		
		username = new JTextField();
		username.setBackground(new Color(128, 128, 128));
		username.setBounds(136, 109, 180, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 434, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Form Login");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize() + 13f));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(32, 11, 179, 50);
		panel.add(lblNewLabel);
		
		Password = new JLabel("Password:");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Password.setForeground(new Color(255, 255, 255));
		Password.setBounds(48, 156, 90, 14);
		contentPane.add(Password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname=username.getText();
				String pad=passwordField.getText();
				
				if(uname.equals("") && pad.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Password or Username is empty!");
				}
				if(uname.equals("name") && pad.equals("password"))
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Login success!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Login failed!");
				}
			}
		});
		btnNewButton.setBounds(164, 206, 89, 23);	
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.GRAY);
		passwordField.setBounds(136, 156, 180, 20);
		contentPane.add(passwordField);
	}
}
