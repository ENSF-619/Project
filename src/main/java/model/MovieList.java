package model;

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
