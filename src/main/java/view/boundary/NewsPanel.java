package view.boundary;

import java.awt.BorderLayout;
import java.awt.SystemColor;

import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.CinemaController;

public class NewsPanel extends JPanel {
public NewsPanel(final CinemaController cc ) {
	setBackground(SystemColor.inactiveCaption);
	setLayout(new BorderLayout(0, 0));
//	
	JScrollPane scrollPane_3 = new JScrollPane();
	add(scrollPane_3, BorderLayout.CENTER);
//	
	JList newsList = new JList();
	scrollPane_3.setViewportView(newsList);
	newsList.setModel(new AbstractListModel() {
		String[] values = cc.getHub().getNews().news();
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
}
}
