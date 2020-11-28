package model;

import java.util.ArrayList;

public class TicketList {
	private ArrayList<Ticket> tickets;

	public TicketList(ArrayList<Ticket> tlist){
		setTickets(tlist);
	}

	public ArrayList<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	
	public Ticket getTicket(int id) {
		for(Ticket ticket : tickets) {
			if(ticket.getTicketId() == id) {
				return ticket;
			}
		}
		return null;
	}

	public boolean checkTicket(Ticket ticket){
		for(Ticket t: tickets){
			if(t.getTicketId() == ticket.getTicketId()){
				return true;
			}
		}
		return false;
		
	}
	
	public void addTicket(Ticket ticket) {
		if(!checkTicket(ticket)){
			tickets.add(ticket);
		}
	}

	public void removeTicket(Ticket ticket){
		if(checkTicket(ticket)){
			tickets.remove(ticket);
		}

	}

	public String toString(){
		String s="";
		for(Ticket t:tickets){
			s+=t + "\n";
		}
		return s;
	}
}
