package view.controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.CinemaController;

public class BrowserController implements ActionListener,ListSelectionListener {
	
	private JComboBox comboBox;
	private JButton searchBtnBrowsePanel;
	private JButton allMoviesBtn;
	private JButton allTheaterBtn;
	private JTextField searchField;
	private JList list;
	private CardLayout c;
	public CardLayout getC() {
		return c;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	private JPanel panel;
	private CinemaController cc;



	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
