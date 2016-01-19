package myPackage;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ATest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ATest
{
    /**
     * Default constructor for test class ATest
     */
    public ATest()
    {
    }

 @Test
 public void test(){
     A a = new A();
     assertEquals("A",a.aMethod());
    }
}
