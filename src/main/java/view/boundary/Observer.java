package view.boundary;
/**
 * ENSF 619 Group Project
 * Observer is used for info accuirment for registed
 * account creation.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
import java.util.ArrayList;

public interface Observer {
	public boolean loginStatus();
	public void setStatus (boolean status);
	public void setRegUserName(String userName);
	public String getUserName();
	public void setRegPassword(String password);
	public String getPassword();
	public void fill();
}
