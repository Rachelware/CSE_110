import java.util.Scanner;

public class Lab11
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        printArray(array);
        System.out.println("Input a number to add: ");
        int input = in.nextInt();
        addElement(array, input);
        printArray(array);
        System.out.println("Input an index: ");
        int index = in.nextInt();
        System.out.println("Input a number: ");
        input = in.nextInt();
        insertElement(array, input, index);
        printArray(array);
        System.out.println("Input an index to delete: ");
        index = in.nextInt();
        deleteElement(array, index);
        printArray(array);
        
        int[][] array2 = new int[10][10];
        for (int i = 0; i < array2.length; i++)
        {
           for (int j = 0; j < array2[0].length; j++)
           {
               //System.out.println("Input array value for (" + i + ", " + j + ")");
               //array2[i][j] = in.nextInt();
               array2[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println("");
        printArray(array2);
    }
    
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
       {
           for (int j = 0; j < array.length; j++)
           {
               System.out.print(array[i][j] + ", ");
            }
           System.out.println();
        }
    }
    
    public static void addElement(int[] array, int element)
    {
        int i = 0;
        while (array[i] != -1)
        {
            i++;
        }
        if (i < array.length)
        {
            array[i] = element;
        }
        else
        {
            System.out.println("array values are all filled");
        }
    }
    
    public static void insertElement(int[] array, int element, int index)
    {
        if (index < array.length && index >= 0)
        {
            array[index] = element;
        }
        else
        {
            System.out.println("Index is out of range");
            System.out.println("Input an index: ");
            int indexed = in.nextInt();
            System.out.println("Input a number: ");
            int input = in.nextInt();
            insertElement(array, input, indexed);
        }
    }
    
    public static void deleteElement(int[] array, int index)
    {
        if (index < array.length && index >= 0)
        {
            array[index] = -1;
        }
        else
        {
            System.out.println("Index is out of range");
            System.out.println("Input an index to delete: ");
            int indexed = in.nextInt();
            deleteElement(array, indexed);
        }
    }
}






















