package model;

/**
 * ENSF 619 Group Project
 * Movie list holds all movie objects in our system.
 * This class has functionality to return all movies, and find movies based on
 * movie name segements.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.util.ArrayList;

public class MovieList {

	ArrayList<Movie> movies;

	public MovieList(ArrayList <Movie> movieList){
		this.movies = movieList;
	}

	public ArrayList<Movie> findMovies(String titleSeg) {
		ArrayList<Movie> temp = new ArrayList<Movie>();
		for (Movie movie : movies) {
			if (movie.getMovieName().toLowerCase().contains(titleSeg.toLowerCase())) {
				temp.add(movie);
			}
		}
		return temp;
	}

	public ArrayList<Movie> getAllMovies(){
		return this.movies;

	}
	
	public Movie getMovie(int id) {
		for (Movie movie : movies) {
			if (movie.getMovieId() == id) {
				return movie;
			}
		}
		return null;
	}


}
