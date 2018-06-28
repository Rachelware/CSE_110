import java.util.Scanner;
/**
 * Write a description of class BattleInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BattleShip[] ships = new BattleShip[5];
        
        System.out.println("input x,y coordinates for submarine: ");
        String Input = in.nextLine();
        String type = "submarine";
        int i = 0;
        int xpos = 0;
        while (Input.charAt(i) != (','))
        {
            i++;
        }
        xpos = Integer.parseInt(Input.substring(0,i));
        int ypos = Integer.parseInt(Input.substring(i+1));
        System.out.println("Input orientation, h or v: ");
        String orientation = in.nextLine();
        BattleShip sub = new BattleShip(xpos, ypos, type, orientation);
        ships[0] = sub;
        
        System.out.println("input x,y coordinates for destroyer: ");
        Input = in.nextLine();
        type = "destroyer";
        i = 0;
        xpos = 0;
        while (Input.charAt(i) != (','))
        {
            i++;
        }
        xpos = Integer.parseInt(Input.substring(0,i));
        ypos = Integer.parseInt(Input.substring(i+1));
        System.out.println("Input orientation, h or v: ");
        orientation = in.nextLine();
        BattleShip destroyer = new BattleShip(xpos, ypos, type, orientation);
        ships[1] = destroyer;
        
        System.out.println("input x,y coordinates for battleship: ");
        Input = in.nextLine();
        type = "battleship";
        i = 0;
        xpos = 0;
        while (Input.charAt(i) != (','))
        {
            i++;
        }
        xpos = Integer.parseInt(Input.substring(0,i));
        ypos = Integer.parseInt(Input.substring(i+1));
        System.out.println("Input orientation, h or v: ");
        orientation = in.nextLine();
        BattleShip battleship = new BattleShip(xpos, ypos, type, orientation);
        ships[2] = battleship;
        
        System.out.println("input x,y coordinates for aircraft carrier: ");
        Input = in.nextLine();
        type = "aircraft carrier";
        i = 0;
        xpos = 0;
        while (Input.charAt(i) != (','))
        {
            i++;
        }
        xpos = Integer.parseInt(Input.substring(0,i));
        ypos = Integer.parseInt(Input.substring(i+1));
        System.out.println("Input orientation, h or v: ");
        orientation = in.nextLine();
        BattleShip aircraftCarrier = new BattleShip(xpos, ypos, type, orientation);
        ships[3] = aircraftCarrier;
        
        System.out.println("input x,y coordinates for cruiser: ");
        Input = in.nextLine();
        type = "cruiser";
        i = 0;
        xpos = 0;
        while (Input.charAt(i) != (','))
        {
            i++;
        }
        xpos = Integer.parseInt(Input.substring(0,i));
        ypos = Integer.parseInt(Input.substring(i+1));
        System.out.println("Input orientation, h or v: ");
        orientation = in.nextLine();
        BattleShip cruiser = new BattleShip(xpos, ypos, type, orientation);
        ships[4] = cruiser;
        
        
        BattleGrid board = new BattleGrid();
        board.createSelection(ships);
        board.createBoard();
        
        int x;
        int y;
        do
        {
            //have user input two values, set to x and y and then below
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
