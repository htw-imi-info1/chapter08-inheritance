
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ETest
{
    /**
     * Default constructor for test class DTest
     */
    public ETest()
    {
    }

    @Test
    public void testCase1(){
        D x = new D();
        assertEquals("XD",x.bMethod("X"));
    }
    @Test
    public void testCase2(){
        E x = new E();
        assertEquals("XXDE",x.bMethod("X"));
    }
    @Test
    public void testCase3(){
        F x = new F();
        assertEquals("XF",x.bMethod("X"));
    }
    @Test
    public void testCase4(){
        D x = new E();
        assertEquals("XXDE",x.bMethod("X"));
    }
    @Test
    public void testCase5(){
        D x = new F();
        assertEquals("XF",x.bMethod("X"));
    }
}
