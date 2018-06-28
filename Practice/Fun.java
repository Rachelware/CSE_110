
/**
 * Write a description of class Fun here.
 *
 * @author Rachel Ware
 * @version 8.21.17
 */
public class Fun
{
    // instance variables - replace the example below with your own
    private String[] holding = {"Vase", "flower", "penny", "apple"};

    /**
     * Constructor for objects of class Fun
     */
    public Fun()
    {
        
    }

    public static void main(String[] args)
    {
        Fun myList = new Fun();
        System.out.print(myList.amendHolding());
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @return  newHolding      A new array of objects being held
     */
    public String[] amendHolding()
    {
        String[] newHolding = new String [holding.length];
        for (int j = 0; j < holding.length; j++)
        {
           String object = "";
           for (int i = 0; i < holding[j].length(); i++)
            {
                if (holding[j].substring(i,i+1).compareTo("o")>0)
                {
                    object += "a";
                }
                else
                {
                    object += "b";
                }
            }
           newHolding[j] = object;
        } 
        return newHolding;
    }
}
