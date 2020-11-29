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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
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
	private JScrollPane scrollpane;
	
	
	
	public BrowserController(CinemaController cc, Observer observer, JComboBox comboBox, JTextField searchField, JButton searchBtnBrowsePanel,
			JButton allMoviesBtn, JButton allTheaterBtn, JTable table, DefaultTableModel model, JScrollPane scrollPane) {
	this.cc=cc;
	this.observer=observer;
	this.comboBox=comboBox;
	this.searchField=searchField;
	this.searchBtnBrowsePanel=searchBtnBrowsePanel;
	this.allMoviesBtn=allMoviesBtn;
	this.allTheaterBtn=allTheaterBtn;
	this.scrollpane=scrollPane;
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
		try {
			if(route==0) {
		
			movieID= (int) table.getValueAt(table.getSelectedRow(), 0);
			ArrayList<Theatre> theatreList=cc.getHub().getShowtimes().getAllTheatrsByMovie(movieID,observer.loginStatus());
			model=new DefaultTableModel();
			table = new JTable(model);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			scrollpane.setViewportView(table);
			
			populateTheaterTable(theatreList);
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					theatrID= (int) table.getValueAt(table.getSelectedRow(), 0);
					ArrayList<Showtime> showTimeList=cc.getHub().getShowtimes().getAllShowtimesByTheatreAndMovie(theatrID, movieID);
					System.err.println(showTimeList.get(0).getShowtimeId());
					model=new DefaultTableModel();
					table = new JTable(model);
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					scrollpane.setViewportView(table);
					populateShowTimeTable(showTimeList);
					table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
						
						@Override
						public void valueChanged(ListSelectionEvent e) {
							showtimeID=(int) table.getValueAt(table.getSelectedRow(), 0);
							Showtime temp=cc.getHub().getShowtimes().getShowtimeById(showtimeID);
							SeatMap map =new SeatMap(cc, observer,temp,c,panel);
							panel.add(map,"SeatMap");
							c.show(panel, "SeatMap");
						}
					});
				}
			});}
			
		//TODO traverse over the columns avilable
		//table.getColumnCount()
		//table.getValueAt(table.getSelectedRow(), 0)
			
				
				
			if(route==1) {
				theatrID= (int) table.getValueAt(table.getSelectedRow(), 0);
				ArrayList<Movie> movieList=cc.getHub().getShowtimes().getAllMovieByTheatre(theatrID,observer.loginStatus());
				model=new DefaultTableModel();
				table = new JTable(model);
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				scrollpane.setViewportView(table);
				
				populateMovieTable(movieList);
				table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent e) {
						movieID= (int) table.getValueAt(table.getSelectedRow(), 0);
						ArrayList<Showtime> showTimeList=cc.getHub().getShowtimes().getAllShowtimesByTheatreAndMovie(theatrID, movieID);
						model=new DefaultTableModel();
						table = new JTable(model);
						table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						scrollpane.setViewportView(table);
						populateShowTimeTable(showTimeList);
						table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
							
							@Override
							public void valueChanged(ListSelectionEvent e) {
								showtimeID=(int) table.getValueAt(table.getSelectedRow(), 0);
								Showtime temp=cc.getHub().getShowtimes().getShowtimeById(showtimeID);
								SeatMap map =new SeatMap(cc, observer,temp,c,panel);
								panel.add(map,"SeatMap");
								c.show(panel, "SeatMap");
							}
						});
					}
				});
			
			}
		}catch (Exception e1) {}}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==searchBtnBrowsePanel) {
			switch (comboBox.getSelectedIndex()) {
			case 0:
				model=new DefaultTableModel();
				table = new JTable(model);
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				scrollpane.setViewportView(table);
				table.getSelectionModel().addListSelectionListener(this);
				route=0;
				tables="Movie";
				String temp=searchField.getText();
				ArrayList<Movie> movieList=cc.getHub().getMovies().findMovies(temp);
				populateMovieTable(movieList);
				break;
				
			case 1:
				model=new DefaultTableModel();
				table = new JTable(model);
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				scrollpane.setViewportView(table);
				table.getSelectionModel().addListSelectionListener(this);
				route=1;
				tables="Theatr";
				String temp2=searchField.getText();
				ArrayList<Theatre> theatreList=cc.getHub().getTheatres().findTheatre(temp2);
				populateTheaterTable(theatreList);
				break;
			}}
			 if (e.getSource()==allMoviesBtn) {
				 model=new DefaultTableModel();
					table = new JTable(model);
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					scrollpane.setViewportView(table);
					table.getSelectionModel().addListSelectionListener(this);
				route=0;
				tables="Movie";
				populateMovieTable(cc.getHub().getMovies().getAllMovies());
				
			}
			 if (e.getSource()==allTheaterBtn) {
				 model=new DefaultTableModel();
					table = new JTable(model);
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					scrollpane.setViewportView(table);
					table.getSelectionModel().addListSelectionListener(this);
				route=1;
				tables="Theatr";
				populateTheaterTable(cc.getHub().getTheatres().getAllTheatres());
				
			}
				
		}
		// TODO check login status first
		//SET THE BOOLEAN TO TRUE WHEN T?HE BUTTON IS CLICKED
		
	}


