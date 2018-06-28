package Assignment_6;


/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        BankPatron one = new BankPatron();
        BankPatron two = new BankPatron("Matt", "Wilson", 10000, 100);
        
        System.out.println(one.getName());
        System.out.println(one.getSalary());
        System.out.println(one.getCashOnHand());
        one.getPaycheck();
        System.out.println(one.getCashOnHand());
        
        System.out.println(two.getName());
        System.out.println(two.getSalary());
        System.out.println(two.getCashOnHand());
        two.getPaycheck();
        System.out.println(two.getCashOnHand());
    }
}
