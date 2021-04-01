/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.keziahrobinson_219113149;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;




/**
 *
 * @author keziah
 * 219113149
 */
public class AssignmentClassTest {
    
    public AssignmentClassTest() {
    }
    
    private AssignmentClass test1;
    private AssignmentClass test2;
    private AssignmentClass test3;
     

    
    @BeforeAll
    public static void setUpClass(){}
    
    @AfterAll
    public static void tearDownClass(){}
    
    @BeforeEach
    public void setUp(){
    test1 = new AssignmentClass();
    test2 = new AssignmentClass();
    test3 = test2;
}
    
    @AfterEach
    public void tearDown(){}
    
    @Test
    public void testEquality()
{
    Assertions.assertEquals(test2,test3);
}
    
    @Test
    public void testIdentity(){
    Assertions.assertSame(test2,test3);
}

   @Test
   public void testFail(){
   Assertions.fail("This is supposed to fail test");
   Assertions.assertSame(test2, test3);
   }
  
  @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() { 
        System.out.println("Timeout has passed");
    }
  
     @Test
    @Disabled("Disabled until bug #42 has been resolved")
    
    void testWillBeSkipped() {
    }
    
    
}
   


   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}



