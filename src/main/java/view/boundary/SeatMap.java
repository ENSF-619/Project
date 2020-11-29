package view.boundary;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CinemaController;
import model.Showtime;
import view.controllers.SeatController;

public class SeatMap extends JPanel{
	ArrayList <JButton> seats;
	SeatController controller;
	private JButton select;
public SeatMap(CinemaController cc, Observer observer, Showtime showTime, CardLayout c, JPanel panel) {
	seats=new ArrayList<JButton>();
	setLayout(null);
	
	JButton btnNewButton = new JButton("Screen");
	btnNewButton.setBackground(SystemColor.info);
	btnNewButton.setBounds(37, 0, 1003, 25);
	add(btnNewButton);
	
	JButton A1 = new JButton("A");
	A1.setIcon(null);
	A1.setBounds(105, 85, 68, 48);
	A1.setName("1A");
	add(A1);
	seats.add(A1);
	
	JLabel lblNewLabel = new JLabel("Row 1");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel.setBounds(12, 99, 56, 16);
	add(lblNewLabel);
	
	JButton B1 = new JButton("B");
	B1.setBounds(245, 85, 68, 48);
	B1.setName("1B");
	add(B1);
	seats.add(B1);
	
	JButton C1 = new JButton("C");
	C1.setBounds(392, 85, 68, 48);
	add(C1);
	C1.setName("1C");
	seats.add(C1);
	
	JButton D1 = new JButton("D");
	D1.setBounds(543, 85, 68, 48);
	add(D1);
	D1.setName("1D");
	seats.add(D1);
	
	JButton E1 = new JButton("E");
	E1.setBounds(706, 85, 68, 48);
	add(E1);
	E1.setName("1E");
	seats.add(E1);
	
	JButton F1 = new JButton("F");
	F1.setBounds(879, 85, 68, 48);
	add(F1);
	F1.setName("1F");
	seats.add(F1);
	
	JButton F2 = new JButton("F");
	F2.setBounds(879, 245, 68, 48);
	add(F2);
	F2.setName("2F");
	seats.add(F2);
	
	JButton E2 = new JButton("E");
	E2.setBounds(706, 245, 68, 48);
	add(E2);
	E2.setName("2E");
	seats.add(E2);
	
	JButton D2 = new JButton("D");
	D2.setBounds(543, 245, 68, 48);
	add(D2);
	D2.setName("2D");
	seats.add(D2);
	
	JButton C2 = new JButton("C");
	C2.setBounds(392, 245, 68, 48);
	add(C2);
	C2.setName("2C");
	seats.add(C2);
	
	JButton B2 = new JButton("B");
	B2.setBounds(245, 245, 68, 48);
	add(B2);
	B2.setName("2B");
	seats.add(B2);
	
	JButton A2 = new JButton("A");
	A2.setBounds(105, 245, 68, 48);
	add(A2);
	A2.setName("2A");
	seats.add(A2);
	
	JLabel lblRow = new JLabel("Row 2");
	lblRow.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblRow.setBounds(12, 259, 56, 16);
	add(lblRow);
	
	JButton F3 = new JButton("F");
	F3.setBounds(879, 419, 68, 48);
	add(F3);
	F3.setName("3F");
	seats.add(F3);
	
	JButton E3 = new JButton("E");
	E3.setBounds(706, 419, 68, 48);
	add(E3);
	E3.setName("3E");
	seats.add(E3);
	
	JButton D3 = new JButton("D");
	D3.setBounds(543, 419, 68, 48);
	add(D3);
	D3.setName("3D");
	seats.add(D3);
	
	JButton C3 = new JButton("C");
	C3.setBounds(392, 419, 68, 48);
	add(C3);
	C3.setName("3C");
	seats.add(C3);
	
	JButton B3 = new JButton("B");
	B3.setBounds(245, 419, 68, 48);
	add(B3);
	B3.setName("3B");
	seats.add(B3);
	
	JButton A3 = new JButton("A");
	A3.setBounds(105, 419, 68, 48);
	add(A3);
	A3.setName("3A");
	seats.add(A3);
	
	JLabel lblRow_1 = new JLabel("Row 3");
	lblRow_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblRow_1.setBounds(12, 433, 56, 16);
	add(lblRow_1);
	
	JButton F4 = new JButton("F");
	F4.setBounds(879, 575, 68, 48);
	add(F4);
	F4.setName("4F");
	seats.add(F4);
	
	JButton E4 = new JButton("E");
	E4.setBounds(706, 575, 68, 48);
	add(E4);
	E4.setName("4E");
	seats.add(E4);
	
	JButton D4 = new JButton("D");
	D4.setBounds(543, 575, 68, 48);
	add(D4);
	D4.setName("4D");
	seats.add(D4);
	
	JButton C4 = new JButton("C");
	C4.setBounds(392, 575, 68, 48);
	add(C4);
	C4.setName("4C");
	seats.add(C4);
	
	JButton B4 = new JButton("B");
	B4.setBounds(245, 575, 68, 48);
	add(B4);
	B4.setName("4B");
	seats.add(B4);
	
	JButton A4 = new JButton("A");
	A4.setBounds(105, 575, 68, 48);
	A4.setName("4A");
	seats.add(A4);
	
	JLabel lblRow_2 = new JLabel("Row 4");
	lblRow_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblRow_2.setBounds(12, 589, 56, 16);
	add(lblRow_2);
	 select = new JButton("select seats");
	select.setForeground(SystemColor.controlDkShadow);
	select.setBackground(SystemColor.activeCaption);
	select.setFont(new Font("Tahoma", Font.PLAIN, 18));
	select.setBounds(874, 661, 135, 48);
	add(select);
	controller=new SeatController(cc,observer,showTime,seats,select,c,panel);
	addActions();
}
private void addActions() {
	for (int i=0;i<seats.size();i++) {
		seats.get(i).addActionListener(controller);
	}
	select.addActionListener(controller);
	
}


}
