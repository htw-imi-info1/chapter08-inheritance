import java.util.*;
/**
 * Superclass for all Posts.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    protected String username;  // username of the post's author
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();

    }
    
     public String display()
    {
        String display = "";
        display += username +"\n";
        //display += message + "\n";
        display += timeString(timestamp);
        
        if(likes > 0) {
            display += "  -  " + likes + " people like this.";
        }
        display += "\n";
        
        if(comments.isEmpty()) {
            display += "   No comments.\n" ;
        }
        else {
            display +="   " + comments.size() + " comment(s). Click here to view.\n";
        }
        return display;
    }
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    private String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }
    
    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }

}
