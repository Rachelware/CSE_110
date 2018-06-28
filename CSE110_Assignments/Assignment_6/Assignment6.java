package Assignment_6;

import java.util.Scanner;
/**
 * Write a description of class BankMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment6
{
    static Scanner in = new Scanner(System.in);
    static PatronList patrons = new PatronList();
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to the bank!");
        menu();
    }
    
    public static String menu()
    {
        System.out.println("a. List Patrons\nb. Add new Patron\nc. Remove Patron\nd. Patron Specific Actions\ne. Quit");
        String input = in.next();
        if (input.equals("a"))
        {
            System.out.println("Patrons currently at the bank: ");
            boolean anyone = false;
            if (patrons.patronInfo(0) != null)
            {
                System.out.println(patrons.patronInfo(0));
                anyone = true;
            }
            if (patrons.patronInfo(1) != null)
            {
                System.out.println(patrons.patronInfo(1));
                anyone = true;
            }
            if (patrons.patronInfo(2) != null)
            {
                System.out.println(patrons.patronInfo(2));
                anyone = true;
            }
            if (patrons.patronInfo(3) != null)
            {
                System.out.println(patrons.patronInfo(3));
                anyone = true;
            }
            if (patrons.patronInfo(4) != null)
            {
                System.out.println(patrons.patronInfo(4));
                anyone = true;
            }
            if (anyone == false)
            {
                System.out.println("None");
            }
            return menu();
        }
        else if (input.equals("b"))
        {
            in.nextLine();
            System.out.println("Input patron first Name: ");
            String firstName = in.next();
            System.out.println("Input patron last name: ");
            String lastName = in.next();
            System.out.println("Input patron salary: ");
            double salary = in.nextDouble();
            System.out.println("Input patron cashOnHand: ");
            double cashOnHand = in.nextDouble();
            if (patrons.addPatron(firstName, lastName,salary, cashOnHand) == true)
            {
                System.out.println("Patron successfully added");
            }
            else
            {
                System.out.println("Bank line already full");
            }
            return menu();
        }
        else if (input.equals("c"))
        {
            System.out.println("Input patron full name: ");
            in.nextLine();
            String name = in.nextLine();
            if (patrons.removePatron(name) == false)
            {
                System.out.println("There are no patrons with this name");
            }
            else
            {
                System.out.println(name + " has left the bank");
            }
            return menu();
        }
        else if (input.equals("d"))
        {
            System.out.println("input patron full name: ");
            in.nextLine();
            String name = in.nextLine();
            BankPatron patron = patrons.patronNameSearch(name);
            if (patron == null)
            {
                System.out.println("Error, no patrons with this name");
                return menu();
            }
            else
            {
                patronMenu(patron);
                return menu();
            }
        }
        else if (input.equals("e"))
        {
            System.out.println("GoodBye!");
            return input;
        }
        else
        {
            System.out.println("Invalid input");
            return menu();
        }
    }
    
    public static String patronMenu(BankPatron patron)
    {
        System.out.println("a. Add New Account\nb. Close Account\nc. GetPaid\nd. Apply Interest to Accounts\ne. Make Deposit\nf. Make Withdraw\ng. Return to Main Menu");
        String input = in.next();
        if (input.equals("a") || input.equals("b") || input.equals("c") || input.equals("d") || input.equals("e") || input.equals("f"))
        {
            patronMenuAction(patron, input);
            return input;
        }
        else if (input.equals("g"))
        {
            return input;
        }
        else
        {
            System.out.println("Invalid input");
            return patronMenu(patron);
        }
    }
    
    public static String patronMenuAction(BankPatron patron, String input)
    {
        String userInput = input;
        if (userInput.equals("a"))
        {
                AccountType type = accountTypeMenu();
                in.nextLine();
                System.out.println("Input interest rate: ");
                double rate = in.nextDouble();
                boolean success = patron.addAccount(rate, type);
            if (success == true)
                {
                    System.out.println("Account successfully added");
                }
            else
                {
                    System.out.println("Account not added");
                }
                return patronMenu(patron);
            }
        else if (userInput.equals("b"))
        {
                System.out.println("Input which account, 1 or 2: ");
                int accInput = in.nextInt();
                boolean success = patron.removeAccount(accInput);
            if (success == true)
                {
                    System.out.println("Account successfully closed");
                }
            else
                {
                    System.out.println("Account not closed");
                }
                return patronMenu(patron);
            }
        else if (userInput.equals("c"))
            {
                patron.getPaycheck();
                return patronMenu(patron);
            }
        else if (userInput.equals("d"))
            {
            if (patron.getAccount(1) != null)
                {
                    patron.getAccount(1).applyInterest();
                }
            if (patron.getAccount(2) != null)
                {
                    patron.getAccount(2).applyInterest();
                }
                return patronMenu(patron);
            }
        else if (userInput.equals("e"))
            {
                System.out.println("Choose an account: ");
                int acc = in.nextInt();
                System.out.println("Input deposit amount: ");
                double deposit = in.nextDouble();
                boolean success = false;
            if (patron.getAccount(acc) != null)
                {
                    success = patron.makeDeposit(deposit, patron.getAccount(acc));
                }
            else
                {
                    System.out.println("Account does not exist");
                }
            if (success)
                {
                    System.out.println("Deposit was successful");
                }
            else
                {
                    System.out.println("Deposit was unsuccessful");
                }
                return patronMenu(patron);
            }
        else if (userInput.equals("f"))
            {
                System.out.println("Choose an account: ");
                int acc = in.nextInt();
                System.out.println("Input withdraw amount: ");
                double withdraw = in.nextDouble();
                boolean success = false;
            if (patron.getAccount(acc) != null)
                {
                    success = patron.makeWithdraw(withdraw, patron.getAccount(acc));
                }
            else
                {
                    System.out.println("Account does not exist");
                }
            if (success)
                {
                    System.out.println("Withdraw was successful");
                }
            else
            {
                System.out.println("Withdraw was unsuccessful");
            }                
            return patronMenu(patron);
        }
        else if (userInput.equals("g"))
        {
            return menu();
        }
        else
        {
            System.out.println("Invalid input");
            return patronMenu(patron);
        } 
    }
    
    public static AccountType accountTypeMenu()
    {
        System.out.println("a. Checking\nb. Savings\nc. CD\nd. Money Market\ne. IRA");
        String input = in.next();
        if (input.equals("a"))
        {
            return AccountType.Checking;
        }
        else if (input.equals("b"))
        {
            return AccountType.Savings;
        }
        else if (input.equals("c"))
        {
            return AccountType.CD;
        }
        else if (input.equals("d"))
        {
            return AccountType.MoneyMarket;
        }
        else if (input.equals("e"))
        {
            return AccountType.IRA;
        }
        else
        {
            System.out.println("Invalid Input");
            return accountTypeMenu();
        }
    }
}







