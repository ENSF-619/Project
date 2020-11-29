package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.CinemaController;
import model.Seat;
import model.Showtime;
import view.boundary.Observer;
import view.boundary.PaymentForm;

public class SeatController implements ActionListener {

	private CinemaController cc;
	private Observer observer;
	private Showtime showTime;
	private ArrayList<JButton> seats;
	private JButton select;
	ArrayList<Seat>selectedSeats;
	private CardLayout c;
	private JPanel panel;
	private ArrayList<Seat> allSeats;

	public SeatController(CinemaController cc, Observer observer, Showtime showTime, ArrayList<JButton> seats, JButton select, CardLayout c, JPanel panel) {
	this.cc=cc;
	this.observer=observer;
	this.showTime=showTime;
	this.seats=seats;
	this.select=select;
	this.c=c;
	this.panel=panel;
	allSeats=showTime.getSeats();
	availableSeats();
	}
	/**
	 * shows all available seats
	 */
	private void availableSeats() {
		
		for(int i=0; i<allSeats.size();i++) {
			String position=allSeats.get(i).getPosition();
			boolean status=allSeats.get(i).isStatus();
			for(int j=0; i<seats.size();i++) {
				if(seats.get(i).getName().equals(position)) {
					seats.get(i).setVisible(status);
				}
				
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0 ;i<seats.size() ;i++) {
			if(e.getSource()==seats.get(i)) {
				seats.get(i).setVisible(false);
				String position=seats.get(i).getName();

				for(int j=0; j<allSeats.size();j++) {
					if(allSeats.get(i).getPosition().equals(position)) {
						selectedSeats.add(allSeats.get(i));
			}
		}
		if (e.getSource()==select) {
			PaymentForm form=new PaymentForm(cc,observer,showTime,selectedSeats,c,panel);
			panel.add(form, "PaymentForm");
			
		}
		
	}

}}}
