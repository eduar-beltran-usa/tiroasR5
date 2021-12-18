/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiroasR5.repository;

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
public class AccessoryRepositoryTest {
    
    public AccessoryRepositoryTest() {
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
     * Test of listAll method, of class AccessoryRepository.
     */
    @Test
    public void testListAll() {
        System.out.println("listAll");
        AccessoryRepository instance = new AccessoryRepository();
        List<Accessory> expResult = null;
        List<Accessory> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccesory method, of class AccessoryRepository.
     */
    @Test
    public void testGetAccesory() {
        System.out.println("getAccesory");
        String reference = "";
        AccessoryRepository instance = new AccessoryRepository();
        Optional<Accessory> expResult = null;
        Optional<Accessory> result = instance.getAccesory(reference);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccessoryRepository.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Accessory accesory = null;
        AccessoryRepository instance = new AccessoryRepository();
        Accessory expResult = null;
        Accessory result = instance.create(accesory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessoryRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Accessory accesory = null;
        AccessoryRepository instance = new AccessoryRepository();
        instance.update(accesory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccessoryRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Accessory accesory = null;
        AccessoryRepository instance = new AccessoryRepository();
        instance.delete(accesory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
