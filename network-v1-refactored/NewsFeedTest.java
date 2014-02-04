
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
    MessagePost mp1;
    PhotoPost pp1;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        //given
        mp1 = new MessagePost("Sandi", "objects!");
        pp1 = new PhotoPost("Jochen", "hund.jpg", "Das ist ein Hund");
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
    @Test
    public void feedShowsContent()
    {
        //when
        String feed = newsFeed1.getFeed();
        assertTrue("Sandis Post",feed.contains("objects"));
        assertTrue("Jochens Post",feed.contains("hund"));
    }

    @Test
    public void postsWithSameContentAreEqual()
    {
        Post post1 = new Post("the author");
        Post post2 = new Post("the author");
        assertFalse("posts are different objects", post1 == post2);
        assertEquals("posts with the same author are equal", post1,post2);
        assertTrue("posts with the same author are equal", post1.equals(post2));
    }
}


