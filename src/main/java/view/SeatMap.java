package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Observer;
import controller.RequestHandler;

public class SeatMap extends JPanel implements ActionListener{
	JButton A1,B1,C1,D1,E1,F1,G1,H1,A2,B2,C2,D2,E2,F2,G2,H2,A3,B3,C3,D3,E3,F3,G3,H3,A4,B4,C4,D4,E4,F4,G4,H4;
	private CardLayout c;
	private JPanel panel;
	private Observer mc;
public SeatMap(Observer mc) {
	this.mc=mc;
	setBackground(SystemColor.inactiveCaption);
	
	setLayout(null);
	
	JButton screen = new JButton("Screen");
	screen.setBackground(new Color(255, 250, 205));
	screen.setBounds(-12, 0, 562, 25);
	add(screen);
	
	JLabel lblNewLabel = new JLabel("Row 1");
	lblNewLabel.setBounds(0, 50, 56, 16);
	add(lblNewLabel);
	
	JLabel lblRow = new JLabel("Row 2");
	lblRow.setBounds(0, 94, 56, 16);
	add(lblRow);
	
	JLabel lblRow_1 = new JLabel("Row 3");
	lblRow_1.setBounds(0, 141, 56, 16);
	add(lblRow_1);
	
	JLabel lblRow_3 = new JLabel("Row 4");
	lblRow_3.setBounds(0, 193, 56, 16);
	add(lblRow_3);
	
	Box row1 = Box.createHorizontalBox();
	row1.setBounds(64, 44, 509, 34);
	add(row1);
	
	 A1 = new JButton("");
	A1.setMaximumSize(new Dimension(30, 25));
	A1.setMinimumSize(new Dimension(88, 25));
	row1.add(A1);
	
	Component horizontalStrut = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut);
	
	 B1 = new JButton("");
	B1.setMinimumSize(new Dimension(88, 25));
	B1.setMaximumSize(new Dimension(30, 25));
	row1.add(B1);
	
