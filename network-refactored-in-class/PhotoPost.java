import java.util.ArrayList;

/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a photo and a caption. 
 * Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class PhotoPost extends Post
{
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        username = author;
        this.filename = filename;
        this.caption = caption;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();
    }

    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public String displayX()
    {
        String display = "";
        display += username+"\n";
        display += "  [" + filename + "]\n";
        display += "  " + caption +"\n";
        display += timeString(timestamp);

        if(likes > 0) {
            display += "  -  " + likes + " people like this.";
        }
        display += "\n";

        if(comments.isEmpty()) {
            display += "   No comments.\n";
        }
        else {
            display += "   " + comments.size() + " comment(s). Click here to view./n";
        }
        return display;
    }

    public String display(){
        String display = "";
        display += "  [" + filename + "]\n";
        display += "  " + caption +"\n";
        display += super.display();
        return display;
    }

}
