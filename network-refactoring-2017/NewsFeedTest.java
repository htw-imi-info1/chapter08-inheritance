
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
    NewsFeed newsFeed1 ;MessagePost message;PhotoPost photoPos1;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        newsFeed1 = new NewsFeed();
        message = new MessagePost("Donald Duck", "Quack");
        message.like();

        newsFeed1.addPost(message);
        photoPos1 = new PhotoPost("Gustav Gans", "feather.jpg", "My Feather");
        newsFeed1.addPost(photoPos1);
        photoPos1.like();
        photoPos1.like();

    }

    
    @Test
    public void testDisplayAuthor()
    {
        assertTrue("", newsFeed1.displayAll().contains("Donald Duck"));
    }

    @Test
    public void testDisplayMessage()
    {
        assertTrue("", newsFeed1.displayAll().contains("Quack"));
    }
    /*
    Donald Duck
    2 seconds ago

    No comments.

    Gustav Gans
    2 seconds ago

    No comments.
     */

}

