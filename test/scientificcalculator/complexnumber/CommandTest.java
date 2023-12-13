/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator.complexnumber.variables.Variables;

/**
 *
 * @author utente
 */
public class CommandTest {
    
    public CommandTest() {
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
     * Test of getCommand method, of class Command.
     */
    @Test
    public void testGetCommand() {
        System.out.println("getCommand");
        Command instance = null;
        String expResult = "";
        String result = instance.getCommand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOperand method, of class Command.
     */
    @Test
    public void testIsOperand() {
        System.out.println("isOperand");
        Command instance = null;
        boolean expResult = false;
        boolean result = instance.isOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOperator method, of class Command.
     */
    @Test
    public void testIsOperator() {
        System.out.println("isOperator");
        Command instance = null;
        boolean expResult = false;
        boolean result = instance.isOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMathOperator method, of class Command.
     */
    @Test
    public void testIsMathOperator() {
        System.out.println("isMathOperator");
        Command instance = null;
        boolean expResult = false;
        boolean result = instance.isMathOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStackOperator method, of class Command.
     */
    @Test
    public void testIsStackOperator() {
        System.out.println("isStackOperator");
        Command instance = null;
        boolean expResult = false;
        boolean result = instance.isStackOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVariableOperator method, of class Command.
     */
    @Test
    public void testIsVariableOperator() {
        System.out.println("isVariableOperator");
        Command instance = null;
        boolean expResult = false;
        boolean result = instance.isVariableOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCommand method, of class Command.
     */
    @Test
    public void testExecuteCommand() throws Exception {
        System.out.println("executeCommand");
        Stack stack = null;
        Variables vars = null;
        Command instance = null;
        instance.executeCommand(stack, vars);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
