package view;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Observer;

public class RegesterPanel extends JPanel {
private JTextField regUserName;
private JTextField regPassword;
private JTextField regAddress;
private JTextField regPhone;
private JTextField regEmail;
private JTextField regCreditCard;
private Observer mc;
private JPanel panel;
private CardLayout c;

public RegesterPanel(Observer mc) {
	this.mc=mc;
	GridBagLayout gbl_regesterPanel = new GridBagLayout();
	gbl_regesterPanel.columnWidths = new int[]{88, 136, 97, 0};
	gbl_regesterPanel.rowHeights = new int[]{16, 16, 16, 16, 16, 1, 16, 25, 0};
	gbl_regesterPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_regesterPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	setLayout(gbl_regesterPanel);
	
	JLabel lblNewLabel_1 = new JLabel("User Name");
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_1.gridx = 1;
	gbc_lblNewLabel_1.gridy = 0;
	add(lblNewLabel_1, gbc_lblNewLabel_1);
	
	regUserName = new JTextField();
	GridBagConstraints gbc_regUserName = new GridBagConstraints();
	gbc_regUserName.anchor = GridBagConstraints.WEST;
	gbc_regUserName.insets = new Insets(0, 0, 5, 0);
	gbc_regUserName.gridx = 2;
	gbc_regUserName.gridy = 0;
	add(regUserName, gbc_regUserName);
	regUserName.setColumns(10);
	
	JLabel lblPassword = new JLabel("Password");
	GridBagConstraints gbc_lblPassword = new GridBagConstraints();
	gbc_lblPassword.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
	gbc_lblPassword.gridx = 1;
	gbc_lblPassword.gridy = 1;
	add(lblPassword, gbc_lblPassword);
	
	regPassword = new JTextField();
	regPassword.setColumns(10);
	GridBagConstraints gbc_regPassword = new GridBagConstraints();
	gbc_regPassword.anchor = GridBagConstraints.WEST;
	gbc_regPassword.insets = new Insets(0, 0, 5, 0);
	gbc_regPassword.gridx = 2;
	gbc_regPassword.gridy = 1;
	add(regPassword, gbc_regPassword);
	
	JLabel lblAddress = new JLabel("Address");
	GridBagConstraints gbc_lblAddress = new GridBagConstraints();
	gbc_lblAddress.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
	gbc_lblAddress.gridx = 1;
	gbc_lblAddress.gridy = 2;
	add(lblAddress, gbc_lblAddress);
	
	regAddress = new JTextField();
	regAddress.setColumns(10);
	GridBagConstraints gbc_regAddress = new GridBagConstraints();
	gbc_regAddress.anchor = GridBagConstraints.WEST;
	gbc_regAddress.insets = new Insets(0, 0, 5, 0);
	gbc_regAddress.gridx = 2;
	gbc_regAddress.gridy = 2;
	add(regAddress, gbc_regAddress);
	
	JLabel lblPhoneNumber = new JLabel("Phone Number");
	GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
	gbc_lblPhoneNumber.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
	gbc_lblPhoneNumber.gridx = 1;
	gbc_lblPhoneNumber.gridy = 3;
	add(lblPhoneNumber, gbc_lblPhoneNumber);
	
	regPhone = new JTextField();
	regPhone.setColumns(10);
	GridBagConstraints gbc_regPhone = new GridBagConstraints();
	gbc_regPhone.anchor = GridBagConstraints.WEST;
	gbc_regPhone.insets = new Insets(0, 0, 5, 0);
	gbc_regPhone.gridx = 2;
	gbc_regPhone.gridy = 3;
	add(regPhone, gbc_regPhone);
	
	JLabel lblEmailAddress = new JLabel("email address");
	GridBagConstraints gbc_lblEmailAddress = new GridBagConstraints();
	gbc_lblEmailAddress.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblEmailAddress.insets = new Insets(0, 0, 5, 5);
	gbc_lblEmailAddress.gridx = 1;
	gbc_lblEmailAddress.gridy = 4;
	add(lblEmailAddress, gbc_lblEmailAddress);
	
	regEmail = new JTextField();
	regEmail.setColumns(10);
	GridBagConstraints gbc_regEmail = new GridBagConstraints();
	gbc_regEmail.anchor = GridBagConstraints.WEST;
	gbc_regEmail.insets = new Insets(0, 0, 5, 0);
	gbc_regEmail.gridx = 2;
	gbc_regEmail.gridy = 4;
	add(regEmail, gbc_regEmail);
	
	Box verticalBox = Box.createVerticalBox();
	GridBagConstraints gbc_verticalBox = new GridBagConstraints();
	gbc_verticalBox.anchor = GridBagConstraints.NORTHWEST;
	gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
	gbc_verticalBox.gridx = 1;
	gbc_verticalBox.gridy = 5;
	add(verticalBox, gbc_verticalBox);
	
	JLabel lblCreditCardInfo = new JLabel("Credit Card info");
	GridBagConstraints gbc_lblCreditCardInfo = new GridBagConstraints();
	gbc_lblCreditCardInfo.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblCreditCardInfo.insets = new Insets(0, 0, 5, 5);
	gbc_lblCreditCardInfo.gridx = 1;
	gbc_lblCreditCardInfo.gridy = 6;
	add(lblCreditCardInfo, gbc_lblCreditCardInfo);
	
	regCreditCard = new JTextField();
	regCreditCard.setColumns(10);
	GridBagConstraints gbc_regCreditCard = new GridBagConstraints();
	gbc_regCreditCard.anchor = GridBagConstraints.WEST;
	gbc_regCreditCard.insets = new Insets(0, 0, 5, 0);
	gbc_regCreditCard.gridx = 2;
	gbc_regCreditCard.gridy = 6;
	add(regCreditCard, gbc_regCreditCard);
	
	JButton regesterBtn = new JButton("Regester");
	GridBagConstraints gbc_regesterBtn = new GridBagConstraints();
	gbc_regesterBtn.anchor = GridBagConstraints.NORTH;
	gbc_regesterBtn.fill = GridBagConstraints.HORIZONTAL;
	gbc_regesterBtn.gridx = 2;
	gbc_regesterBtn.gridy = 7;
	add(regesterBtn, gbc_regesterBtn);
}
}
