package lab_7;

import java.util.*;
public class Lab7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        Student stud = new Student();
        
        System.out.println("Input student name: ");
        stud.setName(in.nextLine());
        System.out.println("Input student major: ");
        stud.setMajor(in.nextLine());
        System.out.println("Input student ID number: ");
        stud.setId(in.nextInt());
        System.out.println("Input student GPA: ");
        stud.setGpa(in.nextDouble());
        System.out.println("Input student age: ");
        stud.setAge(in.nextInt());
        if (stud.getAge() <= 18 && stud.getAge() >=15)
        {
            System.out.println("The student is in high school");
        }
        else if (stud.getAge() < 15 && stud.getAge() >=12)
        {
            System.out.println("The student is in middle school");
        }
        else if (stud.getAge() < 12 && stud.getAge() >= 6)
        {
            System.out.println("The student is in elementary school");
        }
        else
        {
            System.out.println("The student's age is not in the range");
        }
    }
}
