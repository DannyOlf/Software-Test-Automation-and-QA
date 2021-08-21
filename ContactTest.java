package mileStone1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	
		
	

	@Test
	void testContact() {  
		Contact test = new Contact("John", "Doe", "123 Fake Street", "12345", "1234567890");	
		assertTrue(test.getFirstName().equals("John") );
		assertTrue(test.getLastName().equals("Doe") );
		assertTrue(test.getAddress().equals("123 Fake Street") );
		assertTrue(test.getID().equals("12345") );
		assertTrue(test.getPhoneNum().equals("1234567890") );

   } 
	
	@Test
	void testFirstName() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//too long
			new Contact("JJJooohhhnnn", "Doe", "123 Fake Street", "12345", "1234567890");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//null
			new Contact(null, "Doe", "123 Fake Street", "12345", "1234567890");
		});
	}
	
	@Test
	void testLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//too long
			new Contact("John", "DDDoooeeeeee", "123 Fake Street", "12345", "1234567890");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//null
			new Contact("John", null, "123 Fake Street", "12345", "1234567890");
		});
	}
	
	@Test
	void testAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//too long
			new Contact("John", "Doe", "123 Fake Street Pluse like thirty extra characters so the exception is triggered", "12345", "1234567890");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//null
			new Contact("John", "Doe", null, "12345", "1234567890");
		});
	}
	
	@Test
	void testID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//too long
			new Contact("John", "Doe", "123 Fake Street", "123456789011", "1234567890");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//null
			new Contact("John", "Doe", "123 Fake Street", null, "1234567890");
		});
	}
	
	@Test
	void testPhoneNum() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//too long
			new Contact("John", "Doe", "123 Fake Street", "12345", "12345678901");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//too short
			new Contact("John", "Doe", "123 Fake Street", "12345", "123456789");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {//not a number
			new Contact("John", "Doe", "123 Fake Street", "12345", "123456789g");
		});

	}
	
}
