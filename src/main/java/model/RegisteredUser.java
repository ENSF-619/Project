package model;

public class RegisteredUser extends User{
    private String username;
    
	private String password;
	
	public RegisteredUser(String name, String pass){
		setUsername(name);
		setPassword(pass);
	}
    
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String u){
		this.username = u;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String p){
		this.password = p;
	}


	
}