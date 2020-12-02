package model;
import java.util.ArrayList;
/**
 * ENSF 619 Group Project
 * The class `ShowtimeList` stores all showtime objects and has functionality to return
 * all showtimes, showtimes by movie, showtimes by theatre and restricted 
 * showtimes only available to registered users.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class ShowtimeList {
	/**
	 * The instance variable `showtimes` of type ArrayList Showtime
	 */
	private ArrayList<Showtime> showtimes;
	
	/**
	 * The constructor initializes the value of the instance variable.
	 * @param s - of type ArrayList Showtime
	 */
	public ShowtimeList(ArrayList<Showtime> s){
		this.showtimes = s;
	}
	
	/**
	 * The getter method for instance variable `showtimes` 
	 * @return `showtimes` of type ArrayList Showtime
	 */
	public ArrayList<Showtime> getAllShowtimes() {
		return showtimes;
	}

	/**
	 * The method `getShowtimeById()` returns Showtime for a given show time ID
	 * @param showId - Show time ID
	 * @return - Showtime for the given ID.
	 */
	public Showtime getShowtimeById(int showId) {
		for (Showtime showtime : showtimes) {
			if (showtime.getShowtimeId()==showId) {
				return showtime;
			}
		}
		return null;
	}
	
	/**
	 * The method `getUnrestrictedShowtimesByTheatre()` returns unrestricted showtimes 
	 * for a given theatre.
	 * @param theatre - of type Theatre
	 * @return - unrestricted showtimes for a given theatre.
	 */
	public ArrayList<Showtime> getUnrestrictedShowtimesByTheatre(Theatre theatre) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getTheatre().equals(theatre) && showtime.getRestricted() == false){
				temp.add(showtime);
			}
		}
		return temp;
	}
	
	/**
	 * The method `getUnrestrictedShowtimesByMovie()` returns unrestricted showtimes 
	 * for a given movie.
	 * @param movie of type Movie
	 * @return - unrestricted showtimes for a given movie.
	 */
	public ArrayList<Showtime> getUnrestrictedShowtimesByMovie(Movie movie) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getMovie().equals(movie) && showtime.getRestricted() == false) {
				temp.add(showtime);
			}
		}
		return temp;
	}
	
	/**
	 * The method `setTheatres()` sets theatre for the showtime
	 * @param theatres of type `TheatreList`
	 */
	public void setTheatres(TheatreList theatres) {
		for (Showtime showtime : showtimes) {
			showtime.setTheatre(theatres.getTheatre(showtime.getTheatreId()));
		}
	}
	
	/**
	 * The method `setMovies()` sets movie for the showtime
	 * @param movies of type `MovieList`
	 */
	public void setMovies(MovieList movies) {
		for (Showtime showtime : showtimes) {
			showtime.setMovie(movies.getMovie(showtime.getMovieId()));
		}
	}

	/**
	 * The method `getAllShowtimesByTheatre()` returns the showtimes for a given theatre.
	 * @param theatre of type `Theatre`
	 * @return - showtimes for a given theatre
	 */
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
	 * The method `getAllMovieByTheatre()` finds all Movies in a specific theatre.
	 * @param theatreID of type `int`
	 * @param regUser of type `boolean`
	 * @return - Movies in a specific theatre.
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
	 * The method `getAllTheatrsByMovie()` finds all theaters that has a specific movie.
	 * @param movieID - ID of the movie 
	 * @param regUser of type `boolean`
	 * @return - theaters that has a specific movie.
	 */
	public ArrayList<Theatre> getAllTheatrsByMovie(int movieID, boolean regUser){
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
	 * The method `getAllShowtimesByTheatreAndMovie()` finds all showtimes for specific movie and theatre.
	 * @param theatrID - ID of the theatre
	 * @param movieID - ID of the movie
	 * @return - showtimes for specific movie and theatre
	 */
	public ArrayList<Showtime> getAllShowtimesByTheatreAndMovie(int theatrID, int movieID) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getTheatre().getTheatreId()==theatrID && showtime.getMovie().getMovieId()==movieID) {
				temp.add(showtime);
			}
		}
		return temp;
	}
	
	/**
	 * The method `getAllShowtimesByMovie()` finds all showtimes for a specific movie.
	 * @param movie of type Movie
	 * @return - showtimes for a specific movie
	 */
	public ArrayList<Showtime> getAllShowtimesByMovie(Movie movie) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getMovie().equals(movie)) {
				temp.add(showtime);
			}
		}
		return temp;
	}
}
