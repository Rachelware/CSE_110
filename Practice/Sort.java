
/**
 * Write a description of class Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
    public static void main(String[] args)
    {
        int[] array = {4,5,3,2,1};
        boolean madeSwitch = true;
        int temp = 0;
        while (madeSwitch)
        {
            madeSwitch = false;
            for (int i = 0; i < array.length -1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    madeSwitch = true;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        
        char[] arr = {'b', 'c', 'a', 'f'};
        madeSwitch = true;
        char temporary = 0;
        while (madeSwitch)
        {
            madeSwitch = false;
            for (int i = 0; i < arr.length -1; i++)
            {
                if ((int)arr[i] > (int)arr[i + 1])
                {
                    temporary = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temporary;
                    madeSwitch = true;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
        String[] arc = {"d", "c", "e", "a"};
        madeSwitch = true;
        String tempor = "";
        while (madeSwitch)
        {
            madeSwitch = false;
            for (int i = 0; i < arc.length - 1; i++)
            {
                if (arc[i].compareTo(arc[i + 1]) > 0)
                {
                    tempor = arc[i];
                    arc[i] = arc[i + 1];
                    arc[i +1] = tempor;
                    madeSwitch = true;
                }
            }
        }
        for (int i = 0; i < arc.length; i++)
        {
            System.out.print(arc[i] + " ");
        }
        System.out.println("");
        //for objects define own compareTo method
    }
}
