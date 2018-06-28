import java.util.Scanner;

/**
 * Write a description of class Assignment2 here.
 *
 * @author Rachel Ware
 * @version 9.13.17
 */
public class Assignment2
{
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
         
         System.out.println("Please enter a string: ");
         String original = in.nextLine();
         System.out.println("please enter a search term: ");
         String searchTerm = in.nextLine();
         
         System.out.println("Do you wish to consider spaces? 1 for yes, 0 for no");
         String spaces = in.next();
         System.out.println("Do you wish to consider letter case? 1 for yes, 0 for no");
         String caseCounts = in.next();
         int spaceInt = Integer.parseInt(spaces);
         int caseInt = Integer.parseInt(caseCounts);
         
         if (spaceInt == 0)
         {
             original = original.replace(" ", "");
             searchTerm = searchTerm.replace(" ","");
         }
         if (caseInt == 0)
         {
             original = original.toUpperCase();
             searchTerm = searchTerm.toUpperCase();
         }
         if (original.compareTo(searchTerm) == 0)
         {
             System.out.println("Your search is equal to the entire input.");
         }
         else if (original.contains(searchTerm) == false)
         {
             System.out.println("Your search was not found in the input.");
         }
         else
         {
             boolean flag = false; //to avoid out of range error
             for (int i = 0; i < original.length()-1; i++)
              {
                  if (flag == false)
                  {
                      if (original.substring(i, i + searchTerm.length()).compareTo(searchTerm) == 0)
                       {
                           if (i == 0)
                            {
                                System.out.println("Your search is at the beginning of the input.");
                                flag = true;
                            }
                            else if (i == (original.length() - searchTerm.length()))
                            {
                                System.out.println("Your search is at the end of the input.");
                                flag = true;
                            }
                            else
                            {
                                System.out.println("Your search starts at index " + i + " and ends at index " + (i + searchTerm.length()-1));
                                flag = true;
                            }
                       }
                  }
              }
         } 
    }
}
    

