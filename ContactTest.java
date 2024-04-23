
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testGetters() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    // You can add more test cases here to validate edge cases for setters and getters
}
