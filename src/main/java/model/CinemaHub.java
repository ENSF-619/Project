package model;
/**
 * ENSF 619 Group Project
 * The class CinemaHub collects needed objects so controllers can readily access the classes
 * in our system. All lists, Users and News objects are stored here.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since November 2020
 */
public class CinemaHub {
	
	/**
	 * The instance variable `movies` of type `MovieList`
	 */
	private MovieList movies;
	/**
	 * The instance variable `theatres` of type `TheatreList`
	 */
	private TheatreList theatres;
	/**
	 * The instance variable `showtimes` of type `ShowtimeList`
	 */
	private ShowtimeList showtimes;
	/**
	 * The instance variable `tickets` of type `TicketList`
	 */
	private TicketList tickets;
	/**
	 * The instance variable `regUsers` of type `RegList`
	 */
	private RegList regUsers;
	/**
	 * The instance variable `user` of type `User`
	 */
	private User user;
	/**
	 * The instance variable `vouchers` of type `VoucherList`
	 */
	private VoucherList vouchers;
	/**
	 * The instance variable `news` of type `News`
	 */
	private News news;
	
	/**
	 * The constructor initializes the values of the instance variables.
	 * @param movies of type `MovieList`
	 * @param theatres of type `TheatreList`
	 * @param showtimes of type `ShowtimeList`
	 * @param tickets of type `TicketList`
	 * @param regUsers of type `RegList`
	 * @param vouchers of type `VoucherList`
	 */
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
		
		// setting aggregation relations
		showtimes.setMovies(movies);
		showtimes.setTheatres(theatres);
		tickets.setShowtimes(showtimes);
	}
	
	/**
	 * The getter method for instance variable `movies`
	 * @return `movies` of type `MovieList`
	 */
	public MovieList getMovies() {
		return movies;
	}
	
	/**
	 * The getter method for instance variable `theatres`
	 * @return `theatres` of type `TheatreList`
	 */
	public TheatreList getTheatres() {
		return theatres;
	}
	
	/**
	 * The getter method for instance variable `showtimes`
	 * @return `showtimes` of type `ShowtimeList`
	 */
	public ShowtimeList getShowtimes() {
		return showtimes;
	}
	
	/**
	 * The getter method for instance variable `tickets`
	 * @return `tickets` of type `TicketList`
	 */
	public TicketList getTickets() {
		return tickets;
	}
	
	/**
	 * The getter method for instance variable `regUsers`
	 * @return `regUsers` of type `RegList`
	 */
	public RegList getRegUsers() {
		return regUsers;
	}
	
	/**
	 * The getter method for instance variable `user`
	 * @return `user` of type `User`
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * The getter method for instance variable `vouchers`
	 * @return `vouchers` of type `VoucherList`
	 */
	public VoucherList getVouchers() {
		return vouchers;
	}
	
	/**
	 * The getter method for instance variable `news`
	 * @return `news` of type `News`
	 */
	public News getNews() {
		return news;
	}

}
