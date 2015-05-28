package zaawansowana_java.biblioteka.model;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.mockito.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthorTest {

	Author sut;
	
    @SuppressWarnings("deprecation")
	@Before
    public void setUp() throws Exception {
    	sut=new Author("Jan", "Kowalski", new Date(1990, 5, 5), new Date(1990, 12, 5));
    }

    @After
    public void tearDown() throws Exception {
    	sut.setName("Jan");
    	sut.setLastName("Kowalski");
    	sut.setDateOfBirth(new Date(1990, 5, 5));
    	sut.setDateOfDeath(new Date(1990, 12, 5));
    }

    /**
     * Test of getName method, of class Author.
     */
    @Test
    public void testGetName() {
        String expResult = "Jan";
        String result = sut.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Author.
     */
    @Test
    public void testSetName() {
        String name = "Adam";
        sut.setName("Adam");
        String result=sut.getName();
        assertEquals(name, result);
    }

    /**
     * Test of getLastName method, of class Author.
     */
    @Test
    public void testGetLastName() {
        String expResult = "Kowalski";
        String result = sut.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Author.
     */
    @Test
    public void testSetLastName() {
        String lastName = "Nowak";
        sut.setLastName(lastName);
        assertEquals(lastName, sut.getLastName());
    }

    /**
     * Test of getDateOfBirth method, of class Author.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Author instance = null;
        Date expResult = null;
        Date result = instance.getDateOfBirth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOfBirth method, of class Author.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        Date dateOfBirth = null;
        Author instance = null;
        instance.setDateOfBirth(dateOfBirth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOfDeath method, of class Author.
     */
    @Test
    public void testGetDateOfDeath() {
        System.out.println("getDateOfDeath");
        Author instance = null;
        Date expResult = null;
        Date result = instance.getDateOfDeath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOfDeath method, of class Author.
     */
    @Test
    public void testSetDateOfDeath() {
        System.out.println("setDateOfDeath");
        Date dateOfDeath = null;
        Author instance = null;
        instance.setDateOfDeath(dateOfDeath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Author.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Author instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
