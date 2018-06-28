import java.util.*;
/**
 * Write a description of class Lab3 here.
 *
 * @author Rachel Ware
 * @version 9.13.17
 */
public class Lab3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("input a score: ");
        double score = in.nextDouble();
        String grade = "";
        if (score >= 90)
        {
            grade = "A";
        }
        else if (score >= 80)
        {
            grade = "B";
        }
        else if (score >= 60)
        {
            grade = "C";
        }
        else //score less than 60
        {
            grade = "D";
        }
        System.out.println("You got a " + grade);
        
        System.out.println("Input another score: ");
        score = in.nextDouble();
        int intScore = (int) (score/10);
        switch (intScore)
        {
            case 10:
                System.out.println("You got an A");
                break;
            case 9:
                System.out.println("You got an A");
                break;
            case 8:
                System.out.println("You got a B");
                break;
            case 7:
                System.out.println("You got a C");
                break;
            case 6:
                System.out.println("You got a C");
                break;
            default:
                System.out.println("You got a D");
                break;
        }
        
        System.out.println("Please input a score: ");
        score = in.nextDouble();
        while (score >= 0)
        {
            intScore = (int) (score/10);
            switch (intScore)
            {
                case 10:
                    System.out.println("You got an A");
                    break;
                case 9:
                    System.out.println("You got an A");
                    break;
                case 8:
                    System.out.println("You got a B");
                    break;
                case 7:
                    System.out.println("You got a C");
                    break;
                case 6:
                    System.out.println("You got a C");
                    break;
                default:
                    System.out.println("You got a D");
                    break;
            }
            System.out.println("Please input a score: ");
            score = in.nextDouble();
        }
        System.out.println("Please input a valid score.");
    }
}
