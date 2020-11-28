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
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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

	public Browser(CinemaController cc) {
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
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Hello", "you "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setC(CardLayout c) {
		this.controller.
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void set() {
		
	}
	
}
