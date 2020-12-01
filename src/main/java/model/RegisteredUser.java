package model;

/**
 * ENSF 619 Group Project
 * This class represents registered users that have created an account in our system.
 * Each reguser has a unique username with a password that allows them
 * to login to the system.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

public class RegisteredUser extends User {
	private String username;
	private String password;

	public RegisteredUser(String name, String pass, String creditCard, String fname, String lname, String postal,
			String address, String email) {
		super(creditCard, fname, lname, postal, address, email);
		setUsername(name);
		setPassword(pass);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String u) {
		this.username = u;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String p) {
		this.password = p;
	}

}