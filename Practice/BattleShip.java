
/**
 * Write a description of class BattleShip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleShip
{
    private int xPos; //top leftmost point pos
    private int yPos;
    private int length;
    private String type;
    private String orientation;
    private int[][] coordinates;
    
    
    /**
     * Constructor for objects of class BattleShip
     */
    public BattleShip(int xPos, int yPos, String type, String orientation)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.type = type;
        this.orientation = orientation;
        if (type.equals("submarine"))
        {
            length = 3;
        }
        else if(type.equals("destroyer"))
        {
            length = 2;
        }
        else if(type.equals("cruiser"))
        {
            length = 3;
        }
        else if(type.equals("aircraft carrier"))
        {
            length = 5;
        }
        else if (type.equals("battleship"))
        {
            length = 4;
        }
    }

    public int getLength()
    {
        return length;
    }
    
    public int getX()
    {
        return xPos;
    }
    
    public int getY()
    {
        return yPos;
    }
    
    public boolean getOrientation()
    {
        boolean orientedNorth = false; //vertical is true, horizontal is false
        if (orientation.equals("v"))
        {
            orientedNorth = true;
        }
        return orientedNorth;
    }
}
