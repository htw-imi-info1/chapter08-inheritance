

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MessagePostTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MessagePostTest
{
    /**
     * Default constructor for test class MessagePostTest
     */
    public MessagePostTest()
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
    public void methodLookUp()
    {
        MessagePost messageP1 = new MessagePost("bk", "the message");
        assertTrue("the message", messageP1.display().contains("the message"));
    }
}

