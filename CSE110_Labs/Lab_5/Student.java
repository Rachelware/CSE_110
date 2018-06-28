package Lab_5;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    double grade;
    String name;
    /**
     * Constructor for objects of class Student
     */
    public Student(String initialName, double initialGrade)
    {
        name = initialName;
        grade = initialGrade; 
    }
    
    public Student(String initialName, double score1, double score2)
    {
        name = initialName;
        grade = Lab5.getAverage(score1, score2);
    }
}