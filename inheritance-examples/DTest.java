
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
public class DTest
{
    /**
     * Default constructor for test class DTest
     */
    public DTest()
    {
    }

    @Test
    public void testCase1(){
        D x = new D();
        assertEquals("aMethod in D",x.aMethod());
    }
    @Test
    public void testCase2(){
        E x = new E();
        assertEquals("aMethod in D",x.aMethod());
    }
    @Test
    public void testCase3(){
        F x = new F();
        assertEquals("aMethod in F",x.aMethod());
    }
    @Test
    public void testCase4(){
        D x = new E();
        assertEquals("aMethod in D",x.aMethod());
    }
    @Test
    public void testCase5(){
        D x = new F();
        assertEquals("aMethod in F",x.aMethod());
    }
}
