package view;

import java.awt.CardLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Observer;

public class CancelMemberShip extends JPanel{
private JTextField cancelMemName;
private JTextField cancelMemPass;
private Observer mc;
private JPanel panel;
private CardLayout c;

public CancelMemberShip(Observer mc) {
	this.mc=mc;
	
	setBackground(SystemColor.inactiveCaption);
	setLayout(null);
	
	JLabel lblNewLabel_4 = new JLabel("User Name");
	lblNewLabel_4.setBounds(240, 70, 131, 16);
	add(lblNewLabel_4);
	
	JLabel lblPassword_2 = new JLabel("Password");
	lblPassword_2.setBounds(240, 107, 131, 16);
	add(lblPassword_2);
	
	cancelMemName = new JTextField();
	cancelMemName.setBounds(320, 67, 116, 22);
	add(cancelMemName);
	cancelMemName.setColumns(10);
	
	cancelMemPass = new JTextField();
	cancelMemPass.setColumns(10);
	cancelMemPass.setBounds(320, 107, 116, 22);
	add(cancelMemPass);
	
	JButton cancelMemBtn = new JButton("Cancel");
	cancelMemBtn.setBounds(265, 158, 97, 25);
	add(cancelMemBtn);
}
}
