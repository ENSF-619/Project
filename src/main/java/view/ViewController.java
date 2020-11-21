package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Checkbox;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Label;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Component;

public class ViewController {

	private JFrame frame;
	private JTable movieTable;
	int barcode;
	String movie;
	String genre;
	String rating;
	String review;
	int theaterID;
	String theaterName,address,showTime;
	private JTable theaterTable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewController window = new ViewController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		final JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(panel);
		final CardLayout c =new CardLayout(0,0);
		panel.setLayout(c);
		
		JPanel home = new JPanel();
		home.setBackground(SystemColor.inactiveCaption);
		panel.add(home, "home");
		home.setLayout(null);
		
		JButton searchMovie = new JButton("Browse Movies");
		searchMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchMovie.setBounds(65, 80, 164, 25);
		home.add(searchMovie);
		
		JButton searchTheater = new JButton("Browse Theaters");
		searchTheater.setBounds(243, 80, 164, 25);
		home.add(searchTheater);
		
		JPanel browseMovie = new JPanel();
		browseMovie.setBackground(SystemColor.inactiveCaption);
		panel.add(browseMovie, "browseMovie");
		browseMovie.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		browseMovie.add(scrollPane, BorderLayout.CENTER);
		DefaultTableModel tableModel = new DefaultTableModel();
		movieTable = new JTable(tableModel);
		movieTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableModel.addColumn("MovieID");
		tableModel.addColumn("Movie");
		tableModel.addColumn("Genre");
		tableModel.addColumn("Rating");
		tableModel.addColumn("Review");
		tableModel.insertRow(0, new Object [] {10002,"Titanic","Romance","PG-13","4"});
//        System.out.println(doc.get("Barcode")+" "+doc.get("Tire Name"));
		c.show(panel, "browseMovie");
		//load table
		//pass the tableModel to constructo of inventory loader
	
//		tableModel.insertRow(0, new Object[] {10020,"Winter",23,2});
//		tableModel.insertRow(0, new Object[] {100222230,"Summer",23,2});

		scrollPane.setViewportView(movieTable);
		
		JPanel browseTheater = new JPanel();
		browseTheater.setBackground(SystemColor.inactiveCaption);
		panel.add(browseTheater, "browseTheater");
		browseTheater.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		browseTheater.add(scrollPane_1, BorderLayout.CENTER);
		DefaultTableModel tableModel1 = new DefaultTableModel();
		theaterTable = new JTable(tableModel1);
		
		theaterTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableModel1.addColumn("TheaterID");
		tableModel1.addColumn("Theater Name");
		tableModel1.addColumn("Address");
		tableModel1.addColumn("ShowTime");
		tableModel1.insertRow(0, new Object [] {10002,"Cineplex","Ne","20/11/2020 6:00 pm"});
//        System.out.println(doc.get("Barcode")+" "+doc.get("Tire Name"));
	//	c.show(panel, "browseMovie");
		scrollPane_1.setViewportView(theaterTable);
		
		JPanel seatMap = new JPanel();
		panel.add(seatMap, "seatMap");
		
		JPanel purchase = new JPanel();
		purchase.setBackground(SystemColor.inactiveCaption);
		panel.add(purchase, "purchase");
		purchase.setLayout(null);
		
		JButton screen = new JButton("Screen");
		screen.setBackground(new Color(255, 250, 205));
		screen.setBounds(-12, 0, 562, 25);
		purchase.add(screen);
		
		JLabel lblNewLabel = new JLabel("Row 1");
		lblNewLabel.setBounds(0, 50, 56, 16);
		purchase.add(lblNewLabel);
		
		JLabel lblRow = new JLabel("Row 2");
		lblRow.setBounds(0, 94, 56, 16);
		purchase.add(lblRow);
		
		JLabel lblRow_1 = new JLabel("Row 3");
		lblRow_1.setBounds(0, 141, 56, 16);
		purchase.add(lblRow_1);
		
		JLabel lblRow_3 = new JLabel("Row 4");
		lblRow_3.setBounds(0, 193, 56, 16);
		purchase.add(lblRow_3);
		
		Box row1 = Box.createHorizontalBox();
		row1.setBounds(64, 44, 509, 34);
		purchase.add(row1);
		
		JButton A1 = new JButton("");
		A1.setMaximumSize(new Dimension(30, 25));
		A1.setMinimumSize(new Dimension(88, 25));
		row1.add(A1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut);
		
