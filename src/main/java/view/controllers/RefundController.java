package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class RefundController implements ActionListener{

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
	this.cc=cc;
	this.observer=observer;
	this.ticketID=ticketID;
	this.creditNum=creditNum;
	this.month=month;
	this.year=year;
	this.CCV=CCV;
	this.lName=lName;
	this.fName=fName;
	this.refundBtn=refundBtn;
	
 
	}
	
	

	public void setC(CardLayout c) {
		this.c=c;
		
	}

	public void setPanel(JPanel panel) {
		this.panel=panel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==refundBtn) {
			
			if (ticketID.getText().isEmpty() || fName.getText().isEmpty() || lName.getText().isEmpty() ) {
				JOptionPane.showMessageDialog(null, "Please fill in your info");
			}
			else {
				int id=Integer.parseInt(ticketID.getText());
				Ticket ticket=cc.getHub().getTickets().getTicket(id);
				if(ticket==null) {
					JOptionPane.showMessageDialog(null, "Ticket not found");
				}
				else {
					int random=(int) (Math.random()*100000);
					double amount =ticket.getPrice();
					int showTime=ticket.getShowtimeId();
					String position =ticket.getSeatNum();
					if(observer.loginStatus()) {
						cc.getHub().getVouchers().addVoucher(new Voucher(random, amount));
						cc.getHub().getShowtimes().getShowtimeById(showTime).getSeatById(position).setStatus(true);
						JOptionPane.showMessageDialog(null, fName.getText()+" your Voucher ID: "+random+"\n You got full credit of "+amount+" $");
						c.show(panel, "Browse");
					
					}
					else {
						cc.getHub().getVouchers().addVoucher(new Voucher(random, (amount*0.85)));
						cc.getHub().getShowtimes().getShowtimeById(showTime).getSeatById(position).setStatus(true);
						JOptionPane.showMessageDialog(null, fName.getText()+" your Voucher ID: "+random+"\n You got deducted 15% due to cancelation fees\n Your credit of "+Math.round(amount*0.85)+" $");
						c.show(panel, "Browse");
					
					}
				}
			}
		}
		
	}



	public void populateFields() {
		RegisteredUser user= cc.getHub().getRegUsers().getUser(observer.getUserName(), observer.getPassword());
		fName.setText(user.getFname());
		lName.setText(user.getLname());
		creditNum.setText(user.getCreditCard());
	}

}
