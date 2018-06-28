import java.util.*;
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    public static void main(String[] args)
    {
        final int MAX = 10;
        
        Scanner in = new Scanner(System.in);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(25));
        //Math.cbrt for cube root
        System.out.println(Math.random()); //can seed, 
        // bluej automatically uses system time since computer just started
        
        //Math.floor() rounds down
        //Math.ceil() rounds up
        //Math.round() goes either way
    }
}
