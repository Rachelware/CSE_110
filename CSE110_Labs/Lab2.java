import java.util.Scanner;
/**
 * Takes user input and prints fullname with age, full name in uppercase, and the relationship
 * between num1 and num2.
 *
 * @author Rachel Ware
 * @version 9.6.17
 */
public class Lab2
{
    public static void main (String [] args)
    {
         Scanner scan=new Scanner(System.in);
         
         int age;
         double num1;
         double num2;
         String firstName;
         String lastName;
         String fullName;
         
         System.out.println("Enter age:");
         age = scan.nextInt();
         System.out.println("Enter first number:");
         num1 = scan.nextDouble();
         System.out.println("Enter second number:");
         num2 = scan.nextDouble();
         System.out.println("Enter first name:");
         firstName = scan.next();
         System.out.println("Enter last name:");
         lastName = scan.next();
         fullName = firstName + " " + lastName;
         
         System.out.println(fullName + " is " + age + " years old.");
         System.out.println("uppercase full name is " + fullName.toUpperCase());
         
         if (Double.compare(num1, num2) > 0)
         {
             System.out.println("number 1 is bigger than number 2, " + num1 + " > " + num2);
         }
         else if (Double.compare(num1, num2) < 0)
         {
             System.out.println("number 2 is bigger than number 1, " + num2 + " > " + num1);
         }
         else
         {
             System.out.println("number 1 is equal to number 2, " + num1 + " = " + num2);
         }
    }
}

