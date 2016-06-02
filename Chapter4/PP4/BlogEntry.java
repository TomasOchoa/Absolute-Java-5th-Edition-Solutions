package tomas.ochoa;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Define a class called BlogEntry that could be used to store an entry for a Web
 * log. The class should have instance variables to store the poster’s username, text of
 * the entry, and the date of the entry using the Date class from this chapter. Add a
 * constructor that allows the user of the class to set all instance variables. Also add
 * a method, DisplayEntry, that outputs all of the instance variables, and another
 * method called getSummary that returns the first 10 words from the text (or the
 * entire text if it is less than 10 words). Test your class from your main method
 */
public class BlogEntry
{
// Instance variables
    private String myUserName;
    private String myEntry;
    private Date myDate;
// -------------------- Constructors --------------------
    // default
    public BlogEntry()
    {
        myUserName = "";
        myEntry = "";
        myDate = null;
    }
    // ALl instance variables
    public BlogEntry(String user, String entry, Date date)
    {
        myUserName = user;
        myEntry = entry;
        myDate = date;
    }
// -------------------- Method --------------------
    // Method to display all instance variables
    public void DisplayEntry()
    {
        System.out.println("Username: " + this.myUserName);
        System.out.println("Entry: \n" +
                                this.myEntry);
        System.out.println("Date: " + this.myDate);
    }
    // Method to return first ten words or entire text if less than 10 words
    public String getSummary()
    {
    // String variables to hold summary
        String summary = this.myEntry;

    //Each word is seperated by a space so the method should count 9 spaces or less
        int spaceCount = 0;
    // Variable to store the current index of the word
    // while ten words havent been found or blog post is finished
        int subscript = 0;
    // While loop
        while(spaceCount <= 9 && subscript < this.myEntry.length())
        {
            String nextChar = this.myEntry.substring(subscript, subscript + 1);
            // Check if space
            if (nextChar.equals(" "))
            {
                if (spaceCount <= 9)
                    spaceCount++;
                else
                    break;
            }
            summary = summary + nextChar;
            subscript++;
        }
        return summary;
    }

}
