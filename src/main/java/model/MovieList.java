package model;

import java.util.ArrayList;

public class MovieList {

	ArrayList<Movie> movies;

	public ArrayList<Movie> findMovies(String titleSeg) {
		ArrayList<Movie> temp = new ArrayList<Movie>();
		for (Movie movie : movies) {
			if (movie.getMovieName().contains(titleSeg)) {
				temp.add(movie);
			}
		}
		return temp;
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
