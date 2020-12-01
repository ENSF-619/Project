package model;
import java.util.ArrayList;
/**
 * ENSF 619 Group Project
 * The class `MovieList` holds all movie objects in our system.
 * This class has functionality to return all movies, and find movies based on
 * movie name segments.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class MovieList {
	/**
	 * The instance variable `movies` of type ArrayList Movie
	 */
	private ArrayList<Movie> movies;
	
	/**
	 * The constructor initializes the value of the instance variable.
	 * @param movieList of type ArrayList Movie
	 */
	public MovieList(ArrayList <Movie> movieList){
		this.movies = movieList;
	}
	
	/**
	 * The getter method for instance variable movies
	 * @return - `movies` of type ArrayList Movie
	 */
	public ArrayList<Movie> getAllMovies(){
		return this.movies;

	}
	
	/**
	 * The method `findMovies()` finds movies based on movie name segments.
	 * @param titleSeg - Movie name segment.
	 * @return - Movies that contain the name segment given.
	 */
	public ArrayList<Movie> findMovies(String titleSeg) {
		ArrayList<Movie> temp = new ArrayList<Movie>();
		for (Movie movie : movies) {
			if (movie.getMovieName().toLowerCase().contains(titleSeg.toLowerCase())) {
				temp.add(movie);
			}
		}
		return temp;
	}
	
	/**
	 * The method `getMovie()` find movies based on movie id.
	 * @param id - ID of the movie
	 * @return - Movie that matches the given id.
	 */
	public Movie getMovie(int id) {
		for (Movie movie : movies) {
			if (movie.getMovieId() == id) {
				return movie;
			}
		}
		return null;
	}
}
