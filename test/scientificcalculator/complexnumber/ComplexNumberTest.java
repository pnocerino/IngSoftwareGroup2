/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sherr
 */
public class ComplexNumberTest {

    public ComplexNumberTest() {
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

    @Test
    public void testSum1() {
        ComplexNumber num1 = new ComplexNumber("7+11i");
        ComplexNumber num2 = new ComplexNumber("8+11i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("15+22i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum2() {
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-78+11i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-71+26i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum3() {
        ComplexNumber num1 = new ComplexNumber("-10+25i");
        ComplexNumber num2 = new ComplexNumber("7+21i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-3+46i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum4() {
        ComplexNumber num1 = new ComplexNumber("7-75i");
        ComplexNumber num2 = new ComplexNumber("66+11i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-73-64i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum5() {
        ComplexNumber num1 = new ComplexNumber("7+13i");
        ComplexNumber num2 = new ComplexNumber("29-45i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("36-32i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum6() {
        ComplexNumber num1 = new ComplexNumber("-77+19i");
        ComplexNumber num2 = new ComplexNumber("-78+21i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-155+40i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum7() {
        ComplexNumber num1 = new ComplexNumber("7-15i");
        ComplexNumber num2 = new ComplexNumber("77-5i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("84-20i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum8() {
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-48-88i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-55+73i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum9() {
        ComplexNumber num1 = new ComplexNumber("-99-56i");
        ComplexNumber num2 = new ComplexNumber("8+10i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-91+46i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum10() {
        ComplexNumber num1 = new ComplexNumber("0.7+0.15i");
        ComplexNumber num2 = new ComplexNumber("0.1+0.21i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("0.8+0.36i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum11() {
        ComplexNumber num1 = new ComplexNumber("-3.7-5.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78-2.99i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-4.48+8.14i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum12() {
        ComplexNumber num1 = new ComplexNumber("-8.8+0.5i");
        ComplexNumber num2 = new ComplexNumber("0.8+3.9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.0+4.4", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum13() {
        ComplexNumber num1 = new ComplexNumber("7.3+1.5i");
        ComplexNumber num2 = new ComplexNumber("-0.7+77.79i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.6+79.29", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum14() {
        ComplexNumber num1 = new ComplexNumber("-7.7+6.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78+9.9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.48+16.05i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum15() {
        ComplexNumber num1 = new ComplexNumber("6.27+15.2i");
        ComplexNumber num2 = new ComplexNumber("0.75-4.9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("7.02+10.3i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum16() {
        ComplexNumber num1 = new ComplexNumber("46.8-15.5i");
        ComplexNumber num2 = new ComplexNumber("99.9+5.9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("146.7+-9.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum17() {
        ComplexNumber num1 = new ComplexNumber("7.1-15.66i");
        ComplexNumber num2 = new ComplexNumber("8.9-7.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("16.0-23.36i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum18() {
        ComplexNumber num1 = new ComplexNumber("-7.9-1.7i");
        ComplexNumber num2 = new ComplexNumber("9.8+80.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("1.9+78.4i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum19() {
        ComplexNumber num1 = new ComplexNumber("79+17i");
        ComplexNumber num2 = new ComplexNumber("8");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("87+17i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum20() {
        ComplexNumber num1 = new ComplexNumber("75+5i");
        ComplexNumber num2 = new ComplexNumber("-9");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("66+5i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum21() {
        ComplexNumber num1 = new ComplexNumber("-97+15i");
        ComplexNumber num2 = new ComplexNumber("78");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-19+15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum22() {
        ComplexNumber num1 = new ComplexNumber("-71+26i");
        ComplexNumber num2 = new ComplexNumber("-81");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-152+26i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum23() {
        ComplexNumber num1 = new ComplexNumber("7");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("17+2i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum24() {
        ComplexNumber num1 = new ComplexNumber("8");
        ComplexNumber num2 = new ComplexNumber("-78+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-70+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum25() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("-98+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-186+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum26() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-80+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum27() {
        ComplexNumber num1 = new ComplexNumber("110");
        ComplexNumber num2 = new ComplexNumber("-97");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("13", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum28() {
        ComplexNumber num1 = new ComplexNumber("-10");
        ComplexNumber num2 = new ComplexNumber("7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-3", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum29() {
        ComplexNumber num1 = new ComplexNumber("-39");
        ComplexNumber num2 = new ComplexNumber("-5");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-44", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum30() {
        ComplexNumber num1 = new ComplexNumber("79.1");
        ComplexNumber num2 = new ComplexNumber("1.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("87.3+1.7i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum31() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.2+0.5i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum32() {
        ComplexNumber num1 = new ComplexNumber("-9.17+2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-2.37+2.15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum33() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.2+0.5i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum34() {
        ComplexNumber num1 = new ComplexNumber("-9.17+2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-2.37+2.15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum35() {
        ComplexNumber num1 = new ComplexNumber("-7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-15.2+2.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum36() {
        ComplexNumber num1 = new ComplexNumber("7.9");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("9.1+2.1i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum37() {
        ComplexNumber num1 = new ComplexNumber("8.6");
        ComplexNumber num2 = new ComplexNumber("-7.8+7.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-0.8+7.7i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum38() {
        ComplexNumber num1 = new ComplexNumber("-8.18");
        ComplexNumber num2 = new ComplexNumber("-9.8+7.27i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-17.98+7.27i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum39() {
        ComplexNumber num1 = new ComplexNumber("-8.28");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-0.18+7.17i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum40() {
        ComplexNumber num1 = new ComplexNumber("1.1");
        ComplexNumber num2 = new ComplexNumber("-9.7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("10.8", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum41() {
        ComplexNumber num1 = new ComplexNumber("3.9");
        ComplexNumber num2 = new ComplexNumber("2.5");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.4", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum42() {
        ComplexNumber num1 = new ComplexNumber("-0.1");
        ComplexNumber num2 = new ComplexNumber("0.7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("0.6", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum43() {
        ComplexNumber num1 = new ComplexNumber("-3.9");
        ComplexNumber num2 = new ComplexNumber("-5.2");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-9.1", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum44() {
        ComplexNumber num1 = new ComplexNumber("79+7i");
        ComplexNumber num2 = new ComplexNumber("8i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("79+15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum45() {
        ComplexNumber num1 = new ComplexNumber("7.3+1.5i");
        ComplexNumber num2 = new ComplexNumber("-0.7+77.79i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.6+79.29", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum46() {
        ComplexNumber num1 = new ComplexNumber("75+51i");
        ComplexNumber num2 = new ComplexNumber("-9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("75+60i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum47() {
        ComplexNumber num1 = new ComplexNumber("+7-15i");
        ComplexNumber num2 = new ComplexNumber("58");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("65-15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum48() {
        ComplexNumber num1 = new ComplexNumber("71-26i");
        ComplexNumber num2 = new ComplexNumber("-81i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("71-107i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum49() {
        ComplexNumber num1 = new ComplexNumber("7i");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("10+9i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum50() {
        ComplexNumber num1 = new ComplexNumber("8i");
        ComplexNumber num2 = new ComplexNumber("78+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("78+85i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum51() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("98-74i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("98+162i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum52() {
        ComplexNumber num1 = new ComplexNumber("-81i");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8-4i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum53() {
        ComplexNumber num1 = new ComplexNumber("39i");
        ComplexNumber num2 = new ComplexNumber("25i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("64i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum54() {
        ComplexNumber num1 = new ComplexNumber("110i");
        ComplexNumber num2 = new ComplexNumber("-97i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("13i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum55() {
        ComplexNumber num1 = new ComplexNumber("-10i");
        ComplexNumber num2 = new ComplexNumber("7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-3i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum56() {
        ComplexNumber num1 = new ComplexNumber("-39i");
        ComplexNumber num2 = new ComplexNumber("-5i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-44i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum57() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("79.1+9.9i;", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum58() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-80+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum59() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("0.5-8.2i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum60() {
        ComplexNumber num1 = new ComplexNumber("+9.17-2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("9.17+4.65i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum61() {
        ComplexNumber num1 = new ComplexNumber("7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("7.1-5.5i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum62() {
        ComplexNumber num1 = new ComplexNumber("7.9i");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("1.2+10.0i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum63() {
        ComplexNumber num1 = new ComplexNumber("8.6i");
        ComplexNumber num2 = new ComplexNumber("7.8-7.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("7.8+0.9i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum64() {
        ComplexNumber num1 = new ComplexNumber("-8.18i");
        ComplexNumber num2 = new ComplexNumber("9.8-7.27i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("9.8+15.45i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum65() {
        ComplexNumber num1 = new ComplexNumber("-8.28i");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.1-1.11i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum66() {
        ComplexNumber num1 = new ComplexNumber("3.9i");
        ComplexNumber num2 = new ComplexNumber("2.5i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.4i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum67() {
        ComplexNumber num1 = new ComplexNumber("1.1i");
        ComplexNumber num2 = new ComplexNumber("-9.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.6", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum68() {
        ComplexNumber num1 = new ComplexNumber("-3.9i");
        ComplexNumber num2 = new ComplexNumber("-5.2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-9.1i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum69() {
        ComplexNumber num1 = new ComplexNumber("-0.1i");
        ComplexNumber num2 = new ComplexNumber("0.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-0.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot1() {
        ComplexNumber num1 = new ComplexNumber("7+11i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();

        assertEquals("3.165+1.738i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-3.165-1.738i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot2() {
        ComplexNumber num1 = new ComplexNumber("27-i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();

        assertEquals("5.197+0.096i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-5.197-0.096i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot3() {
        ComplexNumber num1 = new ComplexNumber("-4+44i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("4.964+4.432i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-4.964-4.432i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot4() {
        ComplexNumber num1 = new ComplexNumber("-104-6i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("0.294+10.202i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-0.294-10.202i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot5() {
        ComplexNumber num1 = new ComplexNumber("7.1+1.1i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("+2.673+0.206i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-2.673-0.206i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot6() {
        ComplexNumber num1 = new ComplexNumber("4.17-15.1i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("3.149+2.397i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-3.149-2.397i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot7() {
        ComplexNumber num1 = new ComplexNumber("-2.3+4.009i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("1.077+1.86i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-1.077-1.86i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot8() {
        ComplexNumber num1 = new ComplexNumber("-6.5-2.58i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("0.497+2.597i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-0.497-2.597i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot9() {
        ComplexNumber num1 = new ComplexNumber("66");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("8.124", radicequad[0].toString().replace(" ", ""));
        assertEquals("-8.124", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot10() {
        ComplexNumber num1 = new ComplexNumber("-71");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("8.426i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-8.426i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot11() {
        ComplexNumber num1 = new ComplexNumber("112i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("7.483+7.483i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-7.483-7.483i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot12() {
        ComplexNumber num1 = new ComplexNumber("-121i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("7.483+7.778i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-7.483-7.778i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot13() {
        ComplexNumber num1 = new ComplexNumber("17.1");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("4.135i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-4.135i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot14() {
        ComplexNumber num1 = new ComplexNumber("-6.3");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("2.51i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-2.51i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot15() {
        ComplexNumber num1 = new ComplexNumber("4.98i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("1.578+1.578i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-1.578-1.578i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot16() {
        ComplexNumber num1 = new ComplexNumber("-1.11i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("0.745+0.745i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-0.745-0.745i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSignChange1() {
        ComplexNumber num1 = new ComplexNumber("7+11i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();

        assertEquals("-7-11i", segno.toString().replace(" ", ""));

    }

    @Test
    public void testSignChange2() {
        ComplexNumber num1 = new ComplexNumber("27-i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();

        assertEquals("-27+i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange3() {
        ComplexNumber num1 = new ComplexNumber("-4+44i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("4-44i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange4() {
        ComplexNumber num1 = new ComplexNumber("-104-6i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("104+6i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange5() {
        ComplexNumber num1 = new ComplexNumber("7.1+1.1i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("-7.1-1.1i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange6() {
        ComplexNumber num1 = new ComplexNumber("4.17-15.1i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("-4.17+15.1", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange7() {
        ComplexNumber num1 = new ComplexNumber("-2.3+4.009i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("2.3-4.009i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange8() {
        ComplexNumber num1 = new ComplexNumber("-6.5-2.58i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("6.5+2.58i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange9() {
        ComplexNumber num1 = new ComplexNumber("66");
        ComplexNumber segno = new ComplexNumber("0");;
        segno = num1.signChange();
        assertEquals("-66", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange15() {
        ComplexNumber num1 = new ComplexNumber("4.98i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("-4.98i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange11() {
        ComplexNumber num1 = new ComplexNumber("-71");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("71", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange12() {
        ComplexNumber num1 = new ComplexNumber("112i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("-112i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange13() {
        ComplexNumber num1 = new ComplexNumber("-121i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("121i", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange14() {
        ComplexNumber num1 = new ComplexNumber("17.1");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("-17.1", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange10() {
        ComplexNumber num1 = new ComplexNumber("-6.3");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("6.3", segno.toString().replace(" ", ""));
    }

    @Test
    public void testSignChange16() {

        ComplexNumber num1 = new ComplexNumber("-1.11i");
        ComplexNumber segno = new ComplexNumber("0");
        segno = num1.signChange();
        assertEquals("1.11i", segno.toString().replace(" ", ""));
    }
}
