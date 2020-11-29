package model;

import java.util.*;

public class Showtime{
	private int showtimeId;
    private String dateTime;
    private ArrayList<Seat> seats;
    private int movieId;
	private int theatreId;
    private Movie movie;
    private Theatre theatre;
    private boolean restricted;
    

    public Showtime(int id, String d, int m, int t, boolean r){
    	this.showtimeId = id;
        setdateTime(d);
        this.movieId = m;
        this.theatreId = t;
        createSeats();
        setRestrictedShowtime(r);
    }

    public void createSeats(){
        this.seats = new ArrayList<Seat>();
        for(char i = 'A';i < 'G';  i++) {
			for(int j = 1; j<=4; j++){
                Seat s = new Seat(Integer.toString(j)+Character.toString(i));
                s.setStatus(true);
                s.setPrice(14);
                seats.add(s);
                
            }
        }
    }

    public Seat getSeatById(String seatNum) {
		for (Seat seat : seats) {
			if (seat.getPosition().equals(seatNum)) {
				return seat;
			}
		}
		return null;
	}

    public void setSeatVailability(String seatNum,boolean status) {
    	for (Seat seat : seats) {
			if (seat.getPosition().equals(seatNum)) {
				seat.setStatus(status);
			}
		}
    }
    /**
     * @return String return the dateTime
     */
    public String getdateTime() {
        return dateTime;
    }

    public int getShowtimeId(){
        return showtimeId;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setdateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean getRestricted(){
        return this.restricted;
    }

    public void setRestrictedShowtime(boolean res) {
        this.restricted = res;
    }

    /**
     * @return ArrayList<Seat> return the seats
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    /**
     * @return Movie return the movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @param movie the movie to set
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * @return Theatre return the theatre
     */
    public Theatre getTheatre() {
        return theatre;
    }

    /**
     * @param theatre the theatre to set
     */
    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
    
    public int getMovieId() {
		return movieId;
	}


	public int getTheatreId() {
		return theatreId;
	}

}