package beanPackage;

public class RegisterBean implements java.io.Serializable{
	
	
	/**
	 * @author Nisarg
	 */
	private static final long serialVersionUID = -5500310294510506261L;
	private String uname;
	private String dob;
	private String email;
	private String pass;
	private String nationality;
	private String User_type;

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getUser_type() {
		return User_type;
	}
	public void setUser_type(String User_type) {
		this.User_type = User_type;
	}
}
