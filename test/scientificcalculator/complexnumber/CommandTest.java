/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber;

import exceptions.SyntaxErrorException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import scientificcalculator.complexnumber.variables.Variables;
import static org.junit.Assert.*;

/**
 *
 * @author sherr
 */
public class CommandTest {
    
    public CommandTest() {
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

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testGetCommand1() {
        Command command = new Command("3+4i");
        String out = command.getCommand();
        assertEquals("3+4i",out);
    }
    
    @Test
    public void testGetCommand2() {
        Command command = new Command("+");
        String out = command.getCommand();
        assertEquals("+",out);
    }
    
    @Test
    public void testGetCommand3() {
        Command command = new Command("clear");
        String out = command.getCommand();
        assertEquals("clear",out);
    }
    
    @Test
    public void testGetCommand4() {
        Command command = new Command(">x");
        String out = command.getCommand();
        assertEquals(">x",out);
    }
     
    @Test
    public void testIsOperand1() {
        Command command = new Command("-2+i");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand2() {
        Command command = new Command("5-i8");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand3() {
        Command command = new Command("i-8");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand4() {
        Command command = new Command("-i7+5");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand5() {
        Command command = new Command("12");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand6() {
        Command command = new Command("-7i");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand7() {
        Command command = new Command("i2");
        assertTrue(command.isOperand());
    }
    
    @Test
    public void testIsOperand8() {
        Command command = new Command("3+3");
        assertFalse(command.isOperand());
    }
    
    @Test
    public void testIsOperand9() {
        Command command = new Command("i++");
        assertFalse(command.isOperand());
    }
    
    @Test
    public void testIsOperand10() {
        Command command = new Command("7i7");
        assertFalse(command.isOperand());
    }
    
    @Test
    public void testIsMathOperator1() {
        Command command = new Command("+");
        assertTrue(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator2() {
        Command command = new Command("-");
        assertTrue(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator3() {
        Command command = new Command("*");
        assertTrue(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator4() {
        Command command = new Command("/");
        assertTrue(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator5() {
        Command command = new Command("sqrt");
        assertTrue(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator6() {
        Command command = new Command("+-");
        assertTrue(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator7() {
        Command command = new Command("--");
        assertFalse(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator8() {
        Command command = new Command("++");
        assertFalse(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator9() {
        Command command = new Command("Sqrt");
        assertFalse(command.isMathOperator());
    }
    
    @Test
    public void testIsMathOperator10() {
        Command command = new Command("--");
        assertFalse(command.isMathOperator());
    }
    
    @Test
    public void testIsStackOperator1() {
        Command command = new Command("clear");
        assertTrue(command.isStackOperator());
    }
    
    @Test
    public void testIsStackOperator2() {
        Command command = new Command("drop");
        assertTrue(command.isStackOperator());
    }
    
    @Test
    public void testIsStackOperator3() {
        Command command = new Command("dup");
        assertTrue(command.isStackOperator());
    }
    
    @Test
    public void testIsStackOperator4() {
        Command command = new Command("swap");
        assertTrue(command.isStackOperator());
    }
    
    @Test
    public void testIsStackOperator5() {
        Command command = new Command("over");
        assertTrue(command.isStackOperator());
    }
    
    @Test
    public void testIstackOperator6() {
        Command command = new Command("CLEAR");
        assertFalse(command.isStackOperator());
    }
    
    @Test
    public void testIsStackOperator7() {
        Command command = new Command("DRop");
        assertFalse(command.isStackOperator());
    }
    
    @Test
    public void testIsStackOperator8() {
        Command command = new Command("SWap");
        assertFalse(command.isStackOperator());
    }
    
    @Test
    public void testIsVariableOperator1() {
        Command command = new Command("+a");
        assertTrue(command.isVariableOperator());
    }
    
    @Test
    public void testIsVariableOperator2() {
        Command command = new Command("-b");
        assertTrue(command.isVariableOperator());
    }
    
    @Test
    public void testIsVariableOperator3() {
        Command command = new Command(">c");
        assertTrue(command.isVariableOperator());
    }
    
    @Test
    public void testIsVariableOperator4() {
        Command command = new Command("<d");
        assertTrue(command.isVariableOperator());
    }
    
    @Test
    public void testIsVariableOperator5() {
        Command command = new Command("a");
        assertFalse(command.isVariableOperator());
    }
    
    @Test
    public void testIsVariableOperator6() {
        Command command = new Command("+A");
        assertFalse(command.isVariableOperator());
    }
    
    @Test
    public void testIsVariableOperator7() {
        Command command = new Command("><");
        assertFalse(command.isVariableOperator());
    }

    @Test
    public void testExecuteCommand1() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command("CLEAR");
        command.executeCommand(new Stack(24), new Variables());
    }
    
    @Test
    public void testExecuteCommand2() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command("2+");
        command.executeCommand(new Stack(24), new Variables());
    }

    @Test
    public void testExecuteCommand3() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command(">aa");
        command.executeCommand(new Stack(24), new Variables());
    }
    
    @Test
    public void testExecuteCommand4() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command("2+4.5");
        command.executeCommand(new Stack(24), new Variables());
    }
    
    @Test
    public void testExecuteCommand5() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command("-+");
        command.executeCommand(new Stack(24), new Variables());
    }
    
    @Test
    public void testExecuteCommand6() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command("<A");
        command.executeCommand(new Stack(24), new Variables());
    }
    
    @Test
    public void testExecuteCommand7() throws SyntaxErrorException {
        exceptionRule.expect(SyntaxErrorException.class);
        Command command = new Command("Drop");
        command.executeCommand(new Stack(24), new Variables());
    }
    
}
