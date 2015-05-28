/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaawansowana_java.biblioteka.controller;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import zaawansowana_java.biblioteka.model.User;

/**
 *
 * @author Maciek
 */
public class UserDatabaseTest {
    
    public UserDatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUsers method, of class UserDatabase.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserDatabase instance = new UserDatabase();
        List<User> expResult = null;
        List<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class UserDatabase.
     */
    @Test
    public void testSetUsers() {
        System.out.println("setUsers");
        List<User> users = null;
        UserDatabase instance = new UserDatabase();
        instance.setUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserDatabase.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User user = null;
        UserDatabase instance = new UserDatabase();
        instance.addUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class UserDatabase.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        UserDatabase instance = new UserDatabase();
        instance.removeUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
