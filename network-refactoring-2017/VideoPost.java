
public class VideoPost extends Post
{
    public VideoPost(String author){
        super(author);
    }

    @Override
    public String displayContent(){return "some Video";}
}
