import java.util.Scanner;
/**
 * Write a description of class Objects here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Objects
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Student one = new Student();
        Student two = new Student("Larry");
        System.out.println(one.getName());
        System.out.println(two.getName());
        one.setGrade(5);
        System.out.println(one.grade);
        System.out.println(two.grade);
    }
}
