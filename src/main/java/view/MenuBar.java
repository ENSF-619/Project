package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import controller.Observer;

public class MenuBar extends JMenuBar implements ActionListener {
private Observer mc;
private JPanel panel;
private CardLayout c;
JMenuItem regester;

public MenuBar(Observer mc) {
	this.mc=mc;
	
	setBackground(SystemColor.activeCaption);
	
	JMenu homeItem = new JMenu("Home");
	
	add(homeItem);
	
	JMenu menuTab = new JMenu("Menu");
	add(menuTab);
	
	final JMenuItem loginMenuItem = new JMenuItem("Login");

	loginMenuItem.setBorder(new LineBorder(new Color(0, 0, 0)));
	menuTab.add(loginMenuItem);
	
	JMenuItem cancelTicket = new JMenuItem("CancelTicket");

	cancelTicket.setBorder(new LineBorder(new Color(0, 0, 0)));
	menuTab.add(cancelTicket);
	
	regester = new JMenuItem("Regester");
	
	menuTab.add(regester);
	regester.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
if(e.getSource()==regester) {
	c.show(panel, "regester");
}
	
}
}
