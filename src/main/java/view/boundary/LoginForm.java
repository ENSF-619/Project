package view.boundary;
/**
 * ENSF 619 Group Project
 * LoginForm represents the login view for registered users
 * to interact with and access their account.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.awt.CardLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import view.controllers.LoginController;

public class LoginForm extends JPanel {

	LoginController controller;
	private JTextField userName;
	private JTextField password;
	private JButton loginBtn;
	public LoginForm(CinemaController cc, Observer observer) {
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("User Name");
		lblNewLabel_7.setBounds(266, 144, 107, 16);
		add(lblNewLabel_7);
		
		 userName = new JTextField();
		userName.setBounds(385, 141, 116, 22);
		add(userName);
		userName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(266, 189, 107, 16);
		add(lblPassword);
		
		 password = new JTextField();
		password.setColumns(10);
		password.setBounds(385, 186, 116, 22);
		add(password);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(353, 254, 97, 25);
		add(loginBtn);
		controller=new LoginController(cc,observer,userName,password,loginBtn);
	}
	public void setC(CardLayout c) {
		this.controller.setC(c);
	}

	public void setPanel(JPanel panel) {
		this.controller.setPanel(panel);
	}

	public void setActions() {
		loginBtn.addActionListener(controller);
		
		
	}
}
