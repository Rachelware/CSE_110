package Lab_5;
import java.util.*;
/**
 * Write a description of class Lab5 here.
 *
 * @author Rachel Ware
 * @version 9.27.17
 */
public class Lab5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        double num1 = in.nextDouble();
        System.out.println("Input another number: ");
        double num2 = in.nextDouble();
        System.out.println("The sum of these numbers is " + Lab5.getSum(num1, num2));
        System.out.println("The average of these numbers is " + Lab5.getAverage(num1, num2));
        
        System.out.println("Input a student's name: ");
        String name = in.next();
        System.out.println("Input a score: ");
        double score1 = in.nextDouble();
        System.out.println("Input another score: ");
        double score2 = in.nextDouble();
        Student stud = new Student(name, Lab5.getAverage(score1, score2));
        System.out.println("Student name: " + stud.name);
        System.out.println("Student grade: " + stud.grade);
        
        System.out.println("Input a student's name: ");
        name = in.next();
        System.out.println("Input a score: ");
        score1 = in.nextDouble();
        System.out.println("Input another score: ");
        score2 = in.nextDouble();
        Student two = new Student(name, score1, score2);
        System.out.println("Student name: " + two.name);
        System.out.println("Student grade: " + two.grade);
    }
    
    public static double getSum(double num1, double num2)
    {
        return num1+num2;
    }
    
    public static double getAverage(double num1, double num2)
    {
        return (num1+num2) / 2.0;
    }
}
