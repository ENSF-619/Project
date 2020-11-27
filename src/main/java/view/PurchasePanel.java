package view;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Observer;

public class PurchasePanel extends JPanel{

	private JTextField fname;
	private JTextField lname;
	private JTextField email;
	private JTextField credit;
	private Observer mc;
	private CardLayout c;
	private JPanel panel;

	public PurchasePanel(Observer mc) {
		this.mc=mc;
		
		setLayout(null);
		
		JLabel moviePurchase = new JLabel("Movie");
		moviePurchase.setBounds(12, 13, 56, 16);
		add(moviePurchase);
		
		JLabel theaterNamePurchase = new JLabel("Theater");
		theaterNamePurchase.setBounds(12, 42, 56, 16);
		add(theaterNamePurchase);
		
		JLabel addressPurchase = new JLabel("Theater Address");
		addressPurchase.setBounds(12, 70, 109, 16);
		add(addressPurchase);
		
		JLabel showTimePurchase = new JLabel("ShowTime");
		showTimePurchase.setBounds(12, 101, 109, 16);
		add(showTimePurchase);
		
		JLabel auditoriumPurchase = new JLabel("Auditorium");
		auditoriumPurchase.setBounds(12, 130, 109, 16);
		add(auditoriumPurchase);
		
		JLabel seatPurchase = new JLabel("Seat ");
		seatPurchase.setBounds(12, 159, 109, 16);
		add(seatPurchase);
		
		JLabel fNamePurchase = new JLabel("First Name");
		fNamePurchase.setBounds(258, 13, 109, 16);
		add(fNamePurchase);
		
		JLabel lNamePurchase = new JLabel("Last Name");
		lNamePurchase.setBounds(258, 42, 109, 16);
		add(lNamePurchase);
		
		JLabel emailPurchase = new JLabel("Email ");
		emailPurchase.setBounds(258, 70, 109, 16);
		add(emailPurchase);
		
		JLabel creditCard = new JLabel("Credit Card");
		creditCard.setBounds(258, 101, 109, 16);
		add(creditCard);
		
		fname = new JTextField();
		fname.setBounds(350, 10, 116, 22);
		add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(350, 39, 116, 22);
		add(lname);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(350, 70, 116, 22);
		add(email);
		
		credit = new JTextField();
		credit.setColumns(10);
		credit.setBounds(350, 98, 116, 22);
		add(credit);
		
		JButton purchaseBtn = new JButton("Purchase");
		purchaseBtn.setBounds(299, 174, 97, 25);
		add(purchaseBtn);
	}
}
