
public class VideoPost extends Post
{
    private String videoFileName;
    public VideoPost(String author, String videoFileName)
    {
       super(author);
       this.videoFileName = videoFileName;
    }
  public String getSpecificDisplayPart(){

        return "  [" + videoFileName + "]\n";
    }
}
