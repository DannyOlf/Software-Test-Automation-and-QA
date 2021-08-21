package mileStone1;

import java.util.Vector;


/*
The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
firstName
lastName
Number
Address
 */


public class ContactService {
	
	public String firstName = "first name";
	public String lastName = "last name";
	public String address = "add address";
	public String ID = "add ID";
	public String phoneNum = "1234567890";

	
	public Contact contact = new Contact(firstName, lastName, address, ID, phoneNum);
	

	
 public void checkContactID(Vector<Contact> contactService) {//Checks to make each ID in the vector is unique
	int j;
	int i; 
				
	for (i = 0; i<= contactService.size() - 1; ++i ) {
	   for (j = contactService.size() - 1; j >= 0; --j) {
				  
	      this.contact = contactService.elementAt(i);
		  Contact temp = new Contact("John", "Doe", "123 Fake Street", "12345", "1234567890");
		  temp = contactService.elementAt(j);
				   
		  if (contact.ID.equals(temp.ID) && (i != j) ) {
			  
		     throw new IllegalArgumentException("Invalid ID: contacts at index " + i + " and " + j + " have the same ID.");
		  }
	  }		   
   }	
 }
 
 public void deleteContactID(String Id, Vector<Contact> service) {//Removes an element from a vector using an ID as a key	 
	 int i;
					
	 for (i = 0; i<= service.size() - 1; ++i ) {
		if (service.elementAt(i).ID.equals(Id)) {
			
			service.remove(i);	
		}		
	 }	 
 }
 
 public void updateContact(String Id, Vector<Contact> service) {//Updates contact based on Id. 
	 //FIXME:add a way to be able to input information
	 int i;
	 
	 for (i = 0; i<= service.size() - 1; ++i) {
		 if (service.elementAt(i).ID.equals(Id)) {
			 
			 service.elementAt(i).firstName = this.firstName;
			 service.elementAt(i).lastName = this.lastName;
			 service.elementAt(i).phoneNum = this.phoneNum;
			 service.elementAt(i).address = this.address;
		 }
	 }	 
 }
 
}
