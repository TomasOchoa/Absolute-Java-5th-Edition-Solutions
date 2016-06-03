package tomas.ochoa;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Formatter;

/**
 * 1. The UML diagram below describes a class named Movie. Implement this class
 in Java and test it from a main method that creates several Movie objects. The
 printDescription() method should output all member variables for the class.

 _________________________________________________________
                            Movie
 _________________________________________________________
 — title: String
 — minutes: int
 — year: int
 # price: double
 ________________________________________________________
 + Movie(in String title, in int year, in double price)
 + getTitle( ): String
 + setTitle(in String newTitle)
 + printDescription( )
 _________________________________________________________


 The word “in” means the parameter is used to deliver data to the method.
 */
public class Movie
{
    // Instance variables
    private String title;
    private int minutes;
    private int year;
    protected double price;

    // Constructors
    public Movie(String t,int m,int y,double p)
    {
        minutes = m;
        title = t;
        year = y;
        price = p;
    }

    // Accessors
    public String getTitle()
    {
        return title;
    }

    // Mutators
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    // Helpers
    public void printDescription()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Movie Title: "+ title);
        System.out.println("Release Year: "+ year);
        System.out.println("Minutes: "+minutes);
        System.out.println("Price: " + formatter.format(price));
    }
}
