/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.dominicprzygonski_219206414;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dom
 */
public class ExampleTest {
    
    private Example testing1;
    private Example testing2;
    private Example testing3;
    
    public ExampleTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testing1 = new Example();
        testing1.setValue1(5);
        testing1.setValue2(7);
        
        testing2 = new Example();
        testing2.setValue1(7);
        testing2.setValue2(5);
        
        testing3 = testing2;
    }
    
    @After
    public void tearDown() {
    }

    //Test Object Equality, meant to pass
    @Test
    public void testEquality(){
        assertEquals(testing1.getValue1(), testing2.getValue2());
    }
    
    //Test Object identity, meant to pass
    @Test
    public void testIdentity(){
        assertSame(testing2, testing3);
    }
    
    //Test fail, meant to fail
    @Test
    public void testFail(){
        fail("This is meant ot fail");
        assertSame(testing2, testing3);
    }
    
    //Test timeout, meant to fail/error
    @Test (timeout=2000)
    public void testTimeout(){
        while(true){
            
        }
    }
    
    //Test disabling, meant to be skip
    @Test
    @Ignore
    public void testIgnore(){
        System.out.println("This will be skipped");
    }

    
}
