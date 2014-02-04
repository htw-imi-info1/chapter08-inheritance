
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
    NewsFeed newsFeed1;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        //given
        MessagePost mp1 = new MessagePost("Sandi", "objects!");
        PhotoPost pp1 = new PhotoPost("Jochen", "hund.jpg", "Das ist ein Hund");
        newsFeed1 = new NewsFeed();
        newsFeed1.addPost(mp1);
        newsFeed1.addPost(pp1);
    }

    @Test
    public void feedShowsUsers()
    {

        //when
        String feed = newsFeed1.getFeed();
        assertTrue("Sandis Post",feed.contains("Sandi"));
        assertTrue("Jochens Post",feed.contains("Jochen"));
    }
}

