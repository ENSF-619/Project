package model;

import java.util.*;

public class Showtime{
    private String date;
    private ArrayList<Seat> seats;
    private int movieId;
	private int theatreId;
    private Movie movie;
    private Theatre theatre;

    public Showtime(String d, int m, int t){
        setDate(d);
        this.movieId = m;
        this.theatreId = t;
    }


    /**
     * @return String return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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