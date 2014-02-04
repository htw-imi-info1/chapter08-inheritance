

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MapDemoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AutoboxingTest
{
    /**
     * Default constructor for test class MapDemoTest
     */
    public AutoboxingTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

   @Test
   public void autounbox(){
       Integer i = new Integer(6);
       assertEquals(true, i == 6);
    }
}
