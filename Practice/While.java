import java.util.Scanner;
/**
 * Write a description of class While here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class While
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int input = in.nextInt();
        int remember = input;
        while (input < 0 || input > 100)
        {
            System.out.println("Invalid input");
            input = in.nextInt();
            remember = input;
        }
        
        while (input > 0)
        {
            for (int i = 0; i < input; i++)
            {
                System.out.print(input);
            }
            System.out.println("");
            input--;
        }
        for (int i = 0; i <= remember; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
