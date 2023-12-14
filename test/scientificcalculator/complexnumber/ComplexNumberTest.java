/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator.complexnumber;

import exceptions.MathErrorException;
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
    public void testGetRealPart1() {
        ComplexNumber num = new ComplexNumber("5+11i");
        double out = num.getRealPart();

        assertEquals(5.0, out, 0.001);

    }

    @Test
    public void testGetRealPart2() {
        ComplexNumber num = new ComplexNumber("-75+11i");
        double out = num.getRealPart();

        assertEquals(-75.0, out, 0.001);

    }

    @Test
    public void testGetRealPart3() {
        ComplexNumber num = new ComplexNumber("5.6+11i");
        double out = num.getRealPart();

        assertEquals(5.6, out, 0.001);

    }

    @Test
    public void testGetRealPart4() {
        ComplexNumber num = new ComplexNumber("-7.5+11i");
        double out = num.getRealPart();

        assertEquals(-7.5, out, 0.001);

    }

    @Test
    public void testGetRealPart5() {
        ComplexNumber num = new ComplexNumber("12i");
        double out = num.getRealPart();

        assertEquals(0, out, 0.001);

    }

    @Test
    public void testGetRealPart6() {
        ComplexNumber num = new ComplexNumber("96");
        double out = num.getRealPart();

        assertEquals(96.0, out, 0.001);

    }

    @Test
    public void testGetImPart1() {
        ComplexNumber num = new ComplexNumber("7+11i");
        double out = num.getImPart();

        assertEquals(11.0, out, 0.001);

    }

    @Test
    public void testGetImPart2() {
        ComplexNumber num = new ComplexNumber("7-71i");
        double out = num.getImPart();

        assertEquals(-71.0, out, 0.001);

    }

    @Test
    public void testGetImPart3() {
        ComplexNumber num = new ComplexNumber("5.6+7.7i");
        double out = num.getImPart();

        assertEquals(7.7, out, 0.001);

    }

    @Test
    public void testGetImPart4() {
        ComplexNumber num = new ComplexNumber("-7.5-8.9i");
        double out = num.getImPart();

        assertEquals(-8.9, out, 0.001);

    }

    @Test
    public void testGetImPart5() {
        ComplexNumber num = new ComplexNumber("12");
        double out = num.getImPart();

        assertEquals(0, out, 0.001);

    }

    @Test
    public void testGetImPart6() {
        ComplexNumber num = new ComplexNumber("19i");
        double out = num.getImPart();

        assertEquals(19.0, out, 0.001);

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

        assertEquals("73-64i", somma.toString().replace(" ", ""));
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

        assertEquals("-41-73i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum9() {
        ComplexNumber num1 = new ComplexNumber("-99-56i");
        ComplexNumber num2 = new ComplexNumber("8+10i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-91-46i", somma.toString().replace(" ", ""));
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

        assertEquals("-4.48-8.14i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum12() {
        ComplexNumber num1 = new ComplexNumber("-8.8+0.5i");
        ComplexNumber num2 = new ComplexNumber("0.8+3.9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8+4.4i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum13() {
        ComplexNumber num1 = new ComplexNumber("7.3+1.5i");
        ComplexNumber num2 = new ComplexNumber("-0.7+77.79i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.6+79.29i", somma.toString().replace(" ", ""));
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

        assertEquals("146.7-9.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum17() {
        ComplexNumber num1 = new ComplexNumber("7.1-15.66i");
        ComplexNumber num2 = new ComplexNumber("8.9-7.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("16-23.36i", somma.toString().replace(" ", ""));
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
        ComplexNumber num1 = new ComplexNumber("7.29+12.7i");
        ComplexNumber num2 = new ComplexNumber("-5.8-12.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("1.49+0.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum20() {
        ComplexNumber num1 = new ComplexNumber("79+17i");
        ComplexNumber num2 = new ComplexNumber("8");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("87+17i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum21() {
        ComplexNumber num1 = new ComplexNumber("75+5i");
        ComplexNumber num2 = new ComplexNumber("-9");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("66+5i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum22() {
        ComplexNumber num1 = new ComplexNumber("-97+15i");
        ComplexNumber num2 = new ComplexNumber("78");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-19+15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum23() {
        ComplexNumber num1 = new ComplexNumber("-71+26i");
        ComplexNumber num2 = new ComplexNumber("-81");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-152+26i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum24() {
        ComplexNumber num1 = new ComplexNumber("7");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("17+2i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum25() {
        ComplexNumber num1 = new ComplexNumber("8");
        ComplexNumber num2 = new ComplexNumber("-78+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-70+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum26() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("-98+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-186+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum27() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-80+77i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum28() {
        ComplexNumber num1 = new ComplexNumber("39");
        ComplexNumber num2 = new ComplexNumber("25");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("64", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum29() {
        ComplexNumber num1 = new ComplexNumber("110");
        ComplexNumber num2 = new ComplexNumber("-97");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("13", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum30() {
        ComplexNumber num1 = new ComplexNumber("-10");
        ComplexNumber num2 = new ComplexNumber("7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-3", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum31() {
        ComplexNumber num1 = new ComplexNumber("-39");
        ComplexNumber num2 = new ComplexNumber("-5");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-44", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum32() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("87.3+1.7i", somma.toString().replace(" ", ""));
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

        assertEquals("0.8+7.7i", somma.toString().replace(" ", ""));
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
        ComplexNumber num1 = new ComplexNumber("3.9");
        ComplexNumber num2 = new ComplexNumber("2.5");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.4", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum41() {
        ComplexNumber num1 = new ComplexNumber("1.1");
        ComplexNumber num2 = new ComplexNumber("-9.7");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.6", somma.toString().replace(" ", ""));
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
        ComplexNumber num1 = new ComplexNumber("75+51i");
        ComplexNumber num2 = new ComplexNumber("-9i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("75+42i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum46() {
        ComplexNumber num1 = new ComplexNumber("+7-15i");
        ComplexNumber num2 = new ComplexNumber("58");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("65-15i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum47() {
        ComplexNumber num1 = new ComplexNumber("71-26i");
        ComplexNumber num2 = new ComplexNumber("-81i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("71-107i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum48() {
        ComplexNumber num1 = new ComplexNumber("7i");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("10+9i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum49() {
        ComplexNumber num1 = new ComplexNumber("8i");
        ComplexNumber num2 = new ComplexNumber("78+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("78+85i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum50() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("98-74i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("10-74i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum51() {
        ComplexNumber num1 = new ComplexNumber("-81i");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("8-4i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum52() {
        ComplexNumber num1 = new ComplexNumber("39i");
        ComplexNumber num2 = new ComplexNumber("25i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("64i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum53() {
        ComplexNumber num1 = new ComplexNumber("110i");
        ComplexNumber num2 = new ComplexNumber("-97i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("13i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum54() {
        ComplexNumber num1 = new ComplexNumber("-10i");
        ComplexNumber num2 = new ComplexNumber("7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-3i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum55() {
        ComplexNumber num1 = new ComplexNumber("-39i");
        ComplexNumber num2 = new ComplexNumber("-5i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-44i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum56() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("79.1+9.9i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum57() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("0.5-8.2i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum58() {
        ComplexNumber num1 = new ComplexNumber("+9.17-2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("9.17+4.65i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum59() {
        ComplexNumber num1 = new ComplexNumber("7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("7.1-5.5i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum60() {
        ComplexNumber num1 = new ComplexNumber("7.9i");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("1.2+10i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum61() {
        ComplexNumber num1 = new ComplexNumber("8.6i");
        ComplexNumber num2 = new ComplexNumber("7.8-7.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("7.8+0.9i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum62() {
        ComplexNumber num1 = new ComplexNumber("-8.18i");
        ComplexNumber num2 = new ComplexNumber("9.8-7.27i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("9.8-15.45i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum63() {
        ComplexNumber num1 = new ComplexNumber("-8.28i");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("8.1-1.11i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum64() {
        ComplexNumber num1 = new ComplexNumber("3.9i");
        ComplexNumber num2 = new ComplexNumber("2.5i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("6.4i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum65() {
        ComplexNumber num1 = new ComplexNumber("1.1i");
        ComplexNumber num2 = new ComplexNumber("-9.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-8.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum66() {
        ComplexNumber num1 = new ComplexNumber("-0.1i");
        ComplexNumber num2 = new ComplexNumber("0.7i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("0.6i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSum67() {
        ComplexNumber num1 = new ComplexNumber("-3.9i");
        ComplexNumber num2 = new ComplexNumber("-5.2i");
        ComplexNumber somma = num1.sum(num2);

        assertEquals("-9.1i", somma.toString().replace(" ", ""));
    }

    @Test
    public void testSub1() {
        ComplexNumber num1 = new ComplexNumber("7+11i");
        ComplexNumber num2 = new ComplexNumber("8+11i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("1", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub2() {
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-78+11i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-85-4i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub3() {
        ComplexNumber num1 = new ComplexNumber("-10+25i");
        ComplexNumber num2 = new ComplexNumber("7+21i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("17-4i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub4() {
        ComplexNumber num1 = new ComplexNumber("7-75i");
        ComplexNumber num2 = new ComplexNumber("66+11i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("59+86i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub5() {
        ComplexNumber num1 = new ComplexNumber("7+13i");
        ComplexNumber num2 = new ComplexNumber("29-45i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("22-58i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub6() {
        ComplexNumber num1 = new ComplexNumber("-77+19i");
        ComplexNumber num2 = new ComplexNumber("-78+21i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1+2i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub7() {
        ComplexNumber num1 = new ComplexNumber("7-15i");
        ComplexNumber num2 = new ComplexNumber("77-5i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("70+10i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub8() {
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-48-88i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-55-103i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub9() {
        ComplexNumber num1 = new ComplexNumber("-99-56i");
        ComplexNumber num2 = new ComplexNumber("8+10i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("107+66i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub10() {
        ComplexNumber num1 = new ComplexNumber("0.7+0.15i");
        ComplexNumber num2 = new ComplexNumber("0.1+0.21i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-0.6+0.06i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub11() {
        ComplexNumber num1 = new ComplexNumber("-3.7-5.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78-2.99i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("2.92+2.16i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub12() {
        ComplexNumber num1 = new ComplexNumber("-8.8+0.5i");
        ComplexNumber num2 = new ComplexNumber("0.8+3.9i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("9.6+3.4i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub13() {
        ComplexNumber num1 = new ComplexNumber("7.3+1.5i");
        ComplexNumber num2 = new ComplexNumber("-0.7+77.79i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-8+76.29i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub14() {
        ComplexNumber num1 = new ComplexNumber("-7.7+6.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78+9.9i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("6.92+3.75i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub15() {
        ComplexNumber num1 = new ComplexNumber("6.27+15.2i");
        ComplexNumber num2 = new ComplexNumber("0.75-4.9i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-5.52-20.1i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub16() {
        ComplexNumber num1 = new ComplexNumber("46.8-15.5i");
        ComplexNumber num2 = new ComplexNumber("99.9+5.9i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("53.1+21.4i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub17() {
        ComplexNumber num1 = new ComplexNumber("7.1-15.66i");
        ComplexNumber num2 = new ComplexNumber("8.9-7.7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("1.8+7.96i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub18() {
        ComplexNumber num1 = new ComplexNumber("-7.9-1.7i");
        ComplexNumber num2 = new ComplexNumber("9.8+80.1i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("17.7+81.8i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub19() {
        ComplexNumber num1 = new ComplexNumber("7.29+12.7i");
        ComplexNumber num2 = new ComplexNumber("-5.8-12.1i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-13.09-24.8i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub20() {
        ComplexNumber num1 = new ComplexNumber("79+17i");
        ComplexNumber num2 = new ComplexNumber("8");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-71-17i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub21() {
        ComplexNumber num1 = new ComplexNumber("75+5i");
        ComplexNumber num2 = new ComplexNumber("-9");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-84-5i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub22() {
        ComplexNumber num1 = new ComplexNumber("-97+15i");
        ComplexNumber num2 = new ComplexNumber("78");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("175-15i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub23() {
        ComplexNumber num1 = new ComplexNumber("-71+26i");
        ComplexNumber num2 = new ComplexNumber("-81");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-10-26i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub24() {
        ComplexNumber num1 = new ComplexNumber("7");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("3+2i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub25() {
        ComplexNumber num1 = new ComplexNumber("8");
        ComplexNumber num2 = new ComplexNumber("-78+77i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-86+77i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub26() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("-98+77i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-10+77i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub27() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("96+77i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub28() {
        ComplexNumber num1 = new ComplexNumber("39");
        ComplexNumber num2 = new ComplexNumber("25");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-14", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub29() {
        ComplexNumber num1 = new ComplexNumber("110");
        ComplexNumber num2 = new ComplexNumber("-97");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-207", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub30() {
        ComplexNumber num1 = new ComplexNumber("-10");
        ComplexNumber num2 = new ComplexNumber("7");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("17", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub31() {
        ComplexNumber num1 = new ComplexNumber("-39");
        ComplexNumber num2 = new ComplexNumber("-5");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("34", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub32() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-70.9-1.7i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub33() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-9.2-0.5i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub34() {
        ComplexNumber num1 = new ComplexNumber("-9.17+2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("15.97-2.15i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub35() {
        ComplexNumber num1 = new ComplexNumber("-7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1-2.6i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub36() {
        ComplexNumber num1 = new ComplexNumber("7.9");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-6.7+2.1i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub37() {
        ComplexNumber num1 = new ComplexNumber("8.6");
        ComplexNumber num2 = new ComplexNumber("-7.8+7.7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-16.4+7.7i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub38() {
        ComplexNumber num1 = new ComplexNumber("-8.18");
        ComplexNumber num2 = new ComplexNumber("-9.8+7.27i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1.62+7.27i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub39() {
        ComplexNumber num1 = new ComplexNumber("-8.28");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("16.38+7.17i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub40() {
        ComplexNumber num1 = new ComplexNumber("3.9");
        ComplexNumber num2 = new ComplexNumber("2.5");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1.4", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub41() {
        ComplexNumber num1 = new ComplexNumber("1.1");
        ComplexNumber num2 = new ComplexNumber("-9.7");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-10.8", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub42() {
        ComplexNumber num1 = new ComplexNumber("-0.1");
        ComplexNumber num2 = new ComplexNumber("0.7");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("0.8", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub43() {
        ComplexNumber num1 = new ComplexNumber("-3.9");
        ComplexNumber num2 = new ComplexNumber("-5.2");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1.3", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub44() {
        ComplexNumber num1 = new ComplexNumber("79+7i");
        ComplexNumber num2 = new ComplexNumber("8i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-79+i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub45() {
        ComplexNumber num1 = new ComplexNumber("75+51i");
        ComplexNumber num2 = new ComplexNumber("-9i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-75-60i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub46() {
        ComplexNumber num1 = new ComplexNumber("7-15i");
        ComplexNumber num2 = new ComplexNumber("58");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("51+15i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub47() {
        ComplexNumber num1 = new ComplexNumber("71-26i");
        ComplexNumber num2 = new ComplexNumber("-81i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-71-55i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub48() {
        ComplexNumber num1 = new ComplexNumber("7i");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("10-5i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub49() {
        ComplexNumber num1 = new ComplexNumber("8i");
        ComplexNumber num2 = new ComplexNumber("78+77i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("78+69i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub50() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("98-74i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("186-74i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub51() {
        ComplexNumber num1 = new ComplexNumber("-81i");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("8+158i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub52() {
        ComplexNumber num1 = new ComplexNumber("39i");
        ComplexNumber num2 = new ComplexNumber("25i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-14i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub53() {
        ComplexNumber num1 = new ComplexNumber("110i");
        ComplexNumber num2 = new ComplexNumber("-97i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-207i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub54() {
        ComplexNumber num1 = new ComplexNumber("-10i");
        ComplexNumber num2 = new ComplexNumber("7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("17i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub55() {
        ComplexNumber num1 = new ComplexNumber("-39i");
        ComplexNumber num2 = new ComplexNumber("-5i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("34i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub56() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-79.1+6.5i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub57() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-0.5-9.2i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub58() {
        ComplexNumber num1 = new ComplexNumber("+9.17-2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-9.17+8.95i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub59() {
        ComplexNumber num1 = new ComplexNumber("7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-7.1-10.7i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub60() {
        ComplexNumber num1 = new ComplexNumber("7.9i");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("1.2-5.8i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub61() {
        ComplexNumber num1 = new ComplexNumber("8.6i");
        ComplexNumber num2 = new ComplexNumber("7.8-7.7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("7.8-16.3i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub62() {
        ComplexNumber num1 = new ComplexNumber("-8.18i");
        ComplexNumber num2 = new ComplexNumber("9.8-7.27i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("9.8+0.91i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub63() {
        ComplexNumber num1 = new ComplexNumber("-8.28i");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("8.1+15.45i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub64() {
        ComplexNumber num1 = new ComplexNumber("3.9i");
        ComplexNumber num2 = new ComplexNumber("2.5i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1.4i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub65() {
        ComplexNumber num1 = new ComplexNumber("1.1i");
        ComplexNumber num2 = new ComplexNumber("-9.7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-10.8i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub66() {
        ComplexNumber num1 = new ComplexNumber("-0.1i");
        ComplexNumber num2 = new ComplexNumber("0.7i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("0.8i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testSub67() {
        ComplexNumber num1 = new ComplexNumber("-3.9i");
        ComplexNumber num2 = new ComplexNumber("-5.2i");
        ComplexNumber sottrazione = num2.sub(num1);

        assertEquals("-1.3i", sottrazione.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply1() {
        ComplexNumber num1 = new ComplexNumber("7+11i");
        ComplexNumber num2 = new ComplexNumber("8+11i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-65+165i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply2() {
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-78+11i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-711-1093i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply3() {
        ComplexNumber num1 = new ComplexNumber("-10+25i");
        ComplexNumber num2 = new ComplexNumber("7+21i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-595-35i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply4() {
        ComplexNumber num1 = new ComplexNumber("7-75i");
        ComplexNumber num2 = new ComplexNumber("66+11i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("1287-4873i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply5() {
        ComplexNumber num1 = new ComplexNumber("7+13i");
        ComplexNumber num2 = new ComplexNumber("29-45i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("788+62i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply6() {
        ComplexNumber num1 = new ComplexNumber("-77+19i");
        ComplexNumber num2 = new ComplexNumber("-78+21i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("5607-3099i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply7() {
        ComplexNumber num1 = new ComplexNumber("7-15i");
        ComplexNumber num2 = new ComplexNumber("77-5i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("464-1190i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply8() {
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-48-88i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("984-1336i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply9() {
        ComplexNumber num1 = new ComplexNumber("-99-56i");
        ComplexNumber num2 = new ComplexNumber("8+10i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-232-1438i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply10() {
        ComplexNumber num1 = new ComplexNumber("0.7+0.15i");
        ComplexNumber num2 = new ComplexNumber("0.1+0.21i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("0.038+0.162i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply11() {
        ComplexNumber num1 = new ComplexNumber("-3.7-5.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78-2.99i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-12.513+15.08i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply12() {
        ComplexNumber num1 = new ComplexNumber("-8.8+0.5i");
        ComplexNumber num2 = new ComplexNumber("0.8+3.9i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-8.99-33.92i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply13() {
        ComplexNumber num1 = new ComplexNumber("7.3+1.5i");
        ComplexNumber num2 = new ComplexNumber("-0.7+77.79i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-121.795+566.817i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply14() {
        ComplexNumber num1 = new ComplexNumber("-7.7+6.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78+9.9i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-54.879-81.027i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply15() {
        ComplexNumber num1 = new ComplexNumber("6.27+15.2i");
        ComplexNumber num2 = new ComplexNumber("0.75-4.9i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("79.183-19.323i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply16() {
        ComplexNumber num1 = new ComplexNumber("46.8-15.5i");
        ComplexNumber num2 = new ComplexNumber("99.9+5.9i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("4766.77-1272.33i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply17() {
        ComplexNumber num1 = new ComplexNumber("7.1-15.66i");
        ComplexNumber num2 = new ComplexNumber("8.9-7.7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-57.392-194.044i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply18() {
        ComplexNumber num1 = new ComplexNumber("-7.9-1.7i");
        ComplexNumber num2 = new ComplexNumber("9.8+80.1i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("58.75-649.45i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply19() {
        ComplexNumber num1 = new ComplexNumber("7.29+12.7i");
        ComplexNumber num2 = new ComplexNumber("-5.8-12.1i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("111.388-161.869i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply20() {
        ComplexNumber num1 = new ComplexNumber("79+17i");
        ComplexNumber num2 = new ComplexNumber("8");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("632+136i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply21() {
        ComplexNumber num1 = new ComplexNumber("75+5i");
        ComplexNumber num2 = new ComplexNumber("-9");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-675-45i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply22() {
        ComplexNumber num1 = new ComplexNumber("-97+15i");
        ComplexNumber num2 = new ComplexNumber("78");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-7566+1170i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply23() {
        ComplexNumber num1 = new ComplexNumber("-71+26i");
        ComplexNumber num2 = new ComplexNumber("-81");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("5751-2106i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply24() {
        ComplexNumber num1 = new ComplexNumber("7");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("70+14i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply25() {
        ComplexNumber num1 = new ComplexNumber("8");
        ComplexNumber num2 = new ComplexNumber("-78+77i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-624+616i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply26() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("-98+77i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("8624-6776i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply27() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-704-6776i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply28() {
        ComplexNumber num1 = new ComplexNumber("39");
        ComplexNumber num2 = new ComplexNumber("25");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("975", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply29() {
        ComplexNumber num1 = new ComplexNumber("110");
        ComplexNumber num2 = new ComplexNumber("-97");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-10670", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply30() {
        ComplexNumber num1 = new ComplexNumber("-10");
        ComplexNumber num2 = new ComplexNumber("7");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-70", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply31() {
        ComplexNumber num1 = new ComplexNumber("-39");
        ComplexNumber num2 = new ComplexNumber("-5");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("195", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply32() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("648.62+13.94i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply33() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-4.35-4.35i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply34() {
        ComplexNumber num1 = new ComplexNumber("-9.17+2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-62.356+14.62i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply35() {
        ComplexNumber num1 = new ComplexNumber("-7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("57.51-21.06i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply36() {
        ComplexNumber num1 = new ComplexNumber("7.9");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("9.48+16.59i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply37() {
        ComplexNumber num1 = new ComplexNumber("8.6");
        ComplexNumber num2 = new ComplexNumber("-7.8+7.7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-67.08+66.22i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply38() {
        ComplexNumber num1 = new ComplexNumber("-8.18");
        ComplexNumber num2 = new ComplexNumber("-9.8+7.27i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("80.164-59.469i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply39() {
        ComplexNumber num1 = new ComplexNumber("-8.28");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-67.068-59.368i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply40() {
        ComplexNumber num1 = new ComplexNumber("3.9");
        ComplexNumber num2 = new ComplexNumber("2.5");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("9.75", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply41() {
        ComplexNumber num1 = new ComplexNumber("1.1");
        ComplexNumber num2 = new ComplexNumber("-9.7");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-10.67", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply42() {
        ComplexNumber num1 = new ComplexNumber("-0.1");
        ComplexNumber num2 = new ComplexNumber("0.7");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-0.07", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply43() {
        ComplexNumber num1 = new ComplexNumber("-3.9");
        ComplexNumber num2 = new ComplexNumber("-5.2");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("20.28", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply44() {
        ComplexNumber num1 = new ComplexNumber("79+7i");
        ComplexNumber num2 = new ComplexNumber("8i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-56+632i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply45() {
        ComplexNumber num1 = new ComplexNumber("75+51i");
        ComplexNumber num2 = new ComplexNumber("-9i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("459-675i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply46() {
        ComplexNumber num1 = new ComplexNumber("+7-15i");
        ComplexNumber num2 = new ComplexNumber("58");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("406-870i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply47() {
        ComplexNumber num1 = new ComplexNumber("71-26i");
        ComplexNumber num2 = new ComplexNumber("-81i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-2106-5751i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply48() {
        ComplexNumber num1 = new ComplexNumber("7i");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-14+70i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply49() {
        ComplexNumber num1 = new ComplexNumber("8i");
        ComplexNumber num2 = new ComplexNumber("78+77i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-616+624i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply50() {
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("98-74i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-8624+6512i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply51() {
        ComplexNumber num1 = new ComplexNumber("-81i");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("6237-648i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply52() {
        ComplexNumber num1 = new ComplexNumber("39i");
        ComplexNumber num2 = new ComplexNumber("25i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-975", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply53() {
        ComplexNumber num1 = new ComplexNumber("110i");
        ComplexNumber num2 = new ComplexNumber("-97i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("10670", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply54() {
        ComplexNumber num1 = new ComplexNumber("-10i");
        ComplexNumber num2 = new ComplexNumber("7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("70", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply55() {
        ComplexNumber num1 = new ComplexNumber("-39i");
        ComplexNumber num2 = new ComplexNumber("-5i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-195", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply56() {
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-13.94+648.62i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply57() {
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("4.35-4.35i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply58() {
        ComplexNumber num1 = new ComplexNumber("+9.17-2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("14.62+62.356i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply59() {
        ComplexNumber num1 = new ComplexNumber("7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("21.06-57.51i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply60() {
        ComplexNumber num1 = new ComplexNumber("7.9i");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-16.59+9.48i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply61() {
        ComplexNumber num1 = new ComplexNumber("8.6i");
        ComplexNumber num2 = new ComplexNumber("7.8-7.7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("66.22+67.08i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply62() {
        ComplexNumber num1 = new ComplexNumber("-8.18i");
        ComplexNumber num2 = new ComplexNumber("9.8-7.27i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-59.469-80.164i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply63() {
        ComplexNumber num1 = new ComplexNumber("-8.28i");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("59.368-67.068i", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply64() {
        ComplexNumber num1 = new ComplexNumber("3.9i");
        ComplexNumber num2 = new ComplexNumber("2.5i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-9.75", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply65() {
        ComplexNumber num1 = new ComplexNumber("1.1i");
        ComplexNumber num2 = new ComplexNumber("-9.7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("10.67", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply66() {
        ComplexNumber num1 = new ComplexNumber("-0.1i");
        ComplexNumber num2 = new ComplexNumber("0.7i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("0.07", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testMultiply67() {
        ComplexNumber num1 = new ComplexNumber("-3.9i");
        ComplexNumber num2 = new ComplexNumber("-5.2i");
        ComplexNumber prodotto = num1.multiply(num2);

        assertEquals("-20.28", prodotto.toString().replace(" ", ""));
    }

    @Test
    public void testDivide1() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7+11i");
        ComplexNumber num2 = new ComplexNumber("8+11i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.041-0.065i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide2() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-78+11i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-1.391+4.551i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide3() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-10+25i");
        ComplexNumber num2 = new ComplexNumber("7+21i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.628-0.531i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide4() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7-75i");
        ComplexNumber num2 = new ComplexNumber("66+11i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.064+0.886i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide5() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7+13i");
        ComplexNumber num2 = new ComplexNumber("29-45i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-1.752-3.174i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide6() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-77+19i");
        ComplexNumber num2 = new ComplexNumber("-78+21i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.018-0.021i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide7() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7-15i");
        ComplexNumber num2 = new ComplexNumber("77-5i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("2.241+4.088i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide8() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7+15i");
        ComplexNumber num2 = new ComplexNumber("-48-88i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-6.044+0.38i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide9() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-99-56i");
        ComplexNumber num2 = new ComplexNumber("8+10i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.105-0.042i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide10() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("0.7+0.15i");
        ComplexNumber num2 = new ComplexNumber("0.1+0.21i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.198+0.258i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide11() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-3.7-5.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78-2.99i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.455+0.175i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide12() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-8.8+0.5i");
        ComplexNumber num2 = new ComplexNumber("0.8+3.9i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.066-0.447i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide13() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7.3+1.5i");
        ComplexNumber num2 = new ComplexNumber("-0.7+77.79i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("2.009+10.243i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide14() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-7.7+6.15i");
        ComplexNumber num2 = new ComplexNumber("-0.78+9.9i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.689-0.736i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide15() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("6.27+15.2i");
        ComplexNumber num2 = new ComplexNumber("0.75-4.9i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.258-0.156i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide16() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("46.8-15.5i");
        ComplexNumber num2 = new ComplexNumber("99.9+5.9i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.886+0.751i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide17() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7.1-15.66i");
        ComplexNumber num2 = new ComplexNumber("8.9-7.7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.622+0.287i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide18() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-7.9-1.7i");
        ComplexNumber num2 = new ComplexNumber("9.8+80.1i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-3.271-9.435i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide19() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7.29+12.7i");
        ComplexNumber num2 = new ComplexNumber("-5.8-12.1i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.914-0.068i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide20() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("79+17i");
        ComplexNumber num2 = new ComplexNumber("8");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.097-0.021i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide21() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("75+5i");
        ComplexNumber num2 = new ComplexNumber("-9");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.119+0.008i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide22() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-97+15i");
        ComplexNumber num2 = new ComplexNumber("78");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.785-0.121i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide23() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-71+26i");
        ComplexNumber num2 = new ComplexNumber("-81");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.006+0.368i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide24() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.429+0.286i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide25() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("8");
        ComplexNumber num2 = new ComplexNumber("-78+77i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-9.75+9.625i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide26() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("-98+77i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.114-0.875i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide27() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.091-0.875i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide28() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("39");
        ComplexNumber num2 = new ComplexNumber("25");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.641", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide29() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("110");
        ComplexNumber num2 = new ComplexNumber("-97");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.882", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide30() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-10");
        ComplexNumber num2 = new ComplexNumber("7");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.7", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide31() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-39");
        ComplexNumber num2 = new ComplexNumber("-5");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.128", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide32() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.104-0.002i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide33() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-8.7+8.7i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide34() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-9.17+2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.703-0.165i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide35() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.006+0.368i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide36() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7.9");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.152+0.266i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide37() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("8.6");
        ComplexNumber num2 = new ComplexNumber("-7.8+7.7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.907+0.895i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide38() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-8.18");
        ComplexNumber num2 = new ComplexNumber("-9.8+7.27i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.198-0.889i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide39() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-8.28");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.978-0.866i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide40() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("3.9");
        ComplexNumber num2 = new ComplexNumber("2.5");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.641", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide41() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("1.1");
        ComplexNumber num2 = new ComplexNumber("-9.7");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-8.818", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide42() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-0.1");
        ComplexNumber num2 = new ComplexNumber("0.7");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-7", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide43() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-3.9");
        ComplexNumber num2 = new ComplexNumber("-5.2");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.333", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide44() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("79+7i");
        ComplexNumber num2 = new ComplexNumber("8i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.009+0.1i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide45() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("75+51i");
        ComplexNumber num2 = new ComplexNumber("-9i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.056-0.082i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide46() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("+7-15i");
        ComplexNumber num2 = new ComplexNumber("58");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.482+3.175i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide47() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("71-26i");
        ComplexNumber num2 = new ComplexNumber("-81i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.368-1.006i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide48() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7i");
        ComplexNumber num2 = new ComplexNumber("10+2i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.286-1.429i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide49() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("8i");
        ComplexNumber num2 = new ComplexNumber("78+77i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("9.625-9.75i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide50() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-88");
        ComplexNumber num2 = new ComplexNumber("98-74i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-1.114+0.841i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide51() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-81i");
        ComplexNumber num2 = new ComplexNumber("8+77i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.951+0.099i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide52() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("39i");
        ComplexNumber num2 = new ComplexNumber("25i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.641", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide53() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("110i");
        ComplexNumber num2 = new ComplexNumber("-97i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.882", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide54() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-10i");
        ComplexNumber num2 = new ComplexNumber("7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.7", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide55() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-39i");
        ComplexNumber num2 = new ComplexNumber("-5i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.128", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide56() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("79.1+1.7i");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.002+0.104i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide57() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("0.5+0.5i");
        ComplexNumber num2 = new ComplexNumber("-8.7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-8.7-8.7i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide58() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("+9.17-2.15i");
        ComplexNumber num2 = new ComplexNumber("6.8i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.165+0.703i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide59() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7.1+2.6i");
        ComplexNumber num2 = new ComplexNumber("-8.1i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.368-1.006i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide60() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("7.9i");
        ComplexNumber num2 = new ComplexNumber("1.2+2.1i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.266-0.152i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide61() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("8.6i");
        ComplexNumber num2 = new ComplexNumber("7.8-7.7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.895-0.907i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide62() throws MathErrorException{
        ComplexNumber num1 = new ComplexNumber("-8.18i");
        ComplexNumber num2 = new ComplexNumber("9.8-7.27i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.889+1.198i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide63() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("-8.28i");
        ComplexNumber num2 = new ComplexNumber("8.1+7.17i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-0.866+0.978i", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide64() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("3.9i");
        ComplexNumber num2 = new ComplexNumber("2.5i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("0.641", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide65() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("1.1i");
        ComplexNumber num2 = new ComplexNumber("-9.7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-8.818", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide66() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("-0.1i");
        ComplexNumber num2 = new ComplexNumber("0.7i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("-7", quoziente.toString().replace(" ", ""));
    }

    @Test
    public void testDivide67() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("-3.9i");
        ComplexNumber num2 = new ComplexNumber("-5.2i");
        ComplexNumber quoziente = num2.divide(num1);

        assertEquals("1.333", quoziente.toString().replace(" ", ""));
    }

    @Test(expected = MathErrorException.class)
    public void testDivide68() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("7+11i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide69() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-10+25i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide70() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("7-75i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide71() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-99-56i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide72() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("0.7+0.15i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide73() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-3.7-5.15i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide74() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-8.8+0.5i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide75() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("46.8-15.5i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide76() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("7");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide77() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-88");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide78() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("1.1");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide79() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-0.1");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide80() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("7i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide81() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-81i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide82() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("8.2i");
        num2.divide(num1);
    }

    @Test(expected = MathErrorException.class)
    public void testDivide83() throws MathErrorException {
        ComplexNumber num1 = new ComplexNumber("0");
        ComplexNumber num2 = new ComplexNumber("-8.1i");
        num2.divide(num1);
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

        assertEquals("5.197-0.096i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-5.197+0.096i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot3() {
        ComplexNumber num1 = new ComplexNumber("-4+44i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("4.482+4.908i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-4.482-4.908i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot4() {
        ComplexNumber num1 = new ComplexNumber("-104-6i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("0.294-10.202i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-0.294+10.202i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot5() {
        ComplexNumber num1 = new ComplexNumber("7.1+1.1i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("2.673+0.206i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-2.673-0.206i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot6() {
        ComplexNumber num1 = new ComplexNumber("4.17-15.1i");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("3.149-2.397i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-3.149+2.397i", radicequad[1].toString().replace(" ", ""));
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
        assertEquals("0.497-2.597i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-0.497+2.597i", radicequad[1].toString().replace(" ", ""));
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
        assertEquals("7.778-7.778i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-7.778+7.778i", radicequad[1].toString().replace(" ", ""));
    }

    @Test
    public void testSquareRoot13() {
        ComplexNumber num1 = new ComplexNumber("17.1");
        ComplexNumber[] radicequad = new ComplexNumber[2];
        radicequad = num1.squareRoot();
        assertEquals("4.135", radicequad[0].toString().replace(" ", ""));
        assertEquals("-4.135", radicequad[1].toString().replace(" ", ""));
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
        assertEquals("0.745-0.745i", radicequad[0].toString().replace(" ", ""));
        assertEquals("-0.745+0.745i", radicequad[1].toString().replace(" ", ""));
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
        assertEquals("-4.17+15.1i", segno.toString().replace(" ", ""));
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
