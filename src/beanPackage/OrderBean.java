package beanPackage;

import java.util.ArrayList;
import java.util.List;

public class OrderBean implements java.io.Serializable {

	private static final long serialVersionUID = 7209323009817047718L;
	int tableNo;
	String guestNo;
	String guestName;
	String contactNo;
	float billamount;
	List quantity = new ArrayList();
	List itemordered = new ArrayList();
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public String getGuestNo() {
		return guestNo;
	}
	public void setGuestNo(String guestNo) {
		this.guestNo = guestNo;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public float getBillamount() {
		return billamount;
	}
	public void setBillamount(float billamount) {
		this.billamount = billamount;
	}
	public List getQuantity() {
		return quantity;
	}
	public void setQuantity(List quantity) {
		this.quantity = quantity;
	}
	public List getItemordered() {
		return itemordered;
	}
	public void setItemordered(List itemordered) {
		this.itemordered = itemordered;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
