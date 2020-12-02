package model;
import java.util.ArrayList;
/**
 * ENSF 619 Group Project
 * The class `TicketList` stores all generated tickets and has functionality to 
 * check tickets by id, add + remove tickets from the system and sets
 * the ticket's corresponding seats to unavailable after purchase.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class TicketList {
	/**
	 * The instance variable `tickets` of type ArrayList Ticket
	 */
	private ArrayList<Ticket> tickets;
	/**
	 * The instance variable `showtimes` of type ArrayList Showtime
	 */
	private ArrayList<Showtime> showtimes;
	
	/**
	 * The constructor initializes the values of the instance variables.
	 * @param tlist of type ArrayList Ticket
	 * @param arrayList of type ArrayList Showtime
	 */
	public TicketList(ArrayList<Ticket> tlist, ArrayList<Showtime> arrayList){
		setTickets(tlist);
		this.showtimes=arrayList;
		setUnavailableSeats();
	}
	
	/**
	 * The getter method for instance variable `tickets`
	 * @return `tickets` of type ArrayList Ticket
	 */
	public ArrayList<Ticket> getTickets() {
		return this.tickets;
	}
	
	/**
	 * The setter method for instance variable `tickets`
	 * @param tickets of type ArrayList Ticket
	 */
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	/**
	 * The method `setUnavailableSeats()` sets the status of seats to unavailable.
	 */
	private void setUnavailableSeats() {
		for (Ticket ticket : tickets) {
			for(Showtime showtime: showtimes ) {
				if (ticket.getShowtimeId()==showtime.getShowtimeId()) {
					ArrayList<Seat> temp= showtime.getSeats();
					for (int i=0 ;i<temp.size();i++) {
						if(ticket.getSeatNum().equals(temp.get(i).getPosition())) {
							temp.get(i).setStatus(false);
						}
					}
				}
			}
		}
		
	}
	
	/**
	 * The method `getTicket()` returns the ticket based on specified id.
	 * @param id - ID of the ticket
	 * @return - ticket based on specified id.
	 */
	public Ticket getTicket(int id) {
		for(Ticket ticket : tickets) {
			if(ticket.getTicketId() == id) {
				return ticket;
			}
		}
		return null;
	}
	
	/**
	 * The method `checkTicket()` compares the ID of tickets.
	 * @param ticket of type Ticket
	 * @return True if Ticket id is found, else it returns false.
	 */
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

	public void setShowtimes(ShowtimeList showtimes) {
		for (Ticket t : tickets) {
			Showtime temp = showtimes.getShowtimeById(t.getShowtimeId());
			t.setShowtime(temp);
			setSeats(t, temp);
		}
	}

	public void setSeats(Ticket t, Showtime s){
		Seat seat = s.getSeatById(t.getSeatNum());
		t.setMySeat(seat);
		seat.setStatus(false);
	}


	public String toString(){
		String s="";
		for(Ticket t:tickets){
			s+=t + "\n";
		}
		return s;
	}
}