	Component horizontalStrut_1 = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut_1);
	
	 C1 = new JButton("");
	C1.setMinimumSize(new Dimension(88, 25));
	C1.setMaximumSize(new Dimension(30, 25));
	row1.add(C1);
	
	Component horizontalStrut_2 = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut_2);
	
	 D1 = new JButton("");
	D1.setMinimumSize(new Dimension(88, 25));
	D1.setMaximumSize(new Dimension(30, 25));
	row1.add(D1);
	
	Component horizontalStrut_3 = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut_3);
	
	 E1 = new JButton("");
	E1.setMinimumSize(new Dimension(88, 25));
	E1.setMaximumSize(new Dimension(30, 25));
	row1.add(E1);
	
	Component horizontalStrut_4 = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut_4);
	
	 F1 = new JButton("");
	F1.setMinimumSize(new Dimension(88, 25));
	F1.setMaximumSize(new Dimension(30, 25));
	row1.add(F1);
	
	Component horizontalStrut_5 = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut_5);
	
	 G1 = new JButton("");
	G1.setMinimumSize(new Dimension(88, 25));
	G1.setMaximumSize(new Dimension(30, 25));
	row1.add(G1);
	
	Component horizontalStrut_6 = Box.createHorizontalStrut(20);
	row1.add(horizontalStrut_6);
	
	H1 = new JButton("");
	H1.setMinimumSize(new Dimension(88, 25));
	H1.setMaximumSize(new Dimension(30, 25));
	row1.add(H1);
	
	Box row2 = Box.createHorizontalBox();
	row2.setBounds(64, 94, 509, 34);
	add(row2);
	
	A2 = new JButton("");
	A2.setMinimumSize(new Dimension(88, 25));
	A2.setMaximumSize(new Dimension(30, 25));
	row2.add(A2);
	
	Component horizontalStrut_7 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_7);
	
	B2 = new JButton("");
	B2.setMinimumSize(new Dimension(88, 25));
	B2.setMaximumSize(new Dimension(30, 25));
	row2.add(B2);
	
	Component horizontalStrut_8 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_8);
	
	C2 = new JButton("");
	C2.setMinimumSize(new Dimension(88, 25));
	C2.setMaximumSize(new Dimension(30, 25));
	row2.add(C2);
	
	Component horizontalStrut_9 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_9);
	
	D2 = new JButton("");
	D2.setMinimumSize(new Dimension(88, 25));
	D2.setMaximumSize(new Dimension(30, 25));
	row2.add(D2);
	
	Component horizontalStrut_10 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_10);
	
	E2 = new JButton("");
	E2.setMinimumSize(new Dimension(88, 25));
	E2.setMaximumSize(new Dimension(30, 25));
	row2.add(E2);
	
	Component horizontalStrut_11 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_11);
	
	F2 = new JButton("");
	F2.setMinimumSize(new Dimension(88, 25));
	F2.setMaximumSize(new Dimension(30, 25));
	row2.add(F2);
	
	Component horizontalStrut_12 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_12);
	
	 G2 = new JButton("");
	G2.setMinimumSize(new Dimension(88, 25));
	G2.setMaximumSize(new Dimension(30, 25));
	row2.add(G2);
	
	Component horizontalStrut_13 = Box.createHorizontalStrut(20);
	row2.add(horizontalStrut_13);
	
	 H2 = new JButton("");
	H2.setMinimumSize(new Dimension(88, 25));
	H2.setMaximumSize(new Dimension(30, 25));
	row2.add(H2);
	
	Box Row3 = Box.createHorizontalBox();
	Row3.setBounds(64, 141, 509, 34);
	add(Row3);
	
	 A3 = new JButton("");
	A3.setMinimumSize(new Dimension(88, 25));
	A3.setMaximumSize(new Dimension(30, 25));
	Row3.add(A3);
	
	Component horizontalStrut_14 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_14);
	
	 B3 = new JButton("");
	B3.setMinimumSize(new Dimension(88, 25));
	B3.setMaximumSize(new Dimension(30, 25));
	Row3.add(B3);
	
	Component horizontalStrut_15 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_15);
	
	 C3 = new JButton("");
	C3.setMinimumSize(new Dimension(88, 25));
	C3.setMaximumSize(new Dimension(30, 25));
	Row3.add(C3);
	
	Component horizontalStrut_16 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_16);
	
	D3 = new JButton("");
	D3.setMinimumSize(new Dimension(88, 25));
	D3.setMaximumSize(new Dimension(30, 25));
	Row3.add(D3);
	
	Component horizontalStrut_17 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_17);
	
	E3 = new JButton("");
	E3.setMinimumSize(new Dimension(88, 25));
	E3.setMaximumSize(new Dimension(30, 25));
	Row3.add(E3);
	
	Component horizontalStrut_18 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_18);
	
	F3 = new JButton("");
	F3.setMinimumSize(new Dimension(88, 25));
	F3.setMaximumSize(new Dimension(30, 25));
	Row3.add(F3);
	
	Component horizontalStrut_19 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_19);
	
	G3 = new JButton("");
	G3.setMinimumSize(new Dimension(88, 25));
	G3.setMaximumSize(new Dimension(30, 25));
	Row3.add(G3);
	
	Component horizontalStrut_20 = Box.createHorizontalStrut(20);
	Row3.add(horizontalStrut_20);
	
	 H3 = new JButton("");
	H3.setMinimumSize(new Dimension(88, 25));
	H3.setMaximumSize(new Dimension(30, 25));
	Row3.add(H3);
	
	Box row4 = Box.createHorizontalBox();
	row4.setBounds(64, 193, 509, 34);
	add(row4);
	
	A4 = new JButton("");
	A4.setMinimumSize(new Dimension(88, 25));
	A4.setMaximumSize(new Dimension(30, 25));
	row4.add(A4);
	
	Component horizontalStrut_21 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_21);
	
	 B4 = new JButton("");
	B4.setMinimumSize(new Dimension(88, 25));
	B4.setMaximumSize(new Dimension(30, 25));
	row4.add(B4);
	
	Component horizontalStrut_22 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_22);
	
	C4 = new JButton("");
	C4.setMinimumSize(new Dimension(88, 25));
	C4.setMaximumSize(new Dimension(30, 25));
	row4.add(C4);
	
	Component horizontalStrut_23 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_23);
	
	D4 = new JButton("");
	D4.setMinimumSize(new Dimension(88, 25));
	D4.setMaximumSize(new Dimension(30, 25));
	row4.add(D4);
	
	Component horizontalStrut_24 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_24);
	
	E4 = new JButton("");
	E4.setMinimumSize(new Dimension(88, 25));
	E4.setMaximumSize(new Dimension(30, 25));
	row4.add(E4);
	
	Component horizontalStrut_25 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_25);
	
	F4 = new JButton("");
	F4.setMinimumSize(new Dimension(88, 25));
	F4.setMaximumSize(new Dimension(30, 25));
	row4.add(F4);
	
	Component horizontalStrut_26 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_26);
	
	G4 = new JButton("");
	G4.setMinimumSize(new Dimension(88, 25));
	G4.setMaximumSize(new Dimension(30, 25));
	row4.add(G4);
	
	Component horizontalStrut_27 = Box.createHorizontalStrut(20);
	row4.add(horizontalStrut_27);
	
	H4 = new JButton("");
	//H4.setVisible(false);
	H4.setMinimumSize(new Dimension(88, 25));
	H4.setMaximumSize(new Dimension(30, 25));
	row4.add(H4);
}

public void setAction(CardLayout c, JPanel panel) {
	this.c=c;
	this.panel=panel;
	//TODO Add actions
	
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==A1)
	{//new purcahse panel with values take from before
		c.show(panel, "purchase");
		
	}
	
}
public void setTheater(BrowseTheater browseTheater) {
	// TODO Auto-generated method stub
	
}
public void setMovie(BrowseMovie browseMovie) {
	// TODO Auto-generated method stub
	
}
}
