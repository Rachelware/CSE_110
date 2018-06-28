import java.util.Scanner;
/**
 * Write a description of class Lab10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab10
{
    public static void main(String[] args)
    {
        int[] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int i = 3;
        System.out.println("the " + i + " element value in your array is: " + array[i]);
        for (int j = 0; j < array.length; j++)
        {
            System.out.println("the " + j + " element value in your array is: " + array[j]);
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input a positive value: ");
        int input = in.nextInt();
        for (int k = 0; k < array.length; k++)
        {
            while (input < 0 )
            {
                System.out.println("Input a positive value: ");
                input = in.nextInt();
            }
            if (array[k] == -1)
            {
                array[k] = input;
            }
            System.out.println("Input a positive value: ");
            input = in.nextInt();
        }
        for (int j = 0; j < array.length; j++)
            {
                System.out.println("the " + j + " element value in your array is: " + array[j]);
            }
        
        
        System.out.println("Input an index: ");
        int index = in.nextInt();
        while (index < 0 || index > array.length - 1)
        {
            System.out.println("out of range.");
            System.out.println("Input an index: ");
            index = in.nextInt();
        }
        System.out.println("Input a new value: ");
        input = in.nextInt();
        array[index] = input;
        for (int j = 0; j < array.length; j++)
        {
            System.out.println("the " + j + " element value in your array is: " + array[j]);
        }
        
        System.out.println("\nInput an index to erase: ");
        index = in.nextInt();
        while (index < 0 || index > array.length - 1)
        {
            System.out.println("out of range.");
            System.out.println("Input an index: ");
            index = in.nextInt();
        }
        array[index] = -1;
        for (int j = 0; j < array.length; j++)
        {
            System.out.println("the " + j + " element value in your array is: " + array[j]);
        }
    }
}









