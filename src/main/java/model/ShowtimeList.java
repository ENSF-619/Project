package model;

import java.util.ArrayList;

public class ShowtimeList {

	private ArrayList<Showtime> showtimes;

	public ShowtimeList(ArrayList<Showtime> s){
		this.showtimes = s;
	}

	public Showtime getShowtimeById(int showId) {
		for (Showtime showtime : showtimes) {
			if (showtime.getShowTimeId()==showId) {
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
