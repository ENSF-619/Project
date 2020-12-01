package model;
import java.util.*;
/**
 * ENSF 619 Group Project
 * The class `Showtime` represents the showtimes within our system. Showtimes have associated
 * seat arrays, a theatre and a movie as well as an identifying
 * id and a status to allow for visibility control
 * between regular users and registered users.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class Showtime{
	/**
	 * The instance variable `showtimeID` - ID of showtime
	 */
	private int showtimeId;
	/**
	 * The instance variable `dateTime` of type `String`
	 */
    private String dateTime;
    /**
     * The instance variable `seats` of type ArrayList Seat
     */
    private ArrayList<Seat> seats;
    /**
     * The instance variable `movieId` - ID of the movie
     */
    private int movieId;
    /**
     * The instance variable `theatreId` - ID of the theatre
     */
	private int theatreId;
	/**
	 * The instance variable `movie` of type `Movie`
	 */
    private Movie movie;
    /**
	 * The instance variable `theatre` of type `Theatre`
	 */
    private Theatre theatre;
    /**
     * The instance variable `restricted` that indicates restricted showtime.
     */
    private boolean restricted;
    
    /**
     * The constructor initializes the values of the instance variables.
     * @param id - ID of showtime
     * @param d - `dateTime` of type `String`
     * @param m - ID of the movie
     * @param t - ID of the theatre
     * @param r - `restricted` that indicates restricted showtime.
     */
    public Showtime(int id, String d, int m, int t, boolean r){
    	this.showtimeId = id;
        setdateTime(d);
        this.movieId = m;
        this.theatreId = t;
        createSeats();
        setRestrictedShowtime(r);
    }
    
    /**
     * The method `createSeats()` creates new Seat objects.
     */
    public void createSeats(){
        this.seats = new ArrayList<Seat>();
        for(char i = 'A';i < 'G';  i++) {
			for(int j = 1; j<=4; j++){
                Seat s = new Seat(Integer.toString(j)+Character.toString(i));
                s.setStatus(true);
                s.setPrice(14.5);
                seats.add(s);              
            }
        }
    }
    
    /**
     * The method `getSeatById` returns the Seat for the given ID.
     * @param seatNum of type String
     * @return - Seat corresponding to the given seat number.
     */
    public Seat getSeatById(String seatNum) {
		for (Seat seat : seats) {
			if (seat.getPosition().equals(seatNum)) {
				return seat;
			}
		}
		return null;
	}
    
    /**
     * The method `setSeatVailability` sets the status of seat for the given seat number.
     * @param seatNum of type String
     * @param status - Status of the seat
     */
    public void setSeatVailability(String seatNum, boolean status) {
    	for (Seat seat : seats) {
			if (seat.getPosition().equals(seatNum)) {
				seat.setStatus(status);
			}
		}
    }
    
    /**
     * The getter method for instance variable `showtimeId`
     * @return `showtimeID` - ID of showtime
     */
    public int getShowtimeId(){
        return showtimeId;
    }
    
    /**
     * The getter method for instance variable `dateTime`
     * @return dateTime of type `String`
     */
    public String getdateTime() {
        return dateTime;
    }
    
    /**
     * The setter method for instance variable `dateTime`
     * @param dateTime of type `String`
     */
    public void setdateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * The getter method for instance variable `seats`   
     * @return ArrayList<Seat> - seats
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    /**
     * The setter method for instance variable `seats` 
     * @param seats - the seats to set
     */
    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    
    /**
     * The getter method for instance variable `movieID`   
     * @return - `movieId` - ID of the movie
     */
    public int getMovieId() {
		return movieId;
	}

    /**
     * The getter method for instance variable `theatreID`   
     * @return - `theatreId` - ID of the theatre
     */
	public int getTheatreId() {
		return theatreId;
	}
	
	/**
	 * The getter method for instance variable `movie` 
     * @return movie of type `Movie`
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * The setter method for instance variable `movie` 
     * @param movie - the movie to set
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * The getter method for instance variable `theatre` 
     * @return - theatre of type `Theatre`
     */
    public Theatre getTheatre() {
        return theatre;
    }

    /**
     * The setter method for instance variable `theatre` 
     * @param theatre - the theatre to set
     */
    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
    
    /**
     * The getter method for instance variable `restricted`
     * @return restricted that indicates restricted showtime.
     */
    public boolean getRestricted(){
        return this.restricted;
    }
    
    /**
     * The setter method for instance variable `restricted`
     * @param res that indicates restricted showtime.
     */
    public void setRestrictedShowtime(boolean res) {
        this.restricted = res;
    }

}