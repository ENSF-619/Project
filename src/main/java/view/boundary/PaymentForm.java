package view.boundary;

/**
 * ENSF 619 Group Project
 * This bounday is the payment form view which allows program users to enter
 * payment information
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
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import model.Seat;
import model.Showtime;
import view.controllers.PaymentController;

public class PaymentForm extends JPanel {
private JTextField ticketID;
private JTextField movieName;
private JTextField theaterName;
private JTextField showTimeField;
private JTextField seatSelected;
private JTextField firstName;
private JTextField lastName;
private JTextField Email;
private JTextField creditCardNum;
private JComboBox monthComboBox;
private JComboBox yearComboBox;
private JTextField CCV;
private JButton purchaseBtn;
private PaymentController controller;
private JTextField theatreAddress;
private JTextField total;
private JTextField voucherID;

public PaymentForm(CinemaController cc, Observer observer, Showtime showTime, ArrayList<Seat> selectedSeats, CardLayout c, JPanel panel) {
	setBackground(SystemColor.inactiveCaption);
	
	GridBagLayout gbl_purchasePanel = new GridBagLayout();
	gbl_purchasePanel.columnWidths = new int[]{56, 12, 3, 84, 57, 283, 195, 0};
	gbl_purchasePanel.rowHeights = new int[]{36, 22, 22, 22, 44, 22, 44, 22, 41, 36, 22, 22, 33, 22, 39, 22, 22, 25, 0, 0, 0};
	gbl_purchasePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_purchasePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	setLayout(gbl_purchasePanel);
	
	JLabel lblNewLabel_1 = new JLabel("Ticket Info");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
	gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_1.gridwidth = 5;
	gbc_lblNewLabel_1.gridx = 0;
	gbc_lblNewLabel_1.gridy = 0;
	add(lblNewLabel_1, gbc_lblNewLabel_1);
	
	JLabel lblTicketid = new JLabel("TicketID");
	GridBagConstraints gbc_lblTicketid = new GridBagConstraints();
	gbc_lblTicketid.anchor = GridBagConstraints.NORTH;
	gbc_lblTicketid.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblTicketid.insets = new Insets(0, 0, 5, 5);
	gbc_lblTicketid.gridwidth = 2;
	gbc_lblTicketid.gridx = 0;
	gbc_lblTicketid.gridy = 1;
	add(lblTicketid, gbc_lblTicketid);
	
	ticketID = new JTextField();
	ticketID.setEditable(false);
	GridBagConstraints gbc_ticketID = new GridBagConstraints();
	gbc_ticketID.anchor = GridBagConstraints.NORTHEAST;
	gbc_ticketID.insets = new Insets(0, 0, 5, 5);
	gbc_ticketID.gridx = 3;
	gbc_ticketID.gridy = 1;
	add(ticketID, gbc_ticketID);
	ticketID.setColumns(25);
	
	JLabel lblNewLabel_2 = new JLabel("Movie Name");
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2.gridwidth = 2;
	gbc_lblNewLabel_2.gridx = 0;
	gbc_lblNewLabel_2.gridy = 2;
	add(lblNewLabel_2, gbc_lblNewLabel_2);
	
	movieName = new JTextField();
	movieName.setEditable(false);
	movieName.setColumns(25);
	GridBagConstraints gbc_movieName = new GridBagConstraints();
	gbc_movieName.anchor = GridBagConstraints.NORTHWEST;
	gbc_movieName.insets = new Insets(0, 0, 5, 5);
	gbc_movieName.gridwidth = 3;
	gbc_movieName.gridx = 3;
	gbc_movieName.gridy = 2;
	add(movieName, gbc_movieName);
	
	JLabel lblNewLabel_3 = new JLabel("Theater");
	GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
	gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_3.gridx = 0;
	gbc_lblNewLabel_3.gridy = 3;
	add(lblNewLabel_3, gbc_lblNewLabel_3);
	
	theaterName = new JTextField();
	theaterName.setEditable(false);
	theaterName.setColumns(25);
	GridBagConstraints gbc_theaterName = new GridBagConstraints();
	gbc_theaterName.anchor = GridBagConstraints.NORTHWEST;
	gbc_theaterName.insets = new Insets(0, 0, 5, 5);
	gbc_theaterName.gridwidth = 2;
	gbc_theaterName.gridx = 3;
	gbc_theaterName.gridy = 3;
	add(theaterName, gbc_theaterName);
	
	JLabel lblNewLabel_4 = new JLabel("ShowTime");
	GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
	gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_4.gridwidth = 2;
	gbc_lblNewLabel_4.gridx = 0;
	gbc_lblNewLabel_4.gridy = 5;
	add(lblNewLabel_4, gbc_lblNewLabel_4);
	
	showTimeField = new JTextField();
	showTimeField.setEditable(false);
	showTimeField.setColumns(25);
	GridBagConstraints gbc_showTime = new GridBagConstraints();
	gbc_showTime.anchor = GridBagConstraints.NORTHWEST;
	gbc_showTime.insets = new Insets(0, 0, 5, 5);
	gbc_showTime.gridwidth = 2;
	gbc_showTime.gridx = 3;
	gbc_showTime.gridy = 5;
	add(showTimeField, gbc_showTime);
	
	JLabel lblNewLabel_5 = new JLabel("Seats");
	GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
	gbc_lblNewLabel_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_5.gridx = 0;
	gbc_lblNewLabel_5.gridy = 7;
	add(lblNewLabel_5, gbc_lblNewLabel_5);
	
	seatSelected = new JTextField();
	seatSelected.setEditable(false);
	seatSelected.setColumns(25);
	GridBagConstraints gbc_seatSelected = new GridBagConstraints();
	gbc_seatSelected.anchor = GridBagConstraints.NORTHWEST;
	gbc_seatSelected.insets = new Insets(0, 0, 5, 5);
	gbc_seatSelected.gridwidth = 2;
	gbc_seatSelected.gridx = 3;
	gbc_seatSelected.gridy = 7;
	add(seatSelected, gbc_seatSelected);
	
	JLabel lblPaymentInfo = new JLabel("Payment Info");
	lblPaymentInfo.setFont(new Font("Tahoma", Font.PLAIN, 22));
	GridBagConstraints gbc_lblPaymentInfo = new GridBagConstraints();
	gbc_lblPaymentInfo.fill = GridBagConstraints.BOTH;
	gbc_lblPaymentInfo.insets = new Insets(0, 0, 5, 5);
	gbc_lblPaymentInfo.gridwidth = 5;
	gbc_lblPaymentInfo.gridx = 0;
	gbc_lblPaymentInfo.gridy = 9;
	add(lblPaymentInfo, gbc_lblPaymentInfo);
	
	JLabel lblFirstName = new JLabel("First Name");
	GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
	gbc_lblFirstName.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
	gbc_lblFirstName.gridwidth = 2;
	gbc_lblFirstName.gridx = 0;
	gbc_lblFirstName.gridy = 10;
	add(lblFirstName, gbc_lblFirstName);
	
	firstName = new JTextField();
	firstName.setColumns(25);
	GridBagConstraints gbc_firstName = new GridBagConstraints();
	gbc_firstName.anchor = GridBagConstraints.NORTHWEST;
	gbc_firstName.insets = new Insets(0, 0, 5, 5);
	gbc_firstName.gridx = 3;
	gbc_firstName.gridy = 10;
	add(firstName, gbc_firstName);
	
	JLabel lblLastName = new JLabel("Last Name");
	GridBagConstraints gbc_lblLastName = new GridBagConstraints();
	gbc_lblLastName.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
	gbc_lblLastName.gridwidth = 2;
	gbc_lblLastName.gridx = 0;
	gbc_lblLastName.gridy = 11;
	add(lblLastName, gbc_lblLastName);
	
	lastName = new JTextField();
	lastName.setColumns(25);
	GridBagConstraints gbc_lastName = new GridBagConstraints();
	gbc_lastName.anchor = GridBagConstraints.NORTHWEST;
	gbc_lastName.insets = new Insets(0, 0, 5, 5);
	gbc_lastName.gridx = 3;
	gbc_lastName.gridy = 11;
	add(lastName, gbc_lastName);
	
	JLabel lblEmail = new JLabel("Email");
	GridBagConstraints gbc_lblEmail = new GridBagConstraints();
	gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
	gbc_lblEmail.gridwidth = 2;
	gbc_lblEmail.gridx = 0;
	gbc_lblEmail.gridy = 13;
	add(lblEmail, gbc_lblEmail);
	
	Email = new JTextField();
	Email.setColumns(25);
	GridBagConstraints gbc_Email = new GridBagConstraints();
	gbc_Email.anchor = GridBagConstraints.NORTHWEST;
	gbc_Email.insets = new Insets(0, 0, 5, 5);
	gbc_Email.gridx = 3;
	gbc_Email.gridy = 13;
	add(Email, gbc_Email);
	
	JLabel lblCreditCardNumber = new JLabel("Card #");
	GridBagConstraints gbc_lblCreditCardNumber = new GridBagConstraints();
	gbc_lblCreditCardNumber.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblCreditCardNumber.insets = new Insets(0, 0, 5, 5);
	gbc_lblCreditCardNumber.gridwidth = 4;
	gbc_lblCreditCardNumber.gridx = 0;
	gbc_lblCreditCardNumber.gridy = 15;
	add(lblCreditCardNumber, gbc_lblCreditCardNumber);
	
	creditCardNum = new JTextField();
	creditCardNum.setColumns(25);
	GridBagConstraints gbc_creditCardNum = new GridBagConstraints();
	gbc_creditCardNum.anchor = GridBagConstraints.NORTHEAST;
	gbc_creditCardNum.insets = new Insets(0, 0, 5, 5);
	gbc_creditCardNum.gridx = 3;
	gbc_creditCardNum.gridy = 15;
	add(creditCardNum, gbc_creditCardNum);
	
	JLabel lblExpireDate = new JLabel("Expire Date");
	GridBagConstraints gbc_lblExpireDate = new GridBagConstraints();
	gbc_lblExpireDate.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblExpireDate.insets = new Insets(0, 0, 5, 5);
	gbc_lblExpireDate.gridwidth = 2;
	gbc_lblExpireDate.gridx = 0;
	gbc_lblExpireDate.gridy = 16;
	add(lblExpireDate, gbc_lblExpireDate);
	
	 monthComboBox = new JComboBox();
	monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
	monthComboBox.setSelectedIndex(0);
	GridBagConstraints gbc_monthComboBox = new GridBagConstraints();
	gbc_monthComboBox.anchor = GridBagConstraints.NORTH;
	gbc_monthComboBox.fill = GridBagConstraints.HORIZONTAL;
	gbc_monthComboBox.insets = new Insets(0, 0, 5, 5);
	gbc_monthComboBox.gridx = 3;
	gbc_monthComboBox.gridy = 16;
	add(monthComboBox, gbc_monthComboBox);
	
	yearComboBox = new JComboBox();
	yearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "2020", "2021", "2022", "2023", "2024"}));
	GridBagConstraints gbc_yearComboBox = new GridBagConstraints();
	gbc_yearComboBox.anchor = GridBagConstraints.NORTHWEST;
	gbc_yearComboBox.insets = new Insets(0, 0, 5, 5);
	gbc_yearComboBox.gridx = 4;
	gbc_yearComboBox.gridy = 16;
	add(yearComboBox, gbc_yearComboBox);
	
	JLabel lblCcv = new JLabel("CCV");
	GridBagConstraints gbc_lblCcv = new GridBagConstraints();
	gbc_lblCcv.fill = GridBagConstraints.HORIZONTAL;
	gbc_lblCcv.insets = new Insets(0, 0, 5, 5);
	gbc_lblCcv.gridx = 0;
	gbc_lblCcv.gridy = 17;
	add(lblCcv, gbc_lblCcv);
	
	CCV = new JTextField();
	CCV.setColumns(3);
	GridBagConstraints gbc_CCV = new GridBagConstraints();
	gbc_CCV.fill = GridBagConstraints.HORIZONTAL;
	gbc_CCV.insets = new Insets(0, 0, 5, 5);
	gbc_CCV.gridx = 3;
	gbc_CCV.gridy = 17;
	add(CCV, gbc_CCV);
	
	theatreAddress = new JTextField();
	theatreAddress.setEditable(false);
	theatreAddress.setColumns(25);
	GridBagConstraints gbc_theatreAddress = new GridBagConstraints();
	gbc_theatreAddress.anchor = GridBagConstraints.WEST;
	gbc_theatreAddress.insets = new Insets(0, 0, 5, 5);
	gbc_theatreAddress.gridx = 3;
	gbc_theatreAddress.gridy = 4;
	add(theatreAddress, gbc_theatreAddress);
	
	 purchaseBtn = new JButton("Purchase");
	GridBagConstraints gbc_purchaseBtn = new GridBagConstraints();
	gbc_purchaseBtn.insets = new Insets(0, 0, 0, 5);
	gbc_purchaseBtn.anchor = GridBagConstraints.NORTH;
	gbc_purchaseBtn.fill = GridBagConstraints.HORIZONTAL;
	gbc_purchaseBtn.gridx = 3;
	gbc_purchaseBtn.gridy = 19;
	add(purchaseBtn, gbc_purchaseBtn);
	

	JLabel lblTotal = new JLabel("Total");
	GridBagConstraints gbc_lblTotal = new GridBagConstraints();
	gbc_lblTotal.anchor = GridBagConstraints.WEST;
	gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
	gbc_lblTotal.gridx = 0;
	gbc_lblTotal.gridy = 8;
	add(lblTotal, gbc_lblTotal);
	
	total = new JTextField();
	total.setColumns(10);
	GridBagConstraints gbc_total = new GridBagConstraints();
	gbc_total.anchor = GridBagConstraints.WEST;
	gbc_total.insets = new Insets(0, 0, 5, 5);
	gbc_total.gridx = 3;
	gbc_total.gridy = 8;
	add(total, gbc_total);
	JLabel lblVoucher = new JLabel("Voucher");
	GridBagConstraints gbc_lblVoucher = new GridBagConstraints();
	gbc_lblVoucher.insets = new Insets(0, 0, 5, 5);
	gbc_lblVoucher.anchor = GridBagConstraints.EAST;
	gbc_lblVoucher.gridx = 4;
	gbc_lblVoucher.gridy = 8;
	add(lblVoucher, gbc_lblVoucher);
	
	voucherID = new JTextField();
	voucherID.setColumns(10);
	GridBagConstraints gbc_voucherID = new GridBagConstraints();
	gbc_voucherID.anchor = GridBagConstraints.WEST;
	gbc_voucherID.insets = new Insets(0, 0, 5, 5);
	gbc_voucherID.gridx = 5;
	gbc_voucherID.gridy = 8;
	add(voucherID, gbc_voucherID);
	
	controller=new PaymentController(cc,observer,showTime,selectedSeats,c,panel,ticketID
			,movieName,theaterName,theatreAddress,showTimeField,seatSelected,firstName,lastName,Email,creditCardNum,monthComboBox,
			yearComboBox,CCV,purchaseBtn,total,voucherID);
	
	purchaseBtn.addActionListener(controller);
}

	
	
}
