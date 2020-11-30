package view.controllers;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.CinemaController;
import view.boundary.Browser;
import view.boundary.LoginForm;


public class GuiController implements view.boundary.Observer,ActionListener{
	String userName,password;
	 private JFrame frame;
	private JMenuItem loginItem;
	private JMenuItem registerItem;
	private JMenuItem cancelItem;
	private JMenu newsItem;
	private JMenu browseItem;
	private Browser browsePanel;
	private boolean regUser;
	private LoginForm loginPanel;
	private JPanel panel;
	private CardLayout c;

	public GuiController(CinemaController cc) {
		 	frame = new JFrame();
			frame.setBounds(100, 100, 1112, 822);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setVisible(true);
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			JMenu UserMenu = new JMenu("Menu");
			menuBar.add(UserMenu);
			
			loginItem = new JMenuItem("Login");
			UserMenu.add(loginItem);
			
			
			registerItem = new JMenuItem("Register");
			UserMenu.add(registerItem);
			
			cancelItem = new JMenuItem("Cancel Ticket");
			UserMenu.add(cancelItem);
			
			
			newsItem = new JMenu("News");
			newsItem.setVisible(false);//TODO:: checks if login is a Regestered USER then it is enabled
			
			browseItem = new JMenu("Browse");
			menuBar.add(browseItem);
			menuBar.add(newsItem);
			frame.getContentPane().setLayout(new BorderLayout(0, 0));
			
			
			 panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			 c =new CardLayout(0,0);
			panel.setLayout(c);
			panel.add(panel,"home");
			
			 browsePanel = new Browser(cc, this);
			 panel.add(browsePanel, "Browse");
			
			loginPanel = new LoginForm(cc, this);
			loginPanel.setBackground(SystemColor.inactiveCaption);
			panel.add(loginPanel, "Login");
			
			JPanel registerPanel = new JPanel();
			panel.add(registerPanel, "Register");
			
			c.show(panel, "Browse");
//			
//			JPanel newsPanel = new JPanel();
//			newsPanel.setBackground(SystemColor.inactiveCaption);
//			panel.add(newsPanel, "name_300321879098400");
//			newsPanel.setLayout(new BorderLayout(0, 0));
//			
//			JScrollPane scrollPane_3 = new JScrollPane();
//			newsPanel.add(scrollPane_3, BorderLayout.CENTER);
//			
//			JList newsList = new JList();
//			scrollPane_3.setViewportView(newsList);
//			
//			JPanel cancelTicketPanel = new JPanel();
//			cancelTicketPanel.setBackground(SystemColor.inactiveCaption);
//			panel.add(cancelTicketPanel, "name_300420731691800");
//			cancelTicketPanel.setLayout(null);
//			
//			JLabel lblNewLabel_6 = new JLabel("Ticket ID");
//			lblNewLabel_6.setBounds(50, 49, 56, 16);
//			cancelTicketPanel.add(lblNewLabel_6);
//			
//			textField = new JTextField();
//			textField.setBounds(148, 46, 116, 22);
//			cancelTicketPanel.add(textField);
//			textField.setColumns(10);
//			
//			JLabel lblCreditcardNumber = new JLabel("CreditCard Number");
//			lblCreditcardNumber.setBounds(12, 91, 110, 16);
//			cancelTicketPanel.add(lblCreditcardNumber);
//			
//			creditNum = new JTextField();
//			creditNum.setColumns(10);
//			creditNum.setBounds(148, 88, 116, 22);
//			cancelTicketPanel.add(creditNum);
//			
//			JButton refundBtn = new JButton("Refund");
//			refundBtn.setBounds(206, 312, 97, 25);
//			cancelTicketPanel.add(refundBtn);
//			
//			JLabel lblExpiryDate = new JLabel("Expiry Date");
//			lblExpiryDate.setBounds(12, 137, 110, 16);
//			cancelTicketPanel.add(lblExpiryDate);
//			
//			JComboBox month = new JComboBox();
//			month.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
//			month.setSelectedIndex(0);
//			month.setBounds(134, 134, 62, 22);
//			cancelTicketPanel.add(month);
//			
//			JComboBox year = new JComboBox();
//			year.setModel(new DefaultComboBoxModel(new String[] {"Year", "2020", "2021", "2022", "2023"}));
//			year.setSelectedIndex(0);
//			year.setBounds(206, 134, 62, 22);
//			cancelTicketPanel.add(year);
//			
//			JLabel lblCcv_1 = new JLabel("CCV");
//			lblCcv_1.setBounds(12, 180, 110, 16);
//			cancelTicketPanel.add(lblCcv_1);
//			
//			CCVCancelTicket = new JTextField();
//			CCVCancelTicket.setColumns(10);
//			CCVCancelTicket.setBounds(148, 169, 116, 22);
//			cancelTicketPanel.add(CCVCancelTicket);
//			
//			JLabel Fname = new JLabel("First Name");
//			Fname.setBounds(12, 226, 110, 16);
//			cancelTicketPanel.add(Fname);
//			
//			FnameCancelTicket = new JTextField();
//			FnameCancelTicket.setColumns(10);
//			FnameCancelTicket.setBounds(148, 223, 116, 22);
//			cancelTicketPanel.add(FnameCancelTicket);
//			
//			JLabel lblLastName_1 = new JLabel("Last Name");
//			lblLastName_1.setBounds(12, 267, 110, 16);
//			cancelTicketPanel.add(lblLastName_1);
//			
//			LnameCancelTicket = new JTextField();
//			LnameCancelTicket.setColumns(10);
//			LnameCancelTicket.setBounds(148, 264, 116, 22);
//			cancelTicketPanel.add(LnameCancelTicket);
		
			setControllers();
	
			loginItem.addActionListener(this);
			registerItem.addActionListener(this);
			cancelItem.addActionListener(this);
			newsItem.addActionListener(this);
		
			browseItem.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					c.show(panel, "Browse");
				}
			});;
			
	
	}

	private void setControllers() {
		browsePanel.setC(c);
		browsePanel.setPanel(panel);
		browsePanel.setActions();
		
		loginPanel.setC(c);
		loginPanel.setPanel(panel);
		loginPanel.setActions();
		
	}

	@Override
	public boolean loginStatus() {
		return regUser;
	}

	@Override
	public void setStatus(boolean status) {
		this.regUser=status;
		newsItem.setVisible(true);
	}

	@Override
	public void setRegUserName(String userName) {
		this.userName=userName;
		
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setRegPassword(String password) {
		this.password=password;
		
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==loginItem) {
				c.show(panel, "Login");
			}
			if (e.getSource()==registerItem) {
				c.show(panel, "Register");
			}
			if(e.getSource()==cancelItem) {
				c.show(panel, "Cancel");
			}
			if(e.getSource()==newsItem) {
				c.show(panel, "News");
			}
				
	}
		 
	}


	
	
	
	
	
	
	

	


