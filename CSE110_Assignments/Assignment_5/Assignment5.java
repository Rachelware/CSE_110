package Assignment_5;
import java.util.*;
/**
 * Write a description of class Assignment5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment5
{
    private static Scanner in;
    public static void main(String[] args)
    {
         in = new Scanner(System.in);
         
         Pet one = new Pet("Fido", 3);
         Pet two = new Pet("Furball", 1);
         Pet three = null;
         
         System.out.println("Welcome to the pet shop");
         boolean flag = false;
         String userChoice = printMenu();
         while (flag == false)
         {
            if (userChoice.equals("a"))
            {
                String year = " years";
                if (one.getAge() == 1)
                {
                    year = " year";
                }
                if (one.getAdoptionStatus() == false)
                {
                    System.out.println(one.getName() + " is " + one.getAge() + year + " old and is not adopted.");
                }
                else
                {
                    System.out.println(one.getName() + " is " + one.getAge() + " years old and is adopted.");
                }
                year = " years";
                if (two.getAge() == 1)
                {
                    year = " year";
                }
                if (two.getAdoptionStatus() == false)
                {
                    System.out.println(two.getName() + " is " + two.getAge() + year + " old and is not adopted.");
                }
                else
                {
                    System.out.println(two.getName() + " is " + two.getAge() + " years old and is adopted.");
                }
                if (three != null)
                {
                    year = " years";
                    if (three.getAge() == 1)
                    {
                        year = " year";
                    }
                    if (three.getAdoptionStatus() == false)
                    {
                        System.out.println(three.getName() + " is " + three.getAge() + year + " old and is not adopted.");
                    }
                    else
                    {
                        System.out.println(three.getName() + " is " + three.getAge() + " years old and is adopted.");
                    }
                }
                userChoice = printMenu();
            }
            else if (userChoice.equals("b"))
            {
                one.increaseAge();
                two.increaseAge();
                if (three != null)
                {
                    three.increaseAge();
                }
                System.out.println("All the pets are getting older.");
                userChoice = printMenu();
            }
            else if (userChoice.equals("c"))
            {
                if (three != null)
                {
                    System.out.println("Cannot add pet, there are already 3 pets");
                }
                else
                {
                    System.out.println("Give the pet a name: ");
                    String petName = in.next();
                    System.out.println("Give the pet an age: ");
                    int petAge = in.nextInt();
                    three = new Pet(petName, petAge);
                }
                userChoice = printMenu();
            }
            else if (userChoice.equals("d"))
            {
                System.out.println("Type in the number of the pet you wish to adopt: ");
                int adoptChoice = in.nextInt();
                if (adoptChoice == 1)
                {
                    if (one.getAdoptionStatus() == true)
                    {
                        System.out.println("This pet is already adopted.");
                    }
                    else
                    {
                        one.setAdoption();
                        System.out.println("You have adopted " + one.getName() + ".");
                    }
                }
                else if (adoptChoice == 2)
                {
                    if (two.getAdoptionStatus() == true)
                    {
                        System.out.println("This pet is already adopted.");
                    }
                    else
                    {
                        two.setAdoption();
                        System.out.println("You have adopted " + two.getName() + ".");
                    }
                }
                else if (adoptChoice == 3)
                {
                    if (three == null)
                    {
                        System.out.println("This is not a valid pet.");
                    }
                    else if (three.getAdoptionStatus() == true)
                    {
                        System.out.println("This pet is already adopted.");
                    }
                    else
                    {
                        three.setAdoption();
                    }
                }
                userChoice = printMenu();
            }
            else if (userChoice.equals("e"))
            {
                flag = true;
            }
         }
         System.out.println("Bye!");
    }
    
    private static String printMenu()
    {
        System.out.println("a. List the pets in the store. \nb.Age up the pets.\nc.Add a new pet.\nd.Adopt a pet.\ne.Quit.");
        String input = in.next();
        while (!(input.equals("a") || input.equals("b") || input.equals("c") || input.equals("d") || input.equals("e")))
        { 
            System.out.println("Invalid input.");
            System.out.println("a. List the pets in the store. \nb.Age up the pets.\nc.Add a new pet.\nd.Adopt a pet.\ne.Quit.");
            input = in.next();
        }
        
        return input;
    }
}
