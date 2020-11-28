package view.boundary;

import java.util.ArrayList;

public interface Observer {
	public boolean regUser();
	public ArrayList<Object> getMovieSelection();
	public ArrayList<Object> getTheaterSelection();
	public ArrayList<Object> getShowtimeSelection();
	public ArrayList<Object> getSeatSelection();
}
