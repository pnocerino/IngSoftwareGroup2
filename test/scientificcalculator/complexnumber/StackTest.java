package scientificcalculator.complexnumber;

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

public class StackTest {
   
    Stack stack = new Stack(24);
   
    public StackTest() {
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
    public void testPush1() throws SystemErrorException, SyntaxErrorException {
        ComplexNumber num = new ComplexNumber ("5i");
        stack.push(num);
        assertEquals("5i", stack.peek().toString());
    }
   
    @Test
    public void testPush2() throws SystemErrorException, SyntaxErrorException {
        ComplexNumber num1 = new ComplexNumber ("45i");
        stack.push(num1);
        ComplexNumber num2 = new ComplexNumber ("77i");
        stack.push(num2);
        ComplexNumber num3 = new ComplexNumber ("99i");
        stack.push(num3);
        ComplexNumber num4 = new ComplexNumber ("8+11i");
        stack.push(num4);
        ComplexNumber num5 = new ComplexNumber ("7+11i");
        stack.push(num5);
               
        ComplexNumber test = new ComplexNumber("6-43i");
        stack.push(test);
        assertEquals("6 - 43i", stack.peek().toString());
    }
   
    @Test(expected = SystemErrorException.class)
    public void testPush3() throws SystemErrorException, SyntaxErrorException {
      
        ComplexNumber num1 = new ComplexNumber ("45i");
        stack.push(num1);
        ComplexNumber num2 = new ComplexNumber ("7.7i");
        stack.push(num2);
        ComplexNumber num3 = new ComplexNumber ("99");
        stack.push(num3);
        ComplexNumber num4 = new ComplexNumber ("8+11i");
        stack.push(num4);
        ComplexNumber num5 = new ComplexNumber ("7+11i");
        stack.push(num5);
        ComplexNumber num6 = new ComplexNumber ("45.3i");
        stack.push(num6);
        ComplexNumber num7 = new ComplexNumber ("77i");
        stack.push(num7);
        ComplexNumber num8 = new ComplexNumber ("99");
        stack.push(num8);
        ComplexNumber num9 = new ComplexNumber ("8+11i");
        stack.push(num9);
        ComplexNumber num10 = new ComplexNumber ("7+11i");
        stack.push(num10);
        ComplexNumber num11 = new ComplexNumber ("4i");
        stack.push(num11);
        ComplexNumber num12 = new ComplexNumber ("7i");
        stack.push(num12);
        ComplexNumber num13 = new ComplexNumber ("79");
        stack.push(num13);
        ComplexNumber num14 = new ComplexNumber ("1.8+11i");
        stack.push(num14);
        ComplexNumber num15 = new ComplexNumber ("7+11i");
        stack.push(num15);
        ComplexNumber num16 = new ComplexNumber ("45i");
        stack.push(num16);
        ComplexNumber num17 = new ComplexNumber ("77i");
        stack.push(num17);
        ComplexNumber num18 = new ComplexNumber ("96.2");
        stack.push(num18);
        ComplexNumber num19 = new ComplexNumber ("8+11i");
        stack.push(num19);
        ComplexNumber num20 = new ComplexNumber ("7+11i");
        stack.push(num20);
        ComplexNumber num21 = new ComplexNumber ("45i");
        stack.push(num21);
        ComplexNumber num22 = new ComplexNumber ("77i");
        stack.push(num22);
        ComplexNumber num23 = new ComplexNumber ("99");
        stack.push(num23);
        ComplexNumber num24 = new ComplexNumber ("8+11i");
        stack.push(num24);       
      
        ComplexNumber num = new ComplexNumber("7");
        stack.push(num);
        assertEquals("7", stack.peek().toString());
    }
       
    @Test
    public void testPop1() throws SystemErrorException, SyntaxErrorException {
       
        ComplexNumber num1 = new ComplexNumber ("45i");
        stack.push(num1);
        ComplexNumber num2 = new ComplexNumber ("77i");
        stack.push(num2);
        ComplexNumber num3 = new ComplexNumber ("99");
        stack.push(num3);
        ComplexNumber num4 = new ComplexNumber ("8+11i");
        stack.push(num4);
        ComplexNumber num5 = new ComplexNumber ("7+11i");
        stack.push(num5);
       
        ComplexNumber top = new ComplexNumber("0");
        top = stack.peek();
        ComplexNumber num = new ComplexNumber("0");
        num=stack.pop();
        assertEquals(top, num);
    }
   
    @Test(expected=SyntaxErrorException.class)
    public void testPop2() throws SystemErrorException, SyntaxErrorException {
       
        stack.stack.clear();
       
        ComplexNumber num = new ComplexNumber("0");
        num=stack.pop();
    }
   
    @Test
    public void testPop3() throws SystemErrorException, SyntaxErrorException {
       
        ComplexNumber num1 = new ComplexNumber ("45i");
        stack.push(num1);
        ComplexNumber num2 = new ComplexNumber ("7.7i");
        stack.push(num2);
        ComplexNumber num3 = new ComplexNumber ("99");
        stack.push(num3);
        ComplexNumber num4 = new ComplexNumber ("8+11i");
        stack.push(num4);
        ComplexNumber num5 = new ComplexNumber ("7+11i");
        stack.push(num5);
        ComplexNumber num6 = new ComplexNumber ("45.3i");
        stack.push(num6);
        ComplexNumber num7 = new ComplexNumber ("77i");
        stack.push(num7);
        ComplexNumber num8 = new ComplexNumber ("99");
        stack.push(num8);
        ComplexNumber num9 = new ComplexNumber ("8+11i");
        stack.push(num9);
        ComplexNumber num10 = new ComplexNumber ("7+11i");
        stack.push(num10);
        ComplexNumber num11 = new ComplexNumber ("4i");
        stack.push(num11);
        ComplexNumber num12 = new ComplexNumber ("7i");
        stack.push(num12);
        ComplexNumber num13 = new ComplexNumber ("79");
        stack.push(num13);
        ComplexNumber num14 = new ComplexNumber ("1.8+11i");
        stack.push(num14);
        ComplexNumber num15 = new ComplexNumber ("7+11i");
        stack.push(num15);
        ComplexNumber num16 = new ComplexNumber ("45i");
        stack.push(num16);
        ComplexNumber num17 = new ComplexNumber ("77i");
        stack.push(num17);
        ComplexNumber num18 = new ComplexNumber ("96.2");
        stack.push(num18);
        ComplexNumber num19 = new ComplexNumber ("8+11i");
        stack.push(num19);
        ComplexNumber num20 = new ComplexNumber ("7+11i");
        stack.push(num20);
        ComplexNumber num21 = new ComplexNumber ("45i");
        stack.push(num21);
        ComplexNumber num22 = new ComplexNumber ("77i");
        stack.push(num22);
        ComplexNumber num23 = new ComplexNumber ("99");
        stack.push(num23);
        ComplexNumber num24 = new ComplexNumber ("8+11i");
        stack.push(num24);
       
        ComplexNumber top = new ComplexNumber("0");
        top = stack.peek();
        ComplexNumber num = new ComplexNumber("0");
        num=stack.pop();
        assertEquals(top, num);
    }
   
}