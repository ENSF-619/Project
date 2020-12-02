package view.boundary;
/**
 * ENSF 619 Group Project
 * This boundary allows users to create registed accounts by filling in payment 
 * information and creating their username and password.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import view.controllers.RegistrationController;

public class RegistrationForm extends JPanel{

	private JTextField fName;
	private JTextField lName;
	private JTextField email;
	private JTextField address;
	private JTextField postalCode;
	private JTextField phoneNumber;
	private JTextField crediCard;
	private JComboBox month;
	private JComboBox year;
	private JTextField CCV;
	private JButton registerBtn;
	private RegistrationController controller;
	private JTextField userName;
	private JTextField password;

	public RegistrationForm(CinemaController cc) {
		setBackground(SystemColor.inactiveCaption);
		GridBagLayout gbl_registerPanel = new GridBagLayout();
		gbl_registerPanel.columnWidths = new int[]{56, 12, 0, 3, 0, 0, 140, 57, 283, 195, 0};
		gbl_registerPanel.rowHeights = new int[]{36, 22, 22, 22, 44, 22, 44, 22, 41, 0, 36, 22, 0, 22, 33, 22, 39, 22, 22, 25, 0, 0, 0};
		gbl_registerPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_registerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_registerPanel);
		
		JLabel lblUserInfo = new JLabel("User Info");
		lblUserInfo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblUserInfo = new GridBagConstraints();
		gbc_lblUserInfo.fill = GridBagConstraints.BOTH;
		gbc_lblUserInfo.gridwidth = 8;
		gbc_lblUserInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserInfo.gridx = 0;
		gbc_lblUserInfo.gridy = 0;
		add(lblUserInfo, gbc_lblUserInfo);
		
		JLabel label_7 = new JLabel("First Name");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 1;
		add(label_7, gbc_label_7);
		
		fName = new JTextField();
		fName.setColumns(10);
		GridBagConstraints gbc_fName = new GridBagConstraints();
		gbc_fName.fill = GridBagConstraints.HORIZONTAL;
		gbc_fName.anchor = GridBagConstraints.NORTH;
		gbc_fName.insets = new Insets(0, 0, 5, 5);
		gbc_fName.gridx = 1;
		gbc_fName.gridy = 1;
		add(fName, gbc_fName);
		
		JLabel label_8 = new JLabel("Last Name");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 2;
		add(label_8, gbc_label_8);
		
		lName = new JTextField();
		lName.setColumns(10);
		GridBagConstraints gbc_lName = new GridBagConstraints();
		gbc_lName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lName.anchor = GridBagConstraints.NORTH;
		gbc_lName.insets = new Insets(0, 0, 5, 5);
		gbc_lName.gridx = 1;
		gbc_lName.gridy = 2;
		add(lName, gbc_lName);
		
		JLabel label_9 = new JLabel("Email");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 3;
		add(label_9, gbc_label_9);
		
		email = new JTextField();
		email.setColumns(10);
		GridBagConstraints gbc_email = new GridBagConstraints();
		gbc_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_email.anchor = GridBagConstraints.NORTH;
		gbc_email.insets = new Insets(0, 0, 5, 5);
		gbc_email.gridx = 1;
		gbc_email.gridy = 3;
		add(email, gbc_email);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 0;
		gbc_lblAddress.gridy = 4;
		add(lblAddress, gbc_lblAddress);
		
		address = new JTextField();
		address.setColumns(10);
		GridBagConstraints gbc_address = new GridBagConstraints();
		gbc_address.insets = new Insets(0, 0, 5, 5);
		gbc_address.fill = GridBagConstraints.HORIZONTAL;
		gbc_address.gridx = 1;
		gbc_address.gridy = 4;
		add(address, gbc_address);
		
		JLabel lblPostal = new JLabel("Postal");
		GridBagConstraints gbc_lblPostal = new GridBagConstraints();
		gbc_lblPostal.anchor = GridBagConstraints.EAST;
		gbc_lblPostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPostal.gridx = 0;
		gbc_lblPostal.gridy = 5;
		add(lblPostal, gbc_lblPostal);
		
		postalCode = new JTextField();
		postalCode.setColumns(10);
		GridBagConstraints gbc_postalCode = new GridBagConstraints();
		gbc_postalCode.insets = new Insets(0, 0, 5, 5);
		gbc_postalCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_postalCode.gridx = 1;
		gbc_postalCode.gridy = 5;
		add(postalCode, gbc_postalCode);
		
		JLabel PhoneNu = new JLabel("Phone Number");
		GridBagConstraints gbc_PhoneNu = new GridBagConstraints();
		gbc_PhoneNu.anchor = GridBagConstraints.EAST;
		gbc_PhoneNu.insets = new Insets(0, 0, 5, 5);
		gbc_PhoneNu.gridx = 0;
		gbc_PhoneNu.gridy = 6;
		add(PhoneNu, gbc_PhoneNu);
		
		phoneNumber = new JTextField();
		phoneNumber.setColumns(10);
		GridBagConstraints gbc_phoneNumber = new GridBagConstraints();
		gbc_phoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_phoneNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneNumber.gridx = 1;
		gbc_phoneNumber.gridy = 6;
		add(phoneNumber, gbc_phoneNumber);
		
		JLabel label = new JLabel("Payment Info");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 8;
		add(label, gbc_label);
		
		JLabel label_10 = new JLabel("Credit Card Number");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 10;
		add(label_10, gbc_label_10);
		
		crediCard = new JTextField();
		crediCard .setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.anchor = GridBagConstraints.NORTH;
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 10;
		add(crediCard , gbc_textField_8);
		
		JLabel label_11 = new JLabel("Expire Date");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 3;
		gbc_label_11.gridy = 10;
		add(label_11, gbc_label_11);
		
		month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		month.setSelectedIndex(0);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 4;
		gbc_comboBox_1.gridy = 10;
		add(month, gbc_comboBox_1);
		
		year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"Year", "2020", "2021", "2022", "2023"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.gridx = 5;
		gbc_comboBox_2.gridy = 10;
		add(year, gbc_comboBox_2);
		
		JLabel label_12 = new JLabel("CCV");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 3;
		gbc_label_12.gridy = 11;
		add(label_12, gbc_label_12);
		
		CCV = new JTextField();
		CCV.setColumns(3);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill=GridBagConstraints.HORIZONTAL;
		gbc_textField_9.anchor = GridBagConstraints.WEST;
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 11;
		add(CCV, gbc_textField_9);
		
		registerBtn = new JButton("Register");
		GridBagConstraints gbc_registerBtn = new GridBagConstraints();
		gbc_registerBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_registerBtn.anchor = GridBagConstraints.NORTH;
		gbc_registerBtn.insets = new Insets(0, 0, 5, 5);
		gbc_registerBtn.gridx = 1;
		gbc_registerBtn.gridy = 12;
		add(registerBtn, gbc_registerBtn);
		
		JLabel lblUsername = new JLabel("UserName");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 4;
		gbc_lblUsername.gridy = 1;
		add(lblUsername, gbc_lblUsername);
		
		userName = new JTextField();
		userName.setColumns(10);
		GridBagConstraints gbc_userNameField = new GridBagConstraints();
		gbc_userNameField.insets = new Insets(0, 0, 5, 5);
		gbc_userNameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_userNameField.gridx = 5;
		gbc_userNameField.gridy = 1;
		add(userName, gbc_userNameField);
		
		JLabel lblPassword_1 = new JLabel("Password");
		GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
		gbc_lblPassword_1.anchor = GridBagConstraints.EAST;
		gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword_1.gridx = 4;
		gbc_lblPassword_1.gridy = 2;
		add(lblPassword_1, gbc_lblPassword_1);
		
		password = new JTextField();
		password.setColumns(10);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 5;
		gbc_passwordField.gridy = 2;
		add(password, gbc_passwordField);
		
		
		controller=new RegistrationController(cc,fName,lName,email,address,postalCode
				,phoneNumber,crediCard,month,year,CCV,registerBtn,userName,password);
		registerBtn.addActionListener(controller);
	}
	public void setC(CardLayout c) {
		this.controller.setC(c);
	}

	public void setPanel(JPanel panel) {
		this.controller.setPanel(panel);
	}
}
