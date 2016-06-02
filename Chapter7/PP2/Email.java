package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 *
 * Class: Email extends Document
    - Instance Variables:
         - String sender
         - String recipient
         - String title
    - Constructors:
         - 4 variable
            - super to set the sext
            - Sender, recipient, title
    - Accessors:
         - getSender
         - getRecipient
         - getTitle
    - Mutators
         - setSender
         - setRecipient
         - setTitle
    - Overloaded
         - toString
            - Concatenates all fields

 Text should be stored in inherited value
 */
public class Email extends Document
{
// Instance Variables
    String sender;
    String recipient;
    String title;

//--------------------Constructors--------------------
    /**
     * Default constructor
     * */
    public Email()
    {
        setText("");
    }
    /**
     * 4 Arg constructor
     * @param aRecipient The recipient
     * @param aSender The sender of the email
     * @param aTitle The title of the email
     * @param someText The textual content of the email
     * */
    public Email(String someText,String aSender,String aRecipient,String aTitle)
    {
    // Use base class constructor to fill text
        super(someText);
    // Handle the rest of the parameters
        sender = aSender;
        recipient = aRecipient;
        title = aTitle;
    }
//----------------------Accessors---------------------
    /**
     * Accessor method to access the recipient
     * */
    public String getSender()
    {
        return sender;
    }
    /**
     * Accessor method to access the sender
     * */
    public String getRecipient()
    {
        return recipient;
    }
    /**
     * Accessor method to access the title
     * */
    public String getTitle()
    {
        return title;
    }
//-----------------------Mutators---------------------
    /**
     * Mutator method to set the recipient
     * @param newRecipient The new recipient to change the variable with
     * */
    public void setRecipient(String newRecipient)
    {
        recipient = newRecipient;
    }
    /**
     * Mutator method to set the  sender
      @param newSender The new set to change the variable with
     * */
    public void setSender(String newSender)
    {
        sender = newSender;
    }
    /**
     * Mutator method to set the  title
     * @param newTitle THe new title to change the variable with
     * */
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
//----------------------Overloaded--------------------
    /**
     * OVerloaded method to concatenate all strings
     * @return The concatenated strings
     * */
    public String toString()
    {
        return ("From: " + sender + "\n" +
                "To: "   + recipient + "\n" +
                "Title: "+ title + "\n" +
                super.toString());
    }

}//end of email class
