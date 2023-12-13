/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber.variables;

import javafx.collections.ObservableMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author utente
 */
public class VariablesTest {
    
    public VariablesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getMap method, of class Variables.
     */
    @Test
    public void testGetMap() {
        System.out.println("getMap");
        Variables instance = new Variables();
        ObservableMap<Character, Variable> expResult = null;
        ObservableMap<Character, Variable> result = instance.getMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentVariable method, of class Variables.
     */
    @Test
    public void testGetCurrentVariable() {
        System.out.println("getCurrentVariable");
        Variables instance = new Variables();
        Variable expResult = null;
        Variable result = instance.getCurrentVariable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Variables.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Variable var = null;
        Variables instance = new Variables();
        instance.add(var);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Variables.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        char name = ' ';
        Variables instance = new Variables();
        Variable expResult = null;
        Variable result = instance.remove(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Variables.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        char name = ' ';
        Variables instance = new Variables();
        Variable expResult = null;
        Variable result = instance.search(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
