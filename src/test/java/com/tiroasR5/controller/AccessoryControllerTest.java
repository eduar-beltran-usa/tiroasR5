/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiroasR5.controller;

import com.tiroasR5.model.Accessory;
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
public class AccessoryControllerTest {
    
    public AccessoryControllerTest() {
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
     * Test of listAll method, of class AccessoryController.
     */
    @Test
    public void testListAll() {
        System.out.println("listAll");
        AccessoryController instance = new AccessoryController();
        List<Accessory> expResult = null;
        List<Accessory> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccesory method, of class AccessoryController.
     */
    @Test
    public void testGetAccesory() {
        System.out.println("getAccesory");
        String reference = "";
        AccessoryController instance = new AccessoryController();
        Optional<Accessory> expResult = null;
        Optional<Accessory> result = instance.getAccesory(reference);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccessoryController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Accessory accessory = null;
        AccessoryController instance = new AccessoryController();
        Accessory expResult = null;
        Accessory result = instance.create(accessory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessoryController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Accessory accessory = null;
        AccessoryController instance = new AccessoryController();
        Accessory expResult = null;
        Accessory result = instance.update(accessory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccessoryController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String reference = "";
        AccessoryController instance = new AccessoryController();
        boolean expResult = false;
        boolean result = instance.delete(reference);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
