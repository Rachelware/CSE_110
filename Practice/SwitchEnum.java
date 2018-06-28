import java.util.Scanner;

// new primitive type, possible values in curly braces
enum Day {Sunday,Monday,Tuesday}

/**
 * Write a description of class ex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchEnum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int temp = in.nextInt();
        
        Day today = Day.Sunday;
        
        switch (today)
        {
            case Sunday:
                System.out.println("no");
            default:
                break;
        }
        
        //good for exact values, replacing if statements
        //FALLTHROUGH IS INTENTIONAL
        // fall through (no break line) is like the or(||);
        switch(temp) //depending on user input
        {
            case 5: //if they type in 5
                System.out.println("yay"); //then
                break; //program stops
            case 6:
                System.out.println("oh no");
            default: //basically and else statement, if no case is true
                System.out.println("maybe");
        }
    }
}
