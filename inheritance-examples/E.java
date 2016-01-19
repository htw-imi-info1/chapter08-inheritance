
/**
 * Example in Class 19-01-2016
 * 
 */
public class E extends D
{
    public String bMethod(String x){
        return x + super.bMethod(x)+"E";
    }
    protected String hook(){
        return "E";
    }
}
