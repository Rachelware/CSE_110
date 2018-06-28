package Fruit;

public class FruitBowl
{
    private boolean full;
    private String typeOfBowl;
    private int size;
    
    private Fruit one;
    private Fruit two;
    
    public FruitBowl()
    {
        full = false;
        typeOfBowl = "";
        size = 0;
        one = null;
        two = null;
        
    }
    
    public FruitBowl(boolean full, String type, int size, Fruit first, Fruit second)
    {
        this.full = full;
        typeOfBowl = type;
        this.size = size;
        one = first;
        two = second;
    }
    
    public Fruit getFirstFruit()
    {
        return one;
    }
}
