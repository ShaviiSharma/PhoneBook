package com.Phonebook;

public class Contact {
	private String Name;
	private String PhoneNumber;
	
	public Contact(String Name, String PhoneNumber) {
		this.Name = Name;
		this.PhoneNumber=PhoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber=PhoneNumber;
	}
	public String toString() {
		return "Name:" + Name + " Phone Number: " + PhoneNumber;
	}
}
