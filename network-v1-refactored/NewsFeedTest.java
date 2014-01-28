

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewsFeedTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewsFeedTest
{
    /**
     * Default constructor for test class NewsFeedTest
     */
    public NewsFeedTest()
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
    public void feedShowsUsers()
    {
        //given
        MessagePost mp1 = new MessagePost("Sandi", "objects!");
        PhotoPost pp1 = new PhotoPost("Jochen", "hund.jpg", "Das ist ein Hund");
        NewsFeed newsFeed1 = new NewsFeed();
        newsFeed1.addPost(mp1);
        newsFeed1.addPost(pp1);
        //when
        String feed = newsFeed1.getFeed();
        assertTrue("Sandis Post",feed.contains("Sandi"));
        assertTrue("Jochens Post",feed.contains("Jochen"));
    }
}

