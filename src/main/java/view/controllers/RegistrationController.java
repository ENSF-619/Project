package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import model.RegisteredUser;
import view.boundary.Observer;

public class RegistrationController implements ActionListener {

	private JPanel panel;
	private CardLayout c;
	private CinemaController cc;
	private JTextField fName;
	private JTextField lName;
	private JTextField email;
	private JTextField address;
	private JTextField postalCode;
	private JTextField phoneNumber;
	private JComboBox month;
	private JComboBox year;
	private JTextField CCV;
	private JButton registerBtn;
	private JTextField credit;
	private JTextField userName;
	private JTextField password;
	public RegistrationController(CinemaController cc,JTextField fName, JTextField lName,
			JTextField email, JTextField address, JTextField postalCode, JTextField phoneNumber, JTextField crediCard,
			JComboBox month, JComboBox year, JTextField CCV, JButton registerBtn, JTextField userName, JTextField password) {
	
	this.cc=cc;
	this.fName=fName;
	this.lName=lName;
	this.email=email;
	this.address=address;
	this.postalCode=postalCode;
	this.phoneNumber=phoneNumber;
	this.credit=crediCard;
	this.month=month;
	this.year=year;
	this.CCV=CCV;
	this.registerBtn=registerBtn;
	this.userName=userName;
	this.password=password;
	
	
	
	
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void setC(CardLayout c) {
		this.c = c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==registerBtn) {
			if(fName.getText().isEmpty() || lName.getText().isEmpty()|| email.getText().isEmpty()||address.getText().isEmpty() || postalCode.getText().isEmpty() ||phoneNumber.getText().isEmpty() ||credit.getText().isEmpty() || userName.getText().isEmpty() || password.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Fill in all info");
			}
			else {
				if (cc.getHub().getRegUsers().checkPassword(userName.getText(), password.getText())) {
					JOptionPane.showMessageDialog(null, "This username is already taken!!");
					userName.setText("");
					password.setText("");
				}
				else {
				RegisteredUser temp =new RegisteredUser(userName.getText(), password.getText(), credit.getText(), fName.getText(), lName.getText(), postalCode.getText(), address.getText(), email.getText());
				
				cc.getHub().getRegUsers().addUser(temp);
				JOptionPane.showMessageDialog(null, "Thank you for registering "+fName.getText()+"\n Your card will be a $20.00 annual account fee ");
				c.show(panel, "Browse");
				
				}
			}
			
			
		}
		
	}

}
