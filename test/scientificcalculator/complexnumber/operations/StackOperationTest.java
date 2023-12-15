/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber.operations;

import exceptions.SyntaxErrorException;
import exceptions.SystemErrorException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.junit.runners.model.MultipleFailureException.assertEmpty;
import scientificcalculator.complexnumber.ComplexNumber;
import scientificcalculator.complexnumber.Stack;

/**
 *
 * @author sherr
 */
public class StackOperationTest {

    Stack stack;

    public StackOperationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        stack = new Stack(24);
    }

    @After
    public void tearDown() {
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testClear1() throws SystemErrorException {
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        StackOperation so = new StackOperation("clear", stack);
        so.clear();
        assertTrue(stack.stack.isEmpty());
    }

    @Test
    public void testClear2() throws SystemErrorException {
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("5.5+7i"));
        stack.push(new ComplexNumber("66.01"));
        stack.push(new ComplexNumber("98.25+1.02i"));
        stack.push(new ComplexNumber("22-7i"));
        stack.push(new ComplexNumber("666.777i"));
        stack.push(new ComplexNumber("4.4+7i"));
        stack.push(new ComplexNumber("305.2i"));
        stack.push(new ComplexNumber("22i"));
        stack.push(new ComplexNumber("24.05i"));
        StackOperation so = new StackOperation("clear", stack);
        so.clear();
        assertTrue(stack.stack.isEmpty());
    }

    @Test
    public void testClear3() throws SystemErrorException {
        exceptionRule.expect(Error.class);
        StackOperation so = new StackOperation("clear", stack);
        so.clear();
    }

    @Test
    public void testDrop1() throws SystemErrorException {
        stack.push(new ComplexNumber("7+11i"));
        StackOperation so = new StackOperation("drop", stack);
        so.drop();
        assertTrue(stack.stack.isEmpty());
    }

    @Test
    public void testDrop2() throws SystemErrorException {
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("5.5+7i"));
        stack.push(new ComplexNumber("66.01"));
        stack.push(new ComplexNumber("98.25+1.02i"));
        stack.push(new ComplexNumber("22-7i"));
        stack.push(new ComplexNumber("666.777i"));
        stack.push(new ComplexNumber("4.4+7i"));
        stack.push(new ComplexNumber("305.2i"));
        stack.push(new ComplexNumber("22i"));
        stack.push(new ComplexNumber("24.05i"));
        StackOperation so = new StackOperation("drop", stack);
        so.drop();
        assertFalse(stack.isFull());
    }

    @Test
    public void testDrop3() throws SystemErrorException {
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("5.5+7i"));
        stack.push(new ComplexNumber("66.01"));
        StackOperation so = new StackOperation("drop", stack);
        so.drop();
        assertEquals(2, stack.stack.size());
    }

    @Test
    public void testDrop4() throws SystemErrorException {
        exceptionRule.expect(SystemErrorException.class);
        StackOperation so = new StackOperation("clear", stack);
        so.drop();
    }

    @Test
    public void testDup1() throws SyntaxErrorException, SystemErrorException {
        stack.push(new ComplexNumber("5.5+7i"));
        StackOperation so = new StackOperation("dup", stack);
        so.dup();
        ComplexNumber top = stack.peek();
        assertEquals(top, stack.peek());
        assertEquals(stack.peek(), stack.pop());
    }

    @Test
    public void testDup2() throws SyntaxErrorException, SystemErrorException {
        exceptionRule.expect(Error.class);
        StackOperation so = new StackOperation("dup", stack);
        so.dup();
    }

    @Test
    public void testDup3() throws SyntaxErrorException, SystemErrorException {
        exceptionRule.expect(SyntaxErrorException.class);

        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("5.5+7i"));
        stack.push(new ComplexNumber("66.01"));
        stack.push(new ComplexNumber("98.25+1.02i"));
        stack.push(new ComplexNumber("22-7i"));
        stack.push(new ComplexNumber("666.777i"));
        stack.push(new ComplexNumber("4.4+7i"));
        stack.push(new ComplexNumber("305.2i"));
        stack.push(new ComplexNumber("22i"));
        stack.push(new ComplexNumber("24.05i"));
        StackOperation so = new StackOperation("dup", stack);
        so.dup();
    }

    @Test
    public void testSwap1() throws SyntaxErrorException, SystemErrorException {
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        StackOperation so = new StackOperation("swap", stack);
        ComplexNumber top = stack.stack.get(0);
        ComplexNumber snd = stack.stack.get(1);
        so.swap();
        assertEquals("8 + 11i", top.toString());
        assertEquals("7 + 11i", snd.toString());
    }

    @Test
    public void testSwap2() throws SystemErrorException {
        exceptionRule.expect(Error.class);
        stack.push(new ComplexNumber("9.5+7i"));
        StackOperation so = new StackOperation("swap", stack);
        so.solveOperation();
    }

    @Test
    public void testSwap3() {
        exceptionRule.expect(Error.class);
        StackOperation so = new StackOperation("swap", stack);
        so.swap();
    }

    @Test
    public void testOver1() throws SyntaxErrorException, SystemErrorException {
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        StackOperation so = new StackOperation("over", stack);
        ComplexNumber firstTop = stack.peek(); so.over();
        ComplexNumber secondTop = stack.pop();
        ComplexNumber firstTop1 = stack.pop();
        ComplexNumber secondTop1 = stack.pop();
        assertEquals(firstTop, secondTop);
        assertEquals(firstTop1, secondTop1);
    }

    @Test
    public void testOver2() throws SyntaxErrorException, SystemErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("7+11i"));
        stack.push(new ComplexNumber("8+11i"));
        stack.push(new ComplexNumber("99"));
        stack.push(new ComplexNumber("77i"));
        stack.push(new ComplexNumber("45i"));
        stack.push(new ComplexNumber("5.5+7i"));
        stack.push(new ComplexNumber("66.01"));
        stack.push(new ComplexNumber("98.25+1.02i"));
        stack.push(new ComplexNumber("22-7i"));
        stack.push(new ComplexNumber("666.777i"));
        stack.push(new ComplexNumber("4.4+7i"));
        stack.push(new ComplexNumber("305.2i"));
        stack.push(new ComplexNumber("22i"));
        stack.push(new ComplexNumber("24.05i"));
        StackOperation so = new StackOperation("over", stack);
        so.over();
    }

    @Test
    public void testOver3() throws SyntaxErrorException, SystemErrorException {
        exceptionRule.expect(Error.class);
        stack.push(new ComplexNumber("7+11i"));
        StackOperation so = new StackOperation("over", stack);
        so.over();
    }

    @Test
    public void testOver4() throws SyntaxErrorException, SystemErrorException {
        StackOperation so = new StackOperation("over", stack);
        assertTrue(stack.isEmpty());
        //so.over();
    }

}
