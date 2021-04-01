/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mponeng Ratego
 * 216178991
 */
public class CalculationsTest {
    
    public CalculationsTest() {
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

    @org.junit.Test
    public void testSomeMethod() {
        Calculations pg = new Calculations();
        String results = pg.print(98);
        assertEquals("Incorrect Message","You passed",results);
    }

    /**
     * Test of cal method, of class Calculations.
     */
    @org.junit.Test
    public void testCal() {
        System.out.println("cal");
        int sed = 0;
        Calculations instance = new Calculations();
        String expResult = "";
        String result = instance.cal(sed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
