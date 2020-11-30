package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import view.boundary.Observer;

public class LoginController implements ActionListener{

	private CinemaController cc;
	private Observer observer;
	private JTextField userName;
	private JButton loginBtn;
	private JTextField password;
	private CardLayout c;
	private JPanel panel;

	public LoginController(CinemaController cc, Observer observer, JTextField userName, JTextField password,
			JButton loginBtn) {
		this.cc=cc;
		this.observer=observer;
		this.userName=userName;
		this.password=password;
		this.loginBtn=loginBtn;
	}

	public void setC(CardLayout c) {
		this.c=c;
	}

	public void setPanel(JPanel panel) {
		this.panel=panel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==loginBtn) {
			System.err.println("HERE");
			String user=userName.getText();
			String pass=password.getText();
			if(cc.getHub().getRegUsers().checkPassword(user, pass)) {
				observer.setStatus(true);
				observer.setRegUserName(user);
				observer.setRegPassword(pass);
				JOptionPane.showMessageDialog(panel, "Login is valid");
			}
			else {
				observer.setStatus(false);
			observer.setRegUserName("");
			observer.setRegPassword("");
				JOptionPane.showMessageDialog(panel, "Wrong username or password");
		}}
		//TODO check with model and set the username/pasword in guicontroller and set status
	}

}
