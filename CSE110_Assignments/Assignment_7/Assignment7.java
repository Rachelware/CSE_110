package Assignment_7;

import java.util.Scanner;
public class Assignment7
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        MyString mstry = new MyString();
        System.out.println("Welcome!");
        mainMenu(mstry);
        System.out.println("Bye!");
    }
    
    private static String mainMenu(MyString mstr)
    {
        System.out.println("Welcome to the Searchable String menu\na. Create a Searchable String\nb. Print the current Searchable String\nc. Search within the String\nd.Quit");
        String input = in.next();
        in.nextLine();
        if (input.equals("a"))
        {
            System.out.println("Input a string: ");
            String userInput = in.nextLine();
            mstr = new MyString(userInput);
            System.out.println("Set " + mstr.toString()  + " as the searchable String");
            return mainMenu(mstr);
        }
        else if (input.equals("b"))
        {
            System.out.println(mstr);
            return mainMenu(mstr);
        }
        else if (input.equals("c"))
        {
            searchString(mstr);
            return mainMenu(mstr);
        }
        else if (input.equals("d"))
        {
            return "";
        }
        else
        {
            System.out.println("Invalid input");
            return mainMenu(mstr);
        }
    }
    
    private static void searchString(MyString mstr)
    {
        System.out.println("Enter a string to search for: ");
        String str = in.nextLine();
        if (!mstr.contains(str))
        {
            System.out.println("The search string is not in the searchable string");
        }
        else if (mstr.equals(str))
        {
            System.out.println("The search string is identical to the searchable string");
        }
        else if (mstr.startsWith(str))
        {
            System.out.println("The searchable string starts with the search string");
        }
        else if (mstr.endsWith(str))
        {
            System.out.println("The searchable string ends with the search string");
        }
        else
        {
            System.out.println("The search string starts at index " + mstr.indexOf(str) + " in the searchable string");
        }
    }
}











