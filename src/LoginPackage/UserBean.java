package LoginPackage;

public class UserBean {
	private String username;
    private String password;
    private String firstName;
    private String lastName;
    public boolean valid;
	
	public String getUsername(){
		return username;
		
	}
	public void setUsername(String newusername){
		username=newusername;
		
	}
	
	public String getPassword(){
		return password;
		
	}
		public void setPassword(String newpassword){
		password=newpassword;
		
	}
	
	public String getFirstname(){
		return firstName;
		
	}
	public void setFirstname(String newfirstname){
		firstName=newfirstname;
		
	}
	
	public String getLastname(){
		return lastName;
		
	}
	public void setLastname(String newlastname){
		
		lastName=newlastname;
		
	}
	
	public Boolean isValid(){
		return valid;
		
	}
	public void setValid(Boolean newvalid){
		
		valid=newvalid;
		
	}
	
	
	
	

}
