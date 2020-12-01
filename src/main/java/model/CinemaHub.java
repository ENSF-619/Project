package model;

public class CinemaHub {
	
	private MovieList movies;
	private TheatreList theatres;
	private ShowtimeList showtimes;
	private TicketList tickets;
	private RegList regUsers;
	private User user;
	private VoucherList vouchers;
	private News news;
	
	public CinemaHub(MovieList movies, TheatreList theatres, ShowtimeList showtimes, TicketList tickets,
			RegList regUsers, VoucherList vouchers) {
		this.movies = movies;
		this.theatres = theatres;
		this.showtimes = showtimes;
		this.tickets = tickets;
		this.regUsers = regUsers;
		this.user = new User();
		this.vouchers = vouchers;
		this.news = new News();
		
		// SETTING AGG RELATIONS
		showtimes.setMovies(movies);
		showtimes.setTheatres(theatres);
		tickets.setShowtimes(showtimes);
	}
	
	public MovieList getMovies() {
		return movies;
	}

	public TheatreList getTheatres() {
		return theatres;
	}

	public ShowtimeList getShowtimes() {
		return showtimes;
	}

	public TicketList getTickets() {
		return tickets;
	}

	public RegList getRegUsers() {
		return regUsers;
	}

	public User getUser() {
		return user;
	}

	public VoucherList getVouchers() {
		return vouchers;
	}

	public News getNews() {
		return news;
	}
	
	

}
