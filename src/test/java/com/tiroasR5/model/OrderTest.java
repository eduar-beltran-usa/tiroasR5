/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiroasR5.model;

import java.util.Date;
import java.util.Map;
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
public class OrderTest {
    
    public OrderTest() {
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
     * Test of getId method, of class Order.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Order instance = new Order();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisterDay method, of class Order.
     */
    @Test
    public void testGetRegisterDay() {
        System.out.println("getRegisterDay");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getRegisterDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Order.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalesMan method, of class Order.
     */
    @Test
    public void testGetSalesMan() {
        System.out.println("getSalesMan");
        Order instance = new Order();
        User expResult = null;
        User result = instance.getSalesMan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducts method, of class Order.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        Order instance = new Order();
        Map<String, Accessory> expResult = null;
        Map<String, Accessory> result = instance.getProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantities method, of class Order.
     */
    @Test
    public void testGetQuantities() {
        System.out.println("getQuantities");
        Order instance = new Order();
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = instance.getQuantities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Order.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Order instance = new Order();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisterDay method, of class Order.
     */
    @Test
    public void testSetRegisterDay() {
        System.out.println("setRegisterDay");
        Date registerDay = null;
        Order instance = new Order();
        instance.setRegisterDay(registerDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Order.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Order instance = new Order();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalesMan method, of class Order.
     */
    @Test
    public void testSetSalesMan() {
        System.out.println("setSalesMan");
        User salesMan = null;
        Order instance = new Order();
        instance.setSalesMan(salesMan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProducts method, of class Order.
     */
    @Test
    public void testSetProducts() {
        System.out.println("setProducts");
        Map<String, Accessory> products = null;
        Order instance = new Order();
        instance.setProducts(products);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantities method, of class Order.
     */
    @Test
    public void testSetQuantities() {
        System.out.println("setQuantities");
        Map<String, Integer> quantities = null;
        Order instance = new Order();
        instance.setQuantities(quantities);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Order.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Order instance = new Order();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Order.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Order instance = new Order();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Order.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Order instance = new Order();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = new Order();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
