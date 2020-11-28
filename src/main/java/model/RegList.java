package model;

import java.util.ArrayList;

public class RegList {

	ArrayList<RegisteredUser> registeredUsers;

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
    				registeredUser.getUsername().equals(password)) {
    			return true;
    		}
    	}
		return false;
    }
	
	public RegisteredUser getUser(String username, String password) {
    	for (RegisteredUser registeredUser : registeredUsers) {
    		if(registeredUser.getUsername().equals(username) && 
    				registeredUser.getUsername().equals(password)) {
    			return registeredUser;
    		}
    	}
		return null;
    }
	
	public void addUser(RegisteredUser user) {
		registeredUsers.add(user);
	}

}