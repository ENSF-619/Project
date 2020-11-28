package model;

import java.util.ArrayList;

public class ShowtimeList {

	private ArrayList<Showtime> showtimes;

	public ArrayList<Showtime> getShowtimesByTheatre(Theatre theatre) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getTheatre().equals(theatre)) {
				temp.add(showtime);
			}
		}
		return temp;
	}

	public ArrayList<Showtime> getShowtimesByMovie(Movie movie) {
		ArrayList<Showtime> temp = new ArrayList<Showtime>();
		for (Showtime showtime : showtimes) {
			if (showtime.getMovie().equals(movie)) {
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

}
