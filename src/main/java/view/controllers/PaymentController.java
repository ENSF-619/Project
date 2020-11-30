package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import model.RegisteredUser;
import model.Seat;
import model.Showtime;
import model.Ticket;
import model.Voucher;
import view.boundary.Observer;

public class PaymentController implements ActionListener {

	private CinemaController cc;
	private Observer observer;
	private Showtime showTime;
	private ArrayList<Seat> selectedSeats;
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
	private JTextField ticketID;
	int ticketNum;
	private JTextField theatreAdress;
	private JTextField total;
	private JTextField voucherID;

	public PaymentController(CinemaController cc, Observer observer, Showtime showTime, ArrayList<Seat> selectedSeats,
			CardLayout c, JPanel panel, JTextField ticketID, JTextField movieName, JTextField theaterName,
			JTextField theaterAddress, JTextField showTimeField, JTextField seatSelected, JTextField firstName,
			JTextField lastName, JTextField email, JTextField creditCardNum, JComboBox monthComboBox,
			JComboBox yearComboBox, JTextField CCV, JButton purchaseBtn, JTextField total, JTextField voucherID) {

		this.cc = cc;
		this.observer = observer;
		this.showTime = showTime;
		this.selectedSeats = selectedSeats;
		this.c = c;
		this.panel = panel;
		this.movieName = movieName;
		this.theatreName = theaterName;
		this.showTimeField = showTimeField;
		this.seatField = seatSelected;
		this.fName = firstName;
		this.lName = lastName;
		this.email = email;
		this.credit = creditCardNum;
		this.month = monthComboBox;
		this.year = yearComboBox;
		this.ccv = CCV;
		this.purchaseBtn = purchaseBtn;
		this.ticketID = ticketID;
		this.theatreAdress = theaterAddress;
		this.total = total;
		this.voucherID = voucherID;
		voucherID.setText("");
		populateFields();
	}

	private void populateFields() {

		movieName.setText(showTime.getMovie().getMovieName());
		theatreName.setText(showTime.getTheatre().getTheatreName());
		theatreAdress.setText(showTime.getTheatre().getTheatreAddress());
		showTimeField.setText(showTime.getdateTime());
		StringBuffer sb = new StringBuffer();
		double price = 0;
		for (int i = 0; i < selectedSeats.size(); i++) {
			sb.append(selectedSeats.get(i).getPosition() + " ");
			price += selectedSeats.get(i).getPrice();
		}
		seatField.setText(sb.toString());
		if (observer.loginStatus()) {
			
			RegisteredUser temp = cc.getHub().getRegUsers().getUser(observer.getUserName(), observer.getPassword());
			fName.setText(temp.getFname());
			lName.setText(temp.getLname());
			email.setText(temp.getEmail());
			credit.setText(temp.getCreditCard());
		}

		total.setText(price + "");

	}

//TODO change this method
	public int generateCustomerID() {
		Random r = new Random(System.currentTimeMillis());
		return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == purchaseBtn) {
			if (voucherID.getText().length() == 0) {
				if (fName.getText().isEmpty() || lName.getText().isEmpty() || email.getText().isEmpty()
						|| credit.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fill in information");
				} else {

					for (int i = 0; i < selectedSeats.size(); i++) {
						ticketNum = generateCustomerID();
						System.err.println(ticketNum);
						Ticket ticket = new Ticket(ticketNum, selectedSeats.get(i).getPrice(),
								new Date(System.currentTimeMillis()) + "", showTime.getShowtimeId(),
								selectedSeats.get(i).getPosition());

						cc.getHub().getTickets().addTicket(ticket);

						showTime.getSeatById(selectedSeats.get(i).getPosition()).setStatus(false);
					}
					System.err.println(cc.getHub().getTickets().toString());
					JOptionPane.showMessageDialog(null, "Confirmation has been sent to " + email.getText());
					c.show(panel, "Browse");
				}
			} else {
				int id = Integer.parseInt(voucherID.getText());
				Voucher temp = cc.getHub().getVouchers().getVoucher(id);
				if (temp == null) {
					voucherID.setText("");
					JOptionPane.showMessageDialog(null, "Voucher not valid");
				} else {
					double voucherAmount = temp.getVoucherAmmount();
					double before = Double.parseDouble(total.getText());
					if (before >= voucherAmount) {
						total.setText((before - temp.getVoucherAmmount()) + "");
						cc.getHub().getVouchers().removeVoucher(temp);
						JOptionPane.showMessageDialog(null,
								"Your voucher is valid!! Confirmation has been sent to " + email.getText());
						for (int i = 0; i < selectedSeats.size(); i++) {
							ticketNum = generateCustomerID();
							Ticket ticket = new Ticket(ticketNum, selectedSeats.get(i).getPrice(),
									new Date(System.currentTimeMillis()) + "", showTime.getShowtimeId(),
									selectedSeats.get(i).getPosition());

							cc.getHub().getTickets().addTicket(ticket);

							showTime.getSeatById(selectedSeats.get(i).getPosition()).setStatus(false);
						}
						c.show(panel, "Browse");
					} else {
						total.setText(0 + "");
						cc.getHub().getVouchers().getVoucher(id).setVoucherAmmount(voucherAmount - before);
						JOptionPane.showMessageDialog(null,
								"Your voucher is valid!! Confirmation has been sent to " + email.getText());
						for (int i = 0; i < selectedSeats.size(); i++) {
							ticketNum = generateCustomerID();
							System.err.println(ticketNum);
							Ticket ticket = new Ticket(ticketNum, selectedSeats.get(i).getPrice(),
									new Date(System.currentTimeMillis()) + "", showTime.getShowtimeId(),
									selectedSeats.get(i).getPosition());

							cc.getHub().getTickets().addTicket(ticket);

							showTime.getSeatById(selectedSeats.get(i).getPosition()).setStatus(false);
						}
						c.show(panel, "Browse");
					}

				}

			}
		}

	}
}
