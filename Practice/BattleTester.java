import java.util.*;
/**
 * Write a description of class battleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BattleShip[] ships = new BattleShip[5];
        
        String type = "submarine";
        int xpos = 1;
        int ypos = 1;
        String orientation = "h";
        BattleShip sub = new BattleShip(xpos, ypos, type, orientation);
        ships[0] = sub;
        
        type = "destroyer";
        xpos = 3;
        ypos = 3;
        orientation = "v";
        BattleShip destroyer = new BattleShip(xpos, ypos, type, orientation);
        ships[1] = destroyer;
        
        type = "battleship";
        xpos = 5;
        ypos = 5;
        orientation = "h";
        BattleShip battleship = new BattleShip(xpos, ypos, type, orientation);
        ships[2] = battleship;
        
        type = "aircraft carrier";
        xpos = 7;
        ypos = 7;
        orientation = "h";
        BattleShip aircraftCarrier = new BattleShip(xpos, ypos, type, orientation);
        ships[3] = aircraftCarrier;
        
        type = "cruiser";
        xpos = 9;
        ypos = 9;
        orientation = "v";
        BattleShip cruiser = new BattleShip(xpos, ypos, type, orientation);
        ships[4] = cruiser;
        
        
        BattleGrid board = new BattleGrid();
        board.createSelection(ships);
        board.createBoard();
        
        int x;
        int y;
        do
        {
            System.out.println("Input an x value: ");
            x = in.nextInt();
            System.out.println("Input a y value: ");
            y = in.nextInt();
            if (x != -1 && y != -1)
            {
                board.checkHit(x,y);
            }
            else
            {
                System.out.println("Game Over");
            }
        }
        while (board.checkFinished() == false);
    }
}
