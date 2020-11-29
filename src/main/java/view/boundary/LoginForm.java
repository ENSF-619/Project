package view.boundary;

import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;

public class LoginForm extends JPanel {

	
	public LoginForm(CinemaController cc, Observer observer) {
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("User Name");
		lblNewLabel_7.setBounds(266, 144, 107, 16);
		add(lblNewLabel_7);
		
		JTextField userName = new JTextField();
		userName.setBounds(385, 141, 116, 22);
		add(userName);
		userName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(266, 189, 107, 16);
		add(lblPassword);
		
		JTextField password = new JTextField();
		password.setColumns(10);
		password.setBounds(385, 186, 116, 22);
		add(password);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(353, 254, 97, 25);
		add(loginBtn);
	}
}
