package model;

import java.util.ArrayList;

public class TicketList {
	private ArrayList<Ticket> tickets;
	
	public Ticket getTicket(int id) {
		for(Ticket ticket : tickets) {
			if(ticket.getTicketId() == id) {
				return ticket;
			}
		}
		return null;
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
}
