import java.util.*;
/**
 * Write a description of class Assignment3 here.
 *
 * @author Rachel Ware
 * @version 9.13.17
 */
public class Assignment3
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numInputs = 0;
        double sum = 0.0;
        double lastInput = 0.0;
        
        System.out.println("Input doubles. Input a '0' when done.");
        double input = in.nextDouble();
        double highVal = input;
        double lowVal = input;
        while (input != 0.0)
        {
            numInputs++;
            sum = sum + input;
            
            if (input > highVal)
            {
                highVal = input;
            }
            if (input < lowVal)
            {
                lowVal = input;
            }
            lastInput = input;
            System.out.println("Input doubles. Input a '0' when done.");
            input = in.nextDouble();
        }
        if (numInputs == 0)
        {
            System.out.println("You didn't input anything");
        }
        else
        {
            System.out.println("The sum of your inputs is: " + sum);
            System.out.println("The number of inputs is: " + numInputs);
            System.out.println("The average of your inputs is: " + (sum/numInputs));
            System.out.println("The highest number you input is: " + highVal);
            System.out.println("The lowest number you input is: " + lowVal);
        }
        
    }
}
