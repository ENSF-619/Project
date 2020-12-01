package model;
import java.util.ArrayList;
/**
 * ENSF 619 Group Project
 * The class `RegList` holds a list of all registered users in the system. Functionality includes
 * verification of username and password for login as well as add functionality 
 * to allow for new registered users upon account creation.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class RegList {
	/**
	 * The instance variable `registeredUsers` of type ArrayList RegisteredUser
	 */
	private ArrayList<RegisteredUser> registeredUsers;
	
	/**
	 * The constructor initializes the value of the instance variable
	 * @param regUsers of type ArrayList RegisteredUser
	 */
	public RegList(ArrayList<RegisteredUser> regUsers){
		this.registeredUsers = regUsers;
	}
	
	/**
	 * The method `checkUserName()` is used to validate the given username
	 * @param username of type String
	 * @return True if username exists, else it returns false.
	 */
	public boolean checkUserName(String username) {
    	for (RegisteredUser registeredUser : registeredUsers) {
    		if(registeredUser.getUsername().equals(username)) {
    			return true;
    		}
    	}
		return false;
    }
	
	/**
	 * The method `checkPassword()` is used to validate the given username and password.
	 * @param username of type String
	 * @param password of type String
	 * @return True if combination exists, else it returns false.
	 */
	public boolean checkPassword(String username, String password) {
    	for (RegisteredUser registeredUser : registeredUsers) {
    		if(registeredUser.getUsername().equals(username) && 
    				registeredUser.getPassword().equals(password)) {
    			return true;
    		}
    	}
		return false;
    }
	
	/**
	 * The method `getUser()` returns the `RegisteredUser` with the given username and password.
	 * @param username of type String
	 * @param password of type String
	 * @return RegisteredUser for the given username, password combination.
	 */
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
	
	/**
	 * The method `addUser()` is used to add a `RegisteredUser`
	 * @param user of type `RegisteredUser`
	 */
	public void addUser(RegisteredUser user) {
		if(!checkUserName(user.getUsername())){
			registeredUsers.add(user);
		}
	}
	
	/**
	 * The method `removeUser()` is used to remove a `RegisteredUser`
	 * @param user of type `RegisteredUser`
	 */
	public void removeUser(RegisteredUser user){
		if(checkUserName(user.getUsername())){
			registeredUsers.remove(user);
		}
	}

}