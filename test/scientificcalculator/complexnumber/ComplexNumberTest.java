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

/**
 *
 * @author utente
 */
public class ComplexNumberTest {
    
    public ComplexNumberTest() {
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
     * Test of sum method, of class ComplexNumber.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        ComplexNumber n = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class ComplexNumber.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        ComplexNumber n = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.sub(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class ComplexNumber.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        ComplexNumber n = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.multiply(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class ComplexNumber.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        ComplexNumber n = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.divide(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of squareRoot method, of class ComplexNumber.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("squareRoot");
        ComplexNumber instance = null;
        ComplexNumber[] expResult = null;
        ComplexNumber[] result = instance.squareRoot();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signChange method, of class ComplexNumber.
     */
    @Test
    public void testSignChange() {
        System.out.println("signChange");
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.signChange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRealPart method, of class ComplexNumber.
     */
    @Test
    public void testGetRealPart() {
        System.out.println("getRealPart");
        ComplexNumber instance = null;
        double expResult = 0.0;
        double result = instance.getRealPart();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImPart method, of class ComplexNumber.
     */
    @Test
    public void testGetImPart() {
        System.out.println("getImPart");
        ComplexNumber instance = null;
        double expResult = 0.0;
        double result = instance.getImPart();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ComplexNumber.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ComplexNumber instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
