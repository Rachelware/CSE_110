import java.util.Scanner;

/**
 * Write a description of class Assignment1 here.
 *
 * @author Rachel Ware
 * @version 9.1.17
 */
public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the velocity: ");
        double velocity = in.nextDouble();
        System.out.println("Input the angle: ");
        double angle = in.nextDouble();
        System.out.println("Input the distance to the target: ");
        double distance = in.nextDouble();
        System.out.println("Input the elevation of the target: ");
        double elevation = in.nextDouble();
        System.out.println("Input the target size: ");
        double size = in.nextDouble();
        
        //HEIGHT CURRENTLY CALCULATES WRONG!!!!
        angle = angle * (Math.PI/180);
        double valueA = velocity * Math.cos(angle);
        if (valueA == 0)
        {
            System.out.println("distance cannot be calculated");
        }
        else
        {
            double time = distance/ valueA;
            double value1 = velocity * time * Math.sin(angle);
            double value2 = (32.17 * Math.pow(time,2))/2;
            double height = value1 - value2;
            if (height < 0)
            {
                System.out.println("Cannonball did not reach target");
            }
            if (height > 0 && height < elevation)
            {
                System.out.print("Cannonball went below target, at height: " + height);
            }
            if (height > elevation && height < (elevation + size))
            {
                System.out.println("Cannonball hit the target");
            }
            if (height > (elevation + size))
            {
                System.out.println("Cannonball went over target, at height: " + height);
            }
        }
        
    }
}