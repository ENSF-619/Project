package model;
/**
 * ENSF 619 Group Project
 * RegList holds a list of all registered users in the system. Funcionality includes
 * verification of username and password for login as well as add functionality 
 * to allow for new registered users upon account creation.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
import java.util.ArrayList;

public class RegList {

	ArrayList<RegisteredUser> registeredUsers;
	

	public RegList(ArrayList<RegisteredUser> regUsers){
		this.registeredUsers = regUsers;
	}

	public boolean checkUserName(String username) {
    	for (RegisteredUser registeredUser : registeredUsers) {
    		if(registeredUser.getUsername().equals(username)) {
    			return true;
    		}
    	}
		return false;
    }
	
	public boolean checkPassword(String username, String password) {
    	for (RegisteredUser registeredUser : registeredUsers) {
    		if(registeredUser.getUsername().equals(username) && 
    				registeredUser.getPassword().equals(password)) {
    			return true;
    		}
    	}
		return false;
    }
	
	public RegisteredUser getUser(String username, String password) {
    	for (RegisteredUser registeredUser : registeredUsers) {
    		System.err.println(username);
    		if(registeredUser.getUsername().equals(username) && 
    				registeredUser.getPassword().equals(password)) {
    			return registeredUser;
    		}
    	}
		return null;
    }
	
	public void addUser(RegisteredUser user) {
		if(!checkUserName(user.getUsername())){
			registeredUsers.add(user);
		}
	}

	public void removeUser(RegisteredUser user){
		if(checkUserName(user.getUsername())){
			registeredUsers.remove(user);
		}
	}

}