		JButton B1 = new JButton("");
		B1.setMinimumSize(new Dimension(88, 25));
		B1.setMaximumSize(new Dimension(30, 25));
		row1.add(B1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut_1);
		
		JButton C1 = new JButton("");
		C1.setMinimumSize(new Dimension(88, 25));
		C1.setMaximumSize(new Dimension(30, 25));
		row1.add(C1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut_2);
		
		JButton D1 = new JButton("");
		D1.setMinimumSize(new Dimension(88, 25));
		D1.setMaximumSize(new Dimension(30, 25));
		row1.add(D1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut_3);
		
		JButton E1 = new JButton("");
		E1.setMinimumSize(new Dimension(88, 25));
		E1.setMaximumSize(new Dimension(30, 25));
		row1.add(E1);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut_4);
		
		JButton F1 = new JButton("");
		F1.setMinimumSize(new Dimension(88, 25));
		F1.setMaximumSize(new Dimension(30, 25));
		row1.add(F1);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut_5);
		
		JButton G1 = new JButton("");
		G1.setMinimumSize(new Dimension(88, 25));
		G1.setMaximumSize(new Dimension(30, 25));
		row1.add(G1);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		row1.add(horizontalStrut_6);
		
		JButton H1 = new JButton("");
		H1.setMinimumSize(new Dimension(88, 25));
		H1.setMaximumSize(new Dimension(30, 25));
		row1.add(H1);
		
		Box row2 = Box.createHorizontalBox();
		row2.setBounds(64, 94, 509, 34);
		purchase.add(row2);
		
		JButton A2 = new JButton("");
		A2.setMinimumSize(new Dimension(88, 25));
		A2.setMaximumSize(new Dimension(30, 25));
		row2.add(A2);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_7);
		
		JButton B2 = new JButton("");
		B2.setMinimumSize(new Dimension(88, 25));
		B2.setMaximumSize(new Dimension(30, 25));
		row2.add(B2);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_8);
		
		JButton C2 = new JButton("");
		C2.setMinimumSize(new Dimension(88, 25));
		C2.setMaximumSize(new Dimension(30, 25));
		row2.add(C2);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_9);
		
		JButton D2 = new JButton("");
		D2.setMinimumSize(new Dimension(88, 25));
		D2.setMaximumSize(new Dimension(30, 25));
		row2.add(D2);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_10);
		
		JButton E2 = new JButton("");
		E2.setMinimumSize(new Dimension(88, 25));
		E2.setMaximumSize(new Dimension(30, 25));
		row2.add(E2);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_11);
		
		JButton F2 = new JButton("");
		F2.setMinimumSize(new Dimension(88, 25));
		F2.setMaximumSize(new Dimension(30, 25));
		row2.add(F2);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_12);
		
		JButton G2 = new JButton("");
		G2.setMinimumSize(new Dimension(88, 25));
		G2.setMaximumSize(new Dimension(30, 25));
		row2.add(G2);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		row2.add(horizontalStrut_13);
		
		JButton H2 = new JButton("");
		H2.setMinimumSize(new Dimension(88, 25));
		H2.setMaximumSize(new Dimension(30, 25));
		row2.add(H2);
		
		Box Row3 = Box.createHorizontalBox();
		Row3.setBounds(64, 141, 509, 34);
		purchase.add(Row3);
		
		JButton A3 = new JButton("");
		A3.setMinimumSize(new Dimension(88, 25));
		A3.setMaximumSize(new Dimension(30, 25));
		Row3.add(A3);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_14);
		
		JButton B3 = new JButton("");
		B3.setMinimumSize(new Dimension(88, 25));
		B3.setMaximumSize(new Dimension(30, 25));
		Row3.add(B3);
		
		Component horizontalStrut_15 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_15);
		
		JButton C3 = new JButton("");
		C3.setMinimumSize(new Dimension(88, 25));
		C3.setMaximumSize(new Dimension(30, 25));
		Row3.add(C3);
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_16);
		
		JButton D3 = new JButton("");
		D3.setMinimumSize(new Dimension(88, 25));
		D3.setMaximumSize(new Dimension(30, 25));
		Row3.add(D3);
		
		Component horizontalStrut_17 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_17);
		
		JButton E3 = new JButton("");
		E3.setMinimumSize(new Dimension(88, 25));
		E3.setMaximumSize(new Dimension(30, 25));
		Row3.add(E3);
		
		Component horizontalStrut_18 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_18);
		
		JButton F3 = new JButton("");
		F3.setMinimumSize(new Dimension(88, 25));
		F3.setMaximumSize(new Dimension(30, 25));
		Row3.add(F3);
		
		Component horizontalStrut_19 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_19);
		
		JButton G3 = new JButton("");
		G3.setMinimumSize(new Dimension(88, 25));
		G3.setMaximumSize(new Dimension(30, 25));
		Row3.add(G3);
		
		Component horizontalStrut_20 = Box.createHorizontalStrut(20);
		Row3.add(horizontalStrut_20);
		
		JButton H3 = new JButton("");
		H3.setMinimumSize(new Dimension(88, 25));
		H3.setMaximumSize(new Dimension(30, 25));
		Row3.add(H3);
		
		Box row4 = Box.createHorizontalBox();
		row4.setBounds(64, 193, 509, 34);
		purchase.add(row4);
		
		JButton A4 = new JButton("");
		A4.setMinimumSize(new Dimension(88, 25));
		A4.setMaximumSize(new Dimension(30, 25));
		row4.add(A4);
		
		Component horizontalStrut_21 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_21);
		
		JButton B4 = new JButton("");
		B4.setMinimumSize(new Dimension(88, 25));
		B4.setMaximumSize(new Dimension(30, 25));
		row4.add(B4);
		
		Component horizontalStrut_22 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_22);
		
		JButton C4 = new JButton("");
		C4.setMinimumSize(new Dimension(88, 25));
		C4.setMaximumSize(new Dimension(30, 25));
		row4.add(C4);
		
		Component horizontalStrut_23 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_23);
		
		JButton D4 = new JButton("");
		D4.setMinimumSize(new Dimension(88, 25));
		D4.setMaximumSize(new Dimension(30, 25));
		row4.add(D4);
		
		Component horizontalStrut_24 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_24);
		
		JButton E4 = new JButton("");
		E4.setMinimumSize(new Dimension(88, 25));
		E4.setMaximumSize(new Dimension(30, 25));
		row4.add(E4);
		
		Component horizontalStrut_25 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_25);
		
		JButton F4 = new JButton("");
		F4.setMinimumSize(new Dimension(88, 25));
		F4.setMaximumSize(new Dimension(30, 25));
		row4.add(F4);
		
		Component horizontalStrut_26 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_26);
		
		JButton G4 = new JButton("");
		G4.setMinimumSize(new Dimension(88, 25));
		G4.setMaximumSize(new Dimension(30, 25));
		row4.add(G4);
		
		Component horizontalStrut_27 = Box.createHorizontalStrut(20);
		row4.add(horizontalStrut_27);
		
		JButton H4 = new JButton("");
		H4.setVisible(false);
		H4.setMinimumSize(new Dimension(88, 25));
		H4.setMaximumSize(new Dimension(30, 25));
		row4.add(H4);
		
		JPanel regesterPanel = new JPanel();
		panel.add(regesterPanel, "regester");
		
		JPanel cancelTicketPanel = new JPanel();
		panel.add(cancelTicketPanel, "cancelTicket");
		
		JPanel cancelMembership = new JPanel();
		panel.add(cancelMembership, "cancelMembership");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu homeItem = new JMenu("Home");
		menuBar.add(homeItem);
		
		JMenu menuTab = new JMenu("Menu");
		menuBar.add(menuTab);
		
		JMenuItem loginMenuItem = new JMenuItem("Login");
		loginMenuItem.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuTab.add(loginMenuItem);
		
		JMenuItem cancelTicket = new JMenuItem("CancelTicket");
		cancelTicket.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuTab.add(cancelTicket);
		
		JMenuItem regester = new JMenuItem("Regester");
		menuTab.add(regester);
		movieTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	            // do some actions here, for example
	            // print first column value from selected row
	        	 barcode=  (Integer) movieTable.getValueAt(movieTable.getSelectedRow(), 0);
	        	 movie= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 1);
	        	 genre=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 2);
	        	 rating=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 3);
	        	 review=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 4);
	        	 c.show(panel, "browseTheater");
	        }
	    });
		theaterTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	            // do some actions here, for example
	            // print first column value from selected row
	        	 theaterID=  (Integer) movieTable.getValueAt(movieTable.getSelectedRow(), 0);
	        	 theaterName= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 1);
	        	 address=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 2);
	        	 showTime= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 3);
	        	 c.show(panel, "purchase");
	        }
	    });
		System.out.println(movie+genre);
		c.show(panel, "browseMovie");
		
	}
}
