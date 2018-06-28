package Lab_6;

import java.util.*;
/**
 * Write a description of class Lab6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1:\narea: " + rect1.getArea());
        System.out.println("perimeter: " + rect1.getPerimeter());
        
        System.out.println("Input a rectangle length: ");
        double length = in.nextDouble();
        System.out.println("Input a rectangle width: ");
        double width = in.nextDouble();
        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("Rectangle 2:\narea: " + rect2.getArea());
        System.out.println("perimeter: " + rect2.getPerimeter());
        
        Rectangle rect3 = new Rectangle(rect1.length + rect2.length, rect1.width + rect2.width);
        System.out.println("Rectangle 3:\narea: " + rect3.getArea());
        System.out.println("perimeter: " + rect3.getPerimeter());
        
    }
}
