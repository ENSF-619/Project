package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Movie;

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
				Movie temp = new Movie();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
}
