/**
 * SquentialSearch.java
 * 
 * @author Danielle Jeon
 * @version 2024-04-04
 */
public class SequentialSearch
{
    public static int search(int[] intArr, int value)
    {
        // sets the default to -1 incase the value is not found in the array
        int foundIndex = -1;
        
        for(int i = 0; i < intArr.length; i++)
        {
            if (intArr[i] == value)
            {
                return i;
            } // end if
        } // end for
        
        return  foundIndex;
    }
}