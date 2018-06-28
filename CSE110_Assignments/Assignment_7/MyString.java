package Assignment_7;

public class MyString
{
    private int length;
    private char[] characters;

    public MyString()
    {
        length = 0;
        characters = new char[length];
    }
    
    public MyString(String word)
    {
        length = word.length();
        characters = new char[length];
        for (int i = 0; i < characters.length; i++)
        {
            characters[i] = word.charAt(i);
        }
    }
    
    public boolean equals(String word)
    {
        boolean match = false;
        char[] wordChar = word.toCharArray();
        if (wordChar.length == characters.length)
        {
            for (int i = 0; i < wordChar.length; i++)
            {
                if (characters[i] == wordChar[i])
                {
                    match = true;
                }
            }
        }
        return match;
    }
    
    public int indexOf(char a)
    {
        int i = 0;
        boolean flag = false;
        while (flag == false && i < characters.length)
        {
            if (characters[i] == a)
            {
                flag = true;
            }
            else
            {
                i++;
            }
        }
        if (flag == true)
        {
            return i;
        }
        else
        {
            return -1;
        }
    }
    
    public int indexOf(String a)
    {
        int i = 0;
        char[] str = a.toCharArray();
        boolean flag = false;
        while (flag == false && i < characters.length - str.length + 1)
        {
            if (characters[i] == str[0])
            {
                flag = true;
                for (int j = 0; j < str.length; j++)
                {
                    if (characters[i + j] != str[j])
                    {
                        flag = false;
                    }
                }
                if (flag == false)
                {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
        if (flag == true)
        {
            return i;
        }
        else
        {
            return -1;
        }
    }
    
    public boolean startsWith(String str)
    {
        if (indexOf(str) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean endsWith(String str)
    {
        if (indexOf(str) == characters.length - str.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean contains(String str)
    {
        if (indexOf(str) == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public String toString()
    {
        if (characters.length == 0)
        {
            return "";
        }
        else
        {
            String str = "";
            for (int i = 0; i < characters.length; i++)
            {
                str+= characters[i];
            }
            return str;
        }
    }
}









