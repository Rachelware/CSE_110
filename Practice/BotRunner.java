import java.util.Scanner;
/**
 * Write a description of class BotRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BotRunner
{
    public static void main(String[] args)
    {
        ChatBot comp = new ChatBot();
        Scanner in = new Scanner(System.in);
        
        System.out.println(comp.start());
        String input = in.next();
        while (!input.equals("-1"))
        {
            System.out.println(comp.run(input));
            input = in.next();
        }
    }
}
