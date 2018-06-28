import java.util.Scanner;
/**
 * Takes user input of strings and sticks them together in lines.
 *
 * @author Rachel Ware
 * @version 8.25.17
 */
public class Entry
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // String entries
        System.out.println("Please enter your entry: ");
        String words = in.nextLine();
        String transcribe = words;
        while (!(words.equals("0")))
        {
            System.out.println("Please enter your entry: ");
            words = in.nextLine();
            if (!(words.equals("0")))
            {
                transcribe += "\n" + words + ".";
            }
        }
        System.out.print(transcribe);
        for (int i = transcribe.length() - 1; i >= 0; i--)
        {
            System.out.print(transcribe.charAt(i));
        }
        
        //Integer entries
        System.out.println("");
        System.out.print("input a number: " );
        int firstNumber = in.nextInt();
        System.out.println("");
        System.out.print("input another number: ");
        int secondNumber = in.nextInt();
        System.out.println("");
        System.out.print(firstNumber + secondNumber);
        
    }
}
