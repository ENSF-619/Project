package view;

import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import controller.Observer;
import controller.RequestHandler;

public class HomePanel extends JPanel implements ActionListener{
	JButton searchTheater,searchMovie;
	private CardLayout c;
	private JPanel panel;
	private RequestHandler request;
	private Observer mc;
	ObjectMapper mapper=new ObjectMapper();
	ObjectNode node;
public HomePanel(Observer mc) {
	this.mc=mc;
	setBackground(SystemColor.inactiveCaption);
	setLayout(null);
	
	searchMovie = new JButton("Browse Movies");
	searchMovie.setBounds(65, 80, 164, 25);
	add(searchMovie);
	
	 searchTheater = new JButton("Browse Theaters");
	searchTheater.setBounds(243, 80, 164, 25);
	add(searchTheater);
	searchMovie.addActionListener(this);
}
public HomePanel() {
	// TODO Auto-generated constructor stub
}
//public void setActions(CardLayout c, JPanel panel) {
//	this.c=c;
//	this.panel=panel;
//	searchMovie.addActionListener(this);
//	searchTheater.addActionListener(this);
//	
//}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==searchMovie)
		{c.show(panel, "browseMovie");
		node=mapper.createObjectNode();
		node.put("Type", "GET");
		System.err.println(node);
		
		try {
			System.err.println(mc.update(mapper.writeValueAsString(node)));
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	else if (e.getSource()==searchTheater)
		c.show(panel, "browseTheater");
}
public void setActions(CardLayout c, JPanel panel) {
	this.c=c;
	this.panel=panel;
	
}

}
