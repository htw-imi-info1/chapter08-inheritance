import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class NewsFeed
{
    private ArrayList<Post> posts;
  
    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<Post>();
    }

    /**
     * Add a text post to the news feed.
     * 
     * @param text  The text post to be added.
     */
    public void addPost(Post message)
    {
        posts.add(message);
    }


    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()
    {
        System.out.println(getFeed());
    }
    public String getFeed(){
        String feed = "";
        // append all text posts
        for(Post post : posts) {
            feed += post.display();
            feed += "\n"; // empty line between posts
        }

       
        return feed;
    }
}
