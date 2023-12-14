

package scientificcalculator.complexnumber.variables;

import static scientificcalculator.ScientificCalculator.currentVariable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class VariablesTest {
    
    Variables vars;
    Variable variable;
    
    public VariablesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vars = new Variables();
    }
    
    @After
    public void tearDown() {
    }
    
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Test
    public void testAdd1() {
        currentVariable = 'f';
        variable = new Variable(currentVariable, "4+33.2i");
        vars.add(variable);
        assertEquals(variable, vars.search(currentVariable));
    }
    
    @Test
    public void testAdd2() {
        currentVariable = 'l';
        variable = new Variable(currentVariable, "4+33.2i");
        vars.add(variable);
        variable = new Variable(currentVariable, "22.2-5i");
        vars.add(variable);
        assertEquals(variable, vars.search(currentVariable));
    }
    
    @Test
    public void testSearch1() {
        currentVariable = 'z'; variable = new Variable(currentVariable, "6.5i");
        vars.add(new Variable('e', "-2")); vars.add(variable); vars.add(new Variable('j', "-4i"));
        assertEquals(variable, vars.search(currentVariable));
    }
    
    @Test
    public void testSearch2() {
        currentVariable = 'x'; 
        assertNull(vars.search(currentVariable));
    }

}
