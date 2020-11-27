package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import controller.Observer;
import controller.RequestHandler;

public class BrowseMovie extends JPanel implements ListSelectionListener{
	JTable movieTable;
	CardLayout c ;
	JPanel panel;
	private Integer movieID=0;
	private String movie;
	private String genre;
	private String rating;
	private String review;
	private String theaterName;
	private String address;
	private String showTime;
	private Integer theaterID;
	private Integer audiorium;
	private BrowseTheater theater;
	private SeatMap map;
	private Observer mc;
	
	//pass movie list from model here
public BrowseMovie(Observer mc) {
	setBackground(SystemColor.inactiveCaption);
	this.mc=mc;
	
	setLayout(new BorderLayout(0, 0));
	
	JScrollPane scrollPane = new JScrollPane();
	add(scrollPane, BorderLayout.CENTER);
	DefaultTableModel tableModel = new DefaultTableModel();
	movieTable = new JTable(tableModel);
	movieTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	tableModel.addColumn("MovieID");
	tableModel.addColumn("Movie");
	tableModel.addColumn("Genre");
	tableModel.addColumn("Rating");
	tableModel.addColumn("Review");
	//request table from modelcontroller;
	
	tableModel.insertRow(0, new Object [] {10002,"Titanic","Romance","PG-13","4"});

	scrollPane.setViewportView(movieTable);
	movieTable.getSelectionModel().addListSelectionListener(this);
}
public void setAction(CardLayout c2, JPanel panel2) {

}
public void valueChanged(ListSelectionEvent e) {
	 movieID=  (Integer) movieTable.getValueAt(movieTable.getSelectedRow(), 0);
	 movie= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 1);
	 genre=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 2);
	 rating=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 3);
	 review=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 4);
	 movieTable.repaint();
	 
	 c.show(panel, "browseTheater");
}
public Integer getMovieID() {
	return movieID;
}
public void setMovieID(Integer movieID) {
	this.movieID = movieID;
}
public void setTheater(BrowseTheater theater) {
	this.theater=theater;
}
public void setSeatMap(SeatMap map) {
	this.map=map;
}

public String getMovie() {
	return movie;
}
public void setMovie(String movie) {
	this.movie = movie;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
public BrowseTheater getTheater() {
	return theater;
}


}
