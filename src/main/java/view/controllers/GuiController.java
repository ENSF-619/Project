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
import view.boundary.RefundForm;
import view.boundary.RegistrationForm;


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
	private RegistrationForm registerPanel;
	private RefundForm cancelPanel;

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
			newsItem.setVisible(false);
			
			browseItem = new JMenu("Browse");
			menuBar.add(browseItem);
			menuBar.add(newsItem);
			frame.getContentPane().setLayout(new BorderLayout(0, 0));
			
			
			 panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			 c =new CardLayout(0,0);
			panel.setLayout(c);
			
			 browsePanel = new Browser(cc, this);
			 panel.add(browsePanel, "Browse");
			
			loginPanel = new LoginForm(cc, this);
			loginPanel.setBackground(SystemColor.inactiveCaption);
			panel.add(loginPanel, "Login");
			
			 registerPanel = new RegistrationForm(cc);
			panel.add(registerPanel, "Register");
			cancelPanel =new RefundForm(cc, this);
			panel.add(cancelPanel,"Refund");
			
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
		
		registerPanel.setC(c);
		registerPanel.setPanel(panel);
		
		cancelPanel.setC(c);
		cancelPanel.setPanel(panel);
		
	}

	@Override
	public boolean loginStatus() {
		return regUser;
	}

	@Override
	public void setStatus(boolean status) {
		this.regUser=status;
		newsItem.setVisible(status);
		
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
				c.show(panel, "Refund");
			}
			if(e.getSource()==newsItem) {
				c.show(panel, "News");
			}
				
	}

	@Override
	public void fill() {
		cancelPanel.populateFields();		
	}
		 
	}


	
	
	
	
	
	
	

	


