package model;

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