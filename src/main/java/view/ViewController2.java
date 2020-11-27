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

import com.fasterxml.jackson.core.JsonProcessingException;

import controller.ModelController;
import controller.RequestHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Component;

public class ViewController2 {

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
	private JTextField regUserName;
	private JTextField regPassword;
	private JTextField regAddress;
	private JTextField regPhone;
	private JTextField regEmail;
	private JTextField regCreditCard;
	private JTextField loginUserName;
	private JTextField loginPassword;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField cancelMemName;
	private JTextField cancelMemPass;
	private JTextField fname;
	private JTextField lname;
	private JTextField email;
	private JTextField credit;
	JButton searchTheater,searchMovie;
	private JTable showTimeTable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewController2 window = new ViewController2();
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
	public ViewController2() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		RequestHandler request =new RequestHandler();
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		final JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(panel);
		final CardLayout c =new CardLayout(0,0);
		panel.setLayout(c);
		
		HomePanel home = new HomePanel(request);
		panel.add(home, "home");

		BrowseMovie browseMovie = new BrowseMovie(request);
		panel.add(browseMovie, "browseMovie");
		BrowseTheater browseTheater = new BrowseTheater(request);
		panel.add(browseTheater, "browseTheater");
		
		SeatMap seatMap = new SeatMap(request);
		panel.add(seatMap, "seatMap");
		
		RegesterPanel regesterPanel = new RegesterPanel();
		panel.add(regesterPanel, "regester");

		
		JPanel cancelTicketPanel = new CancelTicket();
		panel.add(cancelTicketPanel, "cancelTicket");
		JPanel cancelMembership = new JPanel();
		panel.add(cancelMembership, "cancelMembership");
		
		JMenuBar menuBar = new MenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
//		movieTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//	        public void valueChanged(ListSelectionEvent event) {
//	            // do some actions here, for example
//	            // print first column value from selected row
//	        	 barcode=  (Integer) movieTable.getValueAt(movieTable.getSelectedRow(), 0);
//	        	 movie= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 1);
//	        	 genre=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 2);
//	        	 rating=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 3);
//	        	 review=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 4);
//	        	 c.show(panel, "browseTheater");
//	        }
//	    });
//		theaterTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//	        public void valueChanged(ListSelectionEvent event) {
//	            // do some actions here, for example
//	            // print first column value from selected row
//	        	 theaterID=  (Integer) movieTable.getValueAt(movieTable.getSelectedRow(), 0);
//	        	 theaterName= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 1);
//	        	 address=(String) movieTable.getValueAt(movieTable.getSelectedRow(), 2);
//	        	 showTime= (String) movieTable.getValueAt(movieTable.getSelectedRow(), 3);
//	        	 c.show(panel, "purchase");
//	        }
//	    });
		c.show(panel, "home");
		
		JPanel login = new LoginPanel();
		panel.add(login, "login");
		
		JPanel purchase = new PurchasePanel();
		panel.add(purchase, "purchase");
		browseMovie.setAction(c,panel);
		browseTheater.setAction(c,panel);
		browseMovie.setTheater(browseTheater);
		browseTheater.setMovie(browseMovie);
		seatMap.setAction(c,panel);
		seatMap.setTheater(browseTheater);
		seatMap.setMovie(browseMovie);
		home.setActions(c,panel);
		
		JPanel showTimePanel = new JPanel();
		showTimePanel.setBackground(SystemColor.inactiveCaption);
		panel.add(showTimePanel, "name_2004895173489600");
		showTimePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		showTimePanel.add(scrollPane, BorderLayout.CENTER);
		
		showTimeTable = new JTable();
		scrollPane.setViewportView(showTimeTable);
		
		
//		homeItem.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				c.show(panel, "home");
//			}
//		});
//		loginMenuItem.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				if(e.getSource()==loginMenuItem)
//					c.show(panel,"login");				
//			}
//		});
//		cancelTicket.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				c.show(panel, "cancelTicket");
//			}
//		});
		
		
	}
	
}
