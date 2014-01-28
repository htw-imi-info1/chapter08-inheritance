

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CanvasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CanvasTest
{
    /**
     * Default constructor for test class CanvasTest
     */
    public CanvasTest()
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
    public void test()
    {
        Canvas.getCanvas();
        Circle circle1 = new Circle();
        circle1.makeInvisible();
        circle1.makeVisible();
        Square square1 = new Square();
        square1.makeVisible();
        Triangle triangle1 = new Triangle();
        triangle1.makeVisible();
        Person person1 = new Person();
        person1.makeVisible();
    }
}

