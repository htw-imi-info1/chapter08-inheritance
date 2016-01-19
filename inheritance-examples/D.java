
/**
 * Example in Class 19-01-2016
 * 
 */
public class D
{
    public String aMethod(){
        return "aMethod in D";
    }
     public String bMethod(String x){
        return x + "D";
    }
    public String display(){
        return "A"+hook()+"B";  
    }
    protected String hook(){
        return "D";
    }
}
