
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
    private MessagePost messageP1;
    private PhotoPost photoPos1;
    private NewsFeed newsFeed1;

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
        messageP1 = new MessagePost("author_message", "text of message post");
        photoPos1 = new PhotoPost("author_photo", "filename.jpg", "caption text");
        messageP1.like();
        messageP1.addComment("");
        photoPos1.like();
        photoPos1.like();
        photoPos1.addComment("");
        photoPos1.addComment("");
        newsFeed1 = new NewsFeed();
        newsFeed1.addPost(messageP1);
        newsFeed1.addPost(photoPos1);

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
    public void authorOfMessagePostIsShown()
    {
        assertTrue(newsFeed1.getFeed().contains("author_message"));
    }

    @Test
    public void authorOfPhotoPostIsShown()
    {
        assertTrue(newsFeed1.getFeed().contains("author_photo"));
    }

    @Test
    public void photoShown(){
        assertTrue(newsFeed1.getFeed().contains("filename.jpg"));
        assertTrue(newsFeed1.getFeed().contains("caption text"));

    }

    @Test
    public void print(){
        newsFeed1.show();
    }

    @Test
    public void messagePostLikeAndCommentsAreShown(){
        NewsFeed newsFeed2 = new NewsFeed();
        messageP1 = new MessagePost("author_message", "text of message post");
        newsFeed2.addPost(messageP1);
        messageP1.like();
        messageP1.like();
        messageP1.addComment("bla");
        assertTrue(newsFeed2.getFeed().contains("2 people like this"));
        assertTrue(newsFeed2.getFeed().contains("1 comment"));
    }
      @Test
    public void photoPostLikeAndCommentsAreShown(){
        NewsFeed newsFeed2 = new NewsFeed();
      photoPos1 = new PhotoPost("author_photo", "filename.jpg", "caption text");
        newsFeed2.addPost(photoPos1);
        photoPos1.like();
        photoPos1.like();
        photoPos1.addComment("bla");
        assertTrue(newsFeed2.getFeed().contains("2 people like this"));
        assertTrue(newsFeed2.getFeed().contains("1 comment"));
    }
   

}
