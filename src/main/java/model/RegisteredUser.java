package model;
/**
 * ENSF 619 Group Project
 * The class `RegisteredUser` represents registered users that 
 * have created an account in our system.
 * Each registered user has a unique username with a password that allows them 
 * to login to the system.
 * 
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */
public class RegisteredUser extends User {
	/**
	 * The instance variable `username` of type `String`
	 */
	private String username;
	/**
	 * The instance variable `password` of type `String`
	 */
	private String password;
	
	/**
	 * The constructor initializes the values of the instance variables.
	 * @param name - Username
	 * @param pass - Password
	 * @param creditCard - Credit card number
	 * @param fname - First name
	 * @param lname - Last name
	 * @param postal - Postal code
	 * @param address - Address
	 * @param email - Email ID
	 */
	public RegisteredUser(String name, String pass, String creditCard, String fname, String lname, String postal,
			String address, String email) {
		super(creditCard, fname, lname, postal, address, email);
		setUsername(name);
		setPassword(pass);
	}
	
	/**
	 * The getter method for instance variable `username`
	 * @return - Username of the user.
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * The setter method for instance variable `username`
	 * @param u - Username of the user.
	 */
	public void setUsername(String u) {
		this.username = u;
	}
	
	/**
	 * The getter method for instance variable `password`
	 * @return - Password of the user.
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * The setter method for instance variable `password`
	 * @param p - Password of the user.
	 */
	public void setPassword(String p) {
		this.password = p;
	}

}