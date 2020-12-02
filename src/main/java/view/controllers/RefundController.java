package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

public class RefundController implements ActionListener {

	private CardLayout c;
	private JPanel panel;
	private CinemaController cc;
	private Observer observer;
	private JTextField ticketID;
	private JTextField creditNum;
	private JComboBox month;
	private JComboBox year;
	private JTextField CCV;
	private JTextField lName;
	private JTextField fName;
	private JButton refundBtn;

	public RefundController(CinemaController cc, Observer observer, JTextField ticketID, JTextField creditNum,
			JComboBox month, JComboBox year, JTextField CCV, JTextField fName, JTextField lName, JButton refundBtn) {
		this.cc = cc;
		this.observer = observer;
		this.ticketID = ticketID;
		this.creditNum = creditNum;
		this.month = month;
		this.year = year;
		this.CCV = CCV;
		this.lName = lName;
		this.fName = fName;
		this.refundBtn = refundBtn;

	}

	public void setC(CardLayout c) {
		this.c = c;

	}

	public void setPanel(JPanel panel) {
		this.panel = panel;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == refundBtn) {

			if (ticketID.getText().isEmpty() || fName.getText().isEmpty() || lName.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please fill in your info");
			} else {
				int id = Integer.parseInt(ticketID.getText());
				Ticket ticket = cc.getHub().getTickets().getTicket(id);
				if (ticket == null) {
					JOptionPane.showMessageDialog(null, "Ticket not found");
				} else {
					// ticket info
					 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					    

					 LocalDateTime now = LocalDateTime.now();
					String formattedDate = now.format(dtf);
					
					int random = (int) (Math.random() * 100000);
					double amount = ticket.getPrice();
					int showTime = ticket.getShowtimeId();
					String date = cc.getHub().getShowtimes().getShowtimeById(showTime).getdateTime();
					SimpleDateFormat fort = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date d1 = null;
					try {
						d1 = fort.parse(date);
					} catch (ParseException e1) {
					}
					Date d2 = null;
					try {
						d2 = fort.parse(formattedDate);
						
					} catch (ParseException e1) {
					}
					double hours = (d1.getTime() - d2.getTime()) / 1000 / 3600;
					System.err.println(hours+ " D1 "+ d1+" D2 "+d2);
					String position = ticket.getSeatNum();
					if (observer.loginStatus()) {
						cc.getHub().getVouchers().addVoucher(new Voucher(random, amount));
						cc.getHub().getShowtimes().getShowtimeById(showTime).getSeatById(position).setStatus(true);
						JOptionPane.showMessageDialog(null, fName.getText() + " your Voucher ID: " + random
								+ "\n You got full credit of " + amount + " $");
						cc.getHub().getTickets().removeTicket(ticket);
						c.show(panel, "Browse");

					} else {
						if (hours > 72) {
							
							DecimalFormat formatter = new DecimalFormat();
							formatter.setMaximumFractionDigits(2);
							cc.getHub().getVouchers().addVoucher(new Voucher(random, (amount * 0.85)));
							cc.getHub().getShowtimes().getShowtimeById(showTime).getSeatById(position).setStatus(true);
							JOptionPane.showMessageDialog(null,
									fName.getText() + " your Voucher ID: " + random
											+ "\n You got deducted 15% due to cancelation fees\n Your credit of "
											+ formatter.format(amount * 0.85) + " $");
							cc.getHub().getTickets().removeTicket(ticket);
							c.show(panel, "Browse");

						} else
							JOptionPane.showMessageDialog(null, "Cant refund Ticket is expired");

					}

				}
			}
		}

	}

	public void populateFields() {
		RegisteredUser user = cc.getHub().getRegUsers().getUser(observer.getUserName(), observer.getPassword());
		fName.setText(user.getFname());
		lName.setText(user.getLname());
		creditNum.setText(user.getCreditCard());
	}

}
