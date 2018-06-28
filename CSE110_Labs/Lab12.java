import java.util.Scanner;
public class Lab12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] array = {"john", "ahmed", "ghaith", "tyler", "elizabeth"};
        printArray(array);
        System.out.println("Input a name to search: ");
        String name = in.next();
        System.out.println(search(array, name));
        System.out.println("Input a name for binary search: ");
        name = in.next();
        System.out.println(binarySearch(array, name));
        
        sort(array);
        
        printArray(array);
        System.out.println("Input a name to search: ");
        name = in.next();
        System.out.println(search(array, name));
        System.out.println("Input a name for binary search: ");
        name = in.next();
        System.out.println(binarySearch(array, name));
        
    }
    
    public static void printArray(String[] array)
    {
        System.out.print("{");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }
    
    public static int search(String[] array, String word)
    {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++)
        {
            if (flag == false && word.equals(array[i]))
            {
                flag = true;
                index = i;
            }
        }
        return index;
    }
    
    public static boolean sorted(String[] array)
    {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i].compareTo(array[i + 1]) > 0)
            {
                sorted = false;
            }
        }
        return sorted;
    }
    
    public static void sort(String[] array)
    {
        boolean madeSwitch = true;
        String tempor = "";
        while (madeSwitch)
        {
            madeSwitch = false;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i].compareTo(array[i + 1]) > 0)
                {
                    tempor = array[i];
                    array[i] = array[i + 1];
                    array[i +1] = tempor;
                    madeSwitch = true;
                }
            }
        }
    }
    
    public static int binarySearch(String[] array, String word)
    {
        if (sorted(array) == true && array.length > 0)
        {
            if (array[array.length/2].equals(word))
            {
                return array.length/2;
            }
            else if (array[array.length/2].compareTo(word) > 0)
            {
                String[] arr = new String[(array.length/2)];
                for (int i = 0; i < arr.length; i++)
                {
                    arr[i] = array[i];
                }
                return binarySearch(arr, word);
            }
            else if (array[array.length/2].compareTo(word) < 0)
            {
                String[] arr = new String[(array.length/2) + 1];
                for (int i = 0; i < arr.length; i++)
                {
                    arr[i] = array[i + (array.length/2)];
                }
                return binarySearch(arr, word) + (array.length/2);
            }
            else
            {
                return -1; 
            }
        }
        else
        {
            return -1;
        }
    }
}

