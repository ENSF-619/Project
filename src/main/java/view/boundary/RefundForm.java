package view.boundary;

/**
 * ENSF 619 Group Project
 * RefunDForm is the boundary whichallows users to fill
 * refund information to allow for ticket cancellation.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.awt.CardLayout;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import view.controllers.RefundController;

public class RefundForm extends JPanel{

	private JTextField ticketID;
	private JTextField creditNum;
	private JButton refundBtn;
	private JComboBox month;
	private JComboBox year;
	private JTextField CCV;
	private JTextField fName;
	private JTextField lName;
	private RefundController controller;

	public RefundForm (CinemaController cc ,Observer observer) {
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Ticket ID");
		lblNewLabel_6.setBounds(50, 49, 56, 16);
		add(lblNewLabel_6);
		
		ticketID = new JTextField();
		ticketID.setBounds(148, 46, 116, 22);
		add(ticketID);
		ticketID.setColumns(10);
		
		JLabel lblCreditcardNumber = new JLabel("CreditCard Number");
		lblCreditcardNumber.setBounds(12, 91, 110, 16);
		add(lblCreditcardNumber);
		
		creditNum = new JTextField();
		creditNum.setColumns(25);
		creditNum.setBounds(148, 88, 116, 22);
		add(creditNum);
		
		refundBtn = new JButton("Refund");
		refundBtn.setBounds(206, 312, 97, 25);
		add(refundBtn);
		
		JLabel lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(12, 137, 110, 16);
		add(lblExpiryDate);
		
		 month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		month.setSelectedIndex(0);
		month.setBounds(134, 134, 62, 22);
		add(month);
		
		 year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"Year", "2020", "2021", "2022", "2023"}));
		year.setSelectedIndex(0);
		year.setBounds(206, 134, 62, 22);
		add(year);
		
		JLabel lblCcv_1 = new JLabel("CCV");
		lblCcv_1.setBounds(12, 180, 110, 16);
		add(lblCcv_1);
		
		CCV = new JTextField();
		CCV.setColumns(10);
		CCV.setBounds(148, 169, 116, 22);
		add(CCV);
		
		JLabel Fname = new JLabel("First Name");
		Fname.setBounds(12, 226, 110, 16);
		add(Fname);
		
		fName = new JTextField();
		fName.setColumns(10);
		fName.setBounds(148, 223, 116, 22);
		add(fName);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setBounds(12, 267, 110, 16);
		add(lblLastName_1);
		
		lName = new JTextField();
		lName.setColumns(10);
		lName.setBounds(148, 264, 116, 22);
		add(lName);
		controller=new RefundController(cc,observer,ticketID,creditNum,month,year,CCV,fName,lName,refundBtn);
	refundBtn.addActionListener(controller);
	
	}
	public void setC(CardLayout c) {
		this.controller.setC(c);
	}

	public void setPanel(JPanel panel) {
		this.controller.setPanel(panel);
	}
	public void populateFields() {
		this.controller.populateFields();
	}
}
