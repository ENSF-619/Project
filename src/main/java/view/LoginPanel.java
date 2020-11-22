package view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Observer;

public class LoginPanel extends JPanel{
private JTextField loginUserName;
private JTextField loginPassword;
private Observer mc;
private CardLayout c;
private JPanel panel;

public LoginPanel(Observer mc) {
	this.mc=mc;
	GridBagLayout gbl_login = new GridBagLayout();
	gbl_login.columnWidths = new int[]{209, 102, 0, 0};
	gbl_login.rowHeights = new int[]{75, 16, 16, 0, 0, 0};
	gbl_login.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_login.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	setLayout(gbl_login);
	
	JLabel lblNewLabel_2 = new JLabel("User Name");
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2.gridx = 1;
	gbc_lblNewLabel_2.gridy = 1;
    add(lblNewLabel_2, gbc_lblNewLabel_2);
	
	loginUserName = new JTextField();
	loginUserName.setMaximumSize(new Dimension(30, 2147483647));
	GridBagConstraints gbc_loginUserName = new GridBagConstraints();
	gbc_loginUserName.anchor = GridBagConstraints.WEST;
	gbc_loginUserName.insets = new Insets(0, 0, 5, 0);
	gbc_loginUserName.gridx = 2;
	gbc_loginUserName.gridy = 1;
	add(loginUserName, gbc_loginUserName);
	loginUserName.setColumns(10);
	
	JLabel lblPassword_1 = new JLabel("Password");
	GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
	gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblPassword_1.anchor = GridBagConstraints.NORTHEAST;
	gbc_lblPassword_1.gridx = 1;
	gbc_lblPassword_1.gridy = 2;
	add(lblPassword_1, gbc_lblPassword_1);
	
	loginPassword = new JTextField();
	loginPassword.setMaximumSize(new Dimension(30, 2147483647));
	loginPassword.setColumns(10);
	GridBagConstraints gbc_loginPassword = new GridBagConstraints();
	gbc_loginPassword.insets = new Insets(0, 0, 5, 0);
	gbc_loginPassword.anchor = GridBagConstraints.WEST;
	gbc_loginPassword.gridx = 2;
	gbc_loginPassword.gridy = 2;
	add(loginPassword, gbc_loginPassword);
	
	JButton loginBtn = new JButton("Login");
	GridBagConstraints gbc_loginBtn = new GridBagConstraints();
	gbc_loginBtn.anchor = GridBagConstraints.WEST;
	gbc_loginBtn.gridx = 2;
	gbc_loginBtn.gridy = 4;
	add(loginBtn, gbc_loginBtn);
}
}
