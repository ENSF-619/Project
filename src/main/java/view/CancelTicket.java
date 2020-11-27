package view;

import java.awt.CardLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Observer;

public class CancelTicket extends JPanel {
private JTextField ticketNum;
private JTextField fName;
private CardLayout c;
private Observer mc;
private JPanel panel;

public CancelTicket(Observer mc) {
	this.mc=mc;
	setBackground(SystemColor.inactiveCaption);
	setLayout(null);
	
	JLabel lblNewLabel_3 = new JLabel("Ticket Number");
	lblNewLabel_3.setBounds(141, 55, 108, 16);
	add(lblNewLabel_3);
	
	ticketNum = new JTextField();
	ticketNum.setBounds(250, 52, 116, 22);
	add(ticketNum);
	ticketNum.setColumns(10);
	
	JLabel confirm = new JLabel("First Name");
	confirm.setBounds(141, 91, 108, 16);
	add(confirm);
	
	fName = new JTextField();
	fName.setColumns(10);
	fName.setBounds(250, 91, 116, 22);
	add(fName);
	
	JButton cancelTicketBtn = new JButton("Refund");
	cancelTicketBtn.setBounds(217, 143, 97, 25);
	add(cancelTicketBtn);
	
}
}
