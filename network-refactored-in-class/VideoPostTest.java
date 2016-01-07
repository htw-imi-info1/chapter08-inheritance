

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VideoPostTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VideoPostTest
{
    private VideoPost videoPos1;

    /**
     * Default constructor for test class VideoPostTest
     */
    public VideoPostTest()
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
        videoPos1 = new VideoPost("Donald", "donald.mp4");
    }

    

    @Test
    public void testShowVideo()
    {
        assertTrue("video file name should be contained", videoPos1.display().contains("donald.mp4"));
    }
    
    @Test
    public void testShowAuthor()
    {
        assertTrue("author should be contained", videoPos1.display().contains("Donald"));
    }
    
}

