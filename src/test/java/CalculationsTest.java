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
    private Calculations number1, number2;
    
    public CalculationsTest() {
    }
    
    @BeforeClass
    public void setUp() throws Exception {
      System.out.println("Run @Before"); 
      number1 = new Calculations(11);
      number2 = new Calculations(22);
   }
    
    @AfterClass
   public void tearDown() throws Exception {
      System.out.println("Run @After"); 
   }
   
   @Test
   public void testGetterSetter() {
      System.out.println("Run @Test testGetterSetter"); 
      int value = 33;
      number1.setNumber(value);
      assertEquals("error in getter/setter", value, number1.getNumber());
   }
 
   @Test
   public void testAdd() {
      System.out.println("Run @Test testAdd"); 
      assertEquals("error in add()", 33, number1.add(number2).getNumber());
      assertEquals("error in add()", 55, number1.add(number2).getNumber());
   }
 
   @Test
   public void testDiv() {
      System.out.println("Run @Test testDiv"); 
      assertEquals("error in div()", 2, number2.div(number1).getNumber());
      assertEquals("error in div()", 0, number2.div(number1).getNumber());
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testDivByZero() {
      System.out.println("Run @Test testDivByZero"); 
      number2.setNumber(0);
      number1.div(number2);
   }

    private void assertEquals(String error_in_div, int i, int number) {
        throw new UnsupportedOperationException("Not supported yet."); 
}
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testSomeMethod() {
        
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

    private void assertEquals(String error_in_gettersetter, int value, int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
