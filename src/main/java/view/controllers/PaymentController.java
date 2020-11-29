package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import model.Showtime;
import view.boundary.Observer;

public class PaymentController implements ActionListener{

	private CinemaController cc;
	private Observer observer;
	private Showtime showTime;
	private ArrayList<String> selectedSeats;
	private CardLayout c;
	private JPanel panel;
	private JTextField movieName;
	private JTextField theatreName;
	private JTextField showTimeField;
	private JTextField credit;
	private JComboBox month;
	private JComboBox year;
	private JTextField ccv;
	private JButton purchaseBtn;
	private JTextField seatField;
	private JTextField fName;
	private JTextField lName;
	private JTextField email;


	public PaymentController(CinemaController cc, Observer observer, Showtime showTime, ArrayList<String> selectedSeats,
			CardLayout c, JPanel panel, JTextField movieName, JTextField theaterName, JTextField showTimeField,
			JTextField seatSelected, JTextField firstName, JTextField lastName, JTextField email,
			JTextField creditCardNum, JComboBox monthComboBox, JComboBox yearComboBox, JTextField CCV,
			JButton purchaseBtn) {
		
		
		this.cc=cc;
		this.observer=observer;
		this.showTime=showTime;
		this.selectedSeats=selectedSeats;
		this.c=c;
		this.panel=panel;
		this.movieName=movieName;
		this.theatreName=theaterName;
		this.showTimeField=showTimeField;
		this.seatField=seatSelected;
		this.fName=firstName;
		this.lName=lastName;
		this.email=email;
		this.credit=creditCardNum;
		this.month=monthComboBox;
		this.year=yearComboBox;
		this.ccv=CCV;
		this.purchaseBtn=purchaseBtn;
		populateFields();
	}
	

	private void populateFields() {
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
