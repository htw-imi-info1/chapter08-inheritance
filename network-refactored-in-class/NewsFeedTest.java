

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
    private NewsFeed newsFeed1;
    private MessagePost messageP1;
    private MessagePost messageP2;
    private PhotoPost photoPos1;

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
        newsFeed1 = new NewsFeed();
        messageP1 = new MessagePost("bk", "hallo");
        newsFeed1.addMessagePost(messageP1);
        messageP2 = new MessagePost("asdf", "bla");
        newsFeed1.addMessagePost(messageP2);
        newsFeed1.getFeed();
        newsFeed1.show();
        photoPos1 = new PhotoPost("bk", "asdf.jpg", "bla");
        newsFeed1.addPhotoPost(photoPos1);
        newsFeed1.show();
    }

    

    @Test
    public void simpleFeed()
    {
        // given
        newsFeed1.addMessagePost(messageP1);
        newsFeed1.addMessagePost(messageP2);
        newsFeed1.addPhotoPost(photoPos1);
        //when
        String feed = newsFeed1.getFeed();
        //then
        assertTrue("message1",feed.contains("hallo"));
        assertTrue("message2",feed.contains("bla"));
        assertTrue("photo",feed.contains("asdf.jpg"));
        
        
    }

    @Test
    public void testComments()
    {
        newsFeed1.addMessagePost(messageP1);
        messageP1.addComment("this is a comment");
        messageP1.addComment("this is a second comment");
        assertTrue("comment is counted", newsFeed1.getFeed().contains("2 comment"));
    }
}


