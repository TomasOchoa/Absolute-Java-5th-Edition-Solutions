package tomas.ochoa;
/**
 Part 1:
     -Class name = Money
     -Two instance variavles;
     -int dollars
     -int cents
 -constructors
     -two variable constructor of type int for dollar and cents
     -one variable constructor of type int for an amount of dollars with zero cents
     -default constructor
 -methods
    -add:
         - static
         - addition of amounts of money
         - two parameters of type Money
         - return val of type money
    -minus:
         - static
         - subtraction of amounts of money
         - two parameters of type Money
         - return val of type money
    -Accessor methods
        - get dollars
        - get cents
    -Mutator methods
        - set dollars
        - set cents
    -helper
        -equals
        -toString

 -Write a test program for class


 Part2:
     -Add a second version for addition
         - has a calling object
         - one argument
         - ie: m1.add(m2);
    -Add a second version for subtraction
         - has a calling object
         - one argument
         - ie: m1.sub(m2);
 * */
public class Money
{
//Instance variables
    private int dollar;
    private int cents;

//--------------------Constructors--------------------
    //Two variables
    public Money(int d,int c)
    {
        this.dollar = d;
        this.cents = c;
    }
    //One variables
    public Money(int d)
    {
        this.dollar = d;
    }
    //default
    public Money()
    {
        dollar = 0;
        cents = 0;
    }
//----------------------Accessors---------------------
    /**
     * Accessor method to get dollar value
     * @return Dollar value
     * */
    public int getDollar()
    {
        return dollar;
    }
    /**
     * Accessor method to get Cents value
     * @return Cents value
     * */
    public int getCents()
    {
        return cents;
    }
//----------------------Mutators----------------------
    /**
     * Method to set the dollar instance variable
     * @param d The int amount to set
     * */
    public void setDollar(int d)
    {
        this.dollar = d;
    }
    /**
     * Method to set the cents instance variable
     * @param c The int amount to set
     * */
    public void setCents(int c)
    {
        this.dollar = c;
    }
//----------------------Helpers-----------------------
    /**
     * Method to calculate two addition objects and return
     * the result as a new object
     * @param m1 Money object 1
     * @param m2 Money object 2
     * @return Sum of the two money objects
     * */
    public static Money add(Money m1, Money m2)
    {
        int tempDollars = m1.getDollar() + m2.getDollar();
        int tempCents = m1.getCents() + m2.getCents();
        return new Money(tempDollars,tempCents);
    }
    /**
     * Method to calculate the subtraction of two objects and return
     * the result as a new object
     * @param m1 Money object 1
     * @param m2 Money object 2
     * @return Difference of the two money objects
     * */
    public static Money minus(Money m1, Money m2)
    {
        int tempDollars = m1.getDollar() - m2.getDollar();
        int tempCents = m1.getCents() - m2.getCents();
        return new Money(tempDollars,tempCents);
    }
    /**
     * Method to check if two Money objects are the same
     * @param other
     *              Money object to compare
     * @return true/false
     * */
    public boolean equals(Money other)
    {
        if(dollar == other.dollar && cents == other.cents)
            return true;
        else
            return false;
    }
    /**
     * Method to convert to string
     */
    public String toString()
    {
        return "Dollars: " + getDollar() + "\n" +
               "Cents:   " + getCents();
    }
}
