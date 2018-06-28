package Assignment_6;


/**
 * Write a description of class PatronList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatronList
{
    private BankPatron patron1;
    private BankPatron patron2;
    private BankPatron patron3;
    private BankPatron patron4;
    private BankPatron patron5;

    public PatronList()
    {
        patron1 = null;
        patron2 = null;
        patron3 = null;
        patron4 = null;
        patron5 = null;
    }

    public int firstNullPatron()
    {
        if (patron1 == null)
        {
            return 0;
        }
        else if (patron2 == null)
        {
            return 1;
        }
        else if (patron3 == null)
        {
            return 2;
        }
        else if (patron4 == null)
        {
            return 3;
        }
        else if (patron5 == null)
        {
            return 4;
        }
        else
        {
            return -1;
        }
    }
    
    public boolean addPatron(BankPatron person)
    {
        int nulled = firstNullPatron();
        if (nulled == 0)
        {
            patron1 = person;
            return true;
         }
        else if (nulled == 1)
        {
            patron2 = person;
            return true;
        }
        else if (nulled == 2)
        {
            patron3 = person;
            return true;
        }
        else if (nulled == 3)
        {
            patron4 = person;
            return true;
        }
        else if (nulled == 4)
        {
            patron5 = person;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean addPatron(String firstName,String lastName,double salary,double cashOnHand)
    {
        return addPatron(new BankPatron(firstName, lastName, salary, cashOnHand));
    }
    
    public BankPatron findPatron(int num)
    {
        if (num == 0)
        {
            if (patron1 != null)
            {
                return patron1;
            }
            else
            {
                return null;
            }
        }
        else if (num == 1)
        {
            if (patron2 != null)
            {
                return patron2;
            }
            else
            {
                return null;
            }
        }
        else if (num == 2)
        {
            if (patron3 != null)
            {
                return patron3;
            }
            else
            {
                return null;
            }
        }
        else if (num == 3)
        {
            if (patron4 != null)
            {
                return patron4;
            }
            else
            {
                return null;
            }
        }
        else if (num == 4)
        {
            if (patron5 != null)
            {
                return patron5;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
    
    public BankPatron patronNameSearch(String fullName)
    {
        if (patron1 != null)
        {
            if (patron1.getName().equals(fullName))
            {
                return patron1;
            }
        }
        if (patron2 != null)
        {
            if (patron2.getName().equals(fullName))
            {
                return patron2;
            }
        }
        if (patron3 != null)
        {
            if (patron3.getName().equals(fullName))
            {
                return patron3;
            }
        }
        if (patron4 != null)
        {
            if (patron4.getName().equals(fullName))
            {
                return patron4;
            }
        }
        if (patron5 != null)
        {
            if (patron5.getName().equals(fullName))
            {
                return patron5;
            }
        }
        return null;
    }
    
    public boolean removePatron(String patronName)
    {
        BankPatron patron = patronNameSearch(patronName);
        if (patron == null)
        {
            return false;
        }
        else
        {
            if (patronNameSearch(patronName) == patron1)
            {
                patron1 = null;
                return true;
            }
            if (patronNameSearch(patronName) == patron2)
            {
                patron2 = null;
                return true;
            }
            if (patronNameSearch(patronName) == patron3)
            {
                patron3 = null;
                return true;
            }
            if (patronNameSearch(patronName) == patron4)
            {
                patron4 = null;
                return true;
            }
            if (patronNameSearch(patronName) == patron5)
            {
                patron5 = null;
                return true;
            }
        }
        return false;
    }
    
    public String patronInfo(int num)
    {
        BankPatron patron = findPatron(num);
        if (patron != null)
        {
            String info = patron.getName();
            if (patron.getAccount(1) != null)
            {
                info += " " + patron.bank1.getType() + " " + patron.bank1.getAccountNum() + " Balance: " + 
                        patron.bank1.checkBalance() + " Interest Rate: " + patron.bank1.getRate();
            }
            if (patron.getAccount(2) != null)
            {
                info += "\n" + patron.bank2.getType() + " " + patron.bank2.getAccountNum() + " Balance: " + 
                        patron.bank2.checkBalance() + " Interest Rate: " + patron.bank2.getRate();
            }
            return info;
        }
        else
        {
            return null;
        }
    }
}










