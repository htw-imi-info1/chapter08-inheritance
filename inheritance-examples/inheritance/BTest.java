

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BTest
{
    private A a1;
    private B b1;
    private A b2; // Static Type: A

    /**
     * Default constructor for test class BTest
     */
    public BTest()
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
        a1 = new A();
        b1 = new B();
        b2 = new B(); // dynamic Type: B
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void methodLookupIsDynamic()
    {
        assertEquals("A's method",a1.method());
        assertEquals("B's method",b1.method());
        assertEquals("B's method",b2.method());
    }
        @Test
    public void fieldLookupIsStatic()
    {
        assertEquals("A's field",a1.field);
        assertEquals("B's field",b1.field);
        assertEquals("A's field",b2.field);
    }

    
}


