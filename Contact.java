package mileStone1;

public class Contact {
	
	//Declare variables 
	public String firstName = "add first name";
	public String lastName = "add last name";
	public String address = "add address";
	public String ID = "add ID";
	public String phoneNum = "add phone number";
	
	//Checks to make sure the phone number is an Integer
	public boolean checkNum(String phoneNum) {
		
		this.phoneNum = phoneNum;
		int numVar;
		
		try { 
			
			numVar = Integer.parseInt(phoneNum);
			return true;
			
		} catch(NumberFormatException e) {
			
			throw new IllegalArgumentException("Invalid phone number");
		}
		
	}
	
	//Contact object:
	public Contact(String firstName, String lastName, String address, String ID, String phoneNum) {
		
		if (firstName == null || firstName.length() > 10) {
			
			throw new IllegalArgumentException("Invalid first name");
	    }
		
		if (lastName == null || lastName.length() > 10) {
			
			throw new IllegalArgumentException("Invalid last name");
	    }
		
		
		if (address == null || address.length() > 30) {
			
			throw new IllegalArgumentException("Invalid last address");
	    }
		
		if (ID == null || ID.length() > 10) {
			
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if (phoneNum == null || phoneNum.length() != 10 || !checkNum(phoneNum)) {
			
			throw new IllegalArgumentException("Invalid phone number");
	    }
		
		//Sets variables 
		this.firstName = firstName;
		this.lastName = lastName; 
		this.address = address;
		this.ID = ID;
		this.phoneNum = phoneNum;
	}
	
	//Getters:
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public String getAddress() {
		
		return address;
	}
	
	public String getID() {
		
		return ID;
	}
	
	public String getPhoneNum() {
		
		return phoneNum;
	}
	
}
