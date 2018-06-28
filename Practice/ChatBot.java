
/**
 * Write a description of class ChatBot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChatBot
{
    
    
    /**
     * Constructor for objects of class ChatBot
     */
    public ChatBot()
    {
        
    }
    
        public String start()
    {
        String startPhrase = "Hello, how are you?";
        return startPhrase;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String run(String input)
    {
        String answer = "";
        if (input.equals("good"))
        {
            answer = "That is nice to hear";
        }
        else if (input.contains(" love "))
        {
            answer = "Love is a good emotion";
        }
        else if (input.contains(" hate ") && input.contains(" you "))
        {
            answer = "I am sorry to hear that.";
        }
        else if (input.contains("sports"))
        {
            answer = "My favorite sport is track, all I can do is run";
        }
        else if (input.equals("bye"))
        {
            System.out.println("Goodbye");
            System.exit(0);
        }
        else
        {
            answer = "interesting, tell me more";
        }
        return answer;
    }
}
