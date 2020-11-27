package view;

public interface Communicator {
	public String getMovieVariables(String json);
	public String getTheaterVariables(String json);
	public String getShowtimeVariables(String json);
	public String getSeatVariables(String json);
	public void setLoginStatus(int status);
	public void updateMovieTable();
	public void updateTheaterTable();
	public void updateShowTimeTable();
	public void updateSeatMap();
	
	

}
