/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiroasR5.service;

import com.tiroasR5.model.User;
import java.util.List;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of listAll method, of class UserService.
     */
    @Test
    public void testListAll() {
        System.out.println("listAll");
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserService.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        int id = 0;
        UserService instance = new UserService();
        Optional<User> expResult = null;
        Optional<User> result = instance.getUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UserService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        User user = null;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.create(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        User user = null;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.update(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int userId = 0;
        UserService instance = new UserService();
        boolean expResult = false;
        boolean result = instance.delete(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emailExist method, of class UserService.
     */
    @Test
    public void testEmailExist() {
        System.out.println("emailExist");
        String email = "";
        UserService instance = new UserService();
        boolean expResult = false;
        boolean result = instance.emailExist(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticateUser method, of class UserService.
     */
    @Test
    public void testAutenticateUser() {
        System.out.println("autenticateUser");
        String email = "";
        String password = "";
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.autenticateUser(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBirthtDayMonth method, of class UserService.
     */
    @Test
    public void testListBirthtDayMonth() {
        System.out.println("listBirthtDayMonth");
        String month = "";
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.listBirthtDayMonth(month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
