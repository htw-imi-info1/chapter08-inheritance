import java.util.*;
/**
 * this example demonstrates the cause of the
 * "unsafe type operation" compiler warning.
 */
public class UnsafeType
{
    List unsafeItems;
    List<String> safeItems;
    public void safe(){
        unsafeItems = new ArrayList<String>();
        safeItems = new ArrayList<String>();
        safeItems.add("a");
        // diese Zeile führt zur Compile Warnung
        // unsafeItems.add("a");
        String e1 = safeItems.get(0);
        // diese Zeile compiliert gar nicht, weil Object kein String ist
        // String e2 = unsafeItems.get(0);
        // d.h. hier müsste gecastet werden, und das kann zu einer 
        // Runtime Exception - ClassCastException - führen!
        String e3 = (String)unsafeItems.get(0);
    }
}
