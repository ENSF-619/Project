package model;

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