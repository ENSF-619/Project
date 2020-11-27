package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GUIDesign {

	private JFrame frame;
	private JTable movieTable;
	private JTable theaterTable;
	private JTable showTimeTable;
	private JTextField ticketID;
	private JTextField movieName;
	private JTextField theaterName;
	private JTextField showTime;
	private JTextField seatSelected;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField Email;
	private JTextField creditCardNum;
	private JTextField CCV;
	private JTextField fName;
	private JTextField lName;
	private JTextField email;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField address;
	private JTextField postalCode;
	private JTextField phoneNumber;
	private JTextField userName;
	private JTextField password;
	private JTextField textField;
	private JTextField creditNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDesign window = new GUIDesign();
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
	public GUIDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1112, 822);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu UserMenu = new JMenu("Menu");
		menuBar.add(UserMenu);
		
		JMenuItem loginItem = new JMenuItem("Login");
		UserMenu.add(loginItem);
		
		JMenuItem registerItem = new JMenuItem("Register");
		UserMenu.add(registerItem);
		
		JMenuItem cancelItem = new JMenuItem("Cancel Ticket");
		UserMenu.add(cancelItem);
		
		JMenu newsItem = new JMenu("News");
		newsItem.setVisible(false);//TODO:: checks if login is a Regestered USER then it is enabled
		
		JMenu browseItem = new JMenu("Browse");
		menuBar.add(browseItem);
		menuBar.add(newsItem);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel browsePanel = new JPanel();
		panel.add(browsePanel, "name_296081296350700");
		browsePanel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		browsePanel.add(splitPane, BorderLayout.CENTER);
		
		JPanel browseHeaderPanel = new JPanel();
		browseHeaderPanel.setBackground(SystemColor.activeCaption);
		browseHeaderPanel.setPreferredSize(new Dimension(10, 100));
		browseHeaderPanel.setMinimumSize(new Dimension(100, 100));
		splitPane.setLeftComponent(browseHeaderPanel);
		browseHeaderPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Search by Movie", "Search by Theater"}));
		comboBox.setBounds(94, 28, 167, 22);
		browseHeaderPanel.add(comboBox);
		
		JButton searchBtnBrowsePanel = new JButton("Search");
		searchBtnBrowsePanel.setBounds(305, 27, 97, 25);
		browseHeaderPanel.add(searchBtnBrowsePanel);
		
		JButton allMoviesBtn = new JButton("All Movies");
		allMoviesBtn.setBounds(498, 27, 112, 25);
		browseHeaderPanel.add(allMoviesBtn);
		
		JButton allTheaterBtn = new JButton("All Theaters");
		allTheaterBtn.setBounds(649, 27, 112, 25);
		browseHeaderPanel.add(allTheaterBtn);
		
		JPanel browseTablePanel = new JPanel();
		browseTablePanel.setPreferredSize(new Dimension(10, 800));
		browseTablePanel.setMinimumSize(new Dimension(10, 800));
		splitPane.setRightComponent(browseTablePanel);
		browseTablePanel.setLayout(new CardLayout(0, 0));
		
		JPanel moviePanel = new JPanel();
		moviePanel.setBackground(SystemColor.inactiveCaption);
		browseTablePanel.add(moviePanel, "name_296917148335700");
		moviePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		moviePanel.add(scrollPane, BorderLayout.CENTER);
		
		movieTable = new JTable();
		scrollPane.setViewportView(movieTable);
		
		JPanel theaterPanel = new JPanel();
		browseTablePanel.add(theaterPanel, "name_297093528154100");
		theaterPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		theaterPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		theaterTable = new JTable();
		scrollPane_1.setViewportView(theaterTable);
		
		JPanel showTimePanel = new JPanel();
		panel.add(showTimePanel, "name_297267299186300");
		showTimePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		showTimePanel.add(scrollPane_2, BorderLayout.CENTER);
		
		showTimeTable = new JTable();
		scrollPane_2.setViewportView(showTimeTable);
		
		JPanel seatMap = new JPanel();
		seatMap.setBackground(SystemColor.info);
		panel.add(seatMap, "name_297321563721300");
		seatMap.setLayout(null);
		
		JButton btnNewButton = new JButton("Screen");
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setBounds(37, 0, 1003, 25);
		seatMap.add(btnNewButton);
		
		JButton A1 = new JButton("A");
		A1.setIcon(null);
		A1.setBounds(105, 85, 68, 48);
		seatMap.add(A1);
		
		JLabel lblNewLabel = new JLabel("Row 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 99, 56, 16);
		seatMap.add(lblNewLabel);
		
		JButton B1 = new JButton("B");
		B1.setBounds(245, 85, 68, 48);
		seatMap.add(B1);
		
		JButton C1 = new JButton("C");
		C1.setBounds(392, 85, 68, 48);
		seatMap.add(C1);
		
		JButton D1 = new JButton("D");
		D1.setBounds(543, 85, 68, 48);
		seatMap.add(D1);
		
		JButton E1 = new JButton("E");
		E1.setBounds(706, 85, 68, 48);
		seatMap.add(E1);
		
		JButton F1 = new JButton("F");
		F1.setBounds(879, 85, 68, 48);
		seatMap.add(F1);
		
		JButton F2 = new JButton("F");
		F2.setBounds(879, 245, 68, 48);
		seatMap.add(F2);
		
		JButton E2 = new JButton("E");
		E2.setBounds(706, 245, 68, 48);
		seatMap.add(E2);
		
		JButton D2 = new JButton("D");
		D2.setBounds(543, 245, 68, 48);
		seatMap.add(D2);
		
		JButton C2 = new JButton("C");
		C2.setBounds(392, 245, 68, 48);
		seatMap.add(C2);
		
		JButton B2 = new JButton("B");
		B2.setBounds(245, 245, 68, 48);
		seatMap.add(B2);
		
		JButton A2 = new JButton("A");
		A2.setBounds(105, 245, 68, 48);
		seatMap.add(A2);
		
		JLabel lblRow = new JLabel("Row 2");
		lblRow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRow.setBounds(12, 259, 56, 16);
		seatMap.add(lblRow);
		
		JButton F3 = new JButton("F");
		F3.setBounds(879, 419, 68, 48);
		seatMap.add(F3);
		
		JButton E3 = new JButton("E");
		E3.setBounds(706, 419, 68, 48);
		seatMap.add(E3);
		
		JButton D3 = new JButton("D");
		D3.setBounds(543, 419, 68, 48);
		seatMap.add(D3);
		
		JButton C3 = new JButton("C");
		C3.setBounds(392, 419, 68, 48);
		seatMap.add(C3);
		
		JButton B3 = new JButton("B");
		B3.setBounds(245, 419, 68, 48);
		seatMap.add(B3);
		
		JButton A3 = new JButton("A");
		A3.setBounds(105, 419, 68, 48);
		seatMap.add(A3);
		
		JLabel lblRow_1 = new JLabel("Row 3");
		lblRow_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRow_1.setBounds(12, 433, 56, 16);
		seatMap.add(lblRow_1);
		
		JButton F4 = new JButton("F");
		F4.setBounds(879, 575, 68, 48);
		seatMap.add(F4);
		
		JButton E4 = new JButton("E");
		E4.setBounds(706, 575, 68, 48);
		seatMap.add(E4);
		
		JButton D4 = new JButton("D");
		D4.setBounds(543, 575, 68, 48);
		seatMap.add(D4);
		
		JButton C4 = new JButton("C");
		C4.setBounds(392, 575, 68, 48);
		seatMap.add(C4);
		
		JButton B4 = new JButton("B");
		B4.setBounds(245, 575, 68, 48);
		seatMap.add(B4);
		
		JButton A4 = new JButton("A");
		A4.setBounds(105, 575, 68, 48);
		seatMap.add(A4);
		
		JLabel lblRow_2 = new JLabel("Row 4");
		lblRow_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRow_2.setBounds(12, 589, 56, 16);
		seatMap.add(lblRow_2);
		
		JPanel purchasePanel = new JPanel();
		purchasePanel.setBackground(SystemColor.inactiveCaption);
		panel.add(purchasePanel, "name_298720620389100");
		GridBagLayout gbl_purchasePanel = new GridBagLayout();
		gbl_purchasePanel.columnWidths = new int[]{56, 12, 3, 84, 57, 283, 195, 0};
		gbl_purchasePanel.rowHeights = new int[]{36, 22, 22, 22, 44, 22, 44, 22, 41, 36, 22, 22, 33, 22, 39, 22, 22, 25, 0, 0, 0};
		gbl_purchasePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_purchasePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		purchasePanel.setLayout(gbl_purchasePanel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Info");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		purchasePanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblTicketid = new JLabel("TicketID");
		GridBagConstraints gbc_lblTicketid = new GridBagConstraints();
		gbc_lblTicketid.anchor = GridBagConstraints.NORTH;
		gbc_lblTicketid.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTicketid.insets = new Insets(0, 0, 5, 5);
		gbc_lblTicketid.gridwidth = 2;
		gbc_lblTicketid.gridx = 0;
		gbc_lblTicketid.gridy = 1;
		purchasePanel.add(lblTicketid, gbc_lblTicketid);
		
		ticketID = new JTextField();
		ticketID.setEditable(false);
		GridBagConstraints gbc_ticketID = new GridBagConstraints();
		gbc_ticketID.anchor = GridBagConstraints.NORTHEAST;
		gbc_ticketID.insets = new Insets(0, 0, 5, 5);
		gbc_ticketID.gridx = 3;
		gbc_ticketID.gridy = 1;
		purchasePanel.add(ticketID, gbc_ticketID);
		ticketID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Movie Name");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridwidth = 2;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		purchasePanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		movieName = new JTextField();
		movieName.setEditable(false);
		movieName.setColumns(10);
		GridBagConstraints gbc_movieName = new GridBagConstraints();
		gbc_movieName.anchor = GridBagConstraints.NORTHWEST;
		gbc_movieName.insets = new Insets(0, 0, 5, 5);
		gbc_movieName.gridwidth = 3;
		gbc_movieName.gridx = 3;
		gbc_movieName.gridy = 2;
		purchasePanel.add(movieName, gbc_movieName);
		
		JLabel lblNewLabel_3 = new JLabel("Theater");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		purchasePanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		theaterName = new JTextField();
		theaterName.setEditable(false);
		theaterName.setColumns(10);
		GridBagConstraints gbc_theaterName = new GridBagConstraints();
		gbc_theaterName.anchor = GridBagConstraints.NORTHWEST;
		gbc_theaterName.insets = new Insets(0, 0, 5, 5);
		gbc_theaterName.gridwidth = 2;
		gbc_theaterName.gridx = 3;
		gbc_theaterName.gridy = 3;
		purchasePanel.add(theaterName, gbc_theaterName);
		
		JLabel lblNewLabel_4 = new JLabel("ShowTime");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		purchasePanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		showTime = new JTextField();
		showTime.setEditable(false);
		showTime.setColumns(10);
		GridBagConstraints gbc_showTime = new GridBagConstraints();
		gbc_showTime.anchor = GridBagConstraints.NORTHWEST;
		gbc_showTime.insets = new Insets(0, 0, 5, 5);
		gbc_showTime.gridwidth = 2;
		gbc_showTime.gridx = 3;
		gbc_showTime.gridy = 5;
		purchasePanel.add(showTime, gbc_showTime);
		
		JLabel lblNewLabel_5 = new JLabel("Seats");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 7;
		purchasePanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		seatSelected = new JTextField();
		seatSelected.setEditable(false);
		seatSelected.setColumns(10);
		GridBagConstraints gbc_seatSelected = new GridBagConstraints();
		gbc_seatSelected.anchor = GridBagConstraints.NORTHWEST;
		gbc_seatSelected.insets = new Insets(0, 0, 5, 5);
		gbc_seatSelected.gridwidth = 2;
		gbc_seatSelected.gridx = 3;
		gbc_seatSelected.gridy = 7;
		purchasePanel.add(seatSelected, gbc_seatSelected);
		
		JLabel lblPaymentInfo = new JLabel("Payment Info");
		lblPaymentInfo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblPaymentInfo = new GridBagConstraints();
		gbc_lblPaymentInfo.fill = GridBagConstraints.BOTH;
		gbc_lblPaymentInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaymentInfo.gridwidth = 5;
		gbc_lblPaymentInfo.gridx = 0;
		gbc_lblPaymentInfo.gridy = 9;
		purchasePanel.add(lblPaymentInfo, gbc_lblPaymentInfo);
		
		JLabel lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridwidth = 2;
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 10;
		purchasePanel.add(lblFirstName, gbc_lblFirstName);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		GridBagConstraints gbc_firstName = new GridBagConstraints();
		gbc_firstName.anchor = GridBagConstraints.NORTHWEST;
		gbc_firstName.insets = new Insets(0, 0, 5, 5);
		gbc_firstName.gridx = 3;
		gbc_firstName.gridy = 10;
		purchasePanel.add(firstName, gbc_firstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridwidth = 2;
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 11;
		purchasePanel.add(lblLastName, gbc_lblLastName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		GridBagConstraints gbc_lastName = new GridBagConstraints();
		gbc_lastName.anchor = GridBagConstraints.NORTHWEST;
		gbc_lastName.insets = new Insets(0, 0, 5, 5);
		gbc_lastName.gridx = 3;
		gbc_lastName.gridy = 11;
		purchasePanel.add(lastName, gbc_lastName);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 13;
		purchasePanel.add(lblEmail, gbc_lblEmail);
		
		Email = new JTextField();
		Email.setColumns(10);
		GridBagConstraints gbc_Email = new GridBagConstraints();
		gbc_Email.anchor = GridBagConstraints.NORTHWEST;
		gbc_Email.insets = new Insets(0, 0, 5, 5);
		gbc_Email.gridx = 3;
		gbc_Email.gridy = 13;
		purchasePanel.add(Email, gbc_Email);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		GridBagConstraints gbc_lblCreditCardNumber = new GridBagConstraints();
		gbc_lblCreditCardNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCreditCardNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreditCardNumber.gridwidth = 4;
		gbc_lblCreditCardNumber.gridx = 0;
		gbc_lblCreditCardNumber.gridy = 15;
		purchasePanel.add(lblCreditCardNumber, gbc_lblCreditCardNumber);
		
		creditCardNum = new JTextField();
		creditCardNum.setColumns(10);
		GridBagConstraints gbc_creditCardNum = new GridBagConstraints();
		gbc_creditCardNum.anchor = GridBagConstraints.NORTHEAST;
		gbc_creditCardNum.insets = new Insets(0, 0, 5, 5);
		gbc_creditCardNum.gridx = 3;
		gbc_creditCardNum.gridy = 15;
		purchasePanel.add(creditCardNum, gbc_creditCardNum);
		
		JLabel lblExpireDate = new JLabel("Expire Date");
		GridBagConstraints gbc_lblExpireDate = new GridBagConstraints();
		gbc_lblExpireDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblExpireDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblExpireDate.gridwidth = 2;
		gbc_lblExpireDate.gridx = 0;
		gbc_lblExpireDate.gridy = 16;
		purchasePanel.add(lblExpireDate, gbc_lblExpireDate);
		
		JComboBox monthComboBox = new JComboBox();
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		monthComboBox.setSelectedIndex(0);
		GridBagConstraints gbc_monthComboBox = new GridBagConstraints();
		gbc_monthComboBox.anchor = GridBagConstraints.NORTH;
		gbc_monthComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_monthComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_monthComboBox.gridx = 3;
		gbc_monthComboBox.gridy = 16;
		purchasePanel.add(monthComboBox, gbc_monthComboBox);
		
		JComboBox yearComboBox = new JComboBox();
		yearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "2020", "2021", "2022", "2023", "2024"}));
		GridBagConstraints gbc_yearComboBox = new GridBagConstraints();
		gbc_yearComboBox.anchor = GridBagConstraints.NORTHWEST;
		gbc_yearComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_yearComboBox.gridx = 4;
		gbc_yearComboBox.gridy = 16;
		purchasePanel.add(yearComboBox, gbc_yearComboBox);
		
		JLabel lblCcv = new JLabel("CCV");
		GridBagConstraints gbc_lblCcv = new GridBagConstraints();
		gbc_lblCcv.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCcv.insets = new Insets(0, 0, 5, 5);
		gbc_lblCcv.gridx = 0;
		gbc_lblCcv.gridy = 17;
		purchasePanel.add(lblCcv, gbc_lblCcv);
		
		CCV = new JTextField();
		CCV.setColumns(10);
		GridBagConstraints gbc_CCV = new GridBagConstraints();
		gbc_CCV.fill = GridBagConstraints.HORIZONTAL;
		gbc_CCV.insets = new Insets(0, 0, 5, 5);
		gbc_CCV.gridx = 3;
		gbc_CCV.gridy = 17;
		purchasePanel.add(CCV, gbc_CCV);
		
		JButton purchaseBtn = new JButton("Purchase");
		GridBagConstraints gbc_purchaseBtn = new GridBagConstraints();
		gbc_purchaseBtn.insets = new Insets(0, 0, 0, 5);
		gbc_purchaseBtn.anchor = GridBagConstraints.NORTH;
		gbc_purchaseBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_purchaseBtn.gridx = 3;
		gbc_purchaseBtn.gridy = 19;
		purchasePanel.add(purchaseBtn, gbc_purchaseBtn);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(SystemColor.inactiveCaption);
		panel.add(loginPanel, "name_299827014012100");
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("User Name");
		lblNewLabel_7.setBounds(266, 144, 107, 16);
		loginPanel.add(lblNewLabel_7);
		
		userName = new JTextField();
		userName.setBounds(385, 141, 116, 22);
		loginPanel.add(userName);
		userName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(266, 189, 107, 16);
		loginPanel.add(lblPassword);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(385, 186, 116, 22);
		loginPanel.add(password);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(353, 254, 97, 25);
		loginPanel.add(loginBtn);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(SystemColor.inactiveCaption);
		panel.add(registerPanel, "name_299848635141200");
		GridBagLayout gbl_registerPanel = new GridBagLayout();
		gbl_registerPanel.columnWidths = new int[]{56, 12, 0, 3, 0, 0, 140, 57, 283, 195, 0};
		gbl_registerPanel.rowHeights = new int[]{36, 22, 22, 22, 44, 22, 44, 22, 41, 0, 36, 22, 0, 22, 33, 22, 39, 22, 22, 25, 0, 0, 0};
		gbl_registerPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_registerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registerPanel.setLayout(gbl_registerPanel);
		
		JLabel lblUserInfo = new JLabel("User Info");
		lblUserInfo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblUserInfo = new GridBagConstraints();
		gbc_lblUserInfo.fill = GridBagConstraints.BOTH;
		gbc_lblUserInfo.gridwidth = 8;
		gbc_lblUserInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserInfo.gridx = 0;
		gbc_lblUserInfo.gridy = 0;
		registerPanel.add(lblUserInfo, gbc_lblUserInfo);
		
		JLabel label_7 = new JLabel("First Name");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 1;
		registerPanel.add(label_7, gbc_label_7);
		
		fName = new JTextField();
		fName.setColumns(10);
		GridBagConstraints gbc_fName = new GridBagConstraints();
		gbc_fName.fill = GridBagConstraints.HORIZONTAL;
		gbc_fName.anchor = GridBagConstraints.NORTH;
		gbc_fName.insets = new Insets(0, 0, 5, 5);
		gbc_fName.gridx = 1;
		gbc_fName.gridy = 1;
		registerPanel.add(fName, gbc_fName);
		
		JLabel label_8 = new JLabel("Last Name");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 2;
		registerPanel.add(label_8, gbc_label_8);
		
		lName = new JTextField();
		lName.setColumns(10);
		GridBagConstraints gbc_lName = new GridBagConstraints();
		gbc_lName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lName.anchor = GridBagConstraints.NORTH;
		gbc_lName.insets = new Insets(0, 0, 5, 5);
		gbc_lName.gridx = 1;
		gbc_lName.gridy = 2;
		registerPanel.add(lName, gbc_lName);
		
		JLabel label_9 = new JLabel("Email");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 3;
		registerPanel.add(label_9, gbc_label_9);
		
		email = new JTextField();
		email.setColumns(10);
		GridBagConstraints gbc_email = new GridBagConstraints();
		gbc_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_email.anchor = GridBagConstraints.NORTH;
		gbc_email.insets = new Insets(0, 0, 5, 5);
		gbc_email.gridx = 1;
		gbc_email.gridy = 3;
		registerPanel.add(email, gbc_email);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 0;
		gbc_lblAddress.gridy = 4;
		registerPanel.add(lblAddress, gbc_lblAddress);
		
		address = new JTextField();
		address.setColumns(10);
		GridBagConstraints gbc_address = new GridBagConstraints();
		gbc_address.insets = new Insets(0, 0, 5, 5);
		gbc_address.fill = GridBagConstraints.HORIZONTAL;
		gbc_address.gridx = 1;
		gbc_address.gridy = 4;
		registerPanel.add(address, gbc_address);
		
		JLabel lblPostal = new JLabel("Postal");
		GridBagConstraints gbc_lblPostal = new GridBagConstraints();
		gbc_lblPostal.anchor = GridBagConstraints.EAST;
		gbc_lblPostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPostal.gridx = 0;
		gbc_lblPostal.gridy = 5;
		registerPanel.add(lblPostal, gbc_lblPostal);
		
		postalCode = new JTextField();
		postalCode.setColumns(10);
		GridBagConstraints gbc_postalCode = new GridBagConstraints();
		gbc_postalCode.insets = new Insets(0, 0, 5, 5);
		gbc_postalCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_postalCode.gridx = 1;
		gbc_postalCode.gridy = 5;
		registerPanel.add(postalCode, gbc_postalCode);
		
		JLabel PhoneNu = new JLabel("Phone Number");
		GridBagConstraints gbc_PhoneNu = new GridBagConstraints();
		gbc_PhoneNu.anchor = GridBagConstraints.EAST;
		gbc_PhoneNu.insets = new Insets(0, 0, 5, 5);
		gbc_PhoneNu.gridx = 0;
		gbc_PhoneNu.gridy = 6;
		registerPanel.add(PhoneNu, gbc_PhoneNu);
		
		phoneNumber = new JTextField();
		phoneNumber.setColumns(10);
		GridBagConstraints gbc_phoneNumber = new GridBagConstraints();
		gbc_phoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_phoneNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneNumber.gridx = 1;
		gbc_phoneNumber.gridy = 6;
		registerPanel.add(phoneNumber, gbc_phoneNumber);
		
		JLabel label = new JLabel("Payment Info");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 8;
		registerPanel.add(label, gbc_label);
		
		JLabel label_10 = new JLabel("Credit Card Number");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 10;
		registerPanel.add(label_10, gbc_label_10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.anchor = GridBagConstraints.NORTH;
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 10;
		registerPanel.add(textField_8, gbc_textField_8);
		
		JLabel label_11 = new JLabel("Expire Date");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 3;
		gbc_label_11.gridy = 10;
		registerPanel.add(label_11, gbc_label_11);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setSelectedIndex(0);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 4;
		gbc_comboBox_1.gridy = 10;
		registerPanel.add(comboBox_1, gbc_comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Year", "2020", "2021", "2022", "2023"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.gridx = 5;
		gbc_comboBox_2.gridy = 10;
		registerPanel.add(comboBox_2, gbc_comboBox_2);
		
		JLabel label_12 = new JLabel("CCV");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 3;
		gbc_label_12.gridy = 11;
		registerPanel.add(label_12, gbc_label_12);
		
		textField_9 = new JTextField();
		textField_9.setColumns(3);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.anchor = GridBagConstraints.WEST;
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 11;
		registerPanel.add(textField_9, gbc_textField_9);
		
		JButton registerBtn = new JButton("Register");
		GridBagConstraints gbc_registerBtn = new GridBagConstraints();
		gbc_registerBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_registerBtn.anchor = GridBagConstraints.NORTH;
		gbc_registerBtn.insets = new Insets(0, 0, 5, 5);
		gbc_registerBtn.gridx = 1;
		gbc_registerBtn.gridy = 12;
		registerPanel.add(registerBtn, gbc_registerBtn);
		
		JPanel newsPanel = new JPanel();
		newsPanel.setBackground(SystemColor.inactiveCaption);
		panel.add(newsPanel, "name_300321879098400");
		newsPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		newsPanel.add(scrollPane_3, BorderLayout.CENTER);
		
		JList newsList = new JList();
		scrollPane_3.setViewportView(newsList);
		
		JPanel cancelTicketPanel = new JPanel();
		cancelTicketPanel.setBackground(SystemColor.inactiveCaption);
		panel.add(cancelTicketPanel, "name_300420731691800");
		cancelTicketPanel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Ticket ID");
		lblNewLabel_6.setBounds(50, 49, 56, 16);
		cancelTicketPanel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(148, 46, 116, 22);
		cancelTicketPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCreditcardNumber = new JLabel("CreditCard Number");
		lblCreditcardNumber.setBounds(12, 91, 110, 16);
		cancelTicketPanel.add(lblCreditcardNumber);
		
		creditNum = new JTextField();
		creditNum.setColumns(10);
		creditNum.setBounds(148, 88, 116, 22);
		cancelTicketPanel.add(creditNum);
		
		JButton refundBtn = new JButton("Refund");
		refundBtn.setBounds(195, 156, 97, 25);
		cancelTicketPanel.add(refundBtn);
	}
}
