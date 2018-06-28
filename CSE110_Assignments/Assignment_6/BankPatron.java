package Assignment_6;


/**
 * Write a description of class BankPatron here.
 *
 * @author Rachel Ware
 * @version 10.13.17
 */
public class BankPatron
{
    private String firstName;
    private String lastName;
    private double salary;
    private double cashOnHand;
    BankAccount bank1;
    BankAccount bank2;

    public BankPatron()
    {
        firstName = null;
        lastName = null;
        salary = 0.0;
        cashOnHand = 0.0;
        bank1 = null;
        bank2 = null;
    }
    
    public BankPatron(String firstName, String lastName, double salary, double cashOnHand)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cashOnHand = cashOnHand;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public double getCashOnHand()
    {
        return cashOnHand;
    }
    
    public void getPaycheck()
    {
        double paycheck = salary/28.0;
        cashOnHand += paycheck;
    }
    
    public BankAccount getAccount(int accNum)
    {
        if (accNum == 1)
        {
            if (bank1 == null) 
            {
                return null;
            }
            else
            {
                return bank1;
            }
        }
        else if (accNum == 2)
        {
            if (bank2 == null) 
            {
                return null;
            }
            else
            {
                return bank2;
            }
        }
        else
        {
            return null;
        }
    }
    
    public boolean makeDeposit(double deposit, BankAccount acc)
    {
        if (deposit <= cashOnHand)
        {
            cashOnHand = cashOnHand - deposit;
            acc.deposit(deposit);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean makeWithdraw(double amount, BankAccount acc)
    {
        boolean success = acc.withdraw(amount);
        if (success == true)
        {
            cashOnHand += amount;
        }
        return success;
    }
    
    public boolean addAccount(double rate, AccountType type)
    {
        if (bank1 == null)
        {
            bank1 = new BankAccount(firstName, lastName, rate, type);
            return true;
        }
        else if (bank2 == null)
        {
            bank2 = new BankAccount(firstName, lastName, rate, type);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean removeAccount(int accNum)
    {
        if (accNum == 1)
        {
            if (bank1 != null)
            {
                bank1 = null;
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (accNum == 2)
        {
            if (bank2 != null)
            {
                bank2 = null;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}

















