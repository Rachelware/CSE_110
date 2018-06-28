package Assignment_5;

public class Pet
{
    private String name;
    private int age;
    private boolean adopted;

    /**
     * Constructor for objects of class Pet
     */
    public Pet()
    {
        name = null;
        age = 0;
        adopted = false;
    }
    
    public Pet(String name, int age)
    {
        this.name= name;
        this.age = age;
        adopted = false;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void increaseAge()
    {
        age++;
    }
    
    public boolean getAdoptionStatus()
    {
        return adopted;
    }
    
    public void setAdoption()
    {
        adopted = true;
    }
}
