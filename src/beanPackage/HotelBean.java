package beanPackage;

public class HotelBean implements java.io.Serializable
{

	/**
	 * @author Nisarg
	 */
	private static final long serialVersionUID = 7209323009817047718L;
	int guestId;
	String firstName;
	String lastName;
	String contactNo;
	String gender;
	String dob;
	String room;
	String guestNo;
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getGuestNo() {
		return guestNo;
	}
	public void setGuestNo(String guestNo) {
		this.guestNo = guestNo;
	}
	
}