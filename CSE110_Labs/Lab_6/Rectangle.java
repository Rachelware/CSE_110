package Lab_6;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    double length;
    double width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        length = 5.0;
        width = 6.0;
    }
    
    public Rectangle(double initialLength, double initialWidth)
    {
        if (initialLength >=0 && initialWidth >= 0)
        {
            length = initialLength;
            width = initialWidth;
        }
    }

    public double getArea()
    {
        return length*width;
    }
    
    public double getPerimeter()
    {
        return 2*length + 2*width;
    }
}
