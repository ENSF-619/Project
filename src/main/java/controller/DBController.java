package controller;

/**
 * ENSF 619 Group Project
 * This controller is used for connection and communication between 
 * our model and our CinemaApp database.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

import model.Movie;
import model.RegisteredUser;
import model.Seat;
import model.Showtime;
import model.Theatre;
import model.Ticket;
import model.Voucher;

public class DBController implements JDBCConnectionInfo {

	private Connection jdbc_connection;
	private Statement statement;

	public DBController() {
		try {
			jdbc_connection = DriverManager.getConnection(CONNECTIONINFO, LOGIN, PASSWORD);
			System.out.println("Connected to: " + CONNECTIONINFO + "\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Movie> getMovies() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		String sql = "SELECT * FROM " + MOVIETABLE;
		ResultSet results;
		try {
			statement = jdbc_connection.createStatement();
			results = statement.executeQuery(sql);
			while (results.next()) {
				Movie temp = new Movie(results.getInt("MovieId"), results.getString("MovieName"),
						results.getString("Rating"));
				movies.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}

	public ArrayList<Theatre> getTheatres() {
		ArrayList<Theatre> theatres = new ArrayList<Theatre>();
		String sql = "SELECT * FROM " + THEATRETABLE;
		ResultSet results;
		try {
			statement = jdbc_connection.createStatement();
			results = statement.executeQuery(sql);
			while (results.next()) {
				Theatre temp = new Theatre(results.getInt("TheatreId"), results.getString("TheatreName"),
						results.getString("Address"));
				theatres.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return theatres;
	}

	public ArrayList<Showtime> getShowtimes() {
		ArrayList<Showtime> showtimes = new ArrayList<Showtime>();
		String sql = "SELECT * FROM " + SHOWTIMETABLE;
		ResultSet results;
		try {
			statement = jdbc_connection.createStatement();
			results = statement.executeQuery(sql);
			while (results.next()) {
				Showtime temp = new Showtime(results.getInt("ShowtimeId"), results.getString("dateTime"),
						results.getInt("MovieId"), results.getInt("TheatreId"), results.getBoolean("Restricted"));
				showtimes.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return showtimes;
	}

	public ArrayList<RegisteredUser> getRegisteredUsers() {
		ArrayList<RegisteredUser> users = new ArrayList<RegisteredUser>();
		String sql = "SELECT * FROM " + REGISTEREDUSERTABLE;
		ResultSet results;
		try {
			statement = jdbc_connection.createStatement();
			results = statement.executeQuery(sql);
			while (results.next()) {
				RegisteredUser temp = new RegisteredUser(results.getString("Username"),
						results.getString("UserPassword"), results.getString("CreditCard"), results.getString("FName"),
						results.getString("LName"), results.getString("PostalCode"), results.getString("Address"), results.getString("Email"));
				users.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public ArrayList<Ticket> getTickets() {
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		String sql = "SELECT * FROM " + TICKETTABLE;
		ResultSet results;
		try {
			statement = jdbc_connection.createStatement();
			results = statement.executeQuery(sql);
			while (results.next()) {
				Ticket temp = new Ticket(results.getInt("TicketId"), results.getDouble("Price"),
						results.getString("IssueDate"), results.getInt("ShowtimeId"), results.getString("SeatNumber"));
				tickets.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tickets;
	}
	
	public ArrayList<Voucher> getVouchers() {
		ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
		String sql = "SELECT * FROM " + VOUCHERTABLE;
		ResultSet results;
		try {
			statement = jdbc_connection.createStatement();
			results = statement.executeQuery(sql);
			while (results.next()) {
				Voucher temp = new Voucher(results.getInt("VoucherId"), results.getDouble("Amount"));
				vouchers.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vouchers;
	}
	//TODO : UPDATE queries 
	//	
	/*
	 * Voucher add/remove/update
	 * 
	 * regUser : add/remove
	 * 
	 * 
	 * Ticket : add/remove
	 * 
	 * 
	 * 
	 */

}
