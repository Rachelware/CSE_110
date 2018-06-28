import java.util.*;

/**
 * Write a description of class Assignment4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment_4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("provide a pyramid height 1 through 25: ");
        int height = in.nextInt();
        while (height < 1 || height > 25)
        {
            System.out.println("Enter a valid height: ");
            height = in.nextInt();
        }
        
        System.out.println("Would you prefer a diamond instead of a pyramid?");
        String diamond = in.nextLine();
        while (!(diamond.equals("Yes") || diamond.equals("No")))
        {
            System.out.println("input Yes or No: ");
            diamond = in.next();
        }
        boolean diamondBool = false;
        if (diamond.equals("Yes"))
        {
            diamondBool = true;
            System.out.println("Printing a diamond");
        }
        else
        {
            diamondBool = false;
            System.out.println("Printing a pyramid");
        }
        
        //prints top half wrong
        for (int i = 1; i <= height; i++)
        {
            for (int h = 0; h < height - i; h++)
            {
                System.out.print(" ");
            }  
            for (int j= 0; j < i + i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        if (diamondBool == true)
        {
            for (int i = height-1; i > 0; i--)
            {
                for (int h = height -i; h > 0; h--)
                {
                    System.out.print(" ");
                }
                for (int j= i+ i-1; j > 0; j--)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
