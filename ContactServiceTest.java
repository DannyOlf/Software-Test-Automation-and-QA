package mileStone1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import java.util.Vector;
import org.junit.jupiter.api.Test;

class ContactServiceTest { 

	@Test
	void testCheckID() {//Checks toi make sure an exception is thrown if IDs are NOT unique
		Vector<Contact> testVec = new Vector<Contact>();
		Contact testCont0 = new Contact("John", "Doe", "123 Fake Street", "12345", "1234567890");
		Contact testCont1 = new Contact("Al", "Gore", "ManBearPig", "12345", "1234567890");		
		testVec.add(testCont0);
		testVec.add(testCont1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactService().checkContactID(testVec); 
			});		
	}
	
	@Test
	void testDeleteID() {
		Vector<Contact> testVec = new Vector<Contact>();
		Contact testCont0 = new Contact("John", "Doe", "123 Fake Street", "12345", "1234567890");
		Contact testCont1 = new Contact("Al", "Gore", "ManBearPig", "123456", "1234567890");
		ContactService testService = new ContactService();
		testVec.add(testCont0);
		testVec.add(testCont1);
	    assertTrue(testVec.size() == 2);//make sure the vector is populated
	    testService.deleteContactID("12345", testVec);//should delete Al Gore from vector
	    assertTrue(testVec.size() == 1);	  
	}
	
	@Test
	void testUpdateID() {
		Vector<Contact> testVec = new Vector<Contact>();
		Contact testCont0 = new Contact("John", "Doe", "123 Fake Street", "12345", "1234567890");
		Contact testCont1 = new Contact("Al", "Gore", "ManBearPig", "123456", "1234567890");
		ContactService testService = new ContactService();
		testVec.add(testCont0);
		testVec.add(testCont1);
		assertTrue(testVec.elementAt(1).firstName == "Al");//checks to make sure "Al Gore" is in the vector
		testService.updateContact("123456", testVec);//should update the contact information to the 
        assertTrue(testVec.elementAt(1).firstName == "first name");
		
	}

}