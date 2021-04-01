package za.ac.cput.dominicprzygonski_219206414;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Dominic przygonski - 219206414
 */

//First run will sometimes timeout and not show the correct errors as their is no target files and it need to create those first so second run will run fine

public class ExampleTest {
    
    private Example testing1;
    private Example testing2;
    private Example testing3;
    
    public ExampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception{
        testing1 = new Example();
        testing2 = new Example();
        testing3 = testing2;
        
        testing1.setValue1(5);
        testing1.setValue2(5);
        
       
    }
    
    @AfterEach
    public void tearDown() {
    }

    //Test Object Equality, meant to pass
    @Test
    public void testEquality(){
        int ans = testing1.LessThanTen(testing1.getValue1(), testing1.getValue2());
        assertEquals(10, ans);
    }
    
    //Test Object identity, meant to pass
    @Test
    public void testIdentity(){
        assertSame(testing2, testing3);
    }
    
    //Test fail, meant to fail
    @Test
    public void testFail(){
        fail("This is meant to fail");
    }
   
    //Test timeout, meant to skip
    @Test
    @Timeout(1)
    void testTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        }
    
    //Desiabled test, meant to skip
    @Disabled("Disabled test")
    @Test
    void testDisable() {
        assertEquals(testing1, testing2);
    }
}
