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

import controller.Observer;
import controller.RequestHandler;

public class BrowseTheater extends JPanel implements ListSelectionListener{
	JTable theaterTable ;
	private JPanel panel;
	private CardLayout c;
	private JTable movieTable;
	private String theaterName;
	private String address;
	private String showTime;
	private Integer theaterID;
	private Integer audiorium;
	private Integer movieID=0;
	private String movieName;
	private String genre;
	private String rating;
	private String review;
	private BrowseMovie movie;
	private SeatMap map;
	private RequestHandler request;
	private Observer mc;

	public BrowseTheater(Observer mc)
	{
		this.mc=mc;
		setBackground(SystemColor.inactiveCaption);
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		DefaultTableModel tableModel = new DefaultTableModel();
		theaterTable = new JTable(tableModel);
		
		theaterTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableModel.addColumn("TheaterID");
		tableModel.addColumn("Theater Name");
		tableModel.addColumn("Address");
		tableModel.addColumn("ShowTime");
		tableModel.addColumn("Auditorium");
		//fill table request obeserver
		tableModel.insertRow(0, new Object [] {10002,"Cineplex","Ne","20/11/2020 6:00 pm",3});
		scrollPane.setViewportView(theaterTable);
		theaterTable.getSelectionModel().addListSelectionListener(this);
	}




	public void valueChanged(ListSelectionEvent e) {
    	 theaterID=  (Integer) theaterTable.getValueAt(theaterTable.getSelectedRow(), 0);
    	 theaterName= (String) theaterTable.getValueAt(theaterTable.getSelectedRow(), 1);
    	 address=(String) theaterTable.getValueAt(theaterTable.getSelectedRow(), 2);
    	 showTime= (String) theaterTable.getValueAt(theaterTable.getSelectedRow(), 3);
    	audiorium=  (Integer) theaterTable.getValueAt(theaterTable.getSelectedRow(), 4);
    	if(movie.getMovieID()>0)
    	 c.show(panel, "seatMap");
    	else
    		c.show(panel, "browseMovie");
	}
	public void setMovie(BrowseMovie movie) {
		this.movie=movie;
	}
	public void setSeatMap(SeatMap map) {
		this.map=map;
	}




	public void setAction(CardLayout c, JPanel panel) {
		
		this.c=c;
		this.panel=panel;
	}
}
