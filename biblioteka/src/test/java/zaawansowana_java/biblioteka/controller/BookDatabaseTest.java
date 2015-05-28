/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaawansowana_java.biblioteka.controller;

import java.text.ParseException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import zaawansowana_java.biblioteka.Utils.Utility;
import zaawansowana_java.biblioteka.model.Author;
import zaawansowana_java.biblioteka.model.Book;

/**
 *
 * @author Maciek
 */
public class BookDatabaseTest {
    
	BookDatabase sut;
	
    public BookDatabaseTest() {
    	sut=new BookDatabase();
    }
    
    @Before
    public void setUp() {
    	try {
			sut.addBook(new Book("Carpe Jugulum", "Coś", "Warszawa", 
					Utility.covertStringToSqlDate("1995-12-05"), 
					new Author("Terry", "Pratchett", Utility.covertStringToSqlDate("1940-12-05"), 
							Utility.covertStringToSqlDate("2015-03-05"))));
			sut.addBook(new Book("Pan Tadeusz", "Coś", "Warszawa", 
					Utility.covertStringToSqlDate("1800-12-05"), 
					new Author("Adam", "Mickiewicz", Utility.covertStringToSqlDate("1940-12-05"), 
							Utility.covertStringToSqlDate("2015-03-05"))));
			sut.addBook(new Book("Carpe Jugulum", "Coś", "Warszawa", 
					Utility.covertStringToSqlDate("1995-12-05"), 
					new Author("Terry", "Pratchett", Utility.covertStringToSqlDate("1940-12-05"), 
							Utility.covertStringToSqlDate("2015-03-05"))));
			sut.addBook(new Book("Carpe Jugulum", "Coś", "Warszawa", 
					Utility.covertStringToSqlDate("1995-12-05"), 
					new Author("Terry", "Pratchett", Utility.covertStringToSqlDate("1940-12-05"), 
							Utility.covertStringToSqlDate("2015-03-05"))));
		} catch (ParseException e) {
			System.out.println("Failed to parse");
			//e.printStackTrace();
		}
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBooks method, of class BookDatabase.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        BookDatabase instance = new BookDatabase();
        List<Book> expResult = null;
        List<Book> result = instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooks method, of class BookDatabase.
     */
    @Test
    public void testSetBooks() {
        System.out.println("setBooks");
        List<Book> books = null;
        BookDatabase instance = new BookDatabase();
        instance.setBooks(books);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class BookDatabase.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        BookDatabase instance = new BookDatabase();
        instance.addBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class BookDatabase.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        BookDatabase instance = new BookDatabase();
        instance.removeBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
