package model;
/**
 * ENSF 619 Group Project
 * This class stores all showtime objects and has funcionality to return
 * all showtimes, showtimes by movie, showtimes by theatre and restricted 
 * showtimes only available to registered users.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.util.ArrayList;

public class ShowtimeList {

	private ArrayList<Showtime> showtimes;

	public ShowtimeList(ArrayList<Showtime> s){
		this.showtimes = s;
	}

	public Showtime getShowtimeById(int showId) {
		for (Showtime showtime : showtimes) {
			if (showtime.getShowtimeId()==showId) {
				return showtime;
			}
		}
		return null;
	}

	

	public ArrayList<Showtime> getUnrestrictedShowtimesByTheatre(Theatre theatre) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getTheatre().equals(theatre) && showtime.getRestricted() == false){
				temp.add(showtime);
			}
		}
		return temp;
	}

	public ArrayList<Showtime> getUnrestrictedShowtimesByMovie(Movie movie) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getMovie().equals(movie) && showtime.getRestricted() == false) {
				temp.add(showtime);
			}
		}
		return temp;
	}

	public void setTheatres(TheatreList theatres) {
		for (Showtime showtime : showtimes) {
			showtime.setTheatre(theatres.getTheatre(showtime.getTheatreId()));
		}
	}

	public void setMovies(MovieList movies) {
		for (Showtime showtime : showtimes) {
			showtime.setMovie(movies.getMovie(showtime.getMovieId()));
		}
	}


	public ArrayList<Showtime> getAllShowtimesByTheatre(Theatre theatre) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getTheatre().equals(theatre)) {
				temp.add(showtime);
			}
		}
		return temp;
	}
	
	/**
	 * Finds all Movies in a specific theatre
	 * @param theatreID
	 * @return
	 */
	public ArrayList<Movie> getAllMovieByTheatre(int theatreID, boolean regUser){
		ArrayList<Movie> temp= new ArrayList<Movie>();
		if(regUser) {
		for (Showtime showtime : showtimes){
			if(showtime.getTheatreId()==theatreID )
				temp.add(showtime.getMovie());
			}}
		else {
			for (Showtime showtime : showtimes){
				if(showtime.getTheatreId()==theatreID && showtime.getRestricted()==regUser)
					temp.add(showtime.getMovie());
				}
		}
		return temp;
		}
	/**
	 * Finds all theaters that has a specific movie
	 * @param movieID
	 * @return
	 */
	public ArrayList<Theatre> getAllTheatrsByMovie(int movieID,boolean regUser){
		ArrayList<Theatre> temp= new ArrayList<Theatre>();
		if(regUser) {
		for (Showtime showtime : showtimes){
			if(showtime.getMovieId()==movieID )
				temp.add(showtime.getTheatre());
			}}
		else {
			for (Showtime showtime : showtimes){
				if(showtime.getMovieId()==movieID && showtime.getRestricted()==regUser)
					temp.add(showtime.getTheatre());
				}
		}
			
		return temp;
		}
	/**
	 * Finds all showtimes for specific movie and theatrre
	 * @param theatrID
	 * @param movieID
	 * @return
	 */
	public ArrayList<Showtime> getAllShowtimesByTheatreAndMovie(int theatrID,int movieID) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getTheatre().getTheatreId()==theatrID && showtime.getMovie().getMovieId()==movieID) {
				temp.add(showtime);
			}
		}
		return temp;
	}

	public ArrayList<Showtime> getAllShowtimesByMovie(Movie movie) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getMovie().equals(movie)) {
				temp.add(showtime);
			}
		}
		return temp;
	}
	public ArrayList<Showtime>  getAllShowtimes() {
		return showtimes;
	}



}
