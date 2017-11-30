
/**
 * Write a description of class Compare1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare1
{
    String s1 = "dog";
    String s2 = "cat";
    int returnValue =  0;
    public static String largest(String s1, String s2) {
        if (s1.compareTo(s2) > 0) {
            return s1;
        }
        else if(s1.compareTo(s2) < 0) {
            return s2;
        }
        else{
            return s1 + s2;
        }

    }
}

