package DIT215H16_Team01;

public class User {
	private int id;
	private String username;
	private String password;
	private String mail;
	private boolean userRole;
	
	public User(int id, String username, String password, String mail, boolean userRole){
		this.id = id;
		this.username = username;
		this.password = password;
		this.mail = mail;
		this.userRole = userRole;
	}

	public User(User u){
		this.id = u.id;
		this.username = u.username;
		this.password = u.password;
		this.userRole = u.userRole;
	}
	
	public int getId(){
		return id;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getMail(){
		return this.mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	public boolean isAdministrator(){
		return userRole;
	}
	public boolean userExists(String username){
		return this.username.equals(username);
	}
	public boolean emailExists(String email){
		return this.mail.equals(email);
	}
}

