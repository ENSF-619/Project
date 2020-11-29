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

public class BrowserController implements ActionListener,ListSelectionListener {
	
	private JComboBox comboBox;
	private JButton searchBtnBrowsePanel;
	private JButton allMoviesBtn;
	private JButton allTheaterBtn;
	private JTextField searchField;
	private CardLayout c;
	private JPanel panel;
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
	for( int i=0;i<movies.size();i++) {
		model.insertRow(0,new  Object[] {movies.get(i).getMovieId(),movies.get(i).getMovieName()});
}
	
}
public void populateTheaterTable(ArrayList<Theatre> theatrs) {
	
}
public void populateShowTimeTable(Showtime showTime) {
	
}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(movieSearch)
		//TODO traverse over the columns avilable
		//table.getColumnCount()
		//table.getValueAt(table.getSelectedRow(), 0)
			
		}
		// TODO get selected Movie/Theater info and save it here;
		// After all info is obtained then create the seat Map
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO check login status first
		//SET THE BOOLEAN TO TRUE WHEN T?HE BUTTON IS CLICKED
		
	}

}
