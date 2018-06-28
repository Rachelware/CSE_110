
import java.util.Scanner;
public class TryNCatchThis
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int x;
        try
        {
            x = 5/0;
        }
        catch(ArithmeticException e)
        {
            x = 0;
            System.out.println("Oi! Don't do that! " + e);
        }
        catch (NullpointerException e)
        {
            System.out.println("oops");
        }
        
        String input = in.nextLine();
        try
        {
            x = Integer.parseInt(input);
        }
        catch(ArithmeticException e)
        {
            x = 0;
            System.out.println("Oi! Don't do that! " + e);
        }
        catch (Exception e)
        {
            
        }
        
    }
}
