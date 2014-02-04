
/**
 * Write a description of class ExpressionsAndStatements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExpressionsAndStatements
{
 
    public void sampleMethod(int y)
    {
        boolean a = true;
        // solution a = false is an boolean expression
        boolean a2 = (a = false);
        // don't do this
        if (a = false){
            System.out.println("a = 4");
            // either like this
        if (a == false){}
        // or
        if (!a);
        }
        
        int b = 0;
        b = 4;
        if (b == 4){
            System.out.println("a = 4");
        }
 
    }
}
