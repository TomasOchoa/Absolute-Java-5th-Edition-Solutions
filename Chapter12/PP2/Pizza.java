package tomas.ochoa;
/**
    The Pizza class contains information about a specific pizza. The variables of
 pepperoni, sausage, and mushrooms are booleans that indicate whether or not
 these toppings are present on the pizza. The size variable is a character of value 's',
 'm', or 'l' to indicate small, medium, or large. There is also a Pizza constructor
 that initializes all of these values. The getSize() method returns the size of the
 pizza and the getNumToppings() method returns a number from 0–3 depending
 on what toppings are present (e.g., if the pizza has pepperoni and mushrooms, it
 would be 2).
 */
public class Pizza
{
// Instance Variables
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private char size;

// Constructors
    // Constructor with args
    public Pizza(char s,boolean p,boolean sge,boolean m)
    {
        size = s;
        pepperoni = p;
        sausage = sge;
        mushrooms = m;
    }

// Accessors
    // to get size of pizza
    public char getSize()
    {
        return size;
    }

    // To get amount of toppings
    public int getNumToppings()
    {
        int numToppings = 0;

        // Check for pepporoni
        if(pepperoni)
            numToppings ++;
        // Check for sausage
        if(sausage)
            numToppings ++;
        // Check for mushrooms
        if(mushrooms)
            numToppings ++;

        return numToppings;
    }

}
