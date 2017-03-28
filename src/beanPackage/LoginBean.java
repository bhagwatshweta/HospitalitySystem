package beanPackage;
import java.io.*;

	/**
	 * @author Preethi
	 *
	 */
	public class LoginBean implements java.io.Serializable
	{
	String Username;
	String pwd;
	String Usertype;

	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUsertype() {
		return Usertype;
	}
	public void setUsertype(String usertype) {
		Usertype = usertype;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
