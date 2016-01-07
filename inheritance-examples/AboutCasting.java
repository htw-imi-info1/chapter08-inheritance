

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class AboutCasting.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AboutCasting
{
    /**
     * Default constructor for test class AboutCasting
     */
    public AboutCasting()
    {
    }


    @Test(expected=ClassCastException.class)
    public void aboutUnsafeTypes(){
        ArrayList list = new ArrayList();
        list.add("eins");
        list.add("zwei");
        list.add(3);
        String actual = (String)list.get(0);
        assertEquals("eins", actual);
        actual = (String)list.get(1);
        assertEquals("zwei", actual);
        actual = (String)list.get(2);
        assertEquals(3, actual);

    }
    
      @Test
    public void aboutTypeParameters(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("eins");
        list.add("zwei");
        list.add("drei");
        String actual = list.get(0);
        assertEquals("eins", actual);
        actual = list.get(1);
        assertEquals("zwei", actual);
        actual = list.get(2);
        assertEquals("drei", actual);

    }
    
    
    
    
    
    
    
    
    
    
}
