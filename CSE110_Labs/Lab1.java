import java.util.*;
/**
 * CSE 110 Lab #1
 * Takes input of 2 integers and returns the results of adding, subtracting, multiplying,
 * integer dividing and modulus.
 * 
 * @author Rachel Ware
 * @version 8.30.17
 * TIME SPENT: 13 minutes
 */
public class Lab1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstInput = scan.nextInt();
        System.out.println("You entered: " + firstInput);
        System.out.println("Enter another number: ");
        int secondInput = scan.nextInt();
        System.out.println("You entered: " + secondInput);
        
        System.out.println("Addition = " + (firstInput + secondInput));
        System.out.println("Subtraction = " + (firstInput - secondInput));
        System.out.println("Multiplication = " + (firstInput * secondInput));
        System.out.println("Integer Division = " + (firstInput/ secondInput));
        System.out.println("Modulus = " + (firstInput % secondInput));
    }
}
