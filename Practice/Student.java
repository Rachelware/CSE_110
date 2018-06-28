
/**
 * Write a description of class Objects here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    public static int grade; //all in class have same value
    
    public Student()
    {
        
    }
    
    public Student(String name) //Constructor
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGrade(int x)
    {
        grade = x;
    }
}
