package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.CinemaController;
import model.Movie;
import model.Theatre;
import model.Showtime;
import view.boundary.Observer;
import view.boundary.SeatMap;

public class BrowserController implements ActionListener,ListSelectionListener {
	
	private JComboBox comboBox;
	private JButton searchBtnBrowsePanel;
	private JButton allMoviesBtn;
	private JButton allTheaterBtn;
	private JTextField searchField;
	private CardLayout c;
	private JPanel panel;
	int route;//0 is for movie=>theatre  1 is for the other way around
	private int	movieID=0;
	private int theatrID=0;
	private int showtimeID=0;
	private String tables;

	
	private CinemaController cc;
	ArrayList<String> data;
	Observer observer;
	private JTable table;
	private DefaultTableModel model;
	boolean movieSearch=false;
	boolean theaterSearch=false;
	
	
	
	public BrowserController(Observer observer, JComboBox comboBox, JTextField searchField, JButton searchBtnBrowsePanel,
			JButton allMoviesBtn, JButton allTheaterBtn, JTable table, DefaultTableModel model) {
	this.observer=observer;
	this.comboBox=comboBox;
	this.searchField=searchField;
	this.searchBtnBrowsePanel=searchBtnBrowsePanel;
	this.allMoviesBtn=allMoviesBtn;
	this.allTheaterBtn=allTheaterBtn;
	this.table=table;
	this.model=model;
	}

	public CardLayout getC() {
		return c;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void setC(CardLayout c) {
		this.c = c;
	}


/**
 * Populates the list table
 * @param data it can be a single movie or list movies
 */
public void populateMovieTable(ArrayList<Movie> movies) {
	model.setColumnCount(0);
	model.setRowCount(0);
	model.addColumn("Movie ID");
	model.addColumn("Movie Name");
	model.addColumn("Movie Rating");
	for( int i=0;i<movies.size();i++) {
		model.insertRow(0,new  Object[] {movies.get(i).getMovieId(),movies.get(i).getMovieName(),movies.get(i).getRating()});
}
	
}
public void populateTheaterTable(ArrayList<Theatre> theatrs) {
	model.setColumnCount(0);
	model.setRowCount(0);
	model.addColumn("Theater ID");
	model.addColumn("Theater Name");
	model.addColumn("Theater Address");
	for( int i=0;i<theatrs.size();i++) {
		model.insertRow(0,new  Object[] {theatrs.get(i).getTheatreId(),theatrs.get(i).getTheatreName(),theatrs.get(i).getTheatreAddress()});
}
	
}
public void populateShowTimeTable(ArrayList<Showtime> showTime) {
	model.setColumnCount(0);
	model.setRowCount(0);
	model.addColumn("Showtime ID");
	model.addColumn("Showtime Date");
	
	for( int i=0;i<showTime.size();i++) {
		model.insertRow(0,new  Object[] {showTime.get(i).getShowtimeId(),showTime.get(i).getdateTime()});
}
	
}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(tables.equals("Movie")) {
		switch (route) {
		case 0:
			movieID= (int) table.getValueAt(table.getSelectedRow(), 0);
			ArrayList<Theatre> theatreList=cc.getHub().getShowtimes().getAllTheatrsByMovie(movieID,observer.loginStatus());
			
			tables="Theatr";
			populateTheaterTable(theatreList);
		case 1:
			ArrayList<Showtime> showTimeList=cc.getHub().getShowtimes().getAllShowtimesByTheatreAndMovie(theatrID, movieID);
			
			tables="Showtime";
			populateShowTimeTable(showTimeList);
		}
		//TODO traverse over the columns avilable
		//table.getColumnCount()
		//table.getValueAt(table.getSelectedRow(), 0)
			
		
			
		}
		else if (tables.equals("Theatr")) {
			switch (route) {
			case 0:
				ArrayList<Showtime> showTimeList=cc.getHub().getShowtimes().getAllShowtimesByTheatreAndMovie(theatrID, movieID);
				
				tables="Showtime";
				populateShowTimeTable(showTimeList);
			case 1:
				theatrID= (int) table.getValueAt(table.getSelectedRow(), 0);
				ArrayList<Movie> movieList=cc.getHub().getShowtimes().getAllMovieByTheatre(theatrID,observer.loginStatus());
				
				tables="Movie";
				populateMovieTable(movieList);
			}
			
		}
		else if (tables.equals("Showtime"))
		{
			showtimeID=(int) table.getValueAt(table.getSelectedRow(), 0);
			Showtime temp=cc.getHub().getShowtimes().getShowtimeById(showtimeID);
			SeatMap map =new SeatMap(cc, observer,temp);
			panel.add(map,"SeatMap");
			c.show(panel, "SeatMap");
			
		// TODO get selected Movie/Theater info and save it here;
		// After all info is obtained then create the seat Map
		
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==searchBtnBrowsePanel) {
			switch (comboBox.getSelectedIndex()) {
			case 0:
				route=0;
				tables="Movie";
				String temp=searchField.getText();
				ArrayList<Movie> movieList=cc.getHub().getMovies().findMovies(temp);
				populateMovieTable(movieList);
				
				
			case 1:
				route=1;
				tables="Theatr";
				String temp2=searchField.getText();
				ArrayList<Theatre> theatreList=cc.getHub().getTheatres().findTheatre(temp2);
				populateTheaterTable(theatreList);
			}}
			else if (e.getSource()==allMoviesBtn) {
				route=0;
				tables="Movie";
				populateMovieTable(cc.getHub().getMovies().getAllMovies());
				
			}
			else if (e.getSource()==allMoviesBtn) {
				route=1;
				tables="Theatr";
				populateTheaterTable(cc.getHub().getTheatres().getAllTheatres());
				
			}
				
		}
		// TODO check login status first
		//SET THE BOOLEAN TO TRUE WHEN T?HE BUTTON IS CLICKED
		
	}

}
