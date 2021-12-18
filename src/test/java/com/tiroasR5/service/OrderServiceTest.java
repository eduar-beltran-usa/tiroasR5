/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiroasR5.service;

import com.tiroasR5.model.Order;
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
public class OrderServiceTest {
    
    public OrderServiceTest() {
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
     * Test of getAll method, of class OrderService.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        OrderService instance = new OrderService();
        List<Order> expResult = null;
        List<Order> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder method, of class OrderService.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        int id = 0;
        OrderService instance = new OrderService();
        Optional<Order> expResult = null;
        Optional<Order> result = instance.getOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class OrderService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Order order = null;
        OrderService instance = new OrderService();
        Order expResult = null;
        Order result = instance.create(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class OrderService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Order order = null;
        OrderService instance = new OrderService();
        Order expResult = null;
        Order result = instance.update(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class OrderService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        OrderService instance = new OrderService();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByZone method, of class OrderService.
     */
    @Test
    public void testFindByZone() {
        System.out.println("findByZone");
        String zona = "";
        OrderService instance = new OrderService();
        List<Order> expResult = null;
        List<Order> result = instance.findByZone(zona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordersSalesManByID method, of class OrderService.
     */
    @Test
    public void testOrdersSalesManByID() {
        System.out.println("ordersSalesManByID");
        Integer id = null;
        OrderService instance = new OrderService();
        List<Order> expResult = null;
        List<Order> result = instance.ordersSalesManByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordersSalesManByState method, of class OrderService.
     */
    @Test
    public void testOrdersSalesManByState() {
        System.out.println("ordersSalesManByState");
        String state = "";
        Integer id = null;
        OrderService instance = new OrderService();
        List<Order> expResult = null;
        List<Order> result = instance.ordersSalesManByState(state, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordersSalesManByDate method, of class OrderService.
     */
    @Test
    public void testOrdersSalesManByDate() {
        System.out.println("ordersSalesManByDate");
        String dateStr = "";
        Integer id = null;
        OrderService instance = new OrderService();
        List<Order> expResult = null;
        List<Order> result = instance.ordersSalesManByDate(dateStr, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
