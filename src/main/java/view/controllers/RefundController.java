package view.controllers;
/**
 * ENSF 619 Group Project
 * This controller holds action listeners for our Refund panel, so users may interact
 * with our system and accuire refunds for their cancelled tickets.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CinemaController;
import model.RegisteredUser;
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
					int random = (int) (Math.random() * 100000);
					double amount = ticket.getPrice();
					int showTime = ticket.getShowtimeId();
					String date = ticket.getIssueDate();
					SimpleDateFormat fort = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
					Date d1 = null;
					try {
						d1 = fort.parse(date);
					} catch (ParseException e1) {
					}
					Date d2 = null;
					try {
						d2 = fort.parse(new java.sql.Timestamp(System.currentTimeMillis()) + "");
					} catch (ParseException e1) {
					}
					double hours = (d2.getTime() - d1.getTime()) / 1000 / 3600;
					String position = ticket.getSeatNum();
					if (observer.loginStatus()) {
						cc.getHub().getVouchers().addVoucher(new Voucher(random, amount));
						cc.getHub().getShowtimes().getShowtimeById(showTime).getSeatById(position).setStatus(true);
						JOptionPane.showMessageDialog(null, fName.getText() + " your Voucher ID: " + random
								+ "\n You got full credit of " + amount + " $");
						cc.getHub().getTickets().removeTicket(ticket);
						c.show(panel, "Browse");

					} else {
						if (hours < 72) {
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
