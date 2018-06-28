
/**
 * Write a description of class BattleGrid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleGrid
{
    // instance variables - replace the example below with your own
    private BattleShip[] array = new BattleShip[5];
    private int[][] board = new int[15][15];

    /**
     * Constructor for objects of class BattleGrid
     */
    public BattleGrid()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int createSelection(BattleShip[] input)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input[i];
        }
        return 2;
    }
    
    public int[][] createBoard()
    {
        int xPos;
        int yPos;
        for (int i = 0; i < array.length; i++)
        {
            xPos = array[i].getX();
            yPos = array[i].getY();
            board[yPos][xPos] = 1;
            if (array[i].getOrientation() == true)
            {
                for (int j = 0; j < array[i].getLength() -1; j++)
                {
                    yPos++;
                    board[yPos][xPos] = 1;
                }
            }
            else if (array[i].getOrientation() == false)
            {
                for (int h = 0; h < array[i].getLength() -1; h++)
                {
                    xPos++;
                    board[yPos][xPos] = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                System.out.print(board[i][j] + ", ");
            }
            System.out.println("");
        }
        return board;
    }
    
    public boolean checkHit(int xPos, int yPos)
    {
        boolean hitValue = false;
        if (yPos > board.length || xPos > board[0].length)
        {
            System.out.println("Not a valid coordinate");
            return hitValue;
        }
        if (board[yPos][xPos] == 1)
        {
            hitValue = true;
            System.out.println("you got a hit!");
            board[yPos][xPos] = 2;
        }
        else if (board[yPos][xPos] == 0)
        {
            board[yPos][xPos] = 2;
            System.out.println("you missed");
        }
        else if (board[yPos][xPos] == 2)
        {
            System.out.println("You already chose this point");
        }
        if (checkFinished() == true)
        {
            System.out.println("you won!");
        }
        return hitValue;
    }
    
    public boolean checkFinished()
    {
        boolean done =true;
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                if (board[i][j] == 1)
                {
                    done = false;
                }
            }
        }
        return done;
    }
}




















