package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/10/2016.
 *
 *  - Define a class called Fraction.
 *  - This class is used to represent a ratio of two integers.
 *      - int1/int2
 *  - Include mutator methods that allow the user to set the numerator and the
 *    denominator.
 *  - Innclude a method that displays the fraction on the screen as a ratio (e.g., 5>9).
 *      - This method does not need to reduce the fraction to lowest terms.
 *  - Include an additional method, equals, that takes as input another Fraction and
 *    returns true if the two fractions are identical and false if they are not.
 *          - This method should treat the fractions reduced to lowest terms;
 *          that is, if one fraction is 20>60 and the other is 1>3, then the method should return true.
 *
 *  -  Embed your class in a test program that allows the user to create a fraction.
 *          - Then the program should loop repeatedly until the user decides to quit.
 *          - Inside the body of the loop, the program should allow the user to enter a target
 *            fraction into an anonymous object and learn whether the fractions are identical.
 */
public class Fraction
{
    // Instance variables
    private int num;
    private int den;

    //-------------------- Constructors --------------------
    /**
     * Default Constructor
     * */
    public Fraction()
    {
        num = den = 1;
    }
    /**
     * One argument Constructor
     * */
    public Fraction(int n)
    {
        num = n;
        den = 1;
    }
    /**
     * Two argument Constructor
     * */
    public Fraction(int n, int d)
    {
        num = n;
        den = d;
    }
    /**
     * Copy Constructor
     * @param original The original fraction to copy
     * */
    public Fraction(Fraction original)
    {
        if (original == null)
        {
            System.out.println("Fatal error.");
            System.exit(0);
        }
        num = original.num;
        den = original.den;
    }
    //-------------------- Mutator Methods --------------------
    /**
     * Mutator method that changes/sets the numerator value
     * @param n Int value to change the numerator value to
     * */
    public void setNum(int n)
    {
        num = n;
    }
    /**
    * Mutator method that changes/sets the numerator value
    * @param d Int value to change the numerator value to
    */
    public void setDen(int d)
    {
        den = d;
    }
    //-------------------- Accessor Methods --------------------
    /**
     * Accessor method that gets numerator value
     * @return Returns numerator
     * */
    public int getNum()
    {
        return num;
    }
    /**
     * Accessor method that gets denominator value
     * @return Returns denominator
     * */
    public int getDen()
    {
        return den;
    }
    //-------------------- Helper And Other Methods --------------------
    /**
     * Method that displays the fraction as a ratio i.e. 4/5
     * */
    public void displayFraction()
    {
        System.out.print(num + "/" + den);
    }
    /**
     * Method that a fraction as input and checks if two fractions are identical
     * @param other Variable that contains the fraction to compare
     * @return Returns true if they are equal, false if not
     * */
    public boolean equals(Fraction other)
    {
    // Remainders for this and other
        int myRem = num % den;
        int otherRem = other.num % other.den;

    // Check if dividing by 0
        if((other.den == 0) || (den == 0) || (other == null) || (this == null))
            return false;
        else
        {
        // If a fraction is equal both fractions when reduced should be the same
        // ie 4/5 == 20/25
            while ((myRem > 0) && (otherRem > 0))
            {
                // this
                num = den;
                den = myRem;
                myRem = num % den;
                //other
                other.num = other.den;
                other.den = otherRem;
                otherRem = other.num % other.den;
            } //if both GCD same, then equal else false
            if(myRem == otherRem)
                return true;
            else
                return false;
        }
    }



}
