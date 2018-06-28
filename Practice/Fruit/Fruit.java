package Fruit;

public class Fruit
{
    private String name;
    private FruitColors color;
    private boolean ripe;
    private boolean eaten;
    private boolean beenRipe;

    public Fruit()
    {
        name = "...";
        color = FruitColors.Red;
        ripe = false;
        eaten = false;
    }

    public Fruit(String n, FruitColors fc, boolean r)
    {
        name = n;
        color = fc;
        ripe = r;
        eaten = false;
    }
    
    public Fruit(Fruit f)
    {
        name = f.getName();
        color = f.getColor();
        ripe = f.getRipe();
    }
    
    public static Fruit copyFruit(Fruit f)
    {
        Fruit copyFruit = new Fruit(f);
        return copyFruit;
    }
    
    public Fruit copyMe()
    {
        Fruit copyFruit = new Fruit(this);
        return copyFruit;
    }

    public String getName()
    {
        return name;
    }

    public FruitColors getColor()
    {
        return color;
    }

    public boolean getRipe()
    {
        return ripe;
    }

    public void sitOnCounter()
    {
        if (ripe)
        {
            ripe = !ripe;
        }
        else if (!beenRipe)
        {
            ripe = !ripe;
            beenRipe = !beenRipe;
        }
    }

    public String eat()
    {
        String output = "";
        if(eaten)
        {
            output += "You already ate this!";
        }
        else if(ripe)
        {
            output += "Yum!";    
        }
        else if (!beenRipe)
        {
            output += "Yuck! It wasn't ripe....";
        }
        else
        {
            output += "Blargh! It was rotten";
        }
        eaten = true;
        return output;
    }
    
    public String toString()
    {
        String str = "";
        str += "This " + color + " " + name + " is ";
        if (!ripe)
        {
            str += "not ";
        }
        str += "ripe";
        return str;
    }
}
