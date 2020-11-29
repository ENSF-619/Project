package view.boundary;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.CinemaController;
import view.controllers.BrowserController;

public class Browser extends JPanel{

	private JComboBox comboBox;
	private JButton searchBtnBrowsePanel;
	private JButton allMoviesBtn;
	private JButton allTheaterBtn;
	private JTextField searchField;
	private JList list;
	private CardLayout c;
	private JPanel panel;
	private BrowserController controller;
	private JTable table;
	private DefaultTableModel tableModel;

	public Browser(CinemaController cc,Observer observer) {
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		JPanel browseHeaderPanel = new JPanel();
		browseHeaderPanel.setBackground(SystemColor.activeCaption);
		browseHeaderPanel.setPreferredSize(new Dimension(10, 100));
		browseHeaderPanel.setMinimumSize(new Dimension(100, 100));
		splitPane.setLeftComponent(browseHeaderPanel);
		browseHeaderPanel.setLayout(null);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Search by Movie", "Search by Theater"}));
		comboBox.setBounds(94, 28, 167, 22);
		browseHeaderPanel.add(comboBox);
		
		searchBtnBrowsePanel = new JButton("Search");
		searchBtnBrowsePanel.setBounds(305, 27, 97, 25);
		browseHeaderPanel.add(searchBtnBrowsePanel);
		
		 allMoviesBtn = new JButton("All Movies");
		allMoviesBtn.setBounds(498, 27, 112, 25);
		browseHeaderPanel.add(allMoviesBtn);
		
		allTheaterBtn = new JButton("All Theaters");
		allTheaterBtn.setBounds(649, 27, 112, 25);
		browseHeaderPanel.add(allTheaterBtn);
		
		searchField = new JTextField();
		searchField.setBounds(94, 65, 167, 22);
		browseHeaderPanel.add(searchField);
		searchField.setColumns(10);
		
		JPanel browseTablePanel = new JPanel();
		browseTablePanel.setPreferredSize(new Dimension(10, 800));
		browseTablePanel.setMinimumSize(new Dimension(10, 800));
		splitPane.setRightComponent(browseTablePanel);
		browseTablePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		browseTablePanel.add(scrollPane, BorderLayout.CENTER);
		tableModel=new DefaultTableModel();
		table = new JTable(tableModel);
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.setViewportView(table);
			
		controller=new BrowserController(observer,comboBox,searchField,searchBtnBrowsePanel,allMoviesBtn,allTheaterBtn,table,tableModel);
	}

	public void setC(CardLayout c) {
		this.controller.setC(c);
	}

	public void setPanel(JPanel panel) {
		this.controller.setPanel(panel);
	}

	public void setActions() {
		comboBox.addActionListener(controller);
		searchBtnBrowsePanel.addActionListener(controller);
		allMoviesBtn.addActionListener(controller);
		allTheaterBtn.addActionListener(controller);
		table.getSelectionModel().addListSelectionListener(controller);
		
		
	}
	
}
