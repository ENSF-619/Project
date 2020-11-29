package view.boundary;

import java.util.ArrayList;

public interface Observer {
	public boolean loginStatus();
	public void setStatus (boolean status);
	public void setRegUserName(String userName);
	public String getUserName();
}
