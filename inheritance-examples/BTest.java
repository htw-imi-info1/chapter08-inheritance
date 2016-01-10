
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
    private A a;
    private B b;
    private A bDeclaredAsA; // Static Type: A

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
        a = new A();
        b = new B();
        bDeclaredAsA = new B(); // dynamic Type: B
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
        assertEquals("A's method",a.method());
        assertEquals("B's method",b.method());
        assertEquals("B's method",bDeclaredAsA.method());
    }

    @Test
    public void fieldLookupIsStatic()
    {
        assertEquals("A's field",a.field);
        assertEquals("B's field",b.field);
        assertEquals("A's field",bDeclaredAsA.field);
    }
    @Test
    public void staticMethodsAreStatic()
    {
        assertEquals("A's static method",a.staticMethod());
        assertEquals("B's static method",b.staticMethod());
        assertEquals("A's static method",bDeclaredAsA.staticMethod()); 
        assertEquals("A's static method",A.staticMethod()); 
        assertEquals("B's static method",B.staticMethod()); 
    }
    
}

