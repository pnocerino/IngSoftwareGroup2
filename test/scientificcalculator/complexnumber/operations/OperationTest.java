/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber.operations;

import exceptions.SyntaxErrorException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator.complexnumber.Stack;

/**
 *
 * @author utente
 */
public class OperationTest {
    
    public OperationTest() {
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
     * Test of getOperator method, of class Operation.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Operation instance = null;
        String expResult = "";
        String result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStack method, of class Operation.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        Operation instance = null;
        Stack expResult = null;
        Stack result = instance.getStack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveOperation method, of class Operation.
     */
    @Test
    public void testSolveOperation() throws Exception {
        System.out.println("solveOperation");
        Operation instance = null;
        instance.solveOperation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class OperationImpl extends Operation {

        public OperationImpl() {
            super("", null);
        }

        public void solveOperation() throws SyntaxErrorException {
        }
    }
    
}